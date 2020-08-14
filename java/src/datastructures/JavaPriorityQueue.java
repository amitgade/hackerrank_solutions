package datastructures;

import java.util.*;

/**
 * Created by amit on 14-Aug-2020
 */
public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName() + ", CGPA: " + st.getCGPA() + ", ID: " + st.getID());
            }
        }
    }

    static class Student {
        private int ID;
        private String name;
        private double CGPA;

        public Student(int id, String name, double CGPA) {
            super();
            this.ID = id;
            this.name = name;
            this.CGPA = CGPA;
        }

        public int getID() {
            return ID;
        }

        public String getName() {
            return name;
        }

        public double getCGPA() {
            return CGPA;
        }
    }

    static class Priorities {

        /**
         * Java 8
         **/
//        PriorityQueue<JavaPriorityQueue.Student> data = new PriorityQueue(Comparator
//                .comparing(JavaPriorityQueue.Student::getCGPA)
//                .reversed()
//                .thenComparing(JavaPriorityQueue.Student::getName)
//                .thenComparing(JavaPriorityQueue.Student::getID));

        /**
         * Java 7
         **/
        PriorityQueue<Student> studentsQueue = new PriorityQueue<>(1000, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getCGPA() < o2.getCGPA()) {
                    return 1;
                } else if (o1.getCGPA() > o2.getCGPA()) {
                    return -1;
                } else if (o1.getName().equals(o2.getName())) {
                    if (o1.getID() > o2.getID()) {
                        return 1;
                    } else if (o1.getID() < o2.getID()) {
                        return -1;
                    } else {
                        return 0;
                    }
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

        public List<Student> getStudents(List<String> events) {

            for (String event : events) {
                String[] instruction = event.split(" ");
                String task = instruction[0];

                if (task.equals("ENTER")) {
                    String name = instruction[1];
                    double cgpa = Double.parseDouble(instruction[2]);
                    int id = Integer.parseInt(instruction[3]);
                    Student s = new Student(id, name, cgpa);
                    studentsQueue.add(s);
                } else if (task.equals("SERVED") && !studentsQueue.isEmpty()) {
                    studentsQueue.remove();
                }
            }

            List<Student> students = new ArrayList<>();
            Student first = this.studentsQueue.poll();
            if (first != null) {
                while (first != null) {
                    students.add(first);
                    first = this.studentsQueue.poll();
                }
            }
            return students;
        }
    }
}
