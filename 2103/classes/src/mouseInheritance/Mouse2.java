package mouseInheritance;

public class Mouse2 extends Mouse{
	
	public void rightClick() {
		super.rightClick();
		System.out.println("Clicked Twice");
	}
	public void scrollUp() {
		System.out.println("Scroll up");
	}

	public void scrollDown() {
		System.out.println("Scroll down");
	}
	
	
}
