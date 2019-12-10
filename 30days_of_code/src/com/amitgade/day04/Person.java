package com.amitgade.day04;

/**
 * @project hackerrank
 * @auther amit on 2019-05-04.
 */
public class Person {
    private int age;

    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        age = initialAge;
        if (age < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }

    }

    public void yearPasses() {
        // Increment this person's age.
        age++;
    }
}
