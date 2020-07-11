package day21;

/**
 * @project hackerrank
 * @auther amit on 2019-05-04.
 */
public class Printer<T> {

    /**
     *    Method Name: printArray
     *    Print each element of the generic array on a new line. Do not return anything.
     *    @param array
     **/
    public void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}
