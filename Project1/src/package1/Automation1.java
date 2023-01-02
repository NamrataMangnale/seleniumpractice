package package1;

public class Automation1 {
	
	public Automation1() {
		this(20,30,40);
		System.out.println("Parent deafult constructor");
	}

	public Automation1(int a) 
	{
		this(20,30);
		System.out.println("parent 1 parameterized Constructor");
		
	}
public Automation1(int a,int b) 
{
	this(10,20,30,40);
	System.out.println("parent 2 parameterized Constructor");	
	}
public Automation1(int a,int b, int c) 
{
	
	System.out.println("parent 3 parameterized Constructor");	
	}
public Automation1(int a,int b, int c, int d) 
{
	this();
	System.out.println("parent 4 parameterized Constructor");	
	}
}

