import java.util.Collections;
import java.util.Date;

/**
 * This method was previously throwing an error because not all the methods from Item and
 * MultimediaControl were implemented.
 */
public class AudioPlayer extends Product implements MultimediaControl {
  
  // TODO: Should these be public?
  private String audioSpecification;
  private ItemType mediaType;
  
  /**
   * Creates an object of AudioPlayer according to super class Product constructor and adds details
   * specific to audio players.
   *
   * @param name Name of the object you create.
   * @param audioSpecification Defines the details of the named audio player.
   */
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    mediaType = ItemType.AUDIO;
    this.audioSpecification = audioSpecification; // TODO: is this malformed? Does the logic make sense?
  }
  
  @Override
  public void setProductionNumber(int num) {
    super.setProductionNumber(num);
  }
  
  @Override
  public String getName() {
    return super.getName();
  }
  
  @Override
  public Date getManufacturedDate() {
    return super.getManufacturedDate();
  }
  
  @Override
  public int getSerialNumber() {
    return super.getSerialNumber();
  }
  
  public void play() {
    System.out.println("Playing");
  }
  
  public void stop() {
    System.out.println("Stopping");
  }
  
  public void next() { System.out.println("Next"); }
  
  public void previous() { System.out.println("Previous"); }
  
  
  /**
   * Returns super's toString as well as details for audioSpecification and mediaType.
   *
   * @return Output: Audio Spec: _____ Type: _____
   */
  public String toString() {
    return  super.toString() +
            "Audio Spec: " + audioSpecification + "\n" +
            "Type: " + mediaType + "\n";
  }
  
  public static void main(String[] args) {
  
  }
  
}
