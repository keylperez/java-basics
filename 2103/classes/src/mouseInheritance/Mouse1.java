package mouseInheritance;

public class Mouse1 extends Mouse{
	
	protected String color = "white";
	
	public Mouse1() {
		super(); // this();
	}

	public void changeColor(String color) {
		System.out.println("Color Changed!");
		
	}
}
