package Recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(check(str,0,str.length()-1 ));
    }

    static boolean check(String str,int s, int e){
        if(str.charAt(s) == str.charAt(e)){
            s++;
            e--;
        } else { return false; }
        if(s<e){
            return true;
        }
        return  check(str, s, e);
    }
}
