package org.tnsif.thiskeyworddemoone;


class Team{
	int size;
	Team()
	{
		this(7);
		
		System.out.println("default constructor");
	}
	Team(int size) {
		
		System.out.println("parametarized constructor : "+size);
		
	}
	
}

public class ThisKeywordDemo3 {

	public static void main(String[] args) {
		Team t = new Team();

	}

}
