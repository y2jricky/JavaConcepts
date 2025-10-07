package com.studentmanagement.oops;

import java.util.Objects;

public class Person {
	protected String name;
	protected int age;
	protected String address;
	protected String contactNumber;
	private static int personCounter = 0;

	public Person(String name, int age, String address, String contactNumber) {
		super();
		if (validateContactNumber(contactNumber) && validateAddress(address)) {
			this.name = name;
			this.age = age;
			this.address = address;
			this.contactNumber = contactNumber;
			personCounter = personCounter + 1;// percsonCounter++
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validateAddress(address)) {
			this.address = address;
		}
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		}
	}

	private boolean validateContactNumber(String contactNumber) {
		if (contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Invalid contact number");
			return false;
		}
	}

	private boolean validateAddress(String address) {
		if (address.isEmpty() || address == null) {
			System.err.println("Address is incorrect");
			return false;
		} else {

			return true;
		}
	}

	protected boolean updateInformation(String newAddress, String newContactNumber) {
		if (validateAddress(newAddress) && validateContactNumber(newContactNumber)) {
			this.address = newAddress;
			this.contactNumber = newContactNumber;
			System.out.println("Updated contact number and address");
			return true;
		} else {
			return false;
		}

	}

	protected boolean updateInformation(String newAddress) {
		if (validateAddress(newAddress)) {
			this.address = newAddress;
			System.out.println("Updated address");
			return true;
		} else {
			return false;
		}

	}

	// Here boolean parameter has no significance, only to achieve overloading we
	// are using it
	protected boolean updateInformation(String newContactNumber, boolean update) {
		if (validateContactNumber(newContactNumber)) {
			this.contactNumber = newContactNumber;
			System.out.println("Updated address");
			return true;
		} else {
			return false;
		}

	}

	public static int getTotalPersonCount() {
		return personCounter;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", contactNumber=" + contactNumber
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, contactNumber, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && age == other.age
				&& Objects.equals(contactNumber, other.contactNumber) && Objects.equals(name, other.name);
	}

}
