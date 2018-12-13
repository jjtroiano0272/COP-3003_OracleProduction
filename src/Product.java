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
  
  /**
   * All created products will get the identifier "OracleProduct" by default, then its name gets set
   * by the parameter. Serial number then gets the NEXT number in production (to prevent duplicate
   * serial numbers) and all products get stamped with the full system GMT date as as object of
   * class Date.
   *
   * @param name User-provided name that is an alphanumeric unique identifier for each product.
   */
  public Product(String name) {
    this.manufacturer = "OracleProduction";
    this.name = name;
    serialNumber = currentProductionNumber++;
    // TODO: Does this construction make sense?
    this.manufacturedOn = new Date();
  }
  
  /**
   * Passes the Product object which has been constructed, (meaning Date gets current Date/time by
   * default Date constructor.)
   */
  public String toString() {
    return  "Manufacturer: " + this.manufacturer + "\n" +
            "Serial Number: " + serialNumber + "\n" +
            "Date: " + this.manufacturedOn + "\n" +
            "Name: " + name + "\n";
  }
}

