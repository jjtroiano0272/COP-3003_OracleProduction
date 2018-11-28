import java.util.Date;

public interface Item {
	
	String manufacturer = "OracleProduction";
	
	void setProductionNumber(int num);
	
	String getName();
	
	Date getManufacturedDate();
	
	int getSerialNumber();
	
}
