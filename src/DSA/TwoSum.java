package DSA;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
       int[] numbers = {2,7,11,15};
       int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }

    static public int[] twoSum(int[] numbers, int target) {
        int[] ans = {-1, -1};
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int sum = numbers[start] + numbers[end];
            if (sum < target) {
                start += 1;
            } else if (sum > target) {
                end -= 1;
            } else {
                ans[0] = start;
                ans[1] = end;
                break;
            }
        }
        return ans;
    }

}
