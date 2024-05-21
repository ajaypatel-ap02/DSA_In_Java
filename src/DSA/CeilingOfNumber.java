package DSA;

import java.util.Scanner;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,12,14,20,36,48};
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer taerget");
        int target = sc.nextInt();
        int index = searchCeiling(arr,target);
        System.out.println(index);
    }
    static int searchCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end])
            return -1;

        while(start<=end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid] )
                return mid;
            else if(target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;

        }
        return start;
    }
    
}
