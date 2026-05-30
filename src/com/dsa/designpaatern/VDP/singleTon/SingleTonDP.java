package com.dsa.designpaatern.VDP.singleTon;

 class Employee{

     private static Employee employee=null;

     private Employee(){

     }
     public  static Employee getEmployee(){
         if(employee==null){
             synchronized (Employee.class){
                 if(employee==null){
                     employee=new Employee();
                     return employee;
                 }
             }

         }
         return employee;

     }

 }


public class SingleTonDP {
    public static void main(String[] args) {
       /*  Employee employee1=Employee.getEmployee();
         Employee employee2=Employee.getEmployee();*/
       // System.out.println(employee1==employee2);

        Runnable runnable1=()->{
            Employee employee1=Employee.getEmployee();
            System.out.println(employee1.hashCode());
        };
        Runnable runnable2=()->{
            Employee employee2=Employee.getEmployee();
            System.out.println(employee2.hashCode());
        };
        Thread thread1=new Thread(runnable1);
        Thread thread2=new Thread(runnable2);
        thread1.start();
        thread2.start();
    }
}
