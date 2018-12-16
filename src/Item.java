/**
 * @author      Jonathan J. Troiano
 * @date        Last updated Sunday, December 16, 2018
 * @description Contains fields and methods:
 *                String manufacturer : "OracleProduction"
 *                void: setProductionNumber(int num)
 *                String: getName()
 *                Date: getManufacturedDate()
 *                int: getSerialNumber()
 */

import java.util.Date;

public interface Item {
  
  int getSerialNumber();
  Date getManufacturedDate();
  // TODO: Perhaps this should be final? Does that make logical sense?
  String manufacturer = "OracleProduction";
  String getName();
  
  void setProductionNumber(int num);
  
}
