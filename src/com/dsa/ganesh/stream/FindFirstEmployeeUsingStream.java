package com.dsa.ganesh.stream;

import java.util.*;
import java.util.stream.Collectors;

public class FindFirstEmployeeUsingStream {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Ganesh", "IT", 50000, 30),
                new Employee(2, "Amit", "HR", 40000, 28),
                new Employee(3, "Rahul", "IT", 60000, 32)
        );

        Optional<Employee> employee =
                employees.stream()
                        .findFirst();

        employee.ifPresent(System.out::println);

        Employee emp =
                employees.stream()
                        .findFirst()
                        .orElse(null);

        System.out.println(emp);
        Employee emp2 =
                employees.stream()
                        .findFirst()
                        .orElse(
                                new Employee(0, "Default",
                                        "NA", 0, 0)
                        );
        System.out.println(emp2);
        Employee empIt =
                employees.stream()
                        .filter(e -> e.getDepartment().equals("NonIT"))
                        .findFirst()
                        .orElse( new Employee(0, "Default",
                                "NA", 0, 0));
        System.out.println(empIt);

        employees.stream()
                .map(Employee::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        employees.stream()
                .map(employee1 -> employee1.getName()+"@gmail.com")
                .forEach(System.out::println);
        employees.stream()
                .filter(employee1 -> employee1.getSalary() > 5000)
                .map(employee1 -> employee1.getName())
                .forEach(System.out::println);

        employees.stream()
                .map(Employee::getName)
                .map(String::trim)
                .map(String::toLowerCase)
                .map(name -> "Mr. " + name)
                .forEach(System.out::println);

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(employee1 -> {
                    System.out.println(employee1);
                });
        //find the highrt salary of employee
        System.out.println("find the highrt salary of employee: ");
        System.out.println(employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null));
        System.out.println("find the lowest salary of employee: ");
        System.out.println(employees.stream().min(Comparator.comparing(Employee::getSalary)).orElse(null));
        employees.stream()
                .sorted(Comparator.comparing(
                                Employee::getSalary
                        ).reversed()
                )
                .limit(2)
                .forEach(System.out::println);


        employees.stream()
                .sorted(
                        Comparator.comparing(
                                Employee::getAge
                        )
                )
                .forEach(emp4 ->
                        System.out.println(
                                emp4.getName() + " -> " +
                                        emp4.getAge()
                        )
                );

        employees.stream()
                .sorted(
                        Comparator.comparing(
                                Employee::getAge
                        ).reversed()
                )
                .forEach(emp5 ->
                        System.out.println(
                                emp5.getName() + " -> " +
                                        emp5.getAge()
                        )
                );
        System.out.println("Oldest Employee");
        Employee oldest =
                employees.stream()
                        .max(
                                Comparator.comparing(
                                        Employee::getAge
                                )
                        )
                        .orElse(null);

        System.out.println(oldest.getName());
        //2 olderst employee
        employees.stream()
                .sorted(
                        Comparator.comparing(
                                Employee::getAge
                        ).reversed()
                )
                .limit(2)
                .forEach(emp3 ->
                        System.out.println(
                                emp3.getName() + " -> " +
                                        emp3.getAge()
                        )
                );
        employees.stream()
                .sorted(
                        Comparator.comparing(Employee::getAge)
                                .thenComparing(Employee::getName)
                                .thenComparing(Employee::getSalary)
                )
                .forEach(System.out::println);

        employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);

        Employee lowestSalaryEmployee =
                employees.stream()
                        .min(
                                Comparator.comparing(
                                        Employee::getSalary
                                )
                        )
                        .orElse(null);

        System.out.println(
                lowestSalaryEmployee.getName() +
                        " -> " +
                        lowestSalaryEmployee.getSalary()
        );


        double lowestSalary =
                employees.stream()
                        .map(Employee::getSalary)
                        .min(Double::compare)
                        .orElse(0.0);

        System.out.println(lowestSalary);


        System.out.println("=====================================");
        Employee emp4 =
                employees.stream()
                        .filter(e -> e.getDepartment().equals("IT"))
                        .min(
                                Comparator.comparing(
                                        Employee::getSalary
                                )
                        )
                        .orElse(null);
        System.out.println(emp4);
        System.out.println("except top");
        employees.stream()
                .sorted(
                        Comparator.comparing(
                                Employee::getSalary
                        ).reversed()
                )
                .skip(1)
                .forEach(System.out::println);
        Map<Integer, Employee> result =
                employees.stream()
                        .collect(
                                Collectors.toMap(
                                        Employee::getId,
                                        emp1 -> emp1,
                                        (oldValue, newValue) -> oldValue
                                )
                        );
        System.out.println(result);

        Double secondHighestSalary =
                employees.stream()
                        .map(Employee::getSalary)
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .orElse(null);

        System.out.println(secondHighestSalary);

    }
}
