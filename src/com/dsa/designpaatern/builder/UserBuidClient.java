package com.dsa.designpaatern.builder;

public class UserBuidClient {
    public static void main(String[] args) {
        User user1=new User.UserBuildrer("Ganesh","Parida","SSE").buid();
        User user2=new User.UserBuildrer("Amit","Parida","SSE").setAge(29).buid();
        User user3=new User.UserBuildrer("Sambeet","Parida","SSE").setAge(22).buid();
        User user4=new User.UserBuildrer("Sunil","Sahu","SSE").setAge(30).setMob(8018267321l).buid();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);

    }
}
