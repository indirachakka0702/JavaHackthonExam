package Assignments;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q15 {

	public static void main(String[] args) 
	{
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the input: ");
         String  sInput = sc.nextLine();
         sc.close();
		Set<String>myset = new HashSet<>();
		String s[] = sInput.split(" ");
		for(int i=1;i<s.length;i++)
		{
			myset.add(s[i]);
			
		}
		for(String ss: myset)
		{
			System.out.println(ss);
		}
		
	}

}
