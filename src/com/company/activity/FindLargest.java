/**
 *
 */
package com.company.activity;

import java.lang.*;

/**
 * @author Brendons
 */
public class FindLargest {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2;
        int i = 1, j = 2, k = 10;
        findLargestof2(num1, num2);
        findLargestof3(i, j, k);
    }

    private static void findLargestof2(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is largest of two numbers");
        } else {
            System.out.println(num2 + " is largest of two numbers");
        }
    }

    private static void findLargestof3(int i, int j, int k) {
        if (i > j) {
            if (i > k) {
                System.out.println(i + " is Largest of three numbers");
            } else {
                System.out.println(k + " is Largest of three numbers");
            }
        } else {
            if (j > k) {
                System.out.println(j + " is Largest of three numbers");
            } else {
                System.out.println(k + " is Largest of three numbers");
            }
        }
    }

}
