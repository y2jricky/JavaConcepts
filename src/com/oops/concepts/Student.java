package com.oops.concepts;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private String address;
	private String contactNumber;
	private int rollNumber;
	private double marksObtainedInEnglish;
	private double marksObtainedInMaths;
	private double marksObtainedInScience;
	private String grade;
	private double totalMarks;
	private double percentage;

	public Student(String name, int age, String address, String contactNumber, int rollNumber,
			double marksObtainedInEnglish, double marksObtainedInMaths, double marksObtainedInScience) {
		if (validateAge(age) && validateRollNumber(rollNumber) && validateMarks(marksObtainedInEnglish)
				&& validateMarks(marksObtainedInMaths) && validateMarks(marksObtainedInScience)
				&& validateAddress(address) && validateContactNumber(contactNumber)) {
			this.name = name;
			this.age = age;
			this.address = address;
			this.contactNumber = contactNumber;
			this.rollNumber = rollNumber;
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			this.marksObtainedInMaths = marksObtainedInMaths;
			this.marksObtainedInScience = marksObtainedInScience;
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
		if (age >= 10 && age < 21) {
			this.age = age;
		} else {
			System.out.println("Invalid age for Student : " + age);
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if (rollNumber >= 1) {
			this.rollNumber = rollNumber;
		} else {
			System.out.println("Invalid rollnumber for Student : " + rollNumber);
		}
	}

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
		if (marksObtainedInEnglish >= 0 && marksObtainedInEnglish <= 100) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
		} else {
			System.out.println("Invalid marks for Student in English : " + marksObtainedInEnglish);
		}

	}

	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(double marksObtainedInMaths) {
		if (marksObtainedInMaths >= 0 && marksObtainedInMaths <= 100) {
			this.marksObtainedInMaths = marksObtainedInMaths;
		} else {
			System.out.println("Invalid marks for Student in Math : " + marksObtainedInMaths);
		}

	}

	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(double marksObtainedInScience) {
		if (marksObtainedInScience >= 0 && marksObtainedInScience <= 100) {
			this.marksObtainedInScience = marksObtainedInScience;
		} else {
			System.out.println("Invalid marks for Student in Science : " + marksObtainedInScience);
		}
	}

	public String getGrade() {
		return grade;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public double getPercentage() {
		return percentage;
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

	public void calculateTotalMarks() {
		totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
	}

	public void calculatePercentage() {
		percentage = totalMarks / 3;
	}

	public void calculateGrade() {
		if (percentage == 0) {
			grade = "can not be calculated";
		} else {
			if (percentage >= 95) {
				grade = "A+";
			} else if (percentage >= 90) {
				grade = "A";
			} else if (percentage >= 80) {
				grade = "B";
			} else if (percentage >= 70) {
				grade = "C";
			} else if (percentage >= 40) {
				grade = "D";
			} else {
				grade = "F";
			}
		}

	}

	public boolean validateAge(int age) {
		if (age >= 10 && age < 21) {
			return true;
		} else {
			System.err.println("Invalid age for Student : " + age);
			return false;
		}
	}

	public boolean validateRollNumber(int rollNumber) {
		if (rollNumber >= 1 && rollNumber <= 100) {
			return true;
		} else {
			System.err.println("Invalid rollNumber for Student : " + rollNumber);
			return false;
		}
	}

	public boolean validateMarks(double marksForTheSubject) {
		if (marksForTheSubject > 100 || marksForTheSubject < 0) {
			System.err.println("Invalid marks for Student : " + marksForTheSubject);
			return false;
		} else {

			return true;
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

	public boolean validateContactNumber(String contactNumber) {
		if (contactNumber != null && contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Invalid contact number");
			return false;
		}

	}
	
	public void displayStudentInfo() {
		System.out.println("----------Student Information-----------");
		System.out.println("Name of the Student : "+name);
		System.out.println("Age of the Student : "+age);
		System.out.println("Contact Number of the Student : "+contactNumber);
		System.out.println("Address of the Student : "+address);
		System.out.println("Marks in English for the Student : "+marksObtainedInEnglish);
		System.out.println("Marks in Maths for the Student : "+marksObtainedInMaths);
		System.out.println("Marks in Science for the Student : "+marksObtainedInScience);
		System.out.println("**********************************");
		System.out.println("Total Marks of the Student : "+totalMarks);
		System.out.println("Total Percentage of the Student : "+percentage+"%");
		System.out.println("Grade of the student : "+grade);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, grade, marksObtainedInEnglish, marksObtainedInMaths, marksObtainedInScience, name,
				percentage, rollNumber, totalMarks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(grade, other.grade)
				&& Double.doubleToLongBits(marksObtainedInEnglish) == Double
						.doubleToLongBits(other.marksObtainedInEnglish)
				&& Double.doubleToLongBits(marksObtainedInMaths) == Double.doubleToLongBits(other.marksObtainedInMaths)
				&& Double.doubleToLongBits(marksObtainedInScience) == Double
						.doubleToLongBits(other.marksObtainedInScience)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& rollNumber == other.rollNumber
				&& Double.doubleToLongBits(totalMarks) == Double.doubleToLongBits(other.totalMarks);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", contactNumber=" + contactNumber
				+ ", rollNumber=" + rollNumber + ", marksObtainedInEnglish=" + marksObtainedInEnglish
				+ ", marksObtainedInMaths=" + marksObtainedInMaths + ", marksObtainedInScience="
				+ marksObtainedInScience + ", grade=" + grade + ", totalMarks=" + totalMarks + ", percentage="
				+ percentage + "]";
	}

}
