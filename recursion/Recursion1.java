package recursion;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(10));
		
		System.out.println(pow (2,5));

		System.out.println(fastpow(2,5));
		
		System.out.println(path(4,4));
		
		System.out.println(factorial(10));
		
		int[] arr = new int [20];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println( geekonacci(arr, 4,3));
	}
	
	// To find sum of n natural nos.
	
	public static int sum(int n) {
		if(n == 1)
			return 1;
		
		
		return (n + sum(n-1));
	}

	
	// To find a to the power of b
	
	public static int pow (int a , int b) {
		
		if (b==0)
			return 1;
		
		return (a * pow(a , b-1));
	}
	
	// Fast power method
	
	public static int fastpow(int a , int b) {
		
		if(b==0)
			return 1;
		
		if(b%2 ==0)
			return ( fastpow(a*a,b/2));
		
		else
			return (a* fastpow(a, b-1));
	}
	
	//To find no. of paths in a m x n matrix from (0,0) to (m,n) . If we move only right or down. 
	
	public static int path (int n , int m) {
		
		if (n==1 || m==1)
			return 1;
		
		
		return ( path(n, m-1) + path(n-1 , m) );
	}
	
	// To find factorial of n
	
	public static long factorial(int n ) {
		if (n ==0 )
			return 1;
		
		return(n * factorial(n-1));
	}
	
	
	//Geek created a random series and given a name geek-onacci series. Given four integers A, B, C, N. A, B, C 
	//represents the first three numbers of geek-onacci series. Find the Nth number of the series. The nth number 
	//of geek-onacci series is a sum of the last three numbers (summation of N-1th, N-2th, and N-3th geek-onacci numbers.
	
	
	public static int geekonacci(int[] a, int targetIndex,int n){
		
		a[n] = a[n-1] +a[n-2] + a[n-3];
		
		if(n == targetIndex) {
			return a[n];
		}
		
		return geekonacci(a, targetIndex , n+1);
	}
		    
		
}






