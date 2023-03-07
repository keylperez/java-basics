

public class HourlyEmployee extends Employee{
	
	private float totalHourWorked;
	private float ratePerHour;

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(int empID, String empName, float totalHourWorked, float ratePerHour) {
		super(empID, empName);
		this.totalHourWorked = totalHourWorked;
		this.ratePerHour = ratePerHour;
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
		super.displayInfo();
		System.out.println("TOTAL HOURS WORKED: " + this.getTotalHourWorked());
		System.out.println("RATE PER HOUR: " + this.getRatePerHour());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(super.toString());
		sb.append("\nSALARY: Php");
		sb.append(String.format(" %,.2f", this.getSalary()));
		
		return sb.toString();
	}
	
	public boolean equals(Object obj) {
		HourlyEmployee he;

		if (obj instanceof HourlyEmployee) {
			he = (HourlyEmployee) obj;
		} else {
			return false;
		}
		if(he.getEmpID() == this.getEmpID() && he.getEmpName() == this.getEmpName()) {
			return true;
		}
		return false;
	}
}