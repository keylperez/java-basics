
public class Animal {
	protected String name;


	public Animal(String name) {
		super();
		this.name = name;
	}


	public Animal() {
		super();
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void displayName() {
		System.out.println("Animal name is " + this.name);
	}


	//early binding
	public void eat() {
		System.out.println("The animal named " + this.name + " is eating. ");
	}
	public void eat(String food) {
		System.out.println("The animal named " + this.name + " is eating " + food + ".");
	}
	
	public void tingog() {
		System.out.println("The animal is making a sound.");
	}
	
}
