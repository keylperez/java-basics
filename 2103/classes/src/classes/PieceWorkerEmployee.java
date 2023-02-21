package classes;

public class PieceWorkerEmployee {
	private int piecefinished;
	private float rate;
	
	public PieceWorkerEmployee() {
	}
	
	public PieceWorkerEmployee(int piecefinished, float bonus, float rate) {
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
		int remainder = piecefinished % 100;
		return remainder >= 0 ? this.totalPrice() * 5  * remainder: 0;
	}
	
	public float totalPrice() {
		return this.piecefinished * rate;
	}
}
