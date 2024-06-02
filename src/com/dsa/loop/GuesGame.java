package com.dsa.loop;

import java.util.Locale;
import java.util.Scanner;

public class GuesGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to guess game");
        int number;
        do{
            System.out.print("Enter a number  you guss:");
            number=sc.nextInt();
        }while (!checkMathingnumber(number));
        System.out.println("your guess number is :"+number);
    }
    public static int generateRandomNumberToGuess(){
        return  (int) (Math.random() * 10) + 1;
    }
    public static boolean checkMathingnumber(int number){
          return  generateRandomNumberToGuess() == number;

    }
}
