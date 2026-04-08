package org.codePractices.ExamQuestions;

public class MissingNumberInSequence {

    public static void main(String[] args) {
        System.out.println(findMissingNumber("31323335"));      // 34
        System.out.println(findMissingNumber("121122123125"));  // 124
        System.out.println(findMissingNumber("9101113"));       // 12
        System.out.println(findMissingNumber("9899100101103")); // 102
    }

    public static int findMissingNumber(String s) {
        int n = s.length();

        // Try different possible lengths for the first number
        for (int len = 1; len <= n / 2; len++) {
            long first = Long.parseLong(s.substring(0, len));
            long current = first;
            int index = len;
            long missing = -1;
            boolean valid = true;

            while (index < n) {
                long next = current + 1;
                String nextStr = String.valueOf(next);

                // Normal case: next number matches
                if (index + nextStr.length() <= n &&
                        s.substring(index, index + nextStr.length()).equals(nextStr)) {
                    current = next;
                    index += nextStr.length();
                } else {
                    // Try skipping one number
                    long skipped = current + 2;
                    String skippedStr = String.valueOf(skipped);

                    if (missing == -1 &&
                            index + skippedStr.length() <= n &&
                    s.substring(index, index + skippedStr.length()).equals(skippedStr)) {
                        missing = current + 1;
                        current = skipped;
                        index += skippedStr.length();
                    } else {
                        valid = false;
                        break;
                    }
                }
            }

            if (valid && missing != -1) {
                return (int) missing;
            }
        }

        return -1; // No missing number found
    }
}
