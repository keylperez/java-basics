package classes;

public class PieceWorkerEmployee extends Employee{
	private int piecefinished;
	private float rate;
	
	public PieceWorkerEmployee() {
		super();
	}
	
	public PieceWorkerEmployee(int empID, String empName, int piecefinished, float rate) {
		super.setEmpID(empID);
		super.setEmpName(empName);
		this.piecefinished = piecefinished;
		this.rate = rate;
	}

	public float getRate() {
		return rate;
	}
	
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	public int getPiecefinished() {
		return piecefinished;
	}
	
	public void setPiecefinished(int piecefinished) {
		this.piecefinished = piecefinished;
	}
	
	public float getBonus() {
		int bonus = piecefinished / 100;
		return bonus >= 0 ? this.totalPrice() + (5  * bonus): 0;
//		return remainder;
	}
	
	public float totalPrice() {
		return this.piecefinished * rate;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("PIECE FINISHED: " + this.getPiecefinished());
//		System.out.println(this);
	}
	
	public int inheritEmpID() {
		return super.getEmpID();
	}
	
	public String inheritEmpName() {
		return super.getEmpName();
	}
	
//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//
//		sb.append(super.toString());
////		super.toString();
//		sb.append("\nPIECE FINISHED: ");
//		sb.append(String.format("%d", this.getPiecefinished()));
//		
//		return sb.toString();
//	}
}
