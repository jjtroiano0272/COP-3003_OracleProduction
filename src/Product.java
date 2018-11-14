import java.text.DateFormat;
import java.util.Date;

public abstract class Product implements Item {
	
	int serialNumber;
	String manufacturer;
	Date manufacturedOn;
	String name;
	int currentProductionNumber;
	
	@Override
	public void setProductionNumber(int num) {
	}
	
	@Override
	public String getName() {
		return null;
	}
	
	@Override
	public Date getManufacturedDate() {
		return null;
	}
	
	@Override
	public int getSerialNumber() {
		return 0;
	}
	
	Product() {
		this.name = getName();
		serialNumber = currentProductionNumber++;
		//	Set manufacturedOn as CURRENT date & time.
	}
	
	
	public String toString() {
		return  "Manufacturer: " + manufacturer +
						"Serial Number: " + serialNumber +
						"Date: " + manufacturedOn +
						"Name: " + name;
	}
}
