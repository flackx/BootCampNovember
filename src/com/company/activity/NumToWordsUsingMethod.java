/**
 *
 */
package com.company.activity;

/**
 * @author Brendons
 */
public class NumToWordsUsingMethod {
    public static void main(String[] args) {
        // complete the code to print text value of 8, 9 and 10
        printMyWord(8);
        printMyWord(9);
        printMyWord(10);


    }

    private static void printMyWord(int i) {
        final String numText = switch (i) {
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            case 10 -> "TEN";
            default -> "NUMBER " + i;
        };
        System.out.println(numText);

    }


}
