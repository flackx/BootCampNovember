package com.company.activity;

import java.lang.*;

/**
 * @author Brendons
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        multiplicationTable10();
        multiplicationtable40to60();
    }

    public static void multiplicationTable10() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("\nTable of " + i);
            for (int x = 1; x <= 10; x++) {
                System.out.println(i + "*" + x + " = " + i * x);
            }
        }
    }

    public static void multiplicationtable40to60() {
        for (int i = 40; i <= 60; i++) {
            System.out.println("\nTable of " + i);
            for (int x = 1; x <= 10; x++) {
                System.out.println(i + "*" + x + " = " + i * x);
            }
        }
    }

}
