package com.dsa.ganesh.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OldestEmployee {
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
        /*System.out.println(employees.stream()
                .collect(Collectors
                        .groupingBy(employee -> employee.getAge(),
                                Collectors.maxBy(Comparator.comparing(Employee::getAge)))));*/

        Map<String, Employee> result =
                employees.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::getDepartment,
                                        Collectors.collectingAndThen(
                                                Collectors.minBy(
                                                        Comparator.comparing(
                                                                Employee::getAge
                                                        )
                                                ),
                                                opt -> opt.orElse(null)
                                        )
                                )
                        );
       // System.out.println(result);

        result.forEach(
                (dept, emp) ->
                        System.out.println(
                                dept + " -> " + emp
                        )
        );


    }
}
