import java.util.Collections;

public class AudioPlayer extends Product implements MultimediaControl {

	String audioSpecification;
	ItemType mediaType;
	
	AudioPlayer(name, audioSpecification) {
		super();
	}
	
	public void play() {
		System.out.println("Playing now!");
	}
	
	public void stop() {
		System.out.println("SCREECH! Stopped.");
	}
	
	public void previous() {
		System.out.println("Playing previous track.");
	}
	
	public void next() {
		System.out.println("You ready to hear that next track?");
	}

	// Don't think we'll need override here. We do want the PARENT toString method.
	// This is probably in error, but more so of a placeholder right now.
	public String toString() {
		return "Audio Spec: " + audioSpecification +
					 "Type: " + mediaType;
	}
	
	public static void main(String[] args) {
	/*	TODO: this will be used to test:
			* If we can instantiate occurrences of AudioPlayer
			* Use media controls
			* Print media controls details to console.
	 */
		
	}

}
