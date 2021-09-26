package step1;

public class AllCasting {
	
	
	
	public static void main(String[]args) {
	
		//Casting is the way of converting one data type to another data type
	
	float rentPay =1500.5000f;
	double salary= 124.50;
	
	int myPamant = (int) rentPay;
	byte mySalary= (byte)salary; 
	
	System.out.println(myPamant);
    System.out.println("My Salary is "+mySalary);	
    System.out.println(AllVariable.name); //Calling by className from other class

}
	
}
