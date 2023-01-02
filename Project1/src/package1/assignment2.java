package package1;

public class assignment2 {

	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is" +c);
		return c;
	}
	public int sub(int d, int e)
	{
		int result;
		result = d-e;
		System.out.println("sub result is" +result);
		return result;
		
	}
	public int multi(int x,int y)
	{
		int z;
		z=x*y;
		System.out.println("multiplication is" +z);
		return z;
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
		int sumresult=abc.sum(10, 2);
		abc.sum(sumresult,2);
		int subresult=abc.sub(10, 2);
		int multi= abc.multi(10, 2);
		abc.div(10, 2);
		
	}
}


