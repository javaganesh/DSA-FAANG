package com.dsa.ganesh.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Find_Department_Having_Highest_Total_Salary {

    private static Map<String, Double> sal;

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ganesh", "IT", 30, 50000),
                new Employee(2, "Rahul", "IT", 25, 70000),
                new Employee(3, "Suresh", "IT", 35, 60000),
                new Employee(4, "Amit", "HR", 28, 40000),
                new Employee(5, "Priya", "HR", 22, 60000),
                new Employee(6, "John", "Admin", 40, 45000),
                new Employee(7, "David", "Admin", 32, 55000)
        );
        employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(  employees.stream()
                .collect(Collectors.summingDouble(Employee::getSalary)));
        sal = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary))
                );
        System.out.println(sal);
        Map.Entry<String, Double> result = sal.entrySet().stream()
                .max(Map.Entry.comparingByValue()).orElse(null);
        System.out.println("result:"+result);

        String department =
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::getDepartment,
                                        Collectors.summingDouble(
                                                Employee::getSalary
                                        )
                                )
                        )
                        .entrySet()
                        .stream()
                        .max(
                                Map.Entry.comparingByValue()
                        )
                        .map(Map.Entry::getKey)
                        .orElse(null);

        System.out.println(department);
    }
}
