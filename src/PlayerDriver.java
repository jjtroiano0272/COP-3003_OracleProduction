/**
 * @author      Jonathan J. Troiano
 * @date        Last updated Sunday, December 16, 2018
 * @description Created to demonstrate that any class that implements interface MultimediaControl
 *              will be able to be instantiated and use its methods regardless of type (movie
 *              player, audio player).
 */
public class PlayerDriver {
  
  /**
   * Demonstrates functionality of both audio and movie players. Creates an object of each class
   * and runs their functions:
   *    next()
   *    play()
   *    previous()
   *    stop()
   */
  public static void testPlayer() {
  
    AudioPlayer audioPlayerObj = new AudioPlayer("iPod Mini", "MP3");
    audioPlayerObj.next();
    audioPlayerObj.play();
    audioPlayerObj.previous();
    audioPlayerObj.stop();
    
    MoviePlayer moviePlayerObj = new MoviePlayer("DBPOWER MK101",
        new Screen("720x480", 40, 22), MonitorType.LCD);
    moviePlayerObj.next();
    moviePlayerObj.play();
    moviePlayerObj.previous();
    moviePlayerObj.stop();
  
  }
}
