package io.github.amitgade.warm_up_challenges.sales_by_match;

import java.io.*;
import java.util.*;

/**
 * Created by amitgade on 24-Feb-2022
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    // TODO: 24/02/22 Solution Starts
    public static int sockMerchant(int n, List<Integer> ar) {
        Set<Integer> setOfStocks = new HashSet<>();
        int pairs = 0;
        for (Integer stockColor : ar) {
            if (setOfStocks.contains(stockColor)) {
                setOfStocks.remove(stockColor);
                pairs++;
            } else {
                setOfStocks.add(stockColor);
            }
        }
        return pairs;
    }
    // TODO: 24/02/22 Solution ends
}

