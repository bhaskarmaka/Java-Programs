package com.javaintro;

public class Employee {
	int eid;
	String enmae;
	
	static int orgID = 555;
	static String orgName = "Vcube";
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(orgID);
		System.out.println(orgName);
		System.out.println(Employee.orgID);
		System.out.println(Employee.orgName);
		System.out.println(emp.orgID);
		System.out.println(emp.orgName);
		System.out.println("_------------------------");
		emp.eid=101;
		emp.enmae="Alice";
		System.out.println(emp.eid);
		System.out.println(emp.enmae);
	}
}
