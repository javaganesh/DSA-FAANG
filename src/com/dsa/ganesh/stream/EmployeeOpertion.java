package com.dsa.ganesh.stream;

import java.util.Arrays;
import java.util.List;

public class EmployeeOpertion {
    public static void main(String[] args) {
        /*List<Employee> employees = Arrays.asList(
                new Employee(1, "Ganesh", "IT", 50000, 30),
                new Employee(2, "Amit", "HR", 40000, 28),
                new Employee(3, "Rahul", "IT", 60000, 32)
        );

        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

        System.out.println("===================");
        */
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ganesh", "IT", 50000, 30),
                new Employee(2, "Amit", "HR", 40000, 28),
                new Employee(3, "Rahul", "IT", 60000, 32)
        );

        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
        employees.stream()
                .map(Employee::getSalary)
                .forEach(System.out::println);

        employees.stream()
                .map(emp -> emp.getName() + " -> " + emp.getSalary())
                .forEach(System.out::println);

        long count = employees.stream()
                .count();

        System.out.println(count);

        long count1 = employees.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .count();

        System.out.println(count1);

        long count2 = employees.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .count();
        System.out.println(count2);
        //Count Employees Older Than 30
        long count3 = employees.stream()
                .filter(emp -> emp.getAge() > 30)
                .count();


    }
}
