/**
 * @author      Jonathan J. Troiano
 * @date        Last updated Sunday, December 16, 2018
 * @description Template for all screens produced.
 */
public class Screen implements ScreenSpec {
  
  private String resolution;
  private int refreshRate;
  private int responseTime;
  
  /**
   * Overloaded constructor specifying technical details of all Screen objects.
   *
   * @param resolution    Numerical value such as "1600x1200"
   * @param refreshRate   Numerical value representing cycles per second (Hz) of refreshing
   * @param responseTime  Numerical value representing sensitivity to changes in input
   */
  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }
  
  /**
   * Returns instance String resolution.
   *
   * @return Instance variable String resolution
   */
  @Override
  public String getResolution() {
    return this.resolution;
  }
  
  /**
   * Returns instance int refreshRate.
   *
   * @return Instance variable int refreshRate
   */
  @Override
  public int getRefreshRate() {
    return this.refreshRate;
  }
  
  /**
   * Returns instance int responseTime.
   *
   * @return Instance variable responseTime
   */
  @Override
  public int getResponseTime() {
    return this.responseTime;
  }
  
  /**
   * Returns a string of the instance variables.
   *
   * @return  Resolution: _____
   *          Refresh rate: _____
   *          Response time: _____
   */
  @Override
  public String toString() {
    return  "Resolution: " + this.resolution + "\n" +
            "Refresh rate: " + this.refreshRate + "\n" +
            "Response time: " + this.responseTime + "\n";
  }
}
