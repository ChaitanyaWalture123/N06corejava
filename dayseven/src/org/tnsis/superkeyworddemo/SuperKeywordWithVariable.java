
//progarm to demonstrate the use of the super keyword with variable;
package org.tnsis.superkeyworddemo;
class Building{
	
	int floors=23;
	String name="Anantha-Asta";
	
	
}

class Flat extends Building{
	
	String name="Chaitanya Walture";
	
	void display() {
		
		/* parent and child have same name and if we want to access parent class variable inside child 
		 * class ten we use super.variable name;
		 */
		System.out.println(super.name);
		System.out.println(name);
		
	}
}

public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flat f=new Flat();
		f.display();
	}

}
