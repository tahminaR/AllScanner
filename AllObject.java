package step1;

public class AllObject {

	//object can not create inside the block, or inside the method. 
	//Object can only create in main method
	int xyz= 80;
	static int abc=88;
	
	
	
	public static void main(String[] args) {
		int number= 90;
		
		AllObject myObj= new AllObject();
		System.out.println(myObj.xyz);
		System.out.println(number);
		System.out.println(AllObject.abc);
		
		
		 AllVariable alb=new AllVariable();
		 System.out.println(alb.name);
		 
		 AllDataType arz=new AllDataType();
		 
		 
		// System.out.println(arz.a);
		 
		
	}
	
	
}
