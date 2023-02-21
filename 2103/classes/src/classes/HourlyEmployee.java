package classes;

public class HourlyEmployee {
	private int empID;
	private String empName;
	private float totalHourWorked;
	private float ratePerHour;

	public HourlyEmployee() {
	}

	public HourlyEmployee(int empID, String empName, float totalHourWorked, float ratePerHour) {
		this.empID = empID;
		this.empName = empName;
		this.totalHourWorked = totalHourWorked;
		this.ratePerHour = ratePerHour;
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

	public float getTotalHourWorked() {
		return totalHourWorked;
	}

	public void setTotalHourWorked(float totalHourWorked) {
		this.totalHourWorked = totalHourWorked;
	}

	public float getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(float ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public float getSalary() {
//      float total = this.totalHourWorked * this.ratePerHour;
//      // return this.totalHourWorked * this.ratePerHour;
//      return total <= 40 ? total : total + 40;
		float hours, overtime;

		hours = this.totalHourWorked;
		overtime = 0;

		if (hours > 40) {
			overtime = hours - 40;
			hours = 40;
		}

		return hours * this.ratePerHour + overtime * this.ratePerHour * 1.5f;
	}

	public void displayInfo() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("ID: ");
		sb.append(this.empID);
		sb.append("\nNAME: ");
		sb.append(this.empName);
		sb.append("\nSALARY: Php");
		sb.append(String.format(" %,.2f", this.getSalary()));
		
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		HourlyEmployee he;

		if (obj instanceof HourlyEmployee) {
			he = (HourlyEmployee) obj;
		} else {
			return false;
		}
		if(he.empID == this.empID && he.empName == this.empName) {
			return true;
		}
		return false;
	}
}
