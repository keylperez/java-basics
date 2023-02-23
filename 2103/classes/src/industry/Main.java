package industry;

public class Main {
	
	public static void main(String[] args) {
		Mouse1 m1 = new Mouse1();
		
		m1.leftClick();
		m1.rightClick();
		m1.changeColor("Pink");
		System.out.println("The color is change to " + m1.color);
		
		Mouse2 m2 = new Mouse2();
		m2.scrollUp();
		m2.rightClick();
	}
}
