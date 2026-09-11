package com.dp.composite;

public class CompositeEmployeeTest {
    public static void main(String[] args) {
        IEmployee employeeTester=new Employee("tester");
        IEmployee employeeDeveloper=new Employee("developer");

        Team team=new Team();
        team.setEmployees(employeeDeveloper);
        team.setEmployees(employeeTester);
        //team.setEmployees(employeeTeam);
        System.out.println(employeeTester.getSalary());
        System.out.println(employeeDeveloper.getSalary());
        System.out.println(team.getSalary());

    }
}
