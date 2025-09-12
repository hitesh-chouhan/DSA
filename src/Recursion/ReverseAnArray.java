package Recursion;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {3,4,6,1,3,5};
        System.out.println(Arrays.toString(reverse(0, arr.length - 1, arr)));
    }

    static int[] reverse(int s, int e, int[] arr){
        if(s>=e){
            return arr;
        }
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        return reverse(s+1,e-1,arr);
    }
}
