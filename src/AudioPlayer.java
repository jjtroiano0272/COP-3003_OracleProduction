import java.util.Collections;

/**
 * This method was previously throwing an error because not all the methods from Item and
 * MultimediaControl were implemented.
 */
public class AudioPlayer extends Product implements MultimediaControl {
	
	private String audioSpecification;
	private ItemType mediaType;
	
	/**
	 * Is SUPPOSED to:
	 *     -> take in name variable from Product
	 *     -> call Product's constructor
	 */
	AudioPlayer() {
		super();
		mediaType = ItemType.AU;
	}
	
	@Override
	public void setProductionNumber(int num) {
		super.setProductionNumber(num);
	}
	
	@Override
	public void setName(String name) {
	
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public java.util.Date getManufacturedDate() {
		return super.getManufacturedDate();
	}
	
	@Override
	public int getSerialNumber() {
		return super.getSerialNumber();
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
	
	/**
	 * Don't think we'll need override here. We do want the PARENT toString method. This is probably
	 * in error, but more so of a placeholder right now.
	 */
	public String toString() {
		super.toString();
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
