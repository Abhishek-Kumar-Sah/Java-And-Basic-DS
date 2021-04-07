package impQuestions;

import java.util.Scanner;



public class GCD {
	public static void wishGm() {
		
		System.out.println("Good morning Abhishek");
	}

	public static void main(String[] args) {
		wishGm();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre first no.");
		int n = sc.nextInt();
		System.out.println("Entre second no.");
		int m = sc.nextInt();
		
		int r = 1 ,i =1 ,x = n<m ? n : m ;
		
		 while( i <= x) {
			 
			 if(n%i == 0 && m%i == 0)
				
				  r =i ;
			 
			 i++;
		 }
		 
		 System.out.println("GCD of " + n +" & " + m +" is "+ r);

	}

}
