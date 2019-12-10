package com.amitgade.day19;

/**
 * @project hackerrank
 * @auther amit on 2019-05-04.
 */
public class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {

        //return solution1(n);
        return solution2(n);
    }

    // Soln 1 : O(n)
    private int solution1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Soln 2 : O(n^1/2)
    private int solution2(int n) {
        int sum = 0;
        int sqrt = (int) Math.sqrt(n);

        int step = 1;
        if (n % 2 == 1) {
            step = 2;
        }


        for (int i = 1; i <=sqrt ; i+=step) {
            if (n % i == 0) {
                sum += i + n / i;
            }
        }

        // if sqrt is perfect sqrt e.g. 4,9,16,etc : we should only count it once
        // 16 - {1,2,4,4,8,16} >> 1+2+4+4+8+16 - 4  : subtract sqrt i.e. 4
        if (sqrt * sqrt == n) {
            sum -= sqrt;
        }
        return sum;
    }
}
