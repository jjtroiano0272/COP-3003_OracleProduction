/**
 * @author      Jonathan J. Troiano
 * @date        Last updated December 15, 2018
 * @description This is a class emblematic of actual audio players that are to be created. All
 *              of these audio players will receive the functionality of MultimediaControl interface
 *              (play, stop, previous, next)
 */

import java.util.Collections;
import java.util.Date;

/**
 * This is the blueprint for all audio players. Because it also extends Product, all audio
 * players will have the following fields:
 *    audioSpecification
 *    mediaType
 *
 */
public class AudioPlayer extends Product implements MultimediaControl {
  
  // TODO: Should these be public?
  private String audioSpecification;
  private ItemType mediaType;
  
  /**
   * Creates an object of AudioPlayer according to super class Product constructor and adds details
   * specific to audio players. Upon construction holds the fields:
   *    manufacturer: "OracleProduction"
   *    name
   *    serialNumber
   *    date of manufacture
   *    mediaType: "AU"
   *    audioSpecification
   *
   * @param name Name of the object you create.
   * @param audioSpecification Defines the details of the named audio player.
   */
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.mediaType = ItemType.AUDIO;
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
  
  /**
   * Prints statement: "Playing".
   */
  public void play() {
    
    System.out.println("Playing");
  }
  
  /**
   * Prints statement: "Stopping".
   */
  public void stop() {
    
    System.out.println("Stopping");
  }
  
  /**
   * Prints statement: "Next".
   */
  public void next() {
    System.out.println("Next");
  }
  
  /**
   * Prints statement: "Previous".
   */
  public void previous() {
    System.out.println("Previous");
  }
  
  
  /**
   * Returns the toString of super (Product) as well as details for audioSpecification and
   * mediaType.
   *
   * @return Output:  Manufacturer: _____
   *                  Serial Number: _____
   *                  Date: _____
   *                  Name: _____
   *                  Audio spec: _____
   *                  Type: _____
   */
  // TODO: Should the parameters here be instance variables???
  public String toString() {
    return  super.toString() +
            "Audio Spec: " + audioSpecification + "\n" +
            "Type: " + mediaType.toString();
  }
  
  public static void main(String[] args) {
  
  }
  
}
