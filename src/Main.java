import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Creates objects of the other classes and sorts those objects. Everything in this class will be
 * running inside a pleasing user interface.
 *
 * @author Jonathan Troiano
 */
public class Main {
  
  public static void main(String args[]) {
    
    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());
    
    for (ItemType it : ItemType.values()) {
      // System.out.println(it + " " + it.code);
      System.out.println(it);
    }
    
  }
}

class Widget extends Product {
  
  public Widget(String name) {
    super(name);
  }
  
}