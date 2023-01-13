package package1;

public class Methodpractice {

	public int sum(int a , int b) {
		
		int c;
		c=a+b;
		System.out.println("sum result is = " +c);
		return c;
		
	}
	public int sub(int a1 , int b1) {
		int x;
		
	x=a1-b1;
			System.out.println("sub result is = " +x);
	return x;
		
	}
	public int div(int b1 , int c1) {
		int x1;
		
	x1=b1/c1;
			System.out.println("div result is = " +x1);
	return x1;
	}
	public void multi(int d,int e) {
		int result;
		result=d*e;
		System.out.println("final result = " +result);
	}
	public static void main(String[] args) {
		Methodpractice m1 = new Methodpractice();
		int sumresult = m1.sum(10, 20);
		m1.sum(sumresult, 2);
		int subresult = m1.sub(90,30);
		m1.div(sumresult, 2);
	
	
	}
}


