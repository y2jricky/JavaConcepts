package com.buildersessions;

public class Employee {
	private final String name;
	private final int empId;
	private final double salary;

	private Employee(String name, int empId, double salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */

	public int getEmpId() {
		return empId;
	}

	/*
	 * public void setEmpId(int empId) { this.empId = empId; }
	 */

	public double getSalary() {
		return salary;
	}

	/*
	 * public void setSalary(double salary) { this.salary = salary; }
	 */

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}

	public static class Builder {// Inner class
		private String name;
		private int empId;
		private double salary;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder empId(int empId) {
			this.empId = empId;
			return this;
		}

		public Builder salary(double salary) {
			this.salary = salary;
			return this;
		}
		
		public Employee build() {
			Employee e = new Employee(name, empId, salary);
			return e;
		}

	}

}
