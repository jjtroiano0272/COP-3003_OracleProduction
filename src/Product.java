import java.text.DateFormat;
import java.util.Date;

/**
 * The implementation of Comparable here allows us to compare or, in this case sort, objects
 * of this class by some field.
 */
public abstract class Product implements Item, Comparable<Product> {
  
  private int serialNumber;
  private String manufacturer;
  private Date manufacturedOn;
  private String name;
  private Integer currentProductionNumber;
  
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
  
  public Product() {
    this.name = getName();
    serialNumber = currentProductionNumber++;
  }
  
  public String toString() {
    return  "Manufacturer: " + manufacturer +
            "Serial Number: " + serialNumber +
            "Date: " + manufacturedOn.toString() +
            "Name: " + name;
  }
}
