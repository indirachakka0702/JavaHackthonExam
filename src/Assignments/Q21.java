package Assignments;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s= sc.next();
		sc.close();
		 try{
			 int i=Integer.parseInt(s);
			 System.out.println("After converting into integer: "+i);
		    }catch(Exception a)
		    {
		    	System.out.println("Given String is not a Numeric");
		    }
	      

	}

}
