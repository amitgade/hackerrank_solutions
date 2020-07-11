package introduction;

import java.util.Scanner;

/**
 * Created by amit on 11-Jul-2020
 */
public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.format("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");
        sc.close();
    }
}
