package javaprogram;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		int[] arrayOne = {2, 5, 1, 7, 4}; 
		int[] arrayTwo = {2, 5, 1, 7, 4};
		
		boolean equalOrNot = true;

		if(arrayOne.length==arrayTwo.length) {
			for(int i=0;i<arrayOne.length;i++)
			{
				if(arrayOne[i]!=arrayTwo[i]) {
					equalOrNot=false;
				}
			}
		}
		else
		{
			equalOrNot = false;
		}
		if(equalOrNot)
		{
			System.out.println("Both Arrays are equal");
		}
		else
		{
			System.out.println("Both Arrays are different or not Equal");
		}
		System.out.println(Arrays.equals(arrayOne,arrayTwo)); //use this for single dimansional array comarision
		 //If you are checking multidimensional arrays for equality, then use deepEquals() method of Arrays class

	}

}
