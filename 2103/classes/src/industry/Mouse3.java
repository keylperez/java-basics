package industry;

public class Mouse3 {
	
	String connection = "bluetooh";
	
	public void connect() {
		System.out.println("The mouse is connected to a(n) " + connection);
	}
	
	public void setConnection(String connection) {
		this.connection = connection;
	}
}
