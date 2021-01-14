package bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by amit on 10-Aug-2020
 */

/*

I use isProbablePrime() with certainty = 10 to achieve 99.9% accuracy.
However, even certainty = 1 (which achieves 50% accuracy) is enough to
pass the HackerRank test cases.

isProbablePrime() is always 100% certain if it tells you if a number
is "not prime". If it says "prime", it's only 99.9% certain. It may be
the case that it just hasn't found a prime number number that divides
the BigInteger yet.

 */
public class JavaPrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        System.out.println(new BigInteger(n).isProbablePrime(10) ? "prime" : "not prime");

        scanner.close();
    }
}
