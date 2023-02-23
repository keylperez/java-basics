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

	public float getTotalSalary(float commission) {
		this.totalSalary = this.baseSalary + commission;
		return this.totalSalary;
	}

	public void setTotalSalary(float totalSalary) {
		this.totalSalary = totalSalary;
	}

}
