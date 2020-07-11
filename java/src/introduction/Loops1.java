package introduction;

import java.util.Scanner;

/**
 * Created by amit on 11-Jul-2020
 */
public class Loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N >= 2 && N <= 20) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + "\tx\t" + i + "\t=\t" + N * i);
            }
        } else {
            System.out.println("Valid range is 2 <= N <=20");
        }
        sc.close();
    }
}
