package tasksday3;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[][] table = new int[10][10];
        multiplication2d(table);

    }

    public static void multiplication2d(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        printArray(table);
    }
    public static void printArray(int[][] table) {
        for (int[] ints : table) {
            System.out.println(Arrays.toString(ints));
        }
    }
}



