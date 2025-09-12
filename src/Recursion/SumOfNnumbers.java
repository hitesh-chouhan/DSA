package Recursion;

import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
        //using parametrized recursion
//    static void sum(int n,int s){
//        if(n<1){
//            System.out.println(s);
//            return;
//        }
//        sum(n-1, s+=n);
//    }

    // Using functional recursion: =>
            //functional recursion means the function is nonvoid instead it returns the value;

    static int sum(int n){
        if(n == 1 )return 1;
        return n*sum(n-1);
    }
}

