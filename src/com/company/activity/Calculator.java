/**
 *
 */
package com.company.activity;

/**
 * @author Brendons
 */
public class Calculator {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        int[] nums = {1, 2, 3, 4};

        System.out.println("Addition - " + add(x, y));
        System.out.println("Subtraction - " + subtract(x, y));
        System.out.println("Multiply - " + multiply(nums));
        System.out.println("Divide - " + divide(x, y));

    }

    private static int add(int x, int y) {
        return x + y;
    }

    private static int subtract(int x, int y) {
        int diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }

        return diff;
    }

    private static int multiply(int[] numbers) {
        int temp = 1;
        for (int number : numbers) {
            temp = temp * number;
        }
        return temp;

    }

    private static int divide(int x, int y) {
        int divValue = 0;
        if (x == 0 || y == 0) {
            System.out.println("Cant divide 0 mate ");

        } else {
            divValue = x / y;
        }
        return divValue;

    }

}

