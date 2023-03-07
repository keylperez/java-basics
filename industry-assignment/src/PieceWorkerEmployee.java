
public class PieceWorkerEmployee extends Employee{
	private int piecefinished;
	private float rate;
	
	public PieceWorkerEmployee() {
		super();
	}
	
	public PieceWorkerEmployee(int empID, String empName, int piecefinished, float rate) {
		super(empID, empName);
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
		System.out.println("PIECE FINISHED: " + this.getPiecefinished());
	}
}
