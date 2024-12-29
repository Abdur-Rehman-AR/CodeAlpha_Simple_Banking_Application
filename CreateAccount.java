package codeAlpha;

public class CreateAccount {

	// Private Attributes to provide encapsulation
	private String name = "";
	private int age = 0;
	private String id = "";
	private String address = "";

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
}