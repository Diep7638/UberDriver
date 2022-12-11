public class Person {

  /* So we want to create a person. 
  Every person should have:
  1. name (String, so we can put any name we want)
  2. phone (String/int, choose what ever works best for you)
  3. bank account (Same as for phone number)

  Right? yes

  Ok, so let's make variables
  The reason why string, because all of them are not used in any calculations (aka +, -, * and so on)
So there is simply no point to convert it between one and another
And that means that now we Can System.out.println() without any conversion.
  
Okay, so i get everything that you're saying, but I still need to picture what the result of this repl should look like tho
Are you saying we're going to make it so that we can input the information for the user, the dirver and the person? and then also input destinatio, etc.
    So you want to make an Uber, right? whatever works tbh. it doesnt have to be uber
  I like idea of Uber, so let's just stick with it
  So for now let's create a small programm where we can create accounts for:
  1. Users
  2. Drivers

  But we want to have all the traits what they shar to be in Person class.

well if thats the case, these 3 traits are what they have in common

  Ok, so now let's make a constructor for them.

  And all the getters and setters
dont we have to use the setters for the constructors? or do you want to add that later
ahh alr, i thought it was a must

  Nah, it's just making everything more complecated.
  Look how clean it is now.

  Problem with setters that they only needed if we want to validate something in the setter itself.
  Oh, we actually might want to do it. 
*/
//cool
  // So now our phone is going to be from 4 to 8 digits. 
  private static final int PHONE_MIN = 4;
  private static final int PHONE_MAX = 8;

  private static final int BANK_ACCOUNT_MIN = 10;
  private static final int BANK_ACCOUNT_MAX = 16;

  // Default values, so if set() fails, programm won't crash. 
  private String name;
  private String phone = "0000000";
  private String bankAccount = "000000000000";

	public Person (String name, String phone, String bankAccount) {
		this.setAll(name,phone,bankAccount);
	}

	public Person() {
		//this("Invalid", "0000000", "000000000000");
	}
  public boolean setName(String name) {
    this.name = name;
    return true;
  }

  public boolean setPhone(String phone) {
    if (phone.length() < this.PHONE_MIN || phone.length() > this.PHONE_MAX || !isNumber(phone)) {
      System.out.println("ERROR: Incorrect phone number.");
      return false;
    }
    this.phone = phone;
	  return true; 
  }

  
  public boolean setBankAccount(String bankAccount) {
	  if(bankAccount.length() < this.BANK_ACCOUNT_MIN || bankAccount.length() > this.BANK_ACCOUNT_MAX || !isNumber(bankAccount)) {
      System.out.println("ERROR: Incorrect bank account.");
		 return false; 
	  }
	  this.bankAccount = bankAccount;
    return true;
  }

  public String getName() {
    return this.name;
  }

  public String getPhone() {
    return this.phone;
  }

  public String getBankAccount() {
    return this.bankAccount;
  }

  private boolean isNumber(String text) {
    boolean isNumber = true;
    char[] digits = text.toCharArray();
    for(char element : digits) {
      if(!Character.isDigit(element)){
        isNumber = false;
      }
    }
    return isNumber;
	}

  public boolean setAll(String name, String phone, String bankAccount) {
	  return setName(name) & setPhone(phone) & setBankAccount(bankAccount);
  }

  public boolean equals(Object object) {
	  if(object == null) {
      return false;
    } else if(object instanceof Person) { 
      Person person = (Person) object;
      return person.getName().equals(this.getName()) &&
             person.getPhone().equals(this.getPhone()) &&
             person.getBankAccount().equals(this.getBankAccount());
    } else {
      return false;
    }
  }
   
  public String toString() {
    return "Person:\n Name: " + this.getName() +
        "\n Phone: " + this.getPhone() +
        "\n Bank Account: " + this.getBankAccount();
  }

}