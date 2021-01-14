package datastructures;

import java.util.Scanner;

/**
 * Created by amit on 10-Aug-2020
 */
public class Java2DArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();

        System.out.println(maxHourglass(arr));
    }

    private static int maxHourglass(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int sum = findSum(arr, row, col);
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    private static int findSum(int[][] arr, int row, int col) {
        int sum = arr[row + 0][col + 0] + arr[row + 0][col + 1] + arr[row + 0][col + 2]
                + arr[row + 1][col + 1] +
                arr[row + 2][col + 0] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
        return sum;
    }
}
