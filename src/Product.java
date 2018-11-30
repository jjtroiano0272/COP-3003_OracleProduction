import java.text.DateFormat;
import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {
	
	private int serialNumber;
	private String manufacturer;
	private Date manufacturedOn;
	private String name;
	private Integer currentProductionNumber;
	
	@Override
	public int compareTo(Product otherProduct) {
		return name.compareTo(otherProduct.getName());
	}
	
	@Override
	public void setProductionNumber(int num) {}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public Date getManufacturedDate() {
		return this.manufacturedOn;
	}
	
	@Override
	public int getSerialNumber() {
		return this.serialNumber;
	}
	
	Product() {
		this.name = getName();
		serialNumber = currentProductionNumber++;
		/*
		* Sets manufacturedOn as CURRENT date & time.
		*
		* I previously had this set as
		*
		* 		manufacturedOn.toString();
		*
		* but I don't see any need to do this in the constructor, since I can't assign it. So, instead
		* I'm relegating it to the toString method.
		*/
	}
	
	
	public String toString() {
		return  "Manufacturer: " + manufacturer +
						"Serial Number: " + serialNumber +
						"Date: " + manufacturedOn.toString() +
						"Name: " + name;
	}
}
