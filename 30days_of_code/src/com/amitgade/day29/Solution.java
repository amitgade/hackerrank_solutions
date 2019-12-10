package com.amitgade.day29;

import java.util.Scanner;

/**
 * Created by amit on 14-Oct-2019
 */
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);


            if (((k - 1) | k) <= n) {
                System.out.println(k - 1);
            } else {
                System.out.println(k - 2);
            }
        }
        scanner.close();
    }
}
