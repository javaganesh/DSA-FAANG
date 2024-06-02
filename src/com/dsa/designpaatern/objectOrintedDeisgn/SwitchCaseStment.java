package com.dsa.designpaatern.objectOrintedDeisgn;

public class SwitchCaseStment {
    public static void main(String[] args) {

        int val=0;
        for(int i=1;i<10;i++){

             val =switch (i){
                case 1,2,3-> 10;
                case 4,5,6,7->20;
                
                 default -> 0;
            };
            System.out.println(val);
        }






    }
}
