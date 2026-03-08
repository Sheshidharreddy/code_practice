package secondlargest;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        int[] values = {10, 20, 4, 45, 90, 99};
        int secondLargest = findSecondLargest(values);
        System.out.println("Second largest number: " + secondLargest);
    }

    static int findSecondLargest(int[] values) {
        if (values == null || values.length < 2) {
            throw new IllegalArgumentException("At least two numbers are required.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : values) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("At least two distinct numbers are required.");
        }

        return secondLargest;
    }
}
