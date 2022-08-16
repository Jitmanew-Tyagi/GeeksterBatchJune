import java.lang.Math;
public class BinarySearch {
	public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 8, 8, 8, 8 ,8,  8, 8, 8, 8, 10, 11, 13, 13, 13, 13, 13, 13, 13, 114};
        System.out.println(binarySearchFirstOccurance(arr, 80));
    }

    public static int binarySearch(int[] arr, int ele) {
        int s = 0, e = arr.length - 1;
        
        while(s <= e) {
            int mid = (s + e) / 2; //better
            if(arr[mid] == ele) return mid;
            else if(arr[mid] <  ele) s = mid + 1;
            else e = mid - 1;
        }

        return -1;
    }

    
    public static int binarySearchFirstOccurance(int[] arr, int ele) {
        int s = 0, e = arr.length - 1;
        int ans = -1;
        while(s <= e) {
            int mid = (s + e) / 2; //better
            if(arr[mid] == ele)  {
                ans = mid;
                e = mid - 1;
            }
            else if(arr[mid] <  ele) s = mid + 1;
            else e = mid - 1;
        }

        return ans;
    }

    // leetcode 34
    // class Solution {
    // public int[] searchRange(int[] nums, int target) {
    //     return new int[] {binarySearchMulti(nums, target, true), 
    //                      binarySearchMulti(nums, target, false)};
    // }
    
    // public int binarySearchMulti(int[] arr, int ele, boolean focc) {
    //     int s = 0, e = arr.length - 1;
    //     int ans = -1;
    //     while(s <= e) {
    //         int mid = (s + e) / 2; //better
    //         if(arr[mid] == ele)  {
    //             ans = mid;
    //             if(focc == true) e = mid - 1;
    //             else s = mid + 1;
    //         }
    //         else if(arr[mid] <  ele) s = mid + 1;
    //         else e = mid - 1;
    //     }

    //     return ans;
    // }
// }
}

