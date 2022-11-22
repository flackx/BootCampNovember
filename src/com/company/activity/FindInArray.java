/**
 *
 */
package com.company.activity;

/**
 * @author Brendons
 *
 */
public class FindInArray {
    public static void main(String[] args) {
        int[] nums = {100, 1, 4, 15};
        System.out.println("Smallest in array is: " + FindSmallestInArray(nums));
        System.out.println("Largest is :" + FindLargestInArray(nums));

    }

    public static int FindSmallestInArray(int[] x) {
        int result = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < result) {
                result = x[i];
            }
        }
        return result;
    }

    public static int FindLargestInArray(int[] x) {
        int result = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > result) {
                result = x[i];
            }
        }
        return result;
    }

}
