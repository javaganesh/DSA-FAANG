package com.dsa.recursion_level2;

public class SearchElementUSingRecursion {
    static boolean search(int[] arr, int index, int target) {

        if(index == arr.length)
            return false;

        if(arr[index] == target)
            return true;

        return search(arr, index + 1, target);
    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(search(arr, 0, 40));
    }

//    private static int search(int[] arr, int idx, int ele) {
//         if(arr.length-1== idx){
//             return -1;
//         }
//
//
//        int isFound=search(arr,idx+1,ele);
//         if(isFound==-1){
//             if(arr[idx]==ele) {
//                 return idx;
//             }
//             else{
//                 return -1;
//             }
//         }
//         else{
//             return isFound;
//         }
//    }
}
