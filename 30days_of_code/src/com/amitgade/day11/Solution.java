package com.amitgade.day11;

import java.util.Scanner;

/**
 * @project hackerrank
 * @auther amit on 2019-05-04.
 */
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();

        System.out.println(maxHourglass(arr));
    }

    private static int maxHourglass(int[][] arr) {
        int maxHourGlass = Integer.MIN_VALUE;
        for (int row = 0; row + 2 < 6; row++) {
            for (int column = 0; column + 2 < 6; column++) {
                int sum = calculateSum(arr, row, column);
                maxHourGlass = Math.max(maxHourGlass, sum);
            }
        }
        return maxHourGlass;
    }

    private static int calculateSum(int[][] arr, int r, int c) {
        return    arr[r + 0][c + 0] + arr[r + 0][c + 1] + arr[r + 0][c + 2]
                + arr[r + 1][c + 1]
                + arr[r + 2][c + 0] + arr[r + 2][c + 1] + arr[r + 2][c + 2];
    }
}
