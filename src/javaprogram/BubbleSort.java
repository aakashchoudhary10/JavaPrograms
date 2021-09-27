package javaprogram;

public class BubbleSort {

	public static void main(String[] args) {
		int a [] = {5,6,8,1,4,19,2,25};
		for(int i=0;i<a.length-1;i++)
		{
			int flag=0;
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1]) 
				{
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		

	}

}
