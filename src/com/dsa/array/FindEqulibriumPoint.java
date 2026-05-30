package com.dsa.array;

public class FindEqulibriumPoint {
    private static int findEquilibriumIdx(int[] nums, int n) {

        int leftSum, rightSum;

        for (int i = 0; i < n; i++) {
            leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            rightSum = 0;
            for (int j = i + 1; j < n; j++) {
                rightSum += nums[j];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 5;
        int nums[] = { 1,2,3,4,3,2,1};
        int equilibriumidx = findEquilibriumIdx(nums, n);
        int equilibriumidx1 = findEquilibriumIdxOptimise(nums, n);
        System.out.println(equilibriumidx1);
    }

    private static int findEquilibriumIdxOptimise(int[] nums, int n) {
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];

        }
        int leftSum=0,rightSum=totalSum;
        for(int j=0;j<n;j++){
            rightSum-=nums[j];
            if(leftSum==rightSum){
                return j;
            }
            leftSum+=nums[j];
        }
        return -1;
    }


}
