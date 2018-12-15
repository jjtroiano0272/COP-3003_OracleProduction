/**
 * @author      Jonathan J. Troiano
 * @date        Last updated December 15, 2018
 * @description Getters for the technical details of a Screen:
 *                resolution
 *                refreshRate
 *                responseTime
 */
public interface ScreenSpec {
  String getResolution();
  int getRefreshRate();
  int getResponseTime();
}
