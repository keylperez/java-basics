package classes;

public class BasePlusCommissionEmployee extends CommissionEmployee{

	private float baseSalary;
	private float totalSalary;

	public BasePlusCommissionEmployee() {
		super();
	}

	public BasePlusCommissionEmployee(int empID, String empName, float baseSalary, float totalSales) {
		super.setEmpID(empID);
		super.setEmpName(empName);
		this.baseSalary = baseSalary;
		super.setTotalSales(totalSales);
//		this.totalSalary = totalSalary;
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
	
	public float computeTotalSalary() {
		this.setTotalSalary(this.baseSalary + super.getCommission());
		return this.totalSalary;
	}
	
	public void displayInfo() {
		System.out.println("BasePlusCommissionEmployee");
		System.out.println("BASE SALARY: " + this.getBaseSalary());
//		System.out.println(this);
	}
	
//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//
//		sb.append(super.toString());
////		super.toString();
//		sb.append("\nBASE SALARY: ");
//		sb.append(String.format("%,.2f", this.getBaseSalary()));
//		
//		return sb.toString();
//	}

}
