package BinarySearch;

public class MinInRotatedSortedArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,};
        System.out.print(binarySearch(arr));
    }

/*Note: The index of minimum element in an array is the amount of rotation required to sort an array;
    steps:
        1: find the mid of the array;
        2: compare the mid with adjacent elements previous and next if both are bigger that it is minimum;
        3: if first condition does not satisfy then search for an unsorted half because minimum element. always lie in this;
        4: update starting point and ending point to get unsorted half and repeat;
 */

    static int binarySearch(int[] arr){
        int s = 0;
        int n = arr.length;
        int e = n-1;
        int prev, nxt;
        int mid = s+(e-s)/2;

        while(s<=e){
            if(arr[s] <= arr[e]){
                return s;              // this we considered the best case condition [1,2,3,4,5];
            }
            nxt = (mid+1)%n;           // if mid is at the last index, the next element will jump to 0 using this formula;
            prev = (mid+n-1)%n;        //if mid is at 0th index, the prev element will jump to last;

            if(arr[mid]<=arr[nxt] && arr[mid]<=arr[prev]){
                return mid;
            }
            if(arr[s]<=arr[mid]){ //checking the left half is sorted;
                s = mid+1; //to go in unsorted half;
            }
            else if(arr[mid]<=arr[e]){ //checking the left half is sorted;
                e = mid-1; //to go in unsorted half;
            }
            mid = s+(e-s)/2;
        }
        return 0;
    }



    //..............another method;
  /*  static int binarySearch(int[] arr){
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
   */
}
