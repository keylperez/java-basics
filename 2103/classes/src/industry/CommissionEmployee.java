package industry;

public class CommissionEmployee extends Employee{
	private float totalSales;
	private float commission;
	
	public CommissionEmployee() {
		super();
	}
	public CommissionEmployee(int empID, String empName, float totalSales) {
		super.setEmpID(empID);
		super.setEmpName(empName);
		this.totalSales = totalSales;
	}
	
	public float getCommission() {
		return commission;
	}
	public void setCommission(float commission) {
		this.commission = commission;
	}
	public float getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(float totalSales) {
		this.totalSales = totalSales;
	}
	public float computeCommission() {
		this.commission = 0.05f;
		if(this.totalSales > 10000.00) this.commission = 0.15f;
		if(this.totalSales > 50000.00) this.commission = 0.20f;
		
		this.commission *= this.totalSales;
		return this.commission;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("TOTAL SALES: " + this.getTotalSales());
//		System.out.println(this);
	}
	
//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//
//		sb.append(super.toString());
////		super.toString();
//		sb.append("\nTOTAL SALES: ");
//		sb.append(String.format("%,.2f", this.getCommission()));
//		
//		return sb.toString();
//	}
	
}
