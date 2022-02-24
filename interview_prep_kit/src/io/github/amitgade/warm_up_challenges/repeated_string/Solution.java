package io.github.amitgade.warm_up_challenges.repeated_string;

import java.io.*;

/**
 * Created by amitgade on 24-Feb-2022
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */
    // TODO: 24/02/22 solution starts 
    public static long repeatedString(String s, long n) {
        long quotient = n / s.length();
        long remainder = n % s.length();
        return (quotient * findOccurrenceOfA(s, s.length())) + findOccurrenceOfA(s, remainder);
    }

    private static long findOccurrenceOfA(String s, long iterations) {
        long occurrenceOfA = 0;
        for (int i = 0; i < iterations; i++) {
            if (s.charAt(i) == 'a') {
                occurrenceOfA++;
            }
        }
        return occurrenceOfA;
    }

    // TODO: 24/02/22 solution ends 
}
