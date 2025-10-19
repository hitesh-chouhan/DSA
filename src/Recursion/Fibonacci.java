package Recursion;

//we use this code to find nth fibonacci number using recursion;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.print(find(3));
    }
    static int find(int n ){
        if(n<=1){
            return n; //we are returning n bcz when l will go to 1 it will return 1 while s will go to 0 will return 0;
        }
        int l = find(n-1);
        int s = find(n-2);
        return l+s;
    }
}
