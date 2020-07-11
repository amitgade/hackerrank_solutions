package day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @project hackerrank
 * @auther amit on 2019-05-04.
 */
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> list = new ArrayList<String>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            String regExPattern = "[a-z].@gmail.com";

            Pattern p = Pattern.compile(regExPattern);
            Matcher m = p.matcher(emailID);
            if (m.find()) {
                list.add(firstName);
            }
        }

        Collections.sort(list);
        for (String string : list) {
            System.out.println(string);
        }

        scanner.close();
    }
}
