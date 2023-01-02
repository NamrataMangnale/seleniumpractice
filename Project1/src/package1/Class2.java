package package1;

public class Class2 {
	
 public Class2() {

	 System.out.println("default consutuctor");
}
 public Class2(int a) 
 {
	 this();
		 System.out.println("one parameterized consutuctor");
	}

 public Class2(int a, int b) 
 {
	 this(222); // it will call one parameterized constructor 
		 System.out.println("two parameterized consutuctor");
	}
 	public static void main(String[] args)
 	{
		Class2 obj = new Class2(10,2); //control goes to two parameterized constructor 
	}
}
