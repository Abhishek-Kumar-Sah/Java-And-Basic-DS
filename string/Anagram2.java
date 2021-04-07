package string;

import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre first string");
        String s1 = sc.nextLine();
        
    //    System.out.println(a.charAt(2));
        System.out.println("Entre second string");
        String s2 = sc.nextLine();
        
        int[] arr = new int[256];
        
        for (int c : s1.toCharArray()) {
        	
        	arr[c]++;
        }
        
       for (int c : s2.toCharArray()) {
        	
        	arr[c]--;
	}
       boolean anagram = true;
       for(int c : arr) {
    	   
    	 if( arr[c] !=0)
    		 {anagram = false;
    	 break;}
    	   
       }
       if(anagram)
    	   System.out.println("Anagram");
       else
    	   System.out.println("Not Anagram");

}
}
