package bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by amit on 10-Aug-2020
 */
public class JavaBigInteger {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BigInteger n1 = scanner.nextBigInteger();
        BigInteger n2 = scanner.nextBigInteger();

        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));

        scanner.close();
    }
}
