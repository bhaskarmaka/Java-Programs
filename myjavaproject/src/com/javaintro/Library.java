package com.javaintro;

public class Library {
	
	static String libraryName="JNTUK Library";
	static String librarianName="Vishwanath";
	
	int bookId,availCopies;
	String bookTitle,authorName;
	
	void displayBookdetails(){
		System.out.println("BookId: "+bookId);
		System.out.println("BookTitle: "+bookTitle);
		System.out.println("Author Name: "+authorName);
		System.out.println("Available Copies: "+availCopies);
		//System.out.println();
	}
	void issueBook() {
		if(availCopies>0) {
			availCopies=availCopies-1;
			//System.out.println("Issued!!");
		}
		else{
			System.out.println("Not available");
		}
	}
	
	static void displayLibraryDetails() {
		System.out.println("Library Name: "+libraryName);
		System.out.println("Librarian Name: "+librarianName);
		System.out.println();
	}
	
	static void changeLibrarian() {
		librarianName="Srikanth";
	}
	public static void main(String[] args) {
		Library l1=new Library();
		Library l2=new Library();
		
		l1.bookId=101;
		l1.bookTitle="Abc";
		l1.authorName="Alice";
		l1.availCopies=100;
		
		l2.bookId=102;
		l2.bookTitle="Xyz";
		l2.authorName="Bob";
		l2.availCopies=50;
		
		l1.displayBookdetails();
		Library.displayLibraryDetails();
		l2.displayBookdetails();
		l2.displayLibraryDetails();
				
		l1.issueBook();
		l1.displayBookdetails();
		l1.changeLibrarian();
		
		Library.displayLibraryDetails();
		
		l2.issueBook();
		l2.displayBookdetails();
		l2.displayLibraryDetails();
		

	}

}
