package coreJavaPractise;

public class A_02_Auto_Un_Boxing {

	public static void main(String[] args) {
		
		Integer i = new Integer(100);
		
		int ab = i.intValue();//internally these process will be run like these 
		
		int j = i;
		System.out.println(i);
		System.out.println(ab);
		System.out.println(j);
		
	}
}
