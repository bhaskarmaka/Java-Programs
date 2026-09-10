package com.javaintro;

public class EmployeeSal {
	
	String empName;
	double monthlySal,monthlyGST,monthlyPF,netMonthlySal,annualPF,annualGST,annualNetSal;
	
	void calcMonthlyPF() {
		monthlyPF=(monthlySal * 2)/100;
	}
	
	void calcMonthlyGST() {
		monthlyGST=(monthlySal *3)/100;
	}
	
	void calcNetMonthlySal() {
		netMonthlySal=(monthlySal-monthlyPF-monthlyGST);
	}
	
	void calcAnnualPF() {
		annualPF=monthlyPF * 12;
	}
	
	void calcAnnualGST() {
		annualGST=monthlyGST * 12;
	}
	
	void calcAnnualNetSal() {
		annualNetSal=netMonthlySal * 12;
	}
	
	void displayEmpDetails() {
		System.out.println();
		System.out.println("Employee Name: "+empName);
		System.out.println("Monthly Salary: "+monthlySal);
		System.out.println("Monthly GST: "+monthlyGST);
		System.out.println("Monthly PF: "+monthlyPF);
		System.out.println("Net Monthly Salary: "+netMonthlySal);
		System.out.println("Annual PF: "+annualPF);
		System.out.println("Annual GST: "+annualGST);
		System.out.println("Annual PF: "+annualNetSal);
	}
	public static void main(String[] args) {
		EmployeeSal e1=new EmployeeSal();
		EmployeeSal e2=new EmployeeSal();
		
		e1.empName="Alice";
		e1.monthlySal=5000;
		
		e1.calcMonthlyPF();
		e1.calcMonthlyGST();
		e1.calcNetMonthlySal();
		e1.calcAnnualGST();
		e1.calcAnnualPF();
		e1.calcAnnualNetSal();
		e1.displayEmpDetails();
		
		e2.empName="Bob";
		e2.monthlySal=50000;
		
		e2.calcMonthlyPF();
		e2.calcMonthlyGST();
		e2.calcNetMonthlySal();
		e2.calcAnnualGST();
		e2.calcAnnualPF();
		e2.calcAnnualNetSal();
		e2.displayEmpDetails();
	}

}
