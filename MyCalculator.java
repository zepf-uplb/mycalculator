/**
 * Author: Kristine Elaine P. Bautista
 * Program Description: Calculator of Simple Mathematical Functions
**/

public class MyCalculator {
	// add two numbers
	public float add(float a,float b){
		return a+b;
	}
	
	// subtract two numbers
	public float subtract(float a,float b){
		return a-b;
	}
	
	// multiply two numbers
	public float multiply(float a,float b){
		return a*b;
	}
	
	// divide two numbers
	public float divide(float a,float b){
		return a/b;
	}
	
	// x^2 of two numbers
	public float square(int x){
		return x*x;
	}
	
	// x^3 of three numbers
	public float cube(int x){
		return x*x*x;
	}
	
	// n! of an integer
	public int nfactorial(int n){
		int factorial = 1;
		
<<<<<<< HEAD
		if(n < 0) return -1; //-1 would mean that input is invalid
		
		for(int i=1;i<n;i++)
			factorial *= n; //replaced i with n
=======
		for(int i=1;i<n;i++)
			factorial *= i;
>>>>>>> a55afef393b4a7d17f20835b7e26efaa1f086a86
		
		return factorial;
	}
	
	// binary search in an array
	int binarySearch(int[] a,int x){
		int n = a.length; // get number of elements in the array
		int lower, upper, middle; // variables for positions in the array
		lower = 0; upper = n-1; // initialize values of lower and upper points
		
		while(lower<=upper){
			middle = (lower+upper)/2;
			if(x>a[middle]) lower = middle + 1;
			else if(x<a[middle]) upper = middle - 1;
			else return middle;
		}
		
<<<<<<< HEAD
		return -1; //-1 would mean that x is not in the array
=======
		return 1;
>>>>>>> a55afef393b4a7d17f20835b7e26efaa1f086a86
	}
	
}
