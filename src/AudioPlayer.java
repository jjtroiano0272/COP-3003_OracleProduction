import java.util.Collections;

/**
 * This method was previously throwing an error because not all the methods from Item and
 * MultimediaControl were implemented.
 */
public class AudioPlayer extends Product implements MultimediaControl {
  
  private String audioSpecification;
  private ItemType mediaType;
  
  public AudioPlayer(String name, String audioSpecification) {
    super();
    mediaType = ItemType.AU;
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
  public java.util.Date getManufacturedDate() {
    return super.getManufacturedDate();
  }
  
  @Override
  public int getSerialNumber() {
    return super.getSerialNumber();
  }
  
  public void play() {
    System.out.println("Playing now, on an audio device!");
  }
  
  public void stop() {
    System.out.println("SCREECH! Stopped. (of course, on your audio device)");
  }
  
  public void previous() {
    System.out.println("Playing previous track. (what is that, the iWalkman)");
  }
  
  public void next() {
    System.out.println("You ready to hear that next track? It's on an audio device, but I'm sure"
        + "you already knew that.");
  }
  
  /**
   * Returns super's toString as well as details for audioSpecification and mediaType.
   *
   * @return Output: Audio Spec: _____
   *                 Type: _____
   */
  public String toString() {
    super.toString();
    return "Audio Spec: " + audioSpecification +
          "Type: " + mediaType;
  }
  
  public static void main(String[] args) {
    /*	TODO: this will be used to test:
     * If we can instantiate occurrences of AudioPlayer
     * Use media controls
     * Print media controls details to console.
     */
    
  }
  
}
