package day17;

/**
 * @project hackerrank
 * @auther amit on 2019-05-04.
 */
public class Calculator {

    public int power(int n, int p) {
        if (n < 0 || p < 0) {
            throw new RuntimeException("n and p should be non-negative");
        }

        return (int) Math.pow(n, p);
    }
}
