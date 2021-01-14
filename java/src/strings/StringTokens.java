package strings;

import java.util.Scanner;

/**
 * Created by amit on 12-Jul-2020
 */
public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Write your code here.

        s = removeLeadingNonLetters(s);

        /* Check special cases */
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        /* Split on all non-alphabetic characters */
        String[] words = s.split("[^A-Za-z]+");

        /* Print output */
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }

    }

    private static String removeLeadingNonLetters(String s) {
        int i;
        for (i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                break;
            }
        }
        return s.substring(i);
    }
}
