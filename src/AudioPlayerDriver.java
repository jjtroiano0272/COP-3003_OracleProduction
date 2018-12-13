/*  TODO: AudioPlayerDriver MUST:
      (*) Instantiate occurrences of itself.
      (*) Use the media controls (from MultimediaControl)
      ( ) Print out details using methods from MultimediaControl
 */

public class AudioPlayerDriver {
  
  /**
   * Creates default AudioPlayer object to test its functionality. Prints the constructed object
   * and runs through its functions (implemented from MultimediaControl).
   *
   *    OracleProduction
   *    SerialNumber
   *    GMT date
   *    assigned name (product name)
   *    ItemType (e.g. Audio, Visual, ...)
   *    "newAudioPlayer"
   *    "defaultAudioSpec"
   */
  public static void testAudioPlayer() {
    System.out.println("[JT] in AudioPlayerDriver.testAudioPlayer; creating a new AudioPlayer object now.");
    AudioPlayer audioPlayerObj = new AudioPlayer("newAudioPlayer", "defaultAudioSpec");

    audioPlayerObj.play();
    audioPlayerObj.stop();
    audioPlayerObj.next();
    audioPlayerObj.previous();
    
    System.out.println("[JT] Printing details of audioPlayerObj object.");
    /**
     * This is what is supposed to print:
     *
     *    Manufacturer : OracleProduction
     *    Serial Number : 1
     *    Date : Fri Oct 12 05:06:08 EDT 2018
     *    Name : iPod Mini
     *    Audio Spec : MP3
     *    Type : AUDIO
     */
    audioPlayerObj.toString();
  }
 
}