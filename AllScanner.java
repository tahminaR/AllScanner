package step1;

import java.util.Scanner;
public class AllScanner {
	//Scanner take input from user

	public static void main(String []args) {
	Scanner Value= new Scanner(System.in);
	
	System.out.println("Enter your name");
	String Name= Value.nextLine();
	System.out.println("Enter your Last 4 digit of ssn#");
	int SSN= Value.nextInt();
	
	System.out.println("Enter your per hr income");
	//System.out.println("Enter your monthly salary");
	int perHour= Value.nextInt();
	int PerDay= perHour*8;
	System.out.println("Per day income $"+PerDay);
	int weekly=PerDay*5;
	System.out.println("Per week income $"+weekly);
	int Monthly=weekly*4;
	System.out.println("Per month income $"+Monthly);
	int yearly=Monthly*12;
	System.out.println("yearly income $"+yearly);


	Value.close();
	
	}
	
}
