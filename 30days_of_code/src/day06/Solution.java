package day06;

import java.util.Scanner;

/**
 * @project hackerrank
 * @auther amit on 2019-05-03.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String str = sc.next();
            printEvenOdds(str);
        }
        sc.close();
    }

    private static void printEvenOdds(String str) {
        char[] chars = str.toCharArray();
        StringBuffer even = new StringBuffer();
        StringBuffer odd = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                even.append(ch);
            } else {
                odd.append(ch);
            }
        }
        System.out.println(even + " " + odd);
    }
}
