package com.comit.course._05_Practice;

import java.util.Scanner;

class Book{
	/*
	 * Attributes - Fields - Properties - Instance Variables
	 * Variables inside the class.
	 * class with attributes title of the book, author, number of copies of the book and number of lend copies.
	 */
	
	String title;
	String author;
	int numCopies;
	int lendCopies;
	
	Book(){
		/*
		 * Default Constructor created by Java automatically for us 
		 * when we don't have any constructor
		 */
	}
	
	//Constructor with parameters
	Book(String title, String author, int numCopies, int lendCopies) {
		this.title = title;
		this.author = author;
		this.numCopies = numCopies;
		this.lendCopies = lendCopies;
	}
	/*
	 * Method is a block of code that runs when it is called.
	 * 
	 * return type - method name - parameters - block of code
	 */
	
	/*
	 * To follow Encapsulation follow getters and setters.
	 */
	
	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}


	String getAuthor() {
		return author;
	}
	void setAuthor(String author) {
		this.author = author;
	}


	double getNumCopies() {
		return numCopies;
	}
	void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}


	double getLendCopies() {
		return lendCopies;
	}
	void setLendCopies(int lendCopies) {
		this.lendCopies = lendCopies;
	}


	//loan method
	boolean loan() {
		if(numCopies > lendCopies) {
			lendCopies--;
			return true;
		}
		return false;
	}
	
	//return method
	boolean returnBook() {
		if(lendCopies > 0) {
			lendCopies--;
			return true;
		}
		return false;
	}
	
	//toString method @Override
	public String toString() {
		return "Title:" + title + "\nAuthor:"+ author+"\nNumber of Copies:"+ numCopies + 
				"\nNumber of Lend Copies:"+ lendCopies +"\n";
	}
	
}


public class MyLibrary {

	public static void main(String[] args) {
		
		Scanner lib = new Scanner(System.in);
		
		//Create a book object with default constructor
		Book book1 = new Book();
		
		//Create a book object with parameterized constructor
		Book book2 = new Book("The Festival", "John Kenny", 5, 2);
		
		//Set values for book1 using setters
		System.out.print("Enter the title of the book: ");
		book1.setTitle(lib.nextLine());
		
		System.out.print("Enter the author name of the book: ");
		book1.setAuthor(lib.nextLine());
		
		System.out.print("Enter the number of copies of the book: ");
		book1.setNumCopies(lib.nextInt());
		
		System.out.print("Enter the number of lend copies of the book: ");
		book1.setLendCopies(lib.nextInt());
		
		//Test loan and return methods
		if(book1.loan()) {
			System.out.println("Book loaned successfully.");
		} else {
			System.out.println("No copies available to loan.");
		}
		
		if(book1.returnBook()) {
			System.out.println("Book returned successfully.");
		} else {
			System.out.println("No copies have been lend.");
		}
		
		//print book information using toString method
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		
        lib.close();
	}

}
