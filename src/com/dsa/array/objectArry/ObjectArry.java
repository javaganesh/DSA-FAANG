package com.dsa.array.objectArry;

public class ObjectArry {
    public static Employee[] createEmployeeArry(){

        Employee employee1=new Employee(101,"ganesh","ganesh.amit94@gmail.com");
        Employee employee2=new Employee(102,"Rakesh","Rak.amit94@gmail.com");
        Employee employee3=new Employee(103,"Suresh","suresh@gmail.com");
        Employee employee4=new Employee(104,"Dinesh","Suresh4@gmail.com");

        Employee[] emplyeeArr={employee1,employee2,employee3,employee4};

        return emplyeeArr;
    }

    public static void main(String[] args) {
        Employee[] emparry=createEmployeeArry();
        for(Employee emp:emparry){
            System.out.println(emp.getId()+"---> "+emp.getName()+"--> "+emp.getEmail());
        }
    }
}
