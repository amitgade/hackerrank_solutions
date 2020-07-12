package strings;

import java.util.Scanner;

/**
 * Created by amit on 12-Jul-2020
 */
public class StringReverse {
    public static void main(String[] args) {

        /* If a String is equivalent to itself when reversed, it's a palindrome */
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        if(A.equals(new StringBuilder(A).reverse().toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
