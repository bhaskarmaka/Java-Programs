package com.javaintro;

public class Students {
	int studentId;
	String studentName;
	float englishMarks,teluguMarks,hindiMarks,totalMarks,percentage;
	
	static String collegeName="JNTUK";
	
	void calcTotal() {
		totalMarks=englishMarks+teluguMarks+hindiMarks;
	}
	
	void calcPercentage() {
		percentage=(totalMarks/300 * 100);
	}
	
	void displayStudent() {
		System.out.println("StudentId: "+studentId);
		System.out.println("StudentName: "+studentName);
		System.out.println("College: "+collegeName);
		System.out.println("English Marks: "+englishMarks);
		System.out.println("Telugu Marks: "+teluguMarks);
		System.out.println("Hindi Marks: "+hindiMarks);
		System.out.println("Total Marks of the student:"+totalMarks);
		System.out.println("Percentage: "+percentage);
		System.out.println();
	}
	public static void main(String[] args) {
		Students s1=new Students();
		s1.studentId=101;
		s1.studentName="Alice";
		s1.englishMarks=99;
		s1.hindiMarks=98;
		s1.teluguMarks=97;
		s1.calcTotal();
		s1.calcPercentage();
		s1.displayStudent();
		
		Students s2=new Students();
		s2.studentId=102;
		s2.studentName="Bob";
		s2.englishMarks=87;
		s2.hindiMarks=88;
		s2.teluguMarks=89;
		s2.calcTotal();
		s2.calcPercentage();
		s2.displayStudent();
	}

}
