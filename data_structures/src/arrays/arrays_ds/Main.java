package arrays.arrays_ds;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by amit on 21-Jul-2020
 */
public class Main {
    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int[] a_reverse = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            a_reverse[a.length - 1 - i] = a[i];
        }
        return a_reverse;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();
        int[] arr = new int[t];

        for (int i = 0; i < t; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int[] reverse = reverseArray(arr);

        // For testing purpose
//        for (int i : reverse) {
//            System.out.println(i);
//        }
    }

}
