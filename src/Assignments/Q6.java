package Assignments;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of an array: ");
		int length = sc.nextInt();
		int Arr[] = new int[length];
		
		System.out.println("Enter the elements of an Array: ");
		for(int a=0;a<Arr.length;a++)
		{
			Arr[a] = sc.nextInt();
		}
		
		SelectionSort ss = new SelectionSort();
		ss.sort(Arr);
		System.out.println("Sorted Array is: ");
		for(int p=0;p<Arr.length;p++)
		{
			System.out.println(Arr[p]);
		}
		sc.close();
	}

}
class SelectionSort
{
	void sort(int Arr[])
	{
          for(int i=0;i<Arr.length;i++)
          {
        	  int min =i;
        	  for(int j=i+1;j<Arr.length;j++)
        	  {
        		  if(Arr[j]<Arr[i])
        		  {
        			  min = j;
        			  int temp =Arr[min];
        			  Arr[min] = Arr[i];
        			  Arr[i] = temp;
        			 
        		  }
        	  }
          }
	}
}
