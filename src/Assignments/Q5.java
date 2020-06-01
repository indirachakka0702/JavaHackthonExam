package Assignments;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array: ");
		int length = sc.nextInt();
		int Arr[] = new int[length];
		System.out.println("Enter the nembers of an Array: ");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}
	
		for(int j=0;j<Arr.length;j++)
		{
			int count =1;
			boolean dupFound = false;
		   if(Arr[j]!=0)
		   {
			for(int k=j+1;k<Arr.length;k++)
			{
				if(Arr[j]==Arr[k])
				{
						Arr[k]=0;
						dupFound  = true;
						count++;
				}
			}
		}
		sc.close();
		if(dupFound)
		{
			System.out.println("Duplicate count of Array integer :: "+ Arr[j]+" == "+ count);
		}

	}
	
}
}
