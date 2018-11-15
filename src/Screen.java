public class Screen implements ScreenSpec {
	
	String resolution;
	int refreshrate;
	int responsetime;
	
	@Override
	public String getResolution() { return this.resolution; }
	
	@Override
	public int getRefreshRate() { return this.refreshrate; }
	
	@Override
	public int getResponseTime() { return this.responsetime; }
	
	public String toString() {
		return  "Resolution: " + this.resolution +
						"Refresh Reate: " + this.refreshrate +
						"Response Time: " + this.responsetime;
	}
	
	public static void main(String[] args) {
		/* TODO: TESTS FUNCTIONALITY OF THIS CLASS */
	}
}
