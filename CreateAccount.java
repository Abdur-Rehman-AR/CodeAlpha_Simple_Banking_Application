package codeAlpha;

/*
 * The create account Class is used to set and get the attribute values. 
 * It takes the values, we obtain through the parameters and it then sets 
 * the values. After that, if we want to use these values, we can use getter 
 * methods to get these values. And then we can use them. 
 */

public class CreateAccount {

	// Private Attributes to provide encapsulation
	private String name = "";
	private int age = 0;
	private String id = "";
	private String address = "";
	private int depositAmount = 0;
	private int withdrawAmount = 0;

	// Setter methods to set the private attributes values
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}

	public void setWithdrawAmount(int withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	// Getter methods to get the private attributes values
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public int getDepositAmount() {
		return depositAmount;
	}

	public int getWithdrawAmount() {
		return withdrawAmount;
	}
}