
public class BasePlusCommissionEmployee {

	private float baseSalary;
	private float totalSalary;
	private float commission;

	public BasePlusCommissionEmployee() {
		
	}

	public BasePlusCommissionEmployee(float baseSalary, float totalSales, float commission) {
		this.commission = commission;
		this.baseSalary = baseSalary;
	}

	
	public float getCommission() {
		return commission;
	}
	
	public void setCommission(float commission) {
		this.commission = commission;
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
		this.setTotalSalary(this.baseSalary + this.commission);
		return this.totalSalary;
	}
	
	public void displayInfo() {
		System.out.println("BasePlusCommissionEmployee");
		System.out.println("BASE SALARY: " + this.getBaseSalary());
//		System.out.println(this);
	}
	

}
