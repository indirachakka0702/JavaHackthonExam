package Assignments;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a= ");
		int a=sc.nextInt();
		
		for(int n=1;n<=a;n++)
		{
			if
			(a%n==0)
				
			{
			   System.out.println(n);
			}
			else
				System.out.print("");
		}
		sc.close();

	}

}
