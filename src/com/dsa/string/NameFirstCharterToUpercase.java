package com.dsa.string;

public class NameFirstCharterToUpercase {
    public static void main(String[] args) {
        String str="ganes chandra parida";
        System.out.println(str);
        StringBuilder sb=new StringBuilder();
        String[] strArray=str.split(" ");
        /*for(int i=0;i<strArray.length;i++){
          //sb.append(doFirstCharcterToUperCase(strArray[i])).append(" ");
            sb.append(strArray[i]).substring(0,Character.toUpperCase(strArray[i].charAt(i)));

        }*/
        /*for (int i = 0; i < strArray.length; i++) {
            sb.append(Character.toUpperCase(strArray[i].charAt(0))) // Capitalize first letter
                    .append(strArray[i].substring(1)) // Append the rest of the word
                    .append(" "); // Add space between words
        }


        System.out.println(sb.toString());
*/
        StringBuilder sbrev = new StringBuilder("Ganesh");
        for (int i = 0; i < sbrev.length() / 2; i++) {
            char temp = sbrev.charAt(i);
            sbrev.setCharAt(i, sbrev.charAt(sbrev.length() - i - 1));
            sbrev.setCharAt(sbrev.length() - i - 1, temp);
        }
        System.out.println(sbrev.toString());




    }

    private static String doFirstCharcterToUperCase(String str) {
        str =Character.toUpperCase(str.charAt(0))+ str.substring(1);
        return str;
    }
}
