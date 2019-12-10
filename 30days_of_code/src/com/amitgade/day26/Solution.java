package com.amitgade.day26;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @project hackerrank
 * @auther amit on 2019-05-04.
 */
public class Solution {
    /*public static void main(String[] args) {
        *//* Read and save input as LocalDates *//*
        Scanner scan = new Scanner(System.in);
        LocalDate returnDate = readDate(scan);
        LocalDate expectDate = readDate(scan);
        scan.close();


        int fine;

        if (returnDate.equals(expectDate) || returnDate.isBefore(expectDate)) {
            fine = 0;
        } else if (returnDate.getMonth() == expectDate.getMonth() && returnDate.getYear() == expectDate.getYear()) {
            fine = 15 * (returnDate.getDayOfMonth() - expectDate.getDayOfMonth());
        } else if (returnDate.getYear() == returnDate.getYear()) {
            fine = 500 * (returnDate.getMonthValue() - expectDate.getMonthValue());
        } else {
            fine = 500;
        }

        System.out.println(fine);

    }

    private static LocalDate readDate(Scanner scan) {
        int day   = scan.nextInt();
        int month = scan.nextInt();
        int year  = scan.nextInt();
        return LocalDate.of(year, month, day);
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String actualDate = sc.nextLine();
        String expectedDate = sc.nextLine();
        sc.close();
        int fine = 0;
        String[] dateDetail = actualDate.split(" ");
        String[] eDetail = expectedDate.split(" ");

        int aDate = Integer.parseInt(dateDetail[0]);
        int aMonth = Integer.parseInt(dateDetail[1]);
        int ayear = Integer.parseInt(dateDetail[2]);

        int eDate = Integer.parseInt(eDetail[0]);
        int eMonth = Integer.parseInt(eDetail[1]);
        int eYear = Integer.parseInt(eDetail[2]);

        if (ayear > eYear) {
            fine = 10000;
        } else if (ayear == eYear && aMonth > eMonth) {
            fine = 500 * (aMonth - eMonth);
        } else if (ayear == eYear && aMonth == eMonth && aDate > eDate) {
            fine = 15 * (aDate - eDate);
        }
        System.out.println(fine);
    }
}
