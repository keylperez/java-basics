package classes;

public class PieceWorkerEmployee {
	private int piecefinished;
	private float rate;
	
	public PieceWorkerEmployee() {
	}
	
	public PieceWorkerEmployee(int piecefinished, float rate) {
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
}
