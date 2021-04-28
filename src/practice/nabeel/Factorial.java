package practice.nabeel;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number to find Factorial");
		int number=sc.nextInt();
		System.out.println("Factorial of "+ number+ "  is " + fact(number));

	}
	
	public static int fact(int number) {
		if(number==1) {
			return number;
		}
		return number*fact(number-1);
	}

}
