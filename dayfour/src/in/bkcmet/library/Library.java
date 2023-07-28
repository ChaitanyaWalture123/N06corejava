//program to demonstrate on access specifier
package in.bkcmet.library;
//different access specifier
public class Library {
	public String libraryName;
	private long userId;
	String booksName;
	
	public void displayPublic()
	{
		System.out.println("library name : "+libraryName);
	}
	
	private void displayPrivate()
	{
		System.out.println("user id: "+userId);
	}
	
	void displayDefault() {
		System.out.println("booksName name : "+booksName);
	}
}
