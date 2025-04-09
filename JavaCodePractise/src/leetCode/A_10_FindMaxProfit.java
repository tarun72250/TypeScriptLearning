package leetCode;


//link :- https://www.youtube.com/watch?v=KVWXC-u9nSk&list=PL_6klLfS1WqF1n0GbPCqk0rPDFAu1dzXC&index=3
//
public class A_10_FindMaxProfit {

	public static void main(String[] args) {
		
		int arr[] = {7,1,5,3,6,4};
		
		int max = maxProfit(arr);
		System.out.println("maxProfit :- "+max);
	}

	private static int maxProfit(int[] prices) {
		
		int minPrice = Integer.MAX_VALUE;//Buying value 
		int maxProfit = 0;
		
		 
		for(int i =0 ; i<prices.length; i++)
		{
			if(prices[i] < minPrice)
			{
				minPrice = prices[i];
			}
			else if(prices[i] - minPrice > maxProfit)
			{
				maxProfit= prices[i] - minPrice;
			}
		}
		return maxProfit;
	}
}
