package com.dsa;

import java.util.*;

public class virtusatest {
    private static List<Integer> findUniquElemntAndreturnDuplicateAtLast(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        /*Set<Integer> set = new HashSet<>();
        for (int element : arr) {
             if(!set.contains(element))
            set.add(element);
             else{
                 list.addLast(element);
             }


        }
         List<Integer>  uniqList=new ArrayList<>(set);

        for(int i=0;i<uniqList.size();i++){
            list.add(i,uniqList.get(i));
        }



   return list;
*/
        Map<Integer ,Integer> freq=new HashMap<>();

        for(int elem:arr){
            if(freq.containsKey(elem)){
                freq.put(elem,freq.get(elem)+1);
            }
            else{
                freq.put(elem,1);
            }
        }

        System.out.println("freqmap:"+freq);
        LinkedList<Integer> list12 = new LinkedList<>();
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            if(entry.getValue()==1){
                list12.addFirst(entry.getKey());
            }
            
        }
        return list12;
}






    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,4,5};
       List<Integer> list=findUniquElemntAndreturnDuplicateAtLast(arr);
       System.out.println(list);
    }



}
