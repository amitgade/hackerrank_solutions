package datastructures;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

// ArrayDeque is "likely to be faster than Stack when used as a stack" - Java documentation

/**
 * Created by amit on 10-Aug-2020
 */
public class JavaStack {

    public static void main(String[] args) {

        /* Create HashMap to match opening brackets with closing brackets */
        HashMap<Character, Character> map = new HashMap();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        /* Test each expression for validity */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            System.out.println(isBalanced(input, map) ? "true" : "false");
        }

        sc.close();
    }

    private static boolean isBalanced(String expression, HashMap<Character, Character> map) {

        // odd length Strings are not balanced
        if ((expression.length() % 2) != 0) {
            return false;
        }

        // use deque as a stack
        ArrayDeque<Character> deque = new ArrayDeque();

        for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }
}
