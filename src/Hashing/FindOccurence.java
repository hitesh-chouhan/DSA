package Hashing;
//in hashing we create an array
public class FindOccurence {
    public static void main(String[] args) {
        int[] hash = new int[100000000];
        int n = 3;
        int[] arr = {1,2,3,2,4,1,3,3,3};

        for (int j : arr) {
            hash[j] += 1;
        }
        System.out.println(hash[n]);

    }
}
