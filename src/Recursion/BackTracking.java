package Recursion;

import java.util.Scanner;

public class BackTracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    static void print(int i){
        if(i<1)return;
        print(i-1);
        System.out.println(i);
    }
}
