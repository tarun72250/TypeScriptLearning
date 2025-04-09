package leetCode;

//link :- https://www.youtube.com/watch?v=F18x5El3WbM&list=PL_6klLfS1WqF1n0GbPCqk0rPDFAu1dzXC&index=1
public class A_08_ConvertToLowerCase {
	
	public static void main(String[] args) {

		String s1 = "Hello Bolo Tello";
		String result =toLowerCase(s1);
		System.out.println(result);
		String result1 =toLowerCase1(s1);
		System.out.println(result1);
		
	}

	private static String toLowerCase1(String s1) {
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : s1.toCharArray())
		{
			if(c >= 65 && c <= 90)
			{
				//c = (char)(c + 32);
				c = (char)(c -  'A' + 'a');
			}
			sb.append(c);
		}
		
		return sb.toString();
	}

	private static String toLowerCase(String s1) {

		char ch[] = s1.toCharArray();
		for(int i=0 ; i<ch.length;i++)
		{
			if(ch[i] >= 65 && ch[i] <= 90)
			{
				ch[i] = (char) (ch[i] + 32) ;
			}
		}
		return String.valueOf(ch);	
	}

}
