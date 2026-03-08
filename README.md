# Code Practice

Per-assignment Java structure. Each assignment has its own `Main` class.

## Project structure

```text
.
├── src
│   └── secondlargest
│       └── Main.java
├── scripts
│   └── run.sh
└── out
```

## Run an assignment

```bash
./scripts/run.sh secondlargest
```

Expected output:

```text
Second largest number: 90
```

## Add a new assignment

1. Create a folder in `src/<assignmentname>/`.
2. Add `Main.java` with package `<assignmentname>`.
3. Run:

```bash
./scripts/run.sh <assignmentname>
```
