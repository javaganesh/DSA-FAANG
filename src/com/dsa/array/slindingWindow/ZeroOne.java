package com.dsa.array.slindingWindow;

public class ZeroOne {
    public static int smallestSubstring(String s){

        int res = Integer.MAX_VALUE;

        // To check 0, 1 and 2
        boolean zero = false, one = false, two = false;

        int zeroindex = 0, oneindex = 0, twoindex = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zeroindex=i;
                zero=true;

            }
           else if(s.charAt(i)=='1'){
                oneindex=i;
                one=true;

            }
            else if(s.charAt(i)=='2'){
                twoindex=i;
                two=true;

            }

            if (zero && one && two){
                res = Math.min(
                        res,
                        Math.max(zeroindex,
                                Math.max(oneindex, twoindex))
                                - Math.min(
                                zeroindex,
                                Math.min(oneindex, twoindex)));
            }

        }
        if (res == Integer.MAX_VALUE)
            return -1;
        return res + 1;
    }
    public static void main(String[] args) {
        String s = "01212";
        System.out.print(smallestSubstring(s));
    }
}
