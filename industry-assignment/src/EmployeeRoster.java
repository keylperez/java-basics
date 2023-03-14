
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
//			System.out.println(String.format("Count: %d", this.getCount()));
			return true;
		} else {
			return false;
		}
	}

//	@SuppressWarnings("unused")
	public EmployeeRoster deleteEmployee(int empID) {

		int i = 0;

		for (; i < this.count; i++) {

			if (this.list[i].getEmpID() == empID) {
				System.out.println("true");
				int j = i;
				for (; j < this.count; j++) {

					this.list[j] = this.list[j + 1];
					this.count--;
					return this;
				}
			}
		}

		System.out.println("No employee found");
		return null;
	}

	public boolean searchEmployee(int empID) {

		int i;

		for (i = 0; i < this.count && this.list[i].getEmpID() == empID; i++) {
		}

		if (i == this.count)
			return false;

		System.out.println("Employee exists in records");
		return true;
	}

	public Employee[] searchEmplyee(String keyword) {

		int i, j = 0;
		Employee[] list2 = new Employee[this.max];

		for (i = 0; i < this.count; i++) {

			if (this.list[i].getEmpName().contains(keyword)) {
				list2[j] = this.list[i];
				j++;
			}
		}

		return list2;
	}

	public void displayEmployees() {
		if (this.count != 0) {
			System.out.println("\nID:	NAME:	SALARY:		TYPE:	");
			for (int i = 0; i < count; i++) {
				System.out.print(String.format("\n%d	%s	%,.2f	", this.list[i].getEmpID(),
						this.list[i].getEmpName(), this.list[i].computeSalary()));

				if (this.list[i] instanceof HourlyEmployee)
					System.out.print("Hourly ");
				if (this.list[i] instanceof CommissionEmployee)
					System.out.print("Commission ");
				if (this.list[i] instanceof PieceWorkerEmployee)
					System.out.print("Piece Worker ");
				if(this.list[i] instanceof Employee)
					System.out.print("Employee");
			}
		} else {
			System.out.println("No Employees");
		}
	}

	public float countHourlyEmployee() {
		float totalHours = 0;
		if (this.count != 0) {
			for (int i = 0; i < count; i++) {
				totalHours += ((HourlyEmployee) this.list[i]).getTotalHourWorked();
			}
		}
		return totalHours;
	}

	public int countPieceWorkerEmployee() {
		int totalPiece = 0;
		if (this.count != 0) {
			for (int i = 0; i < count; i++) {
				totalPiece += ((PieceWorkerEmployee) this.list[i]).getPiecefinished();
			}
		}
		return totalPiece;
	}

	public float countCommissionEmployee() {
		float totalCommission = 0;
		if (this.count != 0) {
			for (int i = 0; i < count; i++) {
				totalCommission += ((CommissionEmployee) this.list[i]).getCommission();
			}
		}
		return totalCommission;
	}

	public float countBasePlusCommissionEmployee() {
		float totalSalary = 0;
		if (this.count != 0) {
			for (int i = 0; i < count; i++) {
				totalSalary += this.list[i].computeSalary();
			}
		}
		return totalSalary;
	}
}
