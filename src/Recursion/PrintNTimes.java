package Recursion;

import java.util.Scanner;

public class PrintNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1,n);
    }

    static void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Hitesh");
        print(++i,n);
    }
}
