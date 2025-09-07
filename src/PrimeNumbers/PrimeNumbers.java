package PrimeNumbers;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean a = true;
        int c = 2;
        while (c*c <= n) {
            if (n % c == 0) {
                a = false;
                break;
            }
            c++;
        }
        System.out.print(a);
    }
}
