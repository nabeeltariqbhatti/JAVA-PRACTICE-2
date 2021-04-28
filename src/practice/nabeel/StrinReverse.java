package practice.nabeel;

import java.util.HashSet;
import java.util.Scanner;

public class StrinReverse {

	public static void main(String[] args) {
		
		   Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter the string to reverse");
		             String	 line=sc.nextLine();
		             
		            System.out.print(line + " reverse as "  );
		            reverseString(line);
	}
	
	public static void reverseString(String line) {
	String[] words=line.split(" ");
	String newWords="";
	
//	for(int i=0; i<words.length;i++) {
//		for(int j= words[i].length(); j>=0;--j) {
//			System.out.print(words[j]);
//		}
//	}
		for(String word:words) {
			StringBuilder sb=new StringBuilder(word);
			newWords=newWords+sb.reverse() + " ";
		}
		
		System.out.print(newWords);
		
	}

}
