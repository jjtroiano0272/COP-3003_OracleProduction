/**
 * @author      Jonathan J. Troiano
 * @date        Last updated Sunday, December 16, 2018
 * @description This class "stamps" all products created with:
 *
 *                Manufacturer: _____
 *                Serial Number: _____
 *                Date: _____
 *                Name: _____
 */

import java.text.DateFormat; // TODO: Remove? Possibly superfluous.
import java.util.Date;

/**
 * The implementation of Comparable here allows us to compare or, in this case sort, objects of this
 * class by some field.
 *
 */
public abstract class Product implements Item, Comparable<Product> {
  
  private int serialNumber;
  private static int currentProductionNumber = 1; // class variable per prompt
  private Date manufacturedOn;
  private String manufacturer;
  private String name;
  
  /**
   * This is used to compare two Product objects by the String instance variable String name.
   *
   * @param   otherProduct Used to compare two Product objects.
   * @return  Returns:
   *            -1: If the calling object is earlier in the alphabet than the parameter.
   *             0: If the calling object and the parameter start with the same letter.
   *             1: If the calling object comes later in the alphabet than the parameter.
   */
  @Override
  public int compareTo(Product otherProduct) {
    return this.name.compareTo(otherProduct.getName());
  }
  
  /**
   * Sets global variable currentProductionNumber.
   *
   * @param num The int that currentProductionNumber will be set to.
   */
  @Override
  public void setProductionNumber(int num) {
    currentProductionNumber = num;
  }
  
  /**
   * Returns instance variable name/
   *
   * @return  Return instance variable name
   */
  @Override
  public String getName() { return this.name; }
  
  /**
   * Returns instance variable for Date object which gets held by the object constructed. Date is
   * a full GMT-format string of the system time of creation.
   *
   * @return  Return instance of Date manufacturedOn in format: Fri Oct 12 05:06:08 EDT 2018
   */
  @Override
  public Date getManufacturedDate() {
    return this.manufacturedOn;
  }
  
  /**
   * Returns class variable serialNumber.
   *
   * @return Return class variable serialNumber.
   */
  @Override
  public int getSerialNumber() {
    return serialNumber;
  }
  
  /**
   * All created products will get the identifier "OracleProduct" by default, then its name gets set
   * by the parameter. Serial number then gets the NEXT number in production (to prevent duplicate
   * serial numbers) and all products get stamped with the full system GMT date as as object of
   * class Date. Holds the fields:
   *    manufacturer: "OracleProduction"
   *    name
   *    serialNumber
   *    date of manufacture
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
   * default Date constructor.) Contains a line break at the end.
   *
   * Output:  Manufacturer: _____
   *          Serial Number: _____
   *          Date: _____
   *          Name: _____
   *          \n
   */
  public String toString() {
    return  "Manufacturer: " + this.manufacturer + "\n" +
            "Serial Number: " + serialNumber + "\n" +
            "Date: " + this.manufacturedOn + "\n" +
            "Name: " + name + "\n";
  }
}

