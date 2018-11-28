import java.util.Scanner;

public class EmployeeInfo {
	
	private StringBuilder name;
	private String code;
	
	/**
	 * Checks that the name the user enters for employee is in the correct format, e.g. "John Doe"
	 * with a space separating both names then generates the employee's code by taking the first
	 * letter of their name and appending their full surname. In this example, code would be set to
	 * "jdoe". Otherwise, code will get the default value "guest".
	 *
	 * @param name Employee's first name & surname, ideally separated by one space.
	 */
	private void createEmployeeCode(StringBuilder name) {
		if (checkName(name)) {
			this.code = ((name.charAt(0)) + name.substring(name.indexOf(" " + 1), name.length() - 1))
					.toLowerCase();
		} else {
			this.code = "guest";
		}
	}
	
	/**
	 * Reads in a name to associate with employee code. This prompts you for a name then returns that
	 * name so that it can be passed to a containing function.
	 */
	private String inputName() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Print name: ");
		String nameString = scan.next();
		scan.close();
		return nameString;
	}
	
	/**
	 * Sets object variable name to be what the user enters when prompted.
	 *
	 * I'm starting off assuming that this will work like a standard setter, taking a String input and
	 * setting the StringBuilder name to be a StringBuilder type.
	 */
	private void setName() {
		String nameString = inputName();
		this.name = new StringBuilder(nameString);
		createEmployeeCode(this.name);
	}
	
	/**
	 * Returns true if name has space between first & last letter. I wrote my own code for this. Not
	 * super robust but will work. This just checks if there's a space in the name after the first
	 * letter and before the last letter.
	 */
	/* You may also be able to make this more elegant with lambda functions */
	private boolean checkName(StringBuilder name) {
		if (name.indexOf(" ") > 0 && name.indexOf(" ") < name.length()) {
			return true;
		} else { return false; }
	}
	
	/**
	 * When the constructor is called, the user will be prompted to enter a name. This name will then
	 * be set to the employee's name. This will also create an employeeCode for that employee.
	 */
	public EmployeeInfo() {
		setName();
	}
	
	public StringBuilder getName() {
		return name;
	}
	
	public String getCode() {
		return code;
	}
}