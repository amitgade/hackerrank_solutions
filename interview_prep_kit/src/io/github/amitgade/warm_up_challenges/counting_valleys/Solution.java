package io.github.amitgade.warm_up_challenges.counting_valleys;

import java.io.*;

/**
 * Created by amitgade on 24-Feb-2022
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int numValley = 0;
        int currentLevel = 0;

        for (int i = 0; i < steps; i++) {
            char currentStep = path.charAt(i);
            if (currentStep == 'D') {
                currentLevel--;
            } else if (currentStep == 'U') {
                currentLevel++;
            }

            if (currentLevel == 0) {
                if (currentStep == 'U') {
                    numValley++;
                }
            }
        }
        return numValley;
    }
}
