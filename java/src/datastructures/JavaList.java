package datastructures;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by amit on 10-Aug-2020
 */
public class JavaList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        /* Create and fill Linked List of Integers */
        ArrayList<Integer> list = new ArrayList();
        while (N-- > 0) {
            list.add(scan.nextInt());
        }

        /* Perform queries on Linked List */
        int Q = scan.nextInt();
        while (Q-- > 0) {
            String operation = scan.next();
            if (operation.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else {
                int index = scan.nextInt();
                list.remove(index);
            }
        }

        /* Print our updated Linked List */
        for (Integer element : list) {
            System.out.print(element + " ");
        }

        /* close scanner object */
        scan.close();
    }
}
