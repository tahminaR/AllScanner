package step1;

public class AllVariable { //variable : Global & Local
	    static int c=75654;// non static variable
	   static String name="TahminaRashi";
	    static int name1=123;
	    
	 
	
	static byte a=123;	// declare outside of the method
	// Can we call non static in main method? A=NO
	//to call global variable to local variable, need to use static and call by className
	public static void main(String[] args) {
		int d=70;
		String brand = "Gucci"; // that declared within the body of a method
		System.out.println(brand);
		
		//to call global variable inside of main method
		// use static, and create object and call by object
		System.out.println(d);
		System.out.println(AllVariable.c); //calling from global variable by (className.variable)
		System.out.println(name); //Calling from global variable by only using Static
		System.out.println(AllVariable.name1);
		
		
	
	}
	

	
	
	
	
	
	

}
