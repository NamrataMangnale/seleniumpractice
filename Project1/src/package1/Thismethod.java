package package1;

public class Thismethod {
	
	public void method1()
	{
		this.method3(100,20,30);
		System.out.println("this is default method");
		this.method2(20);
		this.method3(10, 200);
		this.method3(10,20,30,40);
	}

	public void method2(int a)
	{
	System.out.println("one parameterized method");
	}
	public void method3(int a, int b)
	{
		System.out.println("two parameterized method");
	}
	public void method3(int a, int b,int c)
	{
		System.out.println("three parameterized method");
	}

	public void method3(int a, int b, int c, int d)
	{
		System.out.println("four parameterized method");
	}

 	public static void main(String[] args)
 	{
 		Thismethod obj = new Thismethod();
 		obj.method1();
 		
 	}
}

