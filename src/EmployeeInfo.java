import java.util.Scanner;

// This shit should be available also on prof's site.

public class EmployeeInfo {
	
	private StringBuilder name;
	private String code;
	
	public employeeInfo() {
		setName();
	}
	
	public StringBuilder getName() {
		return name;
	}
	
	public String getcode(){
		return code;
	}
	
	//We know
	private void setName() {
		String nameString = inputName();
		name = new StringBuilder(nameString); // one of the constructor for name builder accepts a string(nameString here)
		createEmployeeCode(name);
	}
	
	// Here we set the code.
	private void createEmployeeCode(StringBuilder name){
		if (checkName(name)) { // Indication of validity
		
		}
		if (name.indexOf()) {
			code = name.charAt(0)+name.substring(name.indexOf(" "+1))
		}
		else {
			code =
		}
	}
	
	//
	private String inputName(){
		Scanner in = new Scanner(System.in);
		System.out.println("Print name:");
		StringBuilder nameString = in.nextLine();
		return nameString;
	}
	
	private
	
	boolean checkName(StringBuilder name) {
		if (name.indexOf())
	}
}
