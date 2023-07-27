package org.tnsif.hierachicalinheritance;

public class Android {
	
	private String brand;
	private String slottype;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", slottype=" + slottype + "]";
	}
	public Android(String brand, String slottype) {
		super();
		this.brand = brand;
		this.slottype = slottype;
	}
	

	

}
