public class Driver extends Person {


	String car;

	public Driver(String name, String phoneNumber, String bankAccount, String car) {
		super(name, phoneNumber, bankAccount);
		this.car = car;
	}

	public Driver() {
		this("Invalid", "0000000", "000000000000", "Invalid");
	}

	public boolean setCar(String car) {
		if(this.car == null) {
			System.out.println("ERROR: Incorrect car");
			return false;
		}
		this.car = car;
		return true;
		
	}

	public String getCar() {
		return this.car;
	}

	public boolean setAll(String name, String phoneNumber, String bankAccount, String car) {
		return super.setAll(name, phoneNumber, bankAccount) && this.setCar(car);
	}

	

	
}