package day09;

import java.io.IOException;
import java.util.Scanner;

/**
 * @project hackerrank
 * @auther amit on 2019-05-03.
 */
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(factorial(n));
    }

    static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
