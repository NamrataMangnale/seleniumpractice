package package1;

public class Employee {
	
	String empName;
	int empid;
	String address;
	
	public Employee(String empName, int empid, String address)
	{
		this.empid= empid;
		this.empName=empName;
		this.address=address;
	}
	
	public static void main(String[] args) {
		
		Employee namrata = new Employee("Namrata", 11, "parkridge blvd");
		Employee rahul = new Employee("Rahul", 16, "parkridge blvd");
		Employee arinjay = new Employee("Arinjay", 1, "parkridge blvd");
		System.out.println(namrata.empName.length());
		System.out.println(rahul.empName);
		System.out.println(arinjay.empName);


		
		
	}

}
