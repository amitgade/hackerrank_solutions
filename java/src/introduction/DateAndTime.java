package introduction;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by amit on 11-Jul-2020
 */
public class DateAndTime {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        sc.close();

        // using java.time.LocalDate
//        LocalDate dt = LocalDate.of(year, month, day);
//        System.out.println(dt.getDayOfWeek());

        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        String dayOfWeek = getDayOfWeek(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(dayOfWeek);
    }

    private static String getDayOfWeek(int value) {
        String day = "";
        switch (value) {
            case 1:
                day = "SUNDAY";
                break;
            case 2:
                day = "MONDAY";
                break;
            case 3:
                day = "TUESDAY";
                break;
            case 4:
                day = "WEDNESDAY";
                break;
            case 5:
                day = "THURSDAY";
                break;
            case 6:
                day = "FRIDAY";
                break;
            case 7:
                day = "SATURDAY";
                break;
        }
        return day;
    }

}
