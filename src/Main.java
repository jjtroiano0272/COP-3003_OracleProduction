import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * Demonstrations/Instantiations of the following classes to exhibit FULL functionality,
		 * meaning test all of its code on the resulting object:
		 *   AudioPlayer
		 *   MoviePlayer
		 *   Screen
		 *   ViewFileInfo
		 * */
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
