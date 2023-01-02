package package2;

public class SwiftDesire extends Swift
{
	public void method3()
	{
		System.out.println("child class");
	}
	public static void main(String[] args) 
	{
		SwiftDesire  S =new SwiftDesire();
		
		S.method1();
		S.method2();
		S.method3();
		S.price=100;
		System.out.println(S.price);
		
	}
	
}
