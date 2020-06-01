package Assignments;

public class Q26 {

	public static void main(String[] args)
	{

		int A[] = new int[10];
	    A[0] = 1;
	    A[1] = 2;
	    A[2] = 4;
	    A[3] = 6;
	    A[4] = 9;
	    A[5] = 10;
	    
	    
	    int B[] = {3,5,7,8};
		  
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<B.length;j++)
			{
			if(B[j]<A[i])
			{
			  	 int temp ;
			  	 temp = B[j];
			  	 B[j] = A[i];
			  	 A[i] = temp;
			  	sort(B); 
			  	
			}
		  }
	 }
		  A[6] = B[0];
	      A[7] = B[1];
	      A[8] = B[2];
	      A[9] = B[3];
	      for(int i=0;i<10;i++)
	      {
	       System.out.print(A[i]+",");
	       
	      }
	
	}
	static void sort(int B[])
	{
		for(int i=0;i<B.length-1;i++)
		{
			for(int j=0;j<B.length-1;j++)
			{
				int k=j+1;
				int a=B[j];
				int b=B[k];
				if(b<a)
				{
					B[j]=b;
					B[k]=a;
				}
			}
		}
	}

}
