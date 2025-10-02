package com.builder.patteren;

public class EmpRunner {
	public static void main(String[] args) {
		//Employee e = new Employee("Biswajit", 58515, 55000);
		//System.out.println(e);
		
		Employee e = new Employee.Builder().Name("ricky").Salary(23000).EmpId(34).build();
		System.out.println(e);
	}

}
