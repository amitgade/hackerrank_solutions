package day07;

import java.util.Scanner;

/**
 * @project hackerrank
 * @auther amit on 2019-05-03.
 */
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = n-1; i >=0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
