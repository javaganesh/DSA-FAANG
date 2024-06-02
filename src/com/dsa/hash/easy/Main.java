package com.dsa.hash.easy;

import java.util.*;

class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class PairComp implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {
        return o1.first - o2.first;
    }
}
public class Main {

    public static void the_helper(int[] a, List<Pair> res, int n){
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            // check if the map already has the number,
            // if yes, increase its count by 1, else add it to the map with count 1
            if(mp.containsKey(a[i]))
                mp.put(a[i], mp.get(a[i])+1);
            else
                mp.put(a[i], 1);
        }
        // loop through the map entries and add them to the result list as pairs
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            res.add(new Pair(entry.getValue(), entry.getKey()));
        }
       Collections.sort(res, new PairComp());
       // res.sort(new PairComp());


    }
    public static void main(String[] args) {
        int[] a = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
        List<Pair> res = new ArrayList<>();
        the_helper(a, res, 10);
        // reverse the result list to get it in descending order of frequency
        Collections.reverse(res);
        // loop through the result list and swap pairs with
        // equal frequencies if the second element of the earlier
        // pair is greater than the second element of the later pair
        for(int i = 0; i < res.size()-1; i++){
            if(res.get(i).first == res.get(i+1).first){
                for(int j = i; j < res.size(); j++){
                    if(res.get(i).second > res.get(j).second && res.get(i).first == res.get(j).first){
                        Pair temp = res.get(j);
                        res.set(j, res.get(i));
                        res.set(i, temp);
                    }
                }
            }
        }
        System.out.println();
        // loop through the result list and print each pair's
        //second element the number of times indicated by its first element
        for(Pair p : res){
            for(int i = 0; i < p.first; i++){
                System.out.print(p.second + " ");
            }
        }
    }


    }

