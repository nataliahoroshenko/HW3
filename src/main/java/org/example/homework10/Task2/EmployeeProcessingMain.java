package org.example.homework10.Task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class EmployeeProcessingMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("Minnie", "Mouse", "01/02/2015");
        Employee e2 = new Employee("Mickie", "Mouse", "05/08/2000");
        Employee e3 = new Employee("Daffy", "Duck", "11/02/2011");
        Employee e4 = new Employee("Daisy", "Duck", "05/03/2013");
        Employee e5 = new Employee("Goofy", "Dog", "23/07/2020");

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        class EmployeeProcessor {
            private final Employee employee;
            private final int yearsWorked;
            private final String fullName;

            public EmployeeProcessor(Employee employee) {
                this.employee = employee;
                this.yearsWorked = calculateYearsWorked(employee.hireDate());
                this.fullName = constructFullName(employee.firstName(), employee.lastName());
            }

            private int calculateYearsWorked(String hireDate) {
                return LocalDate.now().getYear() - LocalDate.parse(hireDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear();
            }

            private String constructFullName(String firstName, String lastName) {
                return firstName + " " + lastName;
            }

            @Override
            public String toString() {
                return "Employee: " + fullName + ", Years Worked: " + yearsWorked;
            }
        }

        List<EmployeeProcessor> employeeProcessorList = new ArrayList<>();
        for (Employee emp : employeeList) {
            employeeProcessorList.add(new EmployeeProcessor(emp));
        }

        Comparator<EmployeeProcessor> nameComparator = Comparator.comparing(ep -> ep.fullName);
        Comparator<EmployeeProcessor> yearComparator = Comparator.comparingInt(ep -> ep.yearsWorked);

        System.out.println("Sorted by name:");
        printOrderedList(employeeProcessorList, nameComparator);
        System.out.println();
        System.out.println("Sorted by years worked:");
        printOrderedList(employeeProcessorList, yearComparator);
    }

    private static <T> void printOrderedList(List<T> list, Comparator<T> comparator) {
        list.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }
}
