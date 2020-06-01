package Assignments;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) 
	{  
		Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the String: ");
	       String sInput = sc.nextLine();
	       
	       int smallLetters = 0, capitalLetters = 0, digits = 0, spaces = 0;
	       
	       for(int k=0;k<sInput.length();k++)
	       {
	    	   char ch=sInput.charAt(k);
	    	  
	    	  if (ch >= 'A' && ch <= 'Z')
	    	   {
	    		   ++capitalLetters;
	    		   
	    		
	    	   }
	    	  else if (ch >='a'  && ch <= 'z')
		       {
		    	 ++smallLetters;
		    	 
		       }
	    	   
	    	   else if(ch >= '0' && ch <= '9')
	    	   {
	    		   ++digits;
	    		  
	    	   }
	    	   else if(ch == ' ')
	    	   {
	    		   ++spaces;
	    		  
	    	   }
	       }
	       System.out.println("Number of capital letters in given string is : "+ capitalLetters);
	       System.out.println("Number of small letters in given string is : "+ smallLetters);
	       System.out.println("Number of digits in given string is: "+ digits);
	       System.out.println("Number of spaces in given string is: "+ spaces);
	        sc.close();

		}
	public static void dupFound(String[] sInput)
	{
		
	for(int i=0;i<sInput.length;i++)
	{
		  
		  for(int j=i+1;j<sInput.length;j++)
		  {
			  if(sInput[i]==sInput[j])
			  {
				  System.out.print(sInput[j]);
			       break;
			  }
				 
		  }
		  
	}
	
	}
}



