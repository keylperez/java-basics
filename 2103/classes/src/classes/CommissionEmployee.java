package classes;

public class CommissionEmployee {
	private float totalSales;
	public CommissionEmployee() {
	}
	public CommissionEmployee(float totalSales) {
		this.totalSales = totalSales;
	}
	public float getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(float totalSales) {
		this.totalSales = totalSales;
	}
	public float getCommission() {
		float commission = 0.05f;
		if(this.totalSales > 10000.00) commission = 0.15f;
		if(this.totalSales > 50000.00) commission = 0.20f;
		return this.totalSales * commission;
	}
	
}
