import java.util.Scanner;

public class FloorOFNumber {

    public static void main(String[] args) {
        int[] arr = {2,4,6,9,12,14,20,36,48};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target");
        int target = sc.nextInt();
        int index = searchFloor(arr,target);
        System.out.println(index);
    }
    static int searchFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if(target < arr[start])
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
        return end;
    }

}
