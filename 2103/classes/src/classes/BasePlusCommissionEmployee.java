package classes;

public class BasePlusCommissionEmployee {
	
	private float baseSalary;
	private float totalSales;
	public BasePlusCommissionEmployee() {
	}
	public BasePlusCommissionEmployee(float baseSalary, float totalSales) {
		this.baseSalary = baseSalary;
		this.totalSales = totalSales;
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
	
	
}
