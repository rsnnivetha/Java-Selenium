package firstmaven;

public class strings {

	public strings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// string literal- does not allow duplicate strings
        /*String s ="This is automation";
        String s1 ="This is automation";
        System.out.println(s + s1);
	}*/
	// string -using new memory allocator
    String s = new String("Hi");
    String s1 =new String("Java");
    System.out.println(s +" "+ s1);

}
}
