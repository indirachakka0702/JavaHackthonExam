package Assignments;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the numbers: ");
	 	 int i = sc.nextInt();
		String string = String.valueOf(i);
		String otherString = Integer.toString(i);
		sc.close();
		System.out.println(string.equals(otherString));
        System.out.println(string == otherString);
        System.out.println(string);
        System.out.println(otherString);
	}

}
