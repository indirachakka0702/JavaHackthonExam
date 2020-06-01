package Assignments;

import java.util.Scanner;

public class Q62 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array: ");
		int length = sc.nextInt();
		int [] arrInput = new int[length];
		System.out.println("Enter all the elements: ");
		for(int i=0;i<length;i++)
		{
			arrInput[i]=sc.nextInt();
		}
		int k=3;
		reverse(arrInput,length,k);
		for(int i=0;i<length;i++)
		{
			System.out.print(arrInput[i]+" ");
		}
		sc.close();
		
	}
	 static void reverse(int arr[], int n, int k) 
	    { 
	        for (int i = 0; i < n; i += k) 
	        { 
	            int left = i; 
	      
	            int right = Math.min(i + k - 1, n - 1); 
	            int temp; 
	              
	            while (left < right) 
	            { 
	                temp=arr[left]; 
	                arr[left]=arr[right]; 
	                arr[right]=temp; 
	                left+=1; 
	                right-=1; 
	            } 
	        } 
	    } 
}