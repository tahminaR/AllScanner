package step1;

public class ParentNested {   //parentClass
	         static String firstName= "My Firsr Name is Tahmina";
	         double rent= 5000.555;
	
 public static void main(String[] args){	//Main Method of parentClass
	           String LastName= "Rashid";
	           int age=33;
	System.out.println("This is my Parent Class");
	System.out.println(NestedJr.lastName);
 }
	
   
 public static class NestedJr { 	//ChildClass
	
	 static String lastName= "My last Name is Rashid";
    	public static void main(String[] args){ //Main Method of childClass
    		
    		
    		System.out.println("This is my Child Class");
    		System.out.println(ParentNested.firstName);
    		ParentNested getRent=new ParentNested();
    		System.out.println(getRent.rent);
    		
    		
    		
    		
    		
    	}
	
}


}

	
	
	
	


