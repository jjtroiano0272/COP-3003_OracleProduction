/**
 * @author      Jonathan J. Troiano
 * @date        Last updated Sunday, December 16, 2018
 * @description This is a class emblematic of movie players that are to be created. All
 *              of these movie players will receive the functionality of MultimediaControl interface
 *              (play, stop, previous, next) with messages specific to movie players.
 */
public class MoviePlayer extends Product implements MultimediaControl {
  
  // TODO: Variable screen may need to be replaced...Not sure how this should be used per client.
  private ItemType screen;
  private MonitorType monitorType;
  
  /**
   * Creates an object of MoviePlayer according to super class Product constructor and adds details
   * specific to movie players. Follows the same paradigm as AudioPlayer. Upon construction
   * MoviePlayer objects hold the fields:
   *    manufacturer: "OracleProduction"
   *    name
   *    serialNumber
   *    date of manufacture
   *    mediaType: "AU"
   *    audioSpecification
   *
   * @param name Name of the object you create.
   * @param monitorType Can be set to LED or LCD
   */
  // TODO: May need to be reformatted here...possible Logic error.
  public MoviePlayer(String name, MonitorType monitorType) {
    super(name);
    this.screen = ItemType.VISUAL;
    this.monitorType = monitorType;
  }
  
  /**
   * Prints statement "Playing movie".
   */
  @Override
  public void play() {
    System.out.println("Playing movie");
  }
  
  /**
   * Prints statement "Stopping movie".
   */
  @Override
  public void stop() {
    System.out.println("Stopping movie");
  }
  
  /**
   * Prints statement "Previous movie".
   */
  @Override
  public void previous() {
    System.out.println("Previous movie");
  }
  
  /**
   * Prints statement "Next movie".
   */
  @Override
  public void next() {
    System.out.println("Next movie");
  }
  
  /**
   * @return Returns super (Product) toString as well as monitor type & screen resolution and
   * breaks a new line at the end.
   *
   * Expected output:
   *    Manufacturer: _____
   *    Serial Number: _____
   *    Date: _____
   *    Name: _____
   *    Monitor Type: _____
   *    Screen resolution: _____
   */
  @Override
  public String toString() {
    return  super.toString() +
            "Monitor Type: " + this.monitorType + "\n" +
            "Screen resolution: " + this.screen;
  }
  
}
