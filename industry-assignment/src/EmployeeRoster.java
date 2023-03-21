import java.util.ArrayList;

public class EmployeeRoster {
	private ArrayList<Employee> list;

	public EmployeeRoster() {
	}

	public ArrayList<Employee> getList() {
		return this.list;
	}

	public void setList(ArrayList<Employee> list) {
		this.list = list;
	}

	public boolean addEmployee(Employee emp) {
		try {
			
			return this.list.add(emp);
		}
		catch(NullPointerException e) {
			return false;
		}
	}

	public ArrayList<Employee> deleteEmployee(int empID) {

		for (Employee e : this.list) {
			if (e.getEmpID() == empID) {
				this.list.remove(this.list.indexOf(e));
				break;
			}
		}
		return this.list;
	}

	public boolean searchEmployee(int empID) {

		for (Employee e : this.list) {
			if (e.getEmpID() == empID) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Employee> searchEmplyee(String keyword) {

		ArrayList<Employee> filtered = new ArrayList<Employee>();

		for (Employee e : this.list) {
			if (e.getEmpName().contains(keyword)) {
				filtered.add(e);
			}
		}
		return filtered;
	}

	public void displayEmployees() {
		if (!this.list.isEmpty()) {

			System.out.println("\nID:	NAME:	SALARY:		TYPE:	");

			for (Employee e : this.list) {
				System.out.print(String.format("\n%d	%s	%,.2f	", e.getEmpID(), e.getEmpName(), e.getSalary()));

				if (e instanceof HourlyEmployee)
					System.out.print("Hourly ");
				if (e instanceof CommissionEmployee)
					System.out.print("Commission ");
				if (e instanceof PieceWorkerEmployee)
					System.out.print("Piece Worker ");
				if (e instanceof Employee)
					System.out.print("Employee");
			}
		} else {

			System.out.println("No Employees");
		}

	}

	public float countHourlyEmployee() {
		float totalHours = 0;
		if (!this.list.isEmpty()) {
			for (Employee e : this.list) {
				totalHours += ((HourlyEmployee) e).getTotalHourWorked();
			}
		}
		return totalHours;
	}

	public int countPieceWorkerEmployee() {
		int totalPiece = 0;
		if (!this.list.isEmpty()) {
			for (Employee e : this.list) {
				totalPiece += ((PieceWorkerEmployee) e).getPiecefinished();
			}
		}
		return totalPiece;
	}

	public float countCommissionEmployee() {
		float totalCommission = 0;
		if (!this.list.isEmpty()) {
			for (Employee e : this.list) {
				totalCommission += ((CommissionEmployee) e).getCommission();
			}
		}
		return totalCommission;
	}

	public float countBasePlusCommissionEmployee() {
		float totalSalary = 0;
		if (!this.list.isEmpty()) {
			for (Employee e : this.list) {
				totalSalary += e.computeSalary();
			}
		}
		return totalSalary;
	}
}
