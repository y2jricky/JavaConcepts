package com.oops.concepts;

import java.util.Objects;

public class Teacher {
	private String name;
	private int age;
	private String contactNumber;
	private String address;
	private String empID;
	private String subject;
	private int yearsOfExperience;
	private double salary;
	
	
	private static final double BASE_SALARY = 30000;
	private static final double EXPERIENCE_BONUS = 2000;

	public Teacher(String name, int age, String contactNumber, String address, String empID, String subject,
			int yearsOfExperience) {
		if (validateAge(age) && validateContactNumber(contactNumber) && validateAddress(address) && validateEmpID(empID)
				&& validateSubject(subject) && validateYearsOfExperience(yearsOfExperience)) {
			this.name = name;
			this.age = age;
			this.contactNumber = contactNumber;
			this.address = address;
			this.empID = empID;
			this.subject = subject;
			this.yearsOfExperience = yearsOfExperience;
			calculateSalary();
		}
	}

	public boolean validateAge(int age) {
		if (age >= 21 && age <= 65) {
			return true;
		} else {
			System.err.println("Invalid age for Teacher : " + age);
			return false;
		}
	}

	public boolean validateContactNumber(String contactNumber) {
		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Invalid contact number");
			return false;
		}

	}

	public boolean validateAddress(String address) {
		if (!address.isEmpty()) {
			return true;
		} else {
			System.err.println("Address field has invalid data");
			return false;
		}
	}

	public boolean validateEmpID(String empID) {
		if (empID.matches("T\\d{3}")) {
			return true;
		} else {
			System.err.println("Invalid employee ID");
			return false;
		}
	}

	public boolean validateSubject(String subject) {
		if (!subject.isEmpty()) {
			return true;
		} else {
			System.err.println("Subject field has invalid data");
			return false;
		}
	}

	public boolean validateYearsOfExperience(int yearsOfExperience) {
		if (yearsOfExperience >= 0 && yearsOfExperience <= 35) {
			return true;
		} else {
			System.err.println("Invalid yearsOfExperience for Teacher : " + yearsOfExperience);
			return false;
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
		if (validateAge(age)) {
			this.age = age;
		}
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

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if (validateSubject(subject)) {
			this.subject = subject;
		}
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		if (validateYearsOfExperience(yearsOfExperience)) {
			this.yearsOfExperience = yearsOfExperience;
		}
	}

	public double getSalary() {
		return salary;
	}

	private void calculateSalary() {
		salary = BASE_SALARY + (yearsOfExperience * EXPERIENCE_BONUS);
		System.out.println(salary);

	}
	
	public void displayTeacherInfo() {
		System.out.println("----------Teacher Information-----------");
		System.out.println("Name of the Teacher : "+name);
		System.out.println("Age of the Teacher : "+age);
		System.out.println("Contact Number of the Teacher : "+contactNumber);
		System.out.println("Address of the Teacher : "+address);
		System.out.println("Employee ID of the Teacher : "+empID);
		System.out.println("Subject of the Teacher : "+subject);
		System.out.println("Years Of Experience of the Teacher : "+yearsOfExperience);
		System.out.println("Salary of the Teacher : " + "$" +salary);
		System.out.println("**********************************");
		
		
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", empID=" + empID + ", subject=" + subject + ", yearsOfExperience=" + yearsOfExperience + ", salary="
				+ salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, contactNumber, empID, name, salary, subject, yearsOfExperience);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(address, other.address) && age == other.age
				&& Objects.equals(contactNumber, other.contactNumber) && Objects.equals(empID, other.empID)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(subject, other.subject) && yearsOfExperience == other.yearsOfExperience;
	}

	

}
