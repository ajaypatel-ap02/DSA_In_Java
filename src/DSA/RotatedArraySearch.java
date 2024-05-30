package DSA;

class RotatedArraySearch {
	public static void main(String[] args){
		int[] arr = {55,66,77,88,99,11,22,33,44};
		int target = 33;
		int pivot = findPivot(arr);
		int ans = binarySearch(arr, target, 0, pivot);
		if(ans < 0 ){
			ans = binarySearch(arr, target, pivot + 1, arr.length - 1);
		}
		System.out.println(ans);
	}
	public static int findPivot(int[] arr){
		int start = 0;
		int end = arr.length - 1;
		while(start < end){
			int mid = start + (end - start) / 2;
			if(arr[mid] < arr[mid+1]){
				start = mid + 1;
			}else{
				end = mid;
			}
		}
		return start;
	}
	
	public static int binarySearch(int[] arr, int target, int start, int end){
		boolean isAsc = arr[start] < arr[end];
		while(start <= end){
			int mid = start + (end - start) / 2;
			if(arr[mid] == target){
				return mid;
			}
			if(isAsc){
				if(target > arr[mid]){
					start = mid + 1;
				}else{
					end = mid - 1;
				}
			}else{
				if(target < arr[mid]){
					start = mid + 1;
				}else{
					end = mid -1;
				}
			}
		}
		return -1;
	}
}