package BinarySearch;

public class MinInRotatedSortedArr {
    public static void main(String[] args) {
        int[] arr = {3,1};
        System.out.print(binarySearch(arr));
    }

    static int binarySearch(int[] arr){
        int min = Integer.MAX_VALUE;
        int s = 0, e = arr.length-1, mid;
        while(s<=e){
            mid = s+(e-s)/2;
            if(arr[s] == arr[mid] && arr[mid] == arr[e]){
                min = Math.min(min,arr[mid]);
                s++;
                e--;
                continue;
            }
            if(arr[s]<=arr[mid]){
                min = Math.min(min,arr[s]);
                s = mid+1;
            }else{
                min = Math.min(min,arr[mid]);
                e = mid-1;
            }
        }
        return min;
    }
}
