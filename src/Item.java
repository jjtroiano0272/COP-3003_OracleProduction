import java.util.Date;

public interface Item {
	
	String manufacturer = "Oracle Production";
	
	void setProductionNumber(int num);
	void setName(String name);
	String getName();
	Date getManufacturedDate();
	int getSerialNumber();
	
}
