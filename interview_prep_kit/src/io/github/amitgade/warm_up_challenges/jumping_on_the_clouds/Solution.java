package io.github.amitgade.warm_up_challenges.jumping_on_the_clouds;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by amitgade on 24-Feb-2022
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] cTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> c = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cTemp[i]);
            c.add(cItem);
        }

        int result = Result.jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */
    // TODO: 24/02/22 Solution starts
    public static int jumpingOnClouds(List<Integer> c) {
        int currentPosition = 0;
        int sizeOfList = c.size();
        int minimumJumps = 0;
        while (currentPosition < sizeOfList) {
            if (currentPosition + 2 < sizeOfList && c.get(currentPosition + 2) == 0) {
                currentPosition = currentPosition + 2;
            } else if (currentPosition + 1 < sizeOfList && c.get(currentPosition + 1) == 0) {
                currentPosition = currentPosition + 1;
            } else {
                break;
            }
            minimumJumps++;
        }
        return minimumJumps;
    }
    // TODO: 24/02/22 Solution ends
}