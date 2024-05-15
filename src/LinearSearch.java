public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4,23,65,23,9,12,43,92};
        int target = 9;
        int result = search(arr, target);
        if ( result >= 0 ) {
            System.out.println("Target found at index "+result);
        }else{

        System.out.println("Element does not exist in the array");
        }
    }
    static int search(int[] arr,int target){
        if(arr.length == 0)
            return -1;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] == target)
                return index;
        }
        return -1;
    }
//    static int mySqrt(int x){
//        if(x == 0 ){
//            return 0;
//        }
//        if(x == 1 ){
//            return 1;
//        }
//        int start = 1;
//        int end = x;
//        int mid = Integer.MAX_VALUE;
//        while(start<= end){
//            mid = start + (end - start) / 2;
//            if(mid == x){
//                return mid;
//            } else if (mid > x) {
//                start = mid + 1;
//            }else{
//                end = mid - 1;
//            }
//        }
//
//        return mid;
//    }
}
