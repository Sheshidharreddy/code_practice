#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
SRC_DIR="$ROOT_DIR/src"
OUT_DIR="$ROOT_DIR/out"

if [[ $# -lt 1 ]]; then
    echo "Usage: ./scripts/run.sh <assignment-name> [args...]"
    echo "Example: ./scripts/run.sh secondlargest"
    exit 1
fi

mkdir -p "$OUT_DIR"

find "$SRC_DIR" -name "*.java" -print0 | xargs -0 javac -d "$OUT_DIR"

ASSIGNMENT_NAME="$1"
shift

MAIN_CLASS="${ASSIGNMENT_NAME}.Main"
MAIN_CLASS_FILE="$OUT_DIR/${ASSIGNMENT_NAME}/Main.class"

if [[ ! -f "$MAIN_CLASS_FILE" ]]; then
    echo "Unknown assignment: $ASSIGNMENT_NAME"
    echo "Available assignments:"
    find "$SRC_DIR" -mindepth 1 -maxdepth 1 -type d -exec basename {} \; | sort | sed 's/^/ - /'
    exit 1
fi

java -cp "$OUT_DIR" "$MAIN_CLASS" "$@"
