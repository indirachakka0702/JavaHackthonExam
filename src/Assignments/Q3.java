package Assignments;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of an array: ");
		int length = sc.nextInt();
		int Arr[] = new int[length];
		
		System.out.print("Enter the elements of an Array: ");
		for(int a=0;a<Arr.length;a++)
		{
			Arr[a] = sc.nextInt();
		}
		
		for(int i=0;i<Arr.length-1;i++)
		{
			for(int j=0;j<Arr.length-1;j++)
			{
				int k=j+1;
				int a=Arr[j];
				int b=Arr[k];
				if(b<a)
				{
					Arr[j]=b;
					Arr[k]=a;
				}
			}
		 }
		  sc.close();
		for(int p=0;p<Arr.length;p++)
		{
			System.out.print(Arr[p]+" ");
		}
	}

}
