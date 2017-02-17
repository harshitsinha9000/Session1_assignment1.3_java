package java_session1;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first,second;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First no");
		first=sc.nextInt();
		
		System.out.println("Enter Second no");
		second=sc.nextInt();
		
		System.out.println("Entered nos are first="+first+"\tSecond="+second);
		
		//swapping of two variables 
		first =first +second;
		second=Math.abs(first-second);
		first =Math.abs(second-first);
		
		System.out.println("Swapped nos are first="+first+"\tSecond="+second);
	}

}
