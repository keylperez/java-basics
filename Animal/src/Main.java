
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal a = new Animal("Angelo");
//		a.eat("Beplop");

		Animal a = new Dog("Husky", "Caramel");
		Dog d = (Dog)a;
		a.tingog();
		a.eat("Chocolate"); // used Animal Method
		a.displayName();
		// a.sit() cannot because a is an Animal class
		
		a = new Fish();
		a.tingog();
		a.displayName();
		
		if (a instanceof Dog) {

			((Dog) a).sit(); // typecast to Dog
		}
	}

}
