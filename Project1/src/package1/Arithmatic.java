package package1;

public class Arithmatic {
	
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
	public void multi(int x,int y)
	{
		int z;
		z=x*y;
		System.out.println("final result is"+z);
	}
	public static void main(String[] args)
	{
		Arithmatic abc = new Arithmatic();
		int sumresult=abc.sum(12, 9);
		int subresult=abc.sub(12, 3);
		abc.multi(sumresult, subresult);
		
	}
}
