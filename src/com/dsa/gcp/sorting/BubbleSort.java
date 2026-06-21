package com.dsa.gcp.sorting;

public class BubbleSort {
    private static void bubbleSort(int[] unSorrtedArray) {
        int n=unSorrtedArray.length;
       for(int i=0;i<n;i++){
           boolean isSorted=true;
           for(int j=0;j<n-1;j++){
               if(unSorrtedArray[j]>unSorrtedArray[j++]){
                   isSorted=true;
                   break;
               }
           }
           /*if(isSorted==true) {
               System.out.println("Array is Already sorted");
               break;
           }*/
           for(int j=0;j<n-1-i;j++){
               if(unSorrtedArray[j]> unSorrtedArray[j+1]){
                   int temp=unSorrtedArray[j];
                   unSorrtedArray[j]=unSorrtedArray[j+1];
                   unSorrtedArray[j+1]=temp;
               }
           }
       }

        printArray(unSorrtedArray);


    }
    private static void printArray(int[] unSorrtedArray) {
        for(int ele:unSorrtedArray){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int[] unSorrtedArray={1,4,5,-33,-4,8,90,30,80};
        int[] sorrtedArray={-2,1,2,3,4,5,6};
        System.out.println("BeforeSorting array:");
        printArray(unSorrtedArray);

        bubbleSort(unSorrtedArray);
        bubbleSort(sorrtedArray);
    }




}
