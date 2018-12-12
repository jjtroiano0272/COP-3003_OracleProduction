import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Creates objects of the other classes and sorts those objects. Everything in this class will be
 * running inside a pleasing user interface.
 *
 * @author Jonathan Troiano
 */
public class Main {
  
  public static void main(String[] args) {
    /**
     * Adds an ArrayList that stores the Product objects and then that ArrayList will be sorted.
     * This formation of the code apparently does work according to IJ but I'm not entirely sure
     * if it makes sense...
     *
     * NOTE: All of this stuff, testing it, is available on the REPL.it 16.
     */
    // PREVIOUS CODE: productsArray.sort(Comparable<Product>);
    ArrayList<Product> productsArray = new ArrayList<>();
    sort(productsArray);
    
    // TODO: Test features
    AudioPlayer audioPlayerObj = new AudioPlayer("test audioPlayer",
        "test audioSpec");
    audioPlayerObj.toString();
    
    // TODO: Test features
    MoviePlayer moviePlayerObj = new MoviePlayer();
    moviePlayerObj.toString();
    
    // TODO: Test features
    Screen screenObj = new Screen();
    screenObj.toString();
    
    /**toString
     * Demonstrates that any class that implements the MultimediaControl interface (currently
     * AudioPlayer and MoviePlayer) will be able to be instantiated and use MultimediaControl's
     * methods no matter which subclasses is using it.
     *
     * Runs constructor on a new object of either type, then runs all its functions to demonstrate
     * and test functionality.
     */
    AudioPlayer audioObj = new AudioPlayer("test audio opposite Obj",
        "test audioSpec oppositeObj");
    audioObj.play();
    audioObj.stop();
    audioObj.next();
    audioObj.previous();
    
    MoviePlayer movieObj = new MoviePlayer();
    movieObj.play();
    movieObj.stop();
    movieObj.next();
    movieObj.previous();
    
    // TODO: Code to sort a list of objects we are creating, *of any type*.
    /**
     * This is supposed to allow us to sort all the objects we are creating. This should be sorting
     * a list of the objects.
     */
    
    ItemType.values();
  }
}
