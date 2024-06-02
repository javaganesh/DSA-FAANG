package com.dsa.hash.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveMinimumNumberOfElements {
    public static int minRemove(int a[], int b[], int n,
                                int m)
    {
        int res=0;
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<n;i++){
            map1.put(a[i],map1.get(a[i])==null?1:map1.get(a[i]+1));

        }
        for(int i=0;i<m;i++){
            map2.put(b[i],map2.get(b[i])==null?1:map2.get(b[i]+1));
        }
        Set<Integer> s = map1.keySet();
        for(Integer e:s){
            if(map2.containsKey(e)){
                res += Math.min(map2.get(e),
                        map2.get(e));
            }
        }




        return res;
    }
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 2, 3, 4, 5, 8 };
        int n = a.length;
        int m = b.length;

        System.out.println(minRemove(a, b, n, m));
    }
}
