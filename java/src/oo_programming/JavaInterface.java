package oo_programming;

import java.util.Scanner;

/**
 * Created by amit on 18-Aug-2020
 */
public class JavaInterface {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    public int divisor_sum(int n) {
        if (n <= 1000 || n > 0) {
            int sum = n;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                }
            }
            return sum;
        } else {
            return 0;
        }
    }
}
