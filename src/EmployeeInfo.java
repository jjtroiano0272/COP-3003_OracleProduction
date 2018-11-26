import java.util.Scanner;

// This shit should be available also on prof's site.

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
		if (checkName(name)) { // Checks for existence of mid string space
			this.code = ((name.charAt(0)) + name.substring(name.indexOf(" " + 1), name.length() - 1)).toLowerCase();
		} else {
			this.code = "guest";
		}
	}
	/**
	 * Reads in a name to associate with employee code. This prompts you for a name then returns that
	 * name so that it can be passed to a containing function.
	 *
	 * @return
	 */
	private String inputName() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Print name: ");
		String nameString = scan.next();
		this.name = new StringBuilder(nameString); // This might be able to be more elegant by passing it to setName.
		scan.close();
		return nameString;
	}
	
	/* CURRENTLY SET OFFLINE: MAY BE FAULTY CODE. SEE BELOW METHOD FOR IMPROVEMENT.
	/**
	 * TODO: The fuck exactly does this do? What's its function???
	 *
	private void setName() {
		String nameString = inputName();
		this.name = new StringBuilder(nameString);
		createEmployeeCode(name);
	}
	*/
	
	// TODO: Should this be private? That seems incorrect.
	
	/**
	 * I'm starting off assuming that this will work like a standard setter, taking a String input and
	 * setting the StringBuilder name to be a StringBuilder type.
	 */
	private void setName(String inputName) {
		this.name = new StringBuilder(inputName);
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
		setName(inputName());
	}
	
	public StringBuilder getName() {
		return name;
	}
	
	public String getcode() {
		return code;
	}
}
