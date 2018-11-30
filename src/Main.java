import java.util.Collections;

/**
 * Creates objects of the other classes and sorts those objects. Everything in this class will be
 * running inside a pleasing user interface.
 *
 * @author Jonathan Troiano
 */
public class Main {
	
	public static void main(String[] args) {
		// This stuff is alsso available on REPL.it 16.
		// TODO: Add an arrayList that we'll use to store the Product objects and then sort that.
		
		// TODO: Test features
		AudioPlayer audioPlayerObj = new AudioPlayer();
		audioPlayerObj.toString();
		
		// TODO: Test features
		MoviePlayer moviePlayerObj = new MoviePlayer();
		moviePlayerObj.toString();
		
		// TODO: Test features
		Screen screenObj = new Screen();
		screenObj.toString();
		
		/**
		 * Demonstrates that any class that implements the MultimediaControl interface (currently
		 * AudioPlayer and MoviePlayer) will be able to be instantiated and use MultimediaControl's
		 * methods no matter which subclasses is using it.
		 */
		AudioPlayer oppositeObj1 = new AudioPlayer(); // Better name?
		oppositeObj1.play();
		
		MoviePlayer oppositeObj2 = new MoviePlayer(); // Better name?
		oppositeObj2.play();
		
		/**
		 * This is supposed to allow us to sort all the objects we are creating.
		 */
		Collections.sort(audioPlayerObj);
	}
}
