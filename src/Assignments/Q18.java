package Assignments;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the String: ");
		  String sInput = sc.nextLine();
		 
		  char[] cInput = sInput.toCharArray();
		 
		  System.out.print("Duplicate characters of given string is: ");
		 for(int i=0;i<cInput.length;i++)
		  {
			  
			  for(int j=i+1;j<cInput.length;j++)
			  {
				  if(cInput[i]==cInput[j])
				  {
					  System.out.print(cInput[j]);
				       break;
				  }
					 
			  }
			  
		  }
		  
		  sc.close();
	  }
		

	}


