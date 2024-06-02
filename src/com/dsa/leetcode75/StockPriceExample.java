package com.dsa.leetcode75;

import java.util.HashMap;
import java.util.TreeMap;

class StockPrice {

    HashMap<Integer,Integer> timeToprice;
    TreeMap<Integer,Integer> priceTofreq;
    int lastTime;

    public StockPrice() {
        timeToprice=new HashMap<>();
        priceTofreq=new TreeMap<>();
        lastTime=0;
    }

    public void update(int timestamp, int price) {
     lastTime=Math.max(lastTime,timestamp);
     if(timeToprice.containsKey(timestamp)){
         int oldprice=timeToprice.get(timestamp);
         int freqOldprice=priceTofreq.get(price);

         if(freqOldprice==1){
             priceTofreq.remove(oldprice);
         }
         else {
             priceTofreq.put(oldprice,freqOldprice-1);
         }
         int currentFreqOfNewPrice=priceTofreq.getOrDefault(price,0);
          priceTofreq.put(price,currentFreqOfNewPrice+1);

          timeToprice.put(timestamp,price);
     }
    }

    public int current() {

        return timeToprice.get(lastTime);
    }

    public int maximum() {

        return priceTofreq.lastKey();
    }

    public int minimum() {

        return priceTofreq.firstKey();
    }
}

/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */


public class StockPriceExample {
    public static void main(String[] args) {

    }
}
