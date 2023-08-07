package org.tnsif.interfaceexecutor;

public interface Sony {
	
	//by default all the variabes inside an interface is public static final 
	
	int noOfChannels = 6;
	//by default all the methods are abstract in interface
	
	void display();
	
	//static method
	static void accept() {
		System.out.println("Static method");
	}
	
	// default method
	default void show(){
		System.out.println("default method");
	}
	
	
	
	

}
