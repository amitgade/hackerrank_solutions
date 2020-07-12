package strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by amit on 12-Jul-2020
 */
public class Anagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    private static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

//        return solveWithHashMap(a, b);

        return solveWithoutHashMap(a, b);
    }

    private static boolean solveWithoutHashMap(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (b.indexOf(ch) != -1) {
                b = b.replaceFirst(ch + "", "");
            } else {
                return false;
            }
        }
        return b.length() == 0;
    }

    private static boolean solveWithHashMap(String a, String b) {

        HashMap<Character, Integer> map = new HashMap();

        /* Fill HashMap with 1st String */
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            map.merge(ch, 1, Integer::sum);
        }

        /* Compare 2nd String to 1st String's HashMap */
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
