package Recursion;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //print(n,1);
        printByBackTracking(n, 1);
    }

    static void print(int n,int i){
        if(n<i){
            return;
        }
        System.out.println(n);
        print(--n,i);
    }

    //using Backtracking;
    static void printByBackTracking(int n, int i){
        if(n<i) return;
        printByBackTracking(n, i+1);
        System.out.println(i);
    }
}
