package org.tnsis.superkeyworddemo;

class MET{
	String OwnerName="Chhagan Bhujbal";
	void displayName() {
		System.out.println("owner is: "+OwnerName);
	}
}
class BKC extends MET{
	String OwnerName="Shefali Bhujbal";
			void displayName() {
				super.displayName();
				System.out.println("owner is: "+OwnerName);
			}
	
}

public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b= new BKC();
		b.displayName();

	}

}
