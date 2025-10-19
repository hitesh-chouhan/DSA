//Longest Subarray with sum K

package Hashing;

import java.util.HashMap;

public class LongestSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2,0,0,0,-3};
        int k = 2;
        int s = 0,r, len = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            s +=arr[i];
            if(s == k){
                len = Math.max(len,i+1);
            }
            r = s-k;
            if(map.containsKey(r)){
                len = Math.max(len,i-map.get(r));
            }
            if(!map.containsKey(s)) {
                map.put(s, i);
            }
        }
        System.out.println(len);
    }

}
