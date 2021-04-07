package string;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre first string");
        String s1 = sc.nextLine();
        
    //    System.out.println(a.charAt(2));
        System.out.println("Entre second string");
        String s2 = sc.nextLine();
        
        int[] s1a = new int[s1.length()];
        int[] s2a = new int[s2.length()];
        
        if(s1.length() == s2.length()) {
        for(int i =0 ;i < s1.length()  ; i++) {
        	
             s1a[i] = (int) s1.charAt(i);
        	
        }
        
        
        
        for(int j=0 ; j< s2.length() ; j++) {
    	   
    	   s2a[j] = (int) s2.charAt(j);
       }
       
       for(int i =0 ; i < s1a.length-1; i++) {
    	   int r = i;
    	   for (int j = i ; j < s1a.length ; j++) {
    		   
    		  
    		   if(s1a[j] < s1a[r] ) {
    			   
    			   r=j;
    		   }
    		  
    	   }
    	   int temp = s1a[i];
		   s1a[i] = s1a[r];
		   s1a[r] = temp;
    	   
    	   
       }
       
        for(int i =0 ; i < s2a.length-1; i++) {
        	 int r = i;
    	   for (int j = i ; j < s2a.length ; j++) {
    		   
    		  
    		   if(s2a[j] < s2a[r] ) {
    			   
    			   r=j;
    		   }
    		
    	   }
    	   int temp = s2a[i];
		   s2a[i] = s2a[r];
		   s2a[r] = temp;
    	   
    	   //for(int r: s1a)System.out.println(r+"  ");
       }
        boolean check = true;
        for(int i =0 ; i< s1a.length ; i++) {
        	check = true;
        	if(s1a[i] != s2a[i]) {check = false; break;}
        	
        }
       
        if(check) 
        	System.out.println("Anagram");
        else 
        	System.out.println("Not Angram");
        
	}
        else System.out.println("Not Anagram");
	}

}
