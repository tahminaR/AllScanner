package step1;

public class AllDataType {
	
	//static byte a=123;
	public static void main(String[] args) {
		byte a=123;	
	short b = 12345;
	int c = 123456789; 
	long d = 123456789123456789L;
	double e= 12345678912345.123456789;
	float f= 12345678.1234567f;
		
		System.out.println("my byte value Is"+" -" +a );
		System.out.println("my short value Is"+" -" +b );
		System.out.println("my int value Is" +"- "+c );
		System.out.println("my long value Is" +"- "+d );
		System.out.println("my double value Is" +"- "+e );
		System.out.println("my float value Is" +"- "+f );
		
		//why result show this ??
		//my double value Is- 1.2345678912345123E13
		//my float value Is- 1.2345678E7
		
		// char data type take only 1 value.
		char gender = 'f'; 
		boolean tomorrowIsDayOff =true;
		System.out.println(gender);
		System.out.println(tomorrowIsDayOff);
		
		//string type of value should be in double quote.
		String brand = "Gucci";
		System.out.println(brand);
		//System.out.println(AllVeriable.a);
}
	
	
	

}
