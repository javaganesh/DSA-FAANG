package com.dsa.array.subArray;

public class SmallestSubArraySum {
    static int smallestSubWithSum(int arr[], int n, int x) {
//  Initialize length of smallest subarray as n+1
        int min_len = n + 1;

        for (int start = 0; start < n; start++)
        {
            int curr_sum = arr[start];
            if(curr_sum>x){
                return 1;
            }

            // Try different ending points for current start
            for (int end = start + 1; end < n; end++)
            {
                // add last element to current sum
                curr_sum += arr[end];

                // If sum becomes more than x and length of
                // this subarray is smaller than current smallest
                // length, update the smallest length (or result)
                if (curr_sum > x && (end - start + 1) < min_len)
                    min_len = (end - start + 1);

            }

        }

        return min_len;
    }
        public static void main(String[] args) {

            int arr1[] = {1, 4, 45, 6, 10, 19};
            int x = 51;
            int n1 = arr1.length;
            int res1 = smallestSubWithSum(arr1, n1, x);
            if (res1 == n1+1)
                System.out.println("Not Possible");
            else
                System.out.println(res1);


            int arr2[] = {1, 10, 5, 2, 7};
            int n2 = arr2.length;
            x = 9;
            int res2 = smallestSubWithSum(arr2, n2, x);
            if (res2 == n2+1)
                System.out.println("Not Possible");
            else
                System.out.println(res2);

            int arr3[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
            int n3 = arr3.length;
            x = 280;
            int res3 = smallestSubWithSum(arr3, n3, x);
            if (res3 == n3+1)
                System.out.println("Not Possible");
            else
                System.out.println(res3);
    }
}
