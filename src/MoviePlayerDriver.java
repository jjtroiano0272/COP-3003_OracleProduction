/**
 * @author      Jonathan J. Troiano
 * @date        Last updated December 15, 2018
 * @description Runs through the functionality of movie players with various details. Runs a
 *              toString method at the end of it.
 */
public class MoviePlayerDriver {
  
  /**
   * Creates default AudioPlayer object to test its functionality. Prints the constructed object and
   * runs through its functions (implemented from MultimediaControl).
   *
   * OracleProduction SerialNumber GMT date assigned name (product name) ItemType (e.g. Audio,
   * Visual, ...) "newAudioPlayer" "defaultAudioSpec"
   */
  public static void testMoviePlayer() {
    // These objects will NOT print anything on creation.
    MoviePlayer moviePlayerObj1 = new MoviePlayer("DBPOWER MK101", MonitorType.LCD);
    MoviePlayer moviePlayerObj2 = new MoviePlayer("Pyle PDV156BK", MonitorType.LED);
    AudioPlayer audioPlayerObj = new AudioPlayer("Dummy audio payer", "Dummy audio spec.");
    
    /**
     * This is what is supposed to print:
     *
     *
     */
    System.out.println(moviePlayerObj1.toString());
    System.out.println(moviePlayerObj2.toString());
  
    audioPlayerObj.next();
    audioPlayerObj.play();
    audioPlayerObj.previous();
    audioPlayerObj.stop();
  
    moviePlayerObj1.next();
    moviePlayerObj1.play();
    moviePlayerObj1.previous();
    moviePlayerObj1.stop();
  }
  
}
