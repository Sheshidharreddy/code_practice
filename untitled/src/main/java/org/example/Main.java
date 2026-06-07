package org.example;


public class Main {

    // Create a static, instance and local variable
    static int staticVariable = 10; // Static variable

    int instanceVariable = 20; // Instance variable

    public static void main(String[] args) {
        // Local variable
        int localVariable = 30; // Local variable

        System.out.println("Static Variable: " + staticVariable);

        Main mainInstance = new Main();
        System.out.println("Instance Variable: " + mainInstance.instanceVariable);

        System.out.println("Local Variable: " + localVariable);

        // Call the method to add two numbers
        addTwoNumbers(5, 7);
    }

    // write a method to add two number and print the result
    public static void addTwoNumbers(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }

}