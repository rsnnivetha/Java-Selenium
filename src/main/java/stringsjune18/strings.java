package stringsjune18;

public class strings {

	public strings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// string literal- does not allow duplicate strings
       /* String s ="This is automation";
        String s1 ="This is automation";
        System.out.println(s == s1);*/
	
	// string -using new memory allocator KW
	/*
	 * String a=new String g("Hi"); String s1 =new String("Java");
	 * System.out.println(s+s1);
	 */ 
	
	  //returns char value for an index
	  String name = "I am learning";
	  System.out.println(name.charAt(2));
	  
	  //length of string
	  System.out.println(name.length());
	  
	  //checks if the string is equal
	  System.out.println(name.equals("Nandeesvar"));
	  
	  //checks if the string is equal ignoring the case-sensitive
	  System.out.println(name.equalsIgnoreCase("NIVETHA"));
	  
	  //check if the string is empty
	  System.out.println(name.isEmpty());
	  
	  //take a particular portion of the string or trimming concept
	  System.out.println(name.substring(2));
	  System.out.println(name.substring(1,4));
	  
	  //concatenating the string
	  System.out.println(name.concat(" Automation"));
	  
	  //replace the existing char with the given char
	  System.out.println(name.replace("I am","Nivetha is "));
	  
	 
	  
	  
	  
}
}


