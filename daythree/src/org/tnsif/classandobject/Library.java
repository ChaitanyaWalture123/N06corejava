// program to demonstrate on default and parametarized constructor;

package org.tnsif.classandobject;

public class Library {
	
	public long noOfBooks;
	public String authorName;
	public String bookName;
	public double price;
	public Library() {
		System.out.println("defaulat constructor");
	}
	public Library(long noOfBooks, String authorName, String bookName, double price) {
		super();
		this.noOfBooks = noOfBooks;
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
		System.out.println("parameterized constructor");
	}
	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}
	
	

}
