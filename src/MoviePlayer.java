import java.util.Collections;

public class MoviePlayer extends Product implements MultimediaControl {
  
  private String screen;
  private MonitorType monitorType;
  
  public MoviePlayer(String name) {
    screen = name;
  }
  
  /**
   * Method from interface Item, which super Product implements. Reference UML for more information.
   * NOTE: I previously had this be overridden--may be useful?
   */
  public void setName(String name) {}
  
  @Override
  public void play() {
    System.out.println("Movie playing");
  }
  
  @Override
  public void stop() {
    System.out.println("Movie stopped!");
  }
  
  @Override
  public void previous() {
    System.out.println("Going to previous movie...");
  }
  
  @Override
  public void next() {
    System.out.println("NEXT movie, please? Okay. Playing.");
  }
  
  /**
   * Calls the toString from the super class Product and adds in the monitor type and screen details.
   *
   * @return
   */
  public String toString() {
    super.toString();
    return "MonitorType: " + this.monitorType +
           "Screen Details: " + this.screen;
  }
  
  public static void main(String[] args) {
    /* TODO:
     *  Tests the functionality of this class.
     *  */
    
    /* TODO:
     *  The functionality that would possibly allow us to sort would look like
     *  this*/
  }
  
}
