package Assignments;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the String: ");
		    String sInput = sc.nextLine();
		    System.out.println("Enter the character you want to delete: ");
		    String p = sc.nextLine();
		    char cstr = p.charAt(0);
            char[] cInput = sInput.toCharArray();
		    char[] cOutput=new char[sInput.length()];
		    int j=0;
		    for(int i=0;i<cInput.length;i++)
		    {
		    	if(cInput[i]!=cstr)
		    	{
		    		cOutput[j] = cInput[i];
		    		j++;
		    	}
		    	
		    	
		    }

		    System.out.println(String.valueOf(cOutput));
		      sc.close();

	}

}
