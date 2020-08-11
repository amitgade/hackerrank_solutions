package datastructures;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by amit on 11-Aug-2020
 */
public class JavaGenerics {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray"))
                count++;
        }

        if (count > 1) System.out.println("Method overloading is not allowed!");
    }
}

class Printer {

    public <T> void printArray(T[] arrray) {
        for (T item : arrray) {
            System.out.println(item);
        }
    }
}
