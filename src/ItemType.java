public enum ItemType {
  
  /**
   * Effectively creating objects *within* the ItemType enum.
   */
  AUDIO("AU"), VISUAL("VI"), AUDIO_MOBILE("AM"), VISUAL_MOBLE("VM");
  
  public String code;
  
  /**
   * Similar construction to a regular class constructor.
   *
   * @param type
   */
  ItemType(String type) {
    this.code = type;
  }
  
}
