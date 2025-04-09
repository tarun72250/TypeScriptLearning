package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Inpput : {1,5,4,2,1,4,7}
//Output : {1,4}
public class A_02_FIndDuplicateInArray {

	public static void main(String[] args) {
		
		int arr[] = {1,5,4,2,1,4,7};
		
		/*Set<Integer> uniqueNumber = new HashSet<Integer>();
		boolean isDuplicate = false;
		
		for(int i =0 ; i <arr.length ; i++)
		{
			if(uniqueNumber.contains(arr[i]))
			{
				isDuplicate = true;
				System.out.println("Duplicate Number :- "+arr[i] );
			}
			else
			{
				uniqueNumber.add(arr[i]);
			}
		}
		if(!isDuplicate)
		{
			System.out.println(-1);
		}*/
		
		//=============================================================================
		/*List<Integer> duplicates = new ArrayList<Integer>();
		
		for(int i =0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length;j++)
			{
				if(arr[i] == arr[j] && !duplicates.contains(arr[i]))
				{
					duplicates.add(arr[i]);
				}
			}
		}
		
		System.out.println(duplicates);*/
		

		//=============================================================================
		
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> duplicates = new HashSet<Integer>();
		
		for(int num : arr)
		{
			if(!unique.add(num))
			{
				duplicates.add(num);
			}
		}
		
		System.out.println(duplicates);
	}
}
