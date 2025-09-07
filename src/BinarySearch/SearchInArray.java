package BinarySearch;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,9};
        int target = 8;
        int ans = -1;

        int s = 0;
        int e = arr.length-1;
        int m = s+(e-s)/2;

        while(s<=e){
            if(arr[m] == target){
                ans = m;
                break;
            }
            if(target>arr[m]){
                s = m+1;
            }else{
                e = m-1;
            }
            m = s+(e-s)/2;
        }
        System.out.print(ans);
    }
}
