package leetCode;

//find the largest element in an array :-
//link :- https://www.youtube.com/watch?v=F18x5El3WbM&list=PL_6klLfS1WqF1n0GbPCqk0rPDFAu1dzXC&index=2
public class A_09_PeakIndexInAMountainArray {

	
	
	public static void main(String[] args) {
	
		int arr [] = {0,2,4,6,8,6,4,2,1,0};
		for(int i=0 ; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		int result1 = peakIndexInMountainArray1(arr);
		System.out.println("\nIndex :-"+result1+" Value :-"+arr[result1]);
		int result = peakIndexInMountainArray(arr);
		System.out.println("\nIndex :-"+result+" Value :-"+arr[result]);
	}

	private static int peakIndexInMountainArray1(int[] arr) {

		int low = 0, high = arr.length - 1;
		while(low < high)
		{
			 int mid = low + (high - low)/2; 
			 if(arr[mid] < arr[mid+1])
			 {
				 low = mid+1;
			 }
			 else
			 {
				 high = mid;
			 }
		}
		return low;
	}

	private static int peakIndexInMountainArray(int[] arr) {
		
		int i =0 ;
		
		while(arr[i] < arr[i+1])
		{
			i++;
		}
		
		return i;
	}
}
