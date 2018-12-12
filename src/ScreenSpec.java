public interface ScreenSpec {
  
  /*
  * These currently throw errors because the classes that implement these methods only define
  * the methods but do not OPERATE ON DATA with them. Until you operate on data using these methods,
  * it will continue to yell at you.
  * */
  String getResolution();
  int getRefreshRate();
  int getResponseTime();

}
