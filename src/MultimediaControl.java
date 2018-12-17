/**
 * @author      Jonathan J. Troiano
 * @date        Last updated Sunday, December 16, 2018
 * @description Interface to store the controls that all multimedia objects will have:
 *                play
 *                stop
 *                previous
 *                next
 */

public interface MultimediaControl {
  
  void play();
  void stop();
  void previous();
  void next();
  
}
