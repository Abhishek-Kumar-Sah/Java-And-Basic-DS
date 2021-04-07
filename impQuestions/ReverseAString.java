package impQuestions;

import java.util.Scanner;
import impQuestions.GCD;
public class ReverseAString {

	
	public static void reverse() {
		int start = 0, end = 0 ;
		String str , ans = "";
		Scanner sc = new Scanner (System.in);
		System.out.println();
		str = sc.nextLine();
		
		int i = str.length() - 1;
		while ( i >= 0) {
			
			while (i >= 0 && str.charAt(i) == ' ')  i--;
			
			int j = i ;
			
			while(i >= 0 && str.charAt(i) != ' ') i--;
				if(ans.isEmpty())
				ans = ans.concat(str.substring(i+1,j+1));
				else ans = ans.concat(' '+str.substring(i+1,j+1));
			
		}
		System.out.println(ans);
		
//		int n = str.length();
//		char[] strarr = new char[n];
//		
//		strarr = str.toCharArray();
//		char[] revarr = new char [n];
//		
//		
//		for (int i =0 ; i <n ; i++) {
//			
//			revarr[i] = strarr[n-1-i];
//		
//		}
//		
//		for (int i = start ;  i<n ; i++) {
//			
//			if(revarr[i] != ' ') {
//				end++;
//			
//				// start = end+1;
//			}
//				if(revarr[i] == ' ')
//					break;
//			
//		}
//		char[] finalarr = new char [n];
//        for (int i = start ; i < end; i++) {
//			
//			revarr[end - i] = finalarr[i];
		
////		}
//		for(char i : finalarr)
//		System.out.print(i);
//	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		reverse();

    
	}
	}
