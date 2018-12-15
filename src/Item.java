/**
 * @author      Jonathan J. Troiano
 * @date        Last updated December 15, 2018
 * @description Contains fields and methods:
 *                String manufacturer : "OracleProduction"
 *                void: setProductionNumber(int num)
 *                String: getName()
 *                Date: getManufacturedDate()
 *                int: getSerialNumber()
 */

import java.util.Date;

public interface Item {
  
  String manufacturer = "OracleProduction";
  
  void setProductionNumber(int num);
  
  String getName();
  
  Date getManufacturedDate();
  
  int getSerialNumber();
  
}
