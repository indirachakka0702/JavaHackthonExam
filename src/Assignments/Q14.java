package Assignments;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		sc.close();
		String[] sArr= s.split(" ");
		String[] sArr1 = new String[sArr.length];
		int k=0;
		System.out.println("After reverse the string : ");
		for(int i=sArr.length-1;i>=0;i--)
		{
			sArr1[k] = sArr[i];
			System.out.print(sArr1[k]+ " ");
			k++;
		}
/*		System.out.println();
		System.out.println("After reverse the words in String: ");
		
		for(int i=0;i<sArr1.length;i++)
		{
			String s1 = sArr1[i];
			char [] s2 = new char[s1.length()];
			int p=0;
			for(int j=s1.length()-1;j>=0;j--)
			{
				s2[p] =s1.charAt(j);
				System.out.print(s2[p]);
				p++;
			}
			System.out.print(" ");
		}
		*/
		

	}

	

}
