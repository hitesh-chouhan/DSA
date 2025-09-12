package BinarySearch;

public class SerchInRotatedDuplicateArr {
    public static void main(String[] args) {
        int[] arr = {3,3,3,0,1,1,2,2};
        int t = 1;
        System.out.print(binarySearch(arr,t));
    }

    static boolean binarySearch(int[] arr, int t){
        int s = 0;
        int e = arr.length-1;
        int mid;

        while(s<=e){
            mid = s+(e-s)/2;

            if(arr[mid] == t){
                return true;
            }
            if(arr[mid] == arr[s] && arr[mid] == arr[e]){
                s++;
                e--;
                continue;
            }
            //if left part sorted
            if(arr[s]<=arr[mid]){
                if(arr[s]<=t && arr[mid]>=t){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }
            //if right part sorted
            else{
                if(arr[mid]<=t && arr[e]>= t){
                    s = mid+1;
                }
                else{
                    e = mid-1;
                }
            }
        }
        return false;
    }
}
