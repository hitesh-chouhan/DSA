package PrimeNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class leastPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //sieve
        int[] arr = new int[n+1];
        Arrays.fill(arr,1);
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2 ; i<=n ; i++){
            if(arr[i] == 1){
                arr[i] = i;
                for(int j = i*i; j<=n; j+=i){
                    if(arr[j] == 1) {
                        arr[j] = i;
                    }
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
