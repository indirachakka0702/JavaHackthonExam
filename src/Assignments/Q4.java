package Assignments;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		sc.close();
		char [] s1 = new char[s.length()]; 
		int j=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			s1[j] =s.charAt(i); 
			j++;
		}
		String s2 = new String (s1);
		
        if(s.equals(s2))
        {
        	System.out.println("palindrome");
        }
        else
        {
        	System.out.println("not palindrome");
        }
	}

}
