package coreJavaPractise;

public class A_01_AutoBoxing {

	public static void main(String[] args) {
		
		int i = 100;
		
		Integer j = Integer.valueOf(i);//internally these process will be run like these 
		
		Integer ab = i ;
		
		System.out.println(i);
		
		System.out.println(j);

		System.out.println(ab);
		
	}
}
