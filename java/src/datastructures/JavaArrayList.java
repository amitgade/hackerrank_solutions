package datastructures;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by amit on 10-Aug-2020
 */
public class JavaArrayList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        /* Save numbers in 2-D ArrayList */
        ArrayList<ArrayList<Integer>> lists = new ArrayList();
        for (int row = 0; row < n; row++) {
            int d = scan.nextInt();
            ArrayList<Integer> list = new ArrayList();
            for (int col = 0; col < d; col++) {
                list.add(scan.nextInt());
            }
            lists.add(list);
        }

        /* Answer the queries */
        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> list = lists.get(x - 1);
            if (y <= list.size()) {
                System.out.println(list.get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
