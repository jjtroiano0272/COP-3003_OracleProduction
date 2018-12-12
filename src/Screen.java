public class Screen implements ScreenSpec {
  
  private String resolution;
  private int refreshrate;
  private int responsetime;
  
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
