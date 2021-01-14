package day12;

/**
 * @project hackerrank
 * @auther amit on 2019-05-04.
 */
public class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }


    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    public char calculate() {
        int avg = 0;
        for (int score : testScores) {
            avg += score;
        }

        avg =  Math.round(avg / testScores.length);

        if (avg <= 100 && avg >= 90) {
            return 'O';
        } else if (avg < 90 && avg >= 80) {
            return 'E';
        } else if (avg < 80 && avg >= 70) {
            return 'A';
        } else if (avg < 70 && avg >= 55) {
            return 'P';
        }else if (avg < 55 && avg >= 40) {
            return 'D';
        }else {
            return 'T';
        }
    }
}
