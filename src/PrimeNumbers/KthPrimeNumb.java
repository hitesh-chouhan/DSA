package PrimeNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//given an input and need to find kth prime number
//example: => input 1, output 2; bcz first prime number is 2; likewise 2nd prime number is 3
public class KthPrimeNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int n = 86028121;
        boolean[] arr = new boolean[n+1];

        Arrays.fill(arr,true);
        arr[0] = arr[1] = false;

        for(int i = 2 ; i*i<=n; i++){
            if(arr[i]){
                for(int j = i*i; j<=n; j+=i){
                    arr[j] = false;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        for(int i = 2 ; i<=n ; i++){
            if(arr[i]){
                list.add(i);
            }
        }

        System.out.print(list.get(a-1));
    }
}
