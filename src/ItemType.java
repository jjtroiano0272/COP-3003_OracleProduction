/**
 * @author      Jonathan J. Troiano
 * @date        Last updated December 15, 2018
 * @description Holds four types of items that can be created: audio, visual, audio-mobile, and
 *              visual-mobile.
 */

public enum ItemType {
  
  /**
   * Effectively creates objects *within* the ItemType enum.
   */
  AUDIO("AU"), VISUAL("VI"), AUDIO_MOBILE("AM"), VISUAL_MOBLE("VM");
  
  public String code;
  
  /**
   * Similar construction to a regular class constructor. Sets String parameter as the type of
   * the ItemType object.
   */
  ItemType(String type) {
    this.code = type;
  }
  
}
