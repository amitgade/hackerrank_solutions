package datastructures;

import java.util.*;

/**
 * Created by amit on 11-Aug-2020
 */
public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        // Sort Students
        Collections.sort(studentList, new StudentComparator());

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    double epsilon = 0.001; // since we shouldn't use "==" with doubles

    @Override
    public int compare(Student student1, Student student2) {
        if (Math.abs(student1.getCgpa() - student2.getCgpa()) > epsilon) {
            return (student1.getCgpa() < student2.getCgpa() ? 1 : -1); // descending order
        } else if (!student1.getFname().equals(student2.getFname())) {
            return student1.getFname().compareTo(student2.getFname());
        } else {
            return student1.getId() - student2.getId();
        }
    }
}
