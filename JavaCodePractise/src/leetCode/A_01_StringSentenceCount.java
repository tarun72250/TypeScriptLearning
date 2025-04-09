package leetCode;

public class A_01_StringSentenceCount {

	public static void main(String[] args) {

		String input = "a2b3c1d4e5f2";
		String result = usingForLoop(input);
		System.out.println("Input :-"+input);
		System.out.println("Output :- "+result);
		
		System.out.println("--------------------------------\n");
	
		StringBuilder result2 = usingWhileLoop(input);
		System.out.println("Input :-"+input);
		System.out.println("Output :- "+result2);
	}
	
	
	static StringBuilder usingWhileLoop(String input)
	{
		StringBuilder result = new StringBuilder();
		
		int i = 0;
		while(i < input.length())
		{
			char letter = input.charAt(i);
			int count = input.charAt(i+1)-'0';
			
			
			for(int j=0 ; j<count ; j++)
			{
				result.append(letter);
			}
			i +=2;
		}
		return result;
	}
	
	
	
	static String usingForLoop(String input)
	{
		String result = "";
		for(int i = 0; i<input.length();i += 2)
		{
			char letter = input.charAt(i);//a
			
			int count = input.charAt(i + 1)-'0';//2
			
			String temp = "";
			for(int j =0 ; j < count; j++)
			{
				temp += letter;
			}
			result +=temp;
		}
		return result;
	}
}
