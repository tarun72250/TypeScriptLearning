package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//How to remove elements from unsorted array 

//input arr :{5,1,2,6,4,4,5};//Duplicate element
//output arr :{5,1,2,6,4};//unique element


//Method 1 :- Sorting (First sort the array and then remove the duplicate elements from an array.
public class A_07_RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
		int arr [] = {5,1,2,3,33,6,4,4,5};
		removeDuplicateUsingSorting(arr);
		System.out.println();
		removeDuplicateUsingHashing(arr);
	}
	
	public static void removeDuplicateUsingSorting(int arr[]) 
	{
		Arrays.sort(arr);
		
		int len = arr.length;
		int j = 0;
		
		for(int i =0 ; i <len-1; i++ )
		{
			//if value present from i or i+1 index is not equal
			if(arr[i] != arr[i+1])
			{
				arr[j++] = arr[i];
			}
		}
		
		arr[j++] = arr[len - 1];
		for(int k =0 ; k<j ; k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
	
	public static void removeDuplicateUsingHashing(int arr[])
	{
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		int length = arr.length;
		
		for(int i =0; i < length-1 ; i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i] + 1));
			}
			else
			{
				map.put(arr[i],1);
			}
		}
		
		map.forEach((k,v)->System.out.print(k+" "));
	}
	
	
}
