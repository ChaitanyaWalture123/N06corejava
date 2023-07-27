package org.tnsif.hierachicalinheritance;

public class SnowCone extends Android{
	
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public SnowCone(String brand, String slottype ,int version) {
		super(brand, slottype);
		this.version = version;
	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
