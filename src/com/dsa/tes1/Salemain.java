package com.dsa.tes1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
  final class A{

}

public class Salemain {
    public static void main(String[] args) {

        /*List<Sale> saleList = new ArrayList<>();

        saleList.add(new Sale(1, "shoe" , 5, 50));

        saleList.add(new Sale(1, "watch" , 10, 150));

        saleList.add(new Sale(1, "spec" , 3, 50));

        saleList.add(new Sale(1, "socks" , 15, 20));

        saleList.add(new Sale(1, "mobile" , 25, 550));

        saleList.add(new Sale(1, "ring" , 5, 550));

        saleList.add(new Sale(1, "shoe" , 5, 50));

        saleList.add(new Sale(1, "watch" , 10, 150));

        saleList.add(new Sale(1, "spec" , 3, 50));

        saleList.add(new Sale(1, "socks" , 15, 20));

        saleList.add(new Sale(1, "mobile" , 25, 550));

        saleList.add(new Sale(1, "ring" , 5, 550));

        saleList.add(new Sale(1, "shoe" , 5, 50));

        saleList.add(new Sale(1, "watch" , 10, 150));

        saleList.add(new Sale(1, "spec" , 3, 50));

        saleList.add(new Sale(1, "socks" , 15, 20));

        saleList.add(new Sale(1, "mobile" , 25, 550));

        saleList.add(new Sale(1, "ring" , 5, 550));

        saleList.add(new Sale(1, "shoe" , 5, 50));

        saleList.add(new Sale(1, "watch" , 10, 150));

        saleList.add(new Sale(1, "spec" , 3, 50));

        saleList.add(new Sale(1, "socks" , 15, 20));

        saleList.add(new Sale(1, "mobile" , 25, 550));

        saleList.add(new Sale(1, "ring" , 5, 550));
*/
       /* System.out.println(
       saleList.stream().
                collect(Collectors
                        .groupingBy(Sale::getProduct,Collectors.summingInt(Sale::getQuantity))));*/



   String str1="listen";

   String str2="silent";

        System.out.println(  checkTwoStringCharterCinatineoneToOther(str1,str2));




    }

    private static boolean checkTwoStringCharterCinatineoneToOther(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;

        }
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);

    }
}
