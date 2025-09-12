package Recursion;

public class Basic {
    public static void main(String[] args) {
        print();
    }

    static int c = 0;

    static void print(){
        if(c == 5){
            return;
        }
        System.out.println(c);
        c++;
        print();
    }
}
