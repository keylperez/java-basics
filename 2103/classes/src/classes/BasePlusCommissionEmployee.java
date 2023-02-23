package classes;

public class BasePlusCommissionEmployee {
	
	private float baseSalary;
	private float totalSales;
	private float totalSalary;

	public BasePlusCommissionEmployee() {
	}
	
	public BasePlusCommissionEmployee(float baseSalary, float totalSales) {
		this.baseSalary = baseSalary;
		this.totalSales = totalSales;
//		this.totalSalary = totalSalary;
	}

	public float getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}
	public float getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(float totalSales) {
		this.totalSales = totalSales;
	}

	public float getTotalSalary() {
		float commission = 0.05f;
		if(this.totalSales > 10000.00) commission = 0.15f;
		if(this.totalSales > 50000.00) commission = 0.20f;
		return baseSalary + (this.totalSales * commission);
	}

	public void setTotalSalary(float totalSalary) {
		this.totalSalary = totalSalary;
	}
	
}
