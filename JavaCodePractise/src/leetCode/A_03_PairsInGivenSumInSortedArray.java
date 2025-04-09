package leetCode;

//FInd pairs with given Sum in a sorted Array

//Given an array A of N size
//We need to find all pairs in the array that su to a number equal to K.
//if no such pair exists then output will be -1.

//For ex :- 
//arr[] = {1,2,3,4,5,6,7};
//sun = 9;


//Output :- pair (2,7) (3,6) (4-5)

public class A_03_PairsInGivenSumInSortedArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		
		int sum = 9;
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low < high)
		{
			if(arr[low] + arr[high] > sum)
			{
				high--;
			}
			else if(arr[low] + arr[high] < sum)
			{
				low++;
			}
			else if(arr[low] + arr[high] == sum)
			{
				System.out.println("Pair :("+arr[low]+" , "+arr[high]+" )");
				low++;
				high--;
			}
			
		}
		
	}
}
