package Assignments;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		 try{
	          String source = args[0];
	          String target = args[1];

	          File sourceFile=new File(source);

	          Scanner content=new Scanner(sourceFile);
	          PrintWriter pwriter =new PrintWriter(target);

	          while(content.hasNextLine())
	          {
	             String s=content.nextLine();
	             StringBuffer buffer = new StringBuffer(s);
	             buffer=buffer.reverse();
	             String rs=buffer.toString();
	             pwriter.println(rs);
	          }
	          content.close();    
	          pwriter.close();
	          System.out.println("File is copied successful!");
	          }

	          catch(Exception e){
	              System.out.println("Something went wrong");
	          }
	       }
	

	}


