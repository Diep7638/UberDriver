public class User extends Person {

	
	String pickUpLocation;
	String destiny;

	public User(String name, String phone, String bankAccount, String pickUpLocation, String destiny) {
		super(name, phone, bankAccount);
		this.pickUpLocation = pickUpLocation;
		this.destiny = destiny;
	}

	public User() {
		
		this("Invalid", "0000000", "000000000000", "Invalid", "Invalid");
	}

	public boolean setPickUpLocation(String pickUpLocation) {
		if(this.pickUpLocation == null){
			System.out.println("ERROR: Incorrect pick up location");
			return false;
		}
		this.pickUpLocation = pickUpLocation;
		return true;
	}

	public boolean setDestiny(String destiny) {
		if(this.destiny == null) {
			System.out.println("ERROR: Incorrect destiny");
			return false;
		}
		this.destiny = destiny;
		return true;
	}

	public String getPickUpLocation() {
		return this.pickUpLocation;
	}

	public String getDestiny() {
		return this.destiny;
	}

	public boolean setAll(String name, String phone, String bankAccount, String pickUpLocation, String destiny) {
		return super.setAll(name, phone, bankAccount) && this.setPickUpLocation(pickUpLocation) && this.setDestiny(destiny);
	}

	@Override public String toString() {
		return "User:\n Name: " + this.getName() +
		"\n Phone: " + this.getPhone() +
        "\n Bank Account: " + this.getBankAccount() +
		"\n Pick Up Location: " + this.getPickUpLocation() + 
		"\n Destiny: " + this.getDestiny();
	}
	
}