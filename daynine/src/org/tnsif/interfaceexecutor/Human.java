package org.tnsif.interfaceexecutor;

public class Human implements ColdDrink, AlcoholDrinks{

	@Override
	public void ShowDrink() {
		System.out.println(colddrinkName+" "+alcoholType+" "+brand);
		
	}

	

}
