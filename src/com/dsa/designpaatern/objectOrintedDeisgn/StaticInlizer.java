package com.dsa.designpaatern.objectOrintedDeisgn;

import java.util.Arrays;

public class StaticInlizer {
    public static int[] nums=intilzation();


    static {
         nums=new int[4];
         nums[0]=10;
         nums[1]=20;
         nums[2]=30;
         nums[3]=40;
     //    nums[4]=50;
    }

    public static int[] intilzation(){
        nums=new int[4];
        nums[0]=100;
        nums[1]=200;
        nums[2]=300;
        nums[3]=400;
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nums));
    }

}
