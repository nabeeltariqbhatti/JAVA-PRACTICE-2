package practice.nabeel;
import java.util.*;
public class Calculator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		
		int number1 =sc.nextInt();
		
System.out.println("Enter Second  Number:");
		
		int number2 =sc.nextInt();
		
		System.out.println("Enter Required Operator[+,-,/,*]");
		char op=sc.next().charAt(0);
		
		int result=calculate(number1,number2,op);
		
		System.out.println("Result is:" + result);
		sc.close();
		
		
		
	}
	
	static int calculate(int x, int y, char op) {
		if(op=='+') {
			return x+y;
		}else if(op=='*') {
			return x*y;
		}else if(op=='-') {
			return x-y;
		}else {
			return x/y;
		}
		
	
	}

}
