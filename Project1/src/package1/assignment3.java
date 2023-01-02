package package1;

public class assignment3 {

	public int multi(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("mul result is" +c);
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x*y;
		System.out.println("sub result is" +z);
		return z;
	}
	public int sum(int d, int e)
	{
		int result;
		result = d+e;
		System.out.println("sum result is" +result);
		return result;
		
	}
	public int sub1(int x1,int y2)
	{
		int z1;
		z1=x1-y2;
		System.out.println("sub1 result is" +z1);
		return z1;
	}
	public int div(int a1,int a2)
	{
		int a3;
		a3=a1/a2;
		System.out.println("div result is" +a3);
		return a3;
	}
	public static void main(String[] args)
	{
		assignment2 abc = new assignment2();
		int multiresult =abc.multi(10, 2);
		int subresult = abc.sub(10, 2);
		int sumresult = abc.sum(10, 2);
		
		int divresult = abc.div(10,2);
		
	}
}
