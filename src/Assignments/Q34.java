package Assignments;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: " );
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		System.out.println("Subtraction "+subtract(x));
		System.out.println("Multiply "+multiply( x, y));
		System.out.println("Division "+divide(x, y));
	}
	// subtract
	public static int subtract(int x) {
		return x + negate(x);
	}
	
	public static int negate(int x) {
		int result = 0;
		int temp = x < 0 ? 1 : -1;
		while (x != 0) {
			x += temp;
			result += temp;
		}
		return result;
	}
	
	// multiply
	public static int multiply(int x, int y) {
		if (x < y) {
			return multiply(y, x);  // faster if y < x.
		}
		
		int result = x;
		for (int i = 0; i < abs(y); i++) {
			result += x;
		}
		
		if (y < 0) {
			result = negate(result);
		}
		
		return result;
	}
	
	private static int abs(int y) {
		if (y < 0) {
			return negate(y);
		} else {
			return y;
		}
	}
	
	// division
	public static int divide(int x, int y) {
		if (y == 0) {
			throw new ArithmeticException("could not be zero");
		}
		
		int absx = abs(x);
		int absy = abs(y);
		
		int product = 0;
		int result = 0;
		while (product + absy <= absx) {
			product += absy;
			result++;
		}
		
		if ((x > 0 && y > 0) || (x < 0 && y <0)) {
			return result;
		} else {
			return negate(result);
		}
	}
}


