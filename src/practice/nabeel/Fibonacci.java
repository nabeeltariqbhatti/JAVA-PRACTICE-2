package practice.nabeel;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number to find Fibonacci");
		int number=sc.nextInt();
		
		System.out.print(printFibonacci(number));
		

	}
	
	public static int printFibonacci(int number) {

		if(number==0 || number==1) {
			return number;
		}else {
			
			return printFibonacci(number-1)+printFibonacci(number-2);
		}
		
		
	}

}
