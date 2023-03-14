public class BasePlusCommissionEmployee extends CommissionEmployee{

	private float baseSalary;
	private float totalSalary;

	public BasePlusCommissionEmployee() {
		super();
	}

	public BasePlusCommissionEmployee(int empID, String empName, float baseSalary, float totalSales, float commission) {
		super(empID, empName, commission);
		this.baseSalary = baseSalary;
	}

	
	public float getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}

	public float getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(float totalSalary) {
		this.totalSalary = totalSalary;
	}
	
	@Override
	public float computeSalary() {
		this.setTotalSalary(this.baseSalary + super.getCommission());
		return this.totalSalary;
	}
	
	public void displayInfo() {

		System.out.println("BASE SALARY: " + this.getBaseSalary() + "		");
//		System.out.println(this);
	}
	

}