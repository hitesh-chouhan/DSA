package BinarySearch;

import java.util.Scanner;

public class SearchInRotatedSortedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = 0;
        int p = findPivot(arr, n);
        boolean ans;
        if (arr[p] <= t && t <= arr[n - 1]) {
            ans = binarySearch(arr, p, n - 1, t);
        } else {
            ans = binarySearch(arr, 0, p, t);
        }

        System.out.print(ans);
    }

    static int findPivot(int[] arr, int n) {
        int s = 0;
        int e = n - 1;
        int mid = s + (e - s) / 2;
        while (s < e) {
            if (arr[mid] == arr[s] && arr[mid] == arr[e]) {
                s++;
                e--;
            }
            if (arr[mid] > arr[0]) {
                s = mid + 1;
            } else {
                e = mid;
            }
            mid = s + (e - s) / 2;
        }
        System.out.print("pivot is = " + s);
        return s;  // pivot index
    }

    static boolean binarySearch(int[] arr, int s, int e, int t) {
        int mid = s + (e - s) / 2;
        while (s <= e) {
            if (arr[mid] == t) {
                return true;
            }
            if (arr[mid] < t) {
                s = mid + 1;
            }
            if (arr[mid] > t) {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return false;
    }
}
