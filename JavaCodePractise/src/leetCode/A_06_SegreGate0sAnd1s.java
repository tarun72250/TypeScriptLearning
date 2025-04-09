package leetCode;


//Segragate 0s and 1s in an random array 
//wap to to segragate 0s on one side and 1s on another side of the array.

//Input arr=[0,1,0,1,0,0,1];
//Output arr=[0,0,0,0,1,1,1];


public class A_06_SegreGate0sAnd1s {

	public static void main(String[] args) {
		
		int arr[] = {0,1,0,1,0,0,1,0,1,1,0};
		
		int j=0;
		for(int i = 0 ; i<arr.length;i++)
		{
			//if value at index is equal to 0 
			if(arr[i] == 0)
			{
				arr[j++] =arr[i];
			}
		}
		
		//we have already move zero , now the remaining value is 1 
		while(j < arr.length)
		{
			arr[j++] =1;
		}
		
		for(int k=0 ; k<arr.length;k++)
		{
			System.out.print(arr[k] + " ");
		}
		
	}
}
