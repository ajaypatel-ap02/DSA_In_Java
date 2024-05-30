package DSA;

class MountainArraySearch{
	public static void main(String[] args){
		int[] arr = {2,3,6,5,4,1};
		int target = 1;
		int peak = peakIndex(arr);
		int index = binarySearch(arr, target, 0, peak);
		if(index < 0){
			index = binarySearch(arr, target, peak + 1, arr.length - 1);
		}
		System.out.println(index);
	}
	//this function returns the peak element index of a mountain array
	//take an array as input
	public static int peakIndex(int[] arr){
		int start = 0;
		int end = arr.length;
		while(start < end){
			int mid = start + (end - start) / 2;
			if(arr[mid] > arr[mid + 1]){
				end = mid ;
			}
			else{
				start = mid + 1;
			}			
		}
		return start;
	}
	//return the index of target element in the arr
	//take array, target and start-end point as input
	//work on both Ascendending and Descending order arrays
	public static int binarySearch(int[] arr, int target, int start, int end){
		boolean isAsc = arr[start] < arr[end];
		while(start <= end){
			int mid = start + (end - start) / 2;
			if(arr[mid] == target){
				return mid;
			}
			if(isAsc){

				if(target < arr[mid]){
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}else{
				if(target > arr[mid]){
					end = mid + 1;
				}else{
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}