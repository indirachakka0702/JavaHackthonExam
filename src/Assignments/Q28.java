package Assignments;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) 

		{  
		     Scanner sc = new Scanner(System.in);
		     System.out.println("Enter the number: ");
		     int a = sc.nextInt();
		     sc.close();
			System.out.println("Factorial of given number is: "+factorial(a));
		}
			
			
  static int factorial(int n)
      {
		    if(n==1)
		  return 1;
             else
		     return (n*factorial(n-1));
		}

}


