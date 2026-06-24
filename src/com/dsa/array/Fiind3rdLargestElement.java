package com.dsa.array;

public class Fiind3rdLargestElement {
    private static void findThirdLargestElemnt(int[] arr) {
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;

        for(int ele:arr){
        if(ele>fmax){
            tmax=smax;
            smax=fmax;
            fmax=ele;
        }
        if(ele> smax && ele!=fmax){
            tmax=smax;
            smax=ele;
        }
            if(ele> tmax && ele!=fmax && ele!=smax){
                smax=ele;
            }

      }
        System.out.println(fmax+" "+smax+" "+tmax);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,10,10,15,15,20};
        findThirdLargestElemnt(arr);
    }


}
