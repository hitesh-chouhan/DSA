package BinarySearch;

import java.sql.Statement;

public class SearchInRotatedSortedArr2 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,0,1,2};
        int t = 3;
        System.out.print(binarySearch(arr, t));
    }

    static int binarySearch(int[] arr, int t) {
        int s = 0;
        int e = arr.length - 1;
        int mid;
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (arr[mid] == t) {
                return mid;
            }

            //left part sorted
            if (arr[s] <= arr[mid]) {
                if (arr[mid] >= t && arr[s] <= t) {
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
            } else {
                if (arr[mid] <= t && arr[e] >= t) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }

}
