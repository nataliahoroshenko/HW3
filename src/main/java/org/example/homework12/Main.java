package org.example.homework12;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        List<Student> students = createSampleData();

        printAllStudentNames(students);
        printNamesOfOlderStudents(students, 20);
        printNamesOfAStudents(students);
        printAverageGrade(students);
        printHighestGradeStudent(students);
        printCountBelow60(students);
    }
    private static List<Student> createSampleData() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", 22, 95));
        students.add(new Student("Bob", 19, 80));
        students.add(new Student("Charlie", 20, 100));
        students.add(new Student("Donna", 21, 59));
        return students;
    }
    private static void printAllStudentNames(List<Student> students) {
        System.out.println("All student names:");
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }
    private static void printNamesOfOlderStudents(List<Student> students, int ageLimit) {
        System.out.println("Students older then " + ageLimit);
        students.stream()
                .filter(student -> student.getAge() > ageLimit)
                .map(Student::getName)
                .forEach(System.out::println);
    }
    private static void printNamesOfAStudents(List<Student> students) {
        System.out.println("Students with A grade:");
        students.stream()
                .filter(student -> student.getGrade() >= 90)
                .map(Student::getName)
                .forEach(System.out::println);
    }
    private static void printAverageGrade(List<Student> students) {
        OptionalDouble averageGrade = students.stream()
                .mapToInt(Student::getGrade)
                .average();
        averageGrade.ifPresent(avg -> System.out.println("Average grade: " + avg));
    }
    private static void printHighestGradeStudent(List<Student> students) {
        Student highestGradeStudent = students.stream()
                .max((s1, s2) -> Integer.compare(s1.getGrade(), s2.getGrade()))
                .orElse(null);
        System.out.println("Student with highest grade: " + highestGradeStudent.getName());
    }
    private static void printCountBelow60(List<Student> students) {
        long below60Count = students.stream()
                .filter(student -> student.getGrade() < 60)
                .count();
        System.out.println("Number of students with grade below 60: " + below60Count);
    }
}

