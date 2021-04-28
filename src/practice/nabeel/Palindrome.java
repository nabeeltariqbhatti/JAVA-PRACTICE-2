package practice.nabeel;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String to check if palindrome");
	             String	 word=sc.next();
	             
	             System.out.print("String is Palindrome :" + " ");
	             
	             System.out.println(checkPalindrome(word));
		

	}
	
	public static boolean checkPalindrome(String word) {
		int f=0; int end=word.length()-1;
		
		for(int i=0; i<end;i++) {
			if(word.charAt(i)!=word.charAt(end)) 
				return false;
				
				end--;
			
		
	}
		return true;

	
	}
}
