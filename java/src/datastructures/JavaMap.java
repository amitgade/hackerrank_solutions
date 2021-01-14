package datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by amit on 10-Aug-2020
 */
public class JavaMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> phoneEntries = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneEntries.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phoneEntries.containsKey(s)) {
                System.out.println(s + "=" + phoneEntries.get(s));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
