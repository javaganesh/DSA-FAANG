package com.dsa.array.subArray;

public class SubarraySum {
    public static void main(String[] args) {
        SubarraySum arraysum = new SubarraySum();
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        arraysum.subArraySum(arr, n, sum);
    }

    private void subArraySum(int[] arr, int n, int sum) {
      int currentSum=0;
      for(int i=0;i<n;i++){
          currentSum=arr[i];
          if(currentSum==sum){
              System.out.println("Sum found at indexe "
                      + i);
              return;
          }
          else {
              for (int j = i + 1; j < n; j++) {
                  currentSum += arr[j];

                  if (currentSum == sum) {
                      System.out.println(
                              "Sum found between indexes " + i
                                      + " and " + j);
                      return;
                  }
              }
          }

      }
        System.out.println("No subarray found");
        return;
    }


}
