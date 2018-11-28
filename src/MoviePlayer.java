import java.util.Collections;

public class MoviePlayer extends Product implements MultimediaControl {
	
	private String screen;
	private MonitorType monitorType;
	
	@Override
	/**
	 * Method from interface Item, which super Product implements. Reference UML for more information.
	 */
	public void setName(String name) {}
	
	@Override
	public void play() {
		System.out.println("Movie playing");
	}
	
	@Override
	public void stop() {
		System.out.println("Movie stopped!");
	}
	
	@Override
	public void previous() {
		System.out.println("Going to previous movie...");
	}
	
	@Override
	public void next() {
		System.out.println("NEXT movie, please? Okay. Playing.");
	}
	
	// Hoping this is formed correctly--I want this to call PRODUCT's toString.
	public String toString() {
		/* TODO:
		 *  Calls the super toString
		 *  Displays monitor and screen details
		 *  */
		return "MonitorType: " + this.monitorType +
				"Screen Details: " + this.screen;
	}
	
	public static void main(String[] args) {
		/* TODO:
		 *  Tests the functionality of this class.
		 *  */
		
		/* TODO:
		 *  The functionality that would possibly allow us to sort would look like
		 *  this*/
	}
	
}
