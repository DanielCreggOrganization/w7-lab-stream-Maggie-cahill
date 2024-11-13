package ie.atu.streamlab;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Student {
    private String name;
    private int age;
    private double gpa;

    public Student (String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }


    // Getters
    public String getName() { return name;}
    public int getAge() {return age;}
    public double getGpa() {return gpa;}
}

class StreamExercise1 {
    public static void main (String[]args) {
        List <Student> students = new ArrayList<>();
        students.add(new Student("Maggie", 20, 4.0));
        students.add(new Student("Zainab", 21, 3.5));
        students.add(new Student("Chloe", 22, 3.4));
        students.add(new Student("Magda", 20, 3.89));
        students.add(new Student("Jordan", 19, 2.5));
        students.add(new Student("Izak", 18, 3.2));
        students.add(new Student("Yuko", 24, 2.7));
        students.add(new Student("Riley", 17, 3.1));

        // Convert to stream, filter, sort, map and print
        students.stream() 
                .filter(s -> s.getAge() > 20) // Filter out students under 20
                .sorted(Comparator.comparing(Student::getGpa).reversed()) //sort based on gpa descending
                .map(s -> String.format("Name: %-10s  GPA: %.2f", s.getName(), s.getGpa()))
                .forEach(System.out::println);
    }
}

