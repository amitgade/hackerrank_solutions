package strings;

import java.util.Scanner;

/**
 * Created by amit on 12-Jul-2020
 */
public class SubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();

        System.out.println(S.substring(start,end));
    }
}
