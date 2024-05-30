package DSA;

import java.util.Arrays;

public class FindFirstAndLast {

    public static void main(String[] args) {
        int[] arr = {7,7,7,8,8,10,15,18};
        int target = 7;

        System.out.println("Answer : "+Arrays.toString(searchFirstAndLast(arr,target))); // Answer : [1, 3];
    }

    static int[] searchFirstAndLast(int[] arr, int target){
        int[] ans = {-1, -1};
        ans[0] = binarySearch( arr, target, true) ;
         ans[1] = binarySearch( arr, target,false);

        if(ans[0] == ans[1]){
            ans[1] = -1;
        }
        return ans;
    }
    static int binarySearch(int[] arr, int target, boolean findStart){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }else{
                ans = mid;
                if(findStart){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

            }
        }
        return ans;
    }

}
