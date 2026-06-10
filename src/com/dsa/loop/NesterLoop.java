package com.dsa.loop;

import java.util.Arrays;

public class NesterLoop {
    public static void main(String[] args) {
        int[] arr={2,3,10,7,1,4,5};
        int[] res=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            int d=0;
            boolean falg=false;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] < arr[j]){
                    d=j-i;
                    falg=true;
                    break;
                }

            }
            if(!falg){
                res[i]=-1;
            }
            else {

                res[i] = d;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
