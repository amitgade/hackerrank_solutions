package day02;

import java.util.Scanner;

/**
 * @project hackerrank
 * @auther amit on 2019-05-03.
 */
public class Solution {
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        int finalbill = (int) Math.round(meal_cost +
                meal_cost * tip_percent / 100.0 +
                meal_cost * tax_percent / 100.0);
        System.out.println(finalbill);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }

}

