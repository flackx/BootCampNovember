/**
 *
 */
package com.company.activity;

import java.lang.*;

/**
 * @author Brendons
 *
 */
public class NumToWords {


    public static void main(String[] args) {


        int i = 5;
        String numText = switch (i) {
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "NUMBER " + i;
        };

        System.out.println(numText);


    }


}
