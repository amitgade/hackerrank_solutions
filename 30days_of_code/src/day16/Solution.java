package day16;

import java.util.Scanner;

/**
 * @project hackerrank
 * @auther amit on 2019-05-04.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            int i = Integer.parseInt(S);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
