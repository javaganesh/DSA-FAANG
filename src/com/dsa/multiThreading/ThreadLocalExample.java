package com.dsa.multiThreading;

class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class UserContext {

    static User currentUser;

}
public class ThreadLocalExample {
    private static final ThreadLocal<String> currentUser = new ThreadLocal<>();
    public static void main(String[] args) {
        Runnable task1 = () -> {
            currentUser.set("Ganesh");
            System.out.println(
                    Thread.currentThread().getName()
                            + " -> "
                            + currentUser.get());
            currentUser.remove();
        };
        Runnable task2 = () -> {
            currentUser.set("Rahul");
            System.out.println(
                    Thread.currentThread().getName()
                            + " -> "
                            + currentUser.get());
            currentUser.remove();
        };

        Thread t1 = new Thread(task1, "Thread-1");
        Thread t2 = new Thread(task2, "Thread-2");

        t1.start();
        t2.start();



    }

}
