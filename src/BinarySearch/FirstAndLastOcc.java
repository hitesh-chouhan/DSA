package BinarySearch;

public class FirstAndLastOcc {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 8, 8};
        int t = 9;
        int ans = -1;
        int fo = firstOccurence(arr, t);
        int lo = lastOccurence(arr, t);
        System.out.println("First Occurence = " + fo + " " + "last Occurence = " + lo);
        int total = lo - fo + 1;
        System.out.print("Total occurrence " + total);
    }

    static int firstOccurence(int[] arr, int t) {
        int s = 0;
        int e = arr.length-1;
        int ans = -1, mid;

        while (s <= e) {
            mid = s + (e - s) / 2;
            if (arr[mid] == t) {
                ans = mid;
                e = mid - 1;
            }
            if (arr[mid] < t) {
                s = mid + 1;
            }
            if (arr[mid] > t) {
                e = mid - 1;
            }
        }
        return ans;
    }

    static int lastOccurence(int[] arr, int t) {
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (arr[mid] == t) {
                ans = mid;
                s = mid + 1;
            }
            if (arr[mid] < t) {
                s = mid + 1;
            }
            if (arr[mid] > t) {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }


}
