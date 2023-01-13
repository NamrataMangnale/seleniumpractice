package package1;

public class Constructer 
{
	public Constructer ()
	{
		
	this(7,9,80);
		 System.out.println("default constructer");
	}
	 public Constructer(int a) 
	 {
		this();
			 System.out.println("one parameterized constructer");
		}

	 public Constructer (int a, int b) 
	 {
		this(10);
			 System.out.println("two parameterized constructer");
		}
	 
	 public Constructer (int a, int b, int c) 
	 {
	
			 System.out.println("three parameterized constructer");
		}
	 public Constructer (int a, int b, int c, int d) 
	 {
		this(60,80);
			 System.out.println("Four parameterized consutuctor");
		}
	 
	 	public static void main(String[] args)
	 	{
	 		Constructer ref = new Constructer (10,20,30,70); 
	 		


		}	
	

}
