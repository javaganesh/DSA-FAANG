package com.dsa.backTracking1;

class Employee {

    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
 class EmployeeContext {

    private static final ThreadLocal<Employee> employeeThreadLocal =
            new ThreadLocal<>();

    public static void setEmployee(Employee employee) {
        employeeThreadLocal.set(employee);
    }

    public static Employee getEmployee() {
        return employeeThreadLocal.get();
    }

    public static void clear() {
        employeeThreadLocal.remove();
    }
}
public class ThreadLocalDemo {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            Employee employee =
                    new Employee(101, "Ganesh", "IT");
            EmployeeContext.setEmployee(employee);
            System.out.println(
                    Thread.currentThread().getName()
                            + " -> "
                            + EmployeeContext.getEmployee()
            );

            EmployeeContext.clear();
        };

        Runnable task2 = () -> {
            Employee employee =
                    new Employee(102, "Rahul", "HR");
            EmployeeContext.setEmployee(employee);
            System.out.println(
                    Thread.currentThread().getName()
                            + " -> "
                            + EmployeeContext.getEmployee()
            );
            EmployeeContext.clear();
        };
        Thread t1 = new Thread(task1, "Thread-1");
        Thread t2 = new Thread(task2, "Thread-2");
        t1.start();
        t2.start();

    }
}
