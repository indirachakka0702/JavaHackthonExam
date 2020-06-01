package Assignments;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args)
	{
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the String: ");
		    String sInput = sc.nextLine();
		    sInput = sInput.toLowerCase();
		    char[] c = sInput.toCharArray();
		    for(int f1=0;f1<c.length;f1++)
		    {
	    		int count = 1;
	    		boolean bDupfound = false;
	    		if(c[f1]!=0)
	    		{		
		    	for(int f2=f1+1;f2<c.length;f2++)
		    	{
		    		if(c[f1] == c[f2])
		    		{
	                   c[f2] = 0;
		    			bDupfound = true;
		    			count++;
		    		}
		    	}
	    		}
		    
		    	if(bDupfound)
		    		  System.out.println("Duplicate count of character :: "+ c[f1]+" == "+count);
		  	   
		    }
		    
           sc.close();
		}
		    

		}


	


