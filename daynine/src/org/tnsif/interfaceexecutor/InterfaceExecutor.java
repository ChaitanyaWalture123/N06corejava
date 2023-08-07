package org.tnsif.interfaceexecutor;

//driver class

public class InterfaceExecutor {

	public static void main(String[] args) {
		
		//we can't create an object foe interface
		
		//Sony s = new Sony();
		
		
		SonyTv s = new SonyTv();
		s.display();
		s.show();
		Sony.accept();
		
		
		ISRO i = new ISRO();
		i.status();
		
		
		Human h= new Human();
		h.ShowDrink();

	}

}
