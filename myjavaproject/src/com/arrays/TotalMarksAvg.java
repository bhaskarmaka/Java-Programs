package com.arrays;

public class TotalMarksAvg {

	public static void main(String[] args) {
		int [] marks= {99,98,97,99,98,97};
		
		int tot_marks=0;
		double avg=0;
		
//		for(int m:marks) {
//			tot_marks+=m;
//		}
		
		for(int i=0;i<marks.length;i++) {
			tot_marks+=marks[i];
		}
		
		avg=tot_marks/marks.length;
		System.out.println("Total Marks: "+tot_marks);
		System.out.println("Average Marks: "+avg);
	}

}
