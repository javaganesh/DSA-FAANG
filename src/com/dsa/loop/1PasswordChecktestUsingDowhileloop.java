package com.dsa.loop;

import java.util.Scanner;

class PasswordChecktestUsingDowhileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to my application");
        String password=null;
        do{
            System.out.print("Enter yourpassoword:");
            password=sc.next();

        }while (!passwordChecker(password));
        System.out.println("you have enter correct password:"+password);
    }
    public static boolean passwordChecker(String str){
        return str.length()>6;

    }
}
