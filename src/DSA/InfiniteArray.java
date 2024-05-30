package DSA;

class InfiniteArray{
	public static void main(String[] args){
		int[] arr = {11,22,33,44,55,66,77,88,99,111,144,188,222,235};			
		int target = 99;
		System.out.println(ans(arr,target));
	}
	public static int ans(int[] arr, int target){
		int start = 0;
		int end = 1;
		while(target > arr[end]){
			int temp = end + 1;
			end = end + (end - start + 1) * 2;
			start = temp;
		}

		return binarySearch(arr,target,start,end);

	}
	public static int binarySearch(int[] arr,int target, int start, int end){
		while(start <= end){
			int mid = start + (end - start) / 2;
			if(arr[mid] > target){
				end = mid - 1;
			}else if(arr[mid] < target){
				start = mid + 1;
			}else{
				return mid;
			}
		}
		return -1;
	}

}