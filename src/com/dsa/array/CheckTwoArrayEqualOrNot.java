package com.dsa.array;

public class CheckTwoArrayEqualOrNot {
    public static void main(String[] args) {
        // Initializing the first array
        int[] a = { 10, 30, 12 };
        // Initializing the second array
        int[] b = { 10, 30, 12 };

        // store the result
        boolean result = true;
        result= checktwoArrayEqualOrNot(a,b,result);
        System.out.println(result);
    }

    private static boolean checktwoArrayEqualOrNot(int[] a, int[] b, boolean result) {

        if(a.length==b.length){
            for(int i=0;i< a.length;i++){
                if (a[i] != b[i]) {
                    result = false;
                    break;
                }

            }

        }
        else{
            return result=false;
        }
        if(result){
            result=true;
        }
        return result;
    }
}
