package com.java17;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Enter a grade ");
            String in =scanner.next();
            String grad =switch (in){
                case "A"-> "Excelnt";
                case "B"-> "Good";
                case "C"-> "Average";
                case "D"-> "Poor";
                default -> "Failed";
            };
            System.out.println(grad);
        }

    }

}
