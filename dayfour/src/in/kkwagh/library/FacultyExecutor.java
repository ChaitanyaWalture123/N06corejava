package in.kkwagh.library;
import in.bkcmet.library.*;
//import in.bkcmet.library.library;


public class FacultyExecutor {

	public static void main(String[] args) {
		Library l = new Library();
		l.libraryName="Bhujbal Library";
		l.displayPublic();
		
	//we can access only in same class within same package;
		//l.userId=1233444;
		//l.displayPrivate();
		
	//we can access only  within the same package;
		//l.bookname;
		//l.displayDefault();
		
	}

}
