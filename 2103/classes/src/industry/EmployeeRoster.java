package industry;

public class EmployeeRoster {
	private Employee[] list;
	private int count;
	private int max;
	
	public EmployeeRoster() {
		this(10);
	}
	
	public EmployeeRoster(int max) {
		this.max = max;
		list = new Employee[max];
	}

	public Employee[] getList() {
		return list;
	}

	public void setList(Employee[] list) {
		this.list = list;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	
	
	public boolean addEmployee(Employee e) {
		if (this.getCount() < this.getMax()) {
			list[count] = e;
			this.count++;
			return true;
		}
		else {
			return false;
		}
	}
	
//	public Employee deleteEmployee(int empID) {
//		for(int i = 0; i < this.count; )
//	}
	
//	public boolean searchEmployee(int empID) {}
//	public Employee[] searchEmplyee(String keyword) {}
//	
//	public void displayEmployees() {
//		
//	}
//	
//	public int countHourlyEmployee() {}
//	public int countPieceWorkerEmployee() {}
//	public int countCommissionEmployee() {}
//	public int countBasePlusCommissionEmployee() {}
}
