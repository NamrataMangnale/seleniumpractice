package package1;

public class Selenium2 extends Automation2
{
	public void m2() {
		
		super.m1();
		
		System.out.println("Child class method");
		super.m1();
		super.Namrata=20;
		System.out.println(super.Namrata);
	}
	public static void main(String[] args) {
	
		Selenium2 S = new Selenium2();
		S.m2();
		
	}
}
