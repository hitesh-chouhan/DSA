package PrimeNumbers;

import java.util.Scanner;

//to find the all prime numbers between 1 to n;
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        boolean[] arr = new boolean[n + 1]; //the size will be n+1 bcz the array will start from 0 ;

        for (int i = 0; i <= n; i++) {
            arr[i] = true;
        }
        arr[0] = false; // bcz 0 and 1 are not prime;
        arr[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            if (arr[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
