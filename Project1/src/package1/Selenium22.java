package package1;

public class Selenium22 extends Automation1
{
	
	public Selenium22() {
		this(10,20);
		System.out.println("child deafult constructor");
	}

	public Selenium22(int a) 
	{
		
		this(10,20,30,40);
		System.out.println("child 1 parameterized Constructor");
		
	}
public Selenium22(int a,int b) 
{
	super(200); //explicit call
	System.out.println("child 2 parameterized Constructor");	
	}
public Selenium22(int a,int b,int c) 
{
	this(10);
	System.out.println("child 3 parameterized Constructor");	
	}
public Selenium22(int a,int b,int c, int d) 
{
	this();
	System.out.println("child 4 parameterized Constructor");	
	}

public static void main(String[] args) {
	
	Selenium22 obj = new Selenium22(20,30,10);
}

}
