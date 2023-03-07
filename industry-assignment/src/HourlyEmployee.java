
public class HourlyEmployee {
	
	private float totalHourWorked;
	private float ratePerHour;

	public HourlyEmployee() {
	}

	public HourlyEmployee(float totalHourWorked, float ratePerHour) {
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
}