package com.javaintro;

public class StudentDetail {
	Integer studentId;
	String studentName,branchName;
	Character gender;
	static String collegeName="SITE";
	
	void displayDetails() {
		System.out.println();
		System.out.println("StudentId: "+studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Gender: "+gender);
		System.out.println("Branch Name: "+branchName);
		System.out.println("College Name: "+collegeName);
	}
	public static void main(String[] args) {
			StudentDetail s1=new StudentDetail();
			StudentDetail s2=new StudentDetail();
			
			s1.studentId=101;
			s1.studentName="Alice";
			s1.gender='M';
			s1.branchName="CST";
			
			s2.studentId=102;
			s2.studentName="Sandy";
			s2.gender='F';
			s2.branchName="CSE";
			
			s1.displayDetails();
			s2.displayDetails();

	}

}
