package Hashing;

public class NumberOfOccInString {
    public static void main(String[] args) {
        char a = 'a';
        String s = "abacbd";
        int[] hash = new int[256]; // or new int[256] in case of UpperCase;

        for(int i = 0; i<s.length(); i++){
            hash[s.charAt(i)-'a']++;
        }
        System.out.println(hash[a-'a']);

    }
}
