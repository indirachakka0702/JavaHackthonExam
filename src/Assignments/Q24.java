package Assignments;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		sc.close();
		int sum=0,j=0;
		for(int i=1;i<number;i++)
		{
			sum = i;
			j = i+1;
			
			while(sum<number)
			{
				sum=sum+j;
				j++;
			}
			if(sum==number)
			{
				for(int k=i;k<j;k++)
				{
					if(k==i)
					System.out.print(k);
					else
					System.out.print("+"+k);	
					
				}
				System.out.println();
			}
			
		}
		

	}

}
