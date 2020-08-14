package datastructures;

import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by amit on 14-Aug-2020
 */
public class JavaBitSet {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);

        while (M-- > 0) {
            String operation = sc.next();
            int arg1 = sc.nextInt();
            int arg2 = sc.nextInt();

            switch (operation) {
                case "AND":
                    if (arg1 == 1) {
                        B1.and(B2);
                    } else {
                        B2.and(B1);
                    }
                    break;
                case "OR":
                    if (arg1 == 1) {
                        B1.or(B2);
                    } else {
                        B2.or(B1);
                    }
                    break;
                case "XOR":
                    if (arg1 == 1) {
                        B1.xor(B2);
                    } else {
                        B2.xor(B1);
                    }
                    break;
                case "SET":
                    if (arg1 == 1) {
                        B1.set(arg2);
                    } else {
                        B2.set(arg2);
                    }
                    break;
                case "FLIP":
                    if (arg1 == 1) {
                        B1.flip(arg2);
                    } else {
                        B2.flip(arg2);
                    }
                    break;
                default:
                    break;
            }
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
        sc.close();
    }
}
