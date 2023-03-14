
public class Employee {
	private int empID;
	private String empName;
	private float salary;

	public Employee(int empID, String empName, float salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}

	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}

	public Employee() {
		super();
	}


	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public float computeSalary() {
		return salary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void displayInfo() {
		System.out.println();
		System.out.print("ID: " + this.getEmpID() + "	");
		System.out.print("Name: " + this.getEmpName() + "	");
//			System.out.println(this);
	}
	
}
