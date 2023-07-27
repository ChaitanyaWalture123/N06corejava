package org.tnsif.miltilevelinheritance;

public class TeamMeamber extends TeamLead{
	
	private int size;
	private int duration;
	
	

	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public TeamMeamber(String deptname, String name, int empId, String leadName, String projectName,int size,int duration) {
		super(deptname, name, empId, leadName, projectName);
		
		this.size=size;
		this.duration=duration;
		
	}



	@Override
	public String toString() {
		return "TeamMeamber [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
