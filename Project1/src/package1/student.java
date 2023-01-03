
package package1;

public class student 
{
	
	int roll_no;
	int age;
	
  public void display1()
  {
	  System.out.println ("Welcome to all of you students");
  }
  public void display2()
  {
	  System.out.println("Automation is very easy");
  }
 public static void main(String[] args) {
	 
	 student namrata = new student();
	 namrata.display1();
	 namrata.display2();
	 namrata.roll_no=11;
	 System.out.println(namrata.roll_no);
	 namrata.age=19;
	 System.out.println(namrata.age);
}
}
