package org.example.homework12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", 23, 95));
        students.add(new Student("Bob", 20, 82));
        students.add(new Student("Carol", 21, 92));

        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        students.stream()
                .filter(student -> student.getAge() > 20)
                .map(Student::getName)
                .forEach(System.out::println);

        students.stream()
                .filter(student -> student.getGrade() >= 90)
                .map(Student::getName)
                .forEach(System.out::println);

        double averageGrade = students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0.0);
        System.out.println("Average grade: " + averageGrade);

        Student highestGradeStudent = students.stream()
                .max((s1, s2) -> Integer.compare(s1.getGrade(), s2.getGrade()))
                .orElse(null);
        System.out.println("Student with highest grade: " + highestGradeStudent.getName());

        long below60Count = students.stream()
                .filter(student -> student.getGrade() < 60)
                .count();
        System.out.println("Number of students with grade below 60: " + below60Count);
    }
}
