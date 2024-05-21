package DSA;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = {2,4,6,9,14,18,36,48,55};
        int target = sc.nextInt();
        int result = search(arr,target);

        if(result >= 0)
            System.out.println("the index of "+target+" is "+result);
        else
            System.out.println("the element entered does not exist");
    }
    static int search(int[] arr ,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
