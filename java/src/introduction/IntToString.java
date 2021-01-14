package introduction;

import java.util.Scanner;

/**
 * Created by amit on 11-Jul-2020
 */
public class IntToString {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
            //String s=???; Complete this line below
            String s = Integer.toString(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

