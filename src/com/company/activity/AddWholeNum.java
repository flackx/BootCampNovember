/**
 *
 */
package com.company.activity;

/**
 * @author Brendons
 */
public class AddWholeNum {

    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 50; i++) {
            total = total + i;
        }
        System.out.println("Addition of Whole Numbers from 1 to 50 = " + total);
        total = 0;
        for (int x = 50; x <= 100; x++) {
            total = total + x;
        }
        System.out.println("Addition of Whole Numbers from 50 to 100 = " + total);
    }
}

