package org.tnsif.abstractkeyword;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		//Sandwitch s = new Sandwitch();
		//we cannot create the object for the abstract class;
		
		CheeseCornSandwitch s = new CheeseCornSandwitch();
		s.prepare();
		s.showReceipe();

	}

}
