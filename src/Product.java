import java.text.DateFormat;
import java.util.Date;

/**
 * The implementation of Comparable here allows us to compare or, in this case sort, objects of this
 * class by some field.
 */
public abstract class Product implements Item, Comparable<Product> {
	
	private int serialNumber;
	private String manufacturer;
	private Date manufacturedOn;
	private String name;
	private static int currentProductionNumber = 0; // From prompt "store as integer CLASS VARIABLE"--thus, static.
	
	/**
	 * This is sorting by String name for now.
	 *
	 * @param otherProduct Used to compare two Product objects.
	 * @return Returns the name of which Product has precedence.
	 */
	@Override
	public int compareTo(Product otherProduct) {
		return name.compareTo(otherProduct.getName());
	}
	
	// TODO: May need to be refactored...
	@Override
	public void setProductionNumber(int num) {
		this.currentProductionNumber = num;
	}
	
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
	
	/* Overloaded this in order to fit with what Main does.
	 */
	public Product(String name) {
		this.manufacturer = "OracleProduction";
		this.name = name;
		serialNumber = currentProductionNumber++;
		// TODO: Does this construction make sense?
		this.manufacturedOn = new Date();
	}
	
	
	/**
	 * Passes the Product object which has been constrcuted, (meaning Date gets current Date/time by
	 * default Date constructor.)
	 */
	public String toString() {
		return "Manufacturer: " + manufacturer +
				"\nSerial Number: " + serialNumber +
				"\nDate: " + this.manufacturedOn +
				"\nName: " + name +
				"\n";
	}
}

