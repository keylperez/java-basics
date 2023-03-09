
public class Dog extends Animal{
	private String breed;

	public Dog() {
		super();
	}

	public Dog(String breed) {
		super();
		this.breed = breed;
	}
	
	public Dog(String breed, String name) {
		super(name);
		this.breed = breed;
	}
	
	@Override
	public void tingog() {
		System.out.println(String.format("The dog named as %s says arfff arfff", this.name));
	}

	@Override
	public void eat() {
		System.out.println("the " + this.breed + "dog is eating dogfood");
	}
	
	public void sit() {
		System.out.println("The dog named as " + this.name + "is sitting. Good dog.");
	}
	
	
	
}
