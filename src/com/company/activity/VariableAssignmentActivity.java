/**
 *
 */
package com.company.activity;

import java.lang.*;

/**
 * @author Brendons
 *
 */
public class VariableAssignmentActivity {

    public static void main(String[] args) {
        int x = 5;
        int y = 12;
        System.out.println("x used to be :" + x + "  x now is :" + findx(x, y));
        // 1- Declare a variable of type int and assign it default value.
        // 2- Update the value
        // 3- Print updated value to the console

    }

    //A method to call for when you want to find the value of a number for future use
    public static int findx(int a, int b) {
        a = b - a;
        return a;
    }
}
