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
    AudioPlayer audioPlayerObj1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer audioPlayerObj2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer moviePlayerObj1 = new MoviePlayer("DBPOWER MK101",
        new Screen("720x480", 40, 22), MonitorType.LCD);
    MoviePlayer moviePlayerObj2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    /**
     * This is what is supposed to print for each object:
     *
     * Manufacturer : _____
     *    Serial Number : _____
     *    Date : _____
     *    Name : _____
     *    Monitor Type : _____
     *    Screen resolution : _____
     */
    System.out.println(moviePlayerObj1.toString());
    System.out.println(moviePlayerObj2.toString());
  
    audioPlayerObj1.next();
    audioPlayerObj1.play();
    audioPlayerObj2.previous();
    audioPlayerObj2.stop();
  
    moviePlayerObj1.next();
    moviePlayerObj1.play();
    moviePlayerObj2.previous();
    moviePlayerObj2.stop();
  }
  
}
