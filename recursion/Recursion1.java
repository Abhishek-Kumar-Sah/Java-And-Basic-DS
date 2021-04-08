package recursion;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(10));
		
		System.out.println(pow (2,5));

		System.out.println(fastpow(2,5));
		
		System.out.println(path(4,4));
		
		System.out.println(factorial(10));
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
}






