package Assignments;

import java.util.Scanner;

public class Q1 
{
		
    public static void main(String[] args) 
     {
    	Scanner sc = new Scanner (System.in);
    	System.out.println("Enter the three boolean variables: ");
    	boolean A = sc.nextBoolean();
    	boolean B = sc.nextBoolean();
    	boolean C = sc.nextBoolean();
	   Q q = new Q();
	  
	   System.out.println( "The return value of at least two variables is: "+q.atLeastTwo(A,B,C));
	   sc.close();
       }	
}
class Q
{
	boolean atLeastTwo(boolean a,boolean b,boolean c)
    {
    	if((a&&b)||(b&&c)||(c&&a))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    
    }

}
