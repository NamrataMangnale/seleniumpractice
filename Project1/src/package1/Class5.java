package package1;

public class Class5 {
	
	int a,b,c,d,e;
	public void m1(int a1, int a2, int a3, int a4, int a5)
	{
		a=a1;
		b=a2;
		c=a3;
		d=a4;
		e=a5;
	}

	public static void main(String[] args) {
		Class5 O1= new Class5();
		O1.m1(10,20,30,40,50);
	System.out.println("a=" +O1.a);
	System.out.println("b=" +O1.b);
	System.out.println("c=" +O1.c);
	System.out.println("d=" +O1.d);
	System.out.println("e=" +O1.e);
		
		
	}
}
