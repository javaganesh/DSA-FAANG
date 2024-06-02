package com.dsa.tes1;

public class Accolidigittal2 {
    public static void main(String[] args) {
        int[] arr= {1,1,0,1,1,1};
        //We can Apply Kanedian algorithm here
        int countOne=0;
        int result=Integer.MIN_VALUE;

        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                result=Math.max(result,countOne);
                countOne=0;
            }
            else {
                countOne++;
                result=Math.max(result,countOne);
            }
        }

        System.out.println("maxConsCutive:"+result);
    }
}
