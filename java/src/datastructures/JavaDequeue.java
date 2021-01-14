package datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by amit on 11-Aug-2020
 */
public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);

            if (deque.size() == m) {
                max = Math.max(set.size(), max);
                int item = deque.remove();
                if (!deque.contains(item)) {
                    set.remove(item);
                }
            }
        }
        System.out.println(max);
        in.close();
    }
}
