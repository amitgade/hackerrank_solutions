package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by amit on 20-Aug-2020
 */
public class JavaTryCatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            System.out.println(n1 / n2);
        } catch (InputMismatchException ime) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }
}
