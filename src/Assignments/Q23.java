package Assignments;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the input: ");
	       String s = sc.nextLine();
	       sc.close();
	       String[] sArr = s.split(" ");
	      
	       for(int i=0;i<sArr.length;i++)
	       {
	    	   boolean  isInteger = isInteger(sArr[i]);
	    	   if(isInteger)
	    	   {
	    		   System.out.println( sArr[i]+" :is an integer ");
	    	   }
	    	   else
	    	   {
	    		   System.out.println(sArr[i]+ " :is not an integer");
	    	   }
	       }
	      
	}
	    public static boolean isInteger(String s)
	    {
	    	boolean isValidInteger = false;
	    	try {
	    		   Integer.parseInt(s);
	    		   isValidInteger = true; // if it is valid integer
	    	    }
	    	catch(NumberFormatException e)
	    	{
	    		
	    		// if it is not a valid integer
	    	}
	    	return isValidInteger;
	    }

}

