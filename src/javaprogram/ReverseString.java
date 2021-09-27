package javaprogram;

import java.util.Scanner;

public class ReverseString {

	static String 	name;
	public static void main(String[] args) {

		//1. Using StringBuffer Class

		System.out.println("Enter String");
		Scanner s = new Scanner(System.in);
		name = s.nextLine();
		StringBuffer sb = new StringBuffer(name);
		System.out.print("Reversed String using StringBuffer: "+sb.reverse());

		//2. Using Iterative Method
		System.out.println(" ");
		System.out.print("Reversed String using Iterative: ");
		char[] namearray = name.toCharArray();
		for(int i=namearray.length-1;i>=0;i--)
		{
			System.out.print(namearray[i]);
		}

		//3. Using Recursive Method
		System.out.println(" ");
		System.out.print("Reversed String using Recursive Method: ");
		ReverseString RS = new ReverseString();
		System.out.println(RS.recursiveMethod(name));
	}
	
	static String recursiveMethod(String str)
	{
		if((null==str)||(str.length()<=1)) {
			return str;
		}
		return recursiveMethod(str.substring(1))+str.charAt(0);
	}

}
