import java.util.Scanner;

// This shit should be available also on prof's site.

public class EmployeeInfo {
	
	private StringBuilder name;
	private String code;
	
	//We know
	private void setName() {
		String nameString = inputName();
		name = new StringBuilder(nameString);
		createEmployeeCode(name);
	}
	
	/**
	 * Checks that the name the user enters for employee is in the correct format, e.g. "John Doe"
	 * with a space separating both names then generates the employee's code by taking the first
	 * letter of their name and appending their full surname. In this example, code would be set to
	 * "jdoe". Otherwise, code will get the default value "guest".
	 *
	 * @param name Employee's first name & surname, ideally separated by one space.
	 */
	private void createEmployeeCode(StringBuilder name) {
		if (checkName(name)) { // Checks for existence of mid string space
			code = ((name.charAt(0)) + name.substring(name.indexOf(" " + 1), name.length() - 1)).toLowerCase();
		} else {
			code = "guest";
		}
	}
	
	private String inputName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Print name:");
		name = scan.;
		scan.close();
		return nameString;
	}
	
	/**
	 * I wrote my own code for this. Not super robust but will work. This just checks if there's a
	 * space in the name after the first letter and before the last letter.
	 *
	 * Be careful here, the if condition may be malformed!
	 */
	/* You may also be able to make this more elegant with lambda functions */
	private boolean checkName(StringBuilder name) {
		if (name.indexOf(" ") > 0 && name.indexOf(" ") < name.length() - 1) {
			return true;
		}
	}
	
	public EmployeeInfo() {
		setName();
	}
	
	public StringBuilder getName() {
		return name;
	}
	
	public String getcode() {
		return code;
	}
}
