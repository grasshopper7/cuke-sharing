package sharing;

import io.cucumber.java.en.Given;

public class DisplayNameSteps {

	private FullName name;
	
	public DisplayNameSteps(FullName name) {
		this.name = name;
	}
	
	@Given("{string} Full Name")
	public void display_Full_Name(String state) {
	    System.out.println(state + " name details - " + name);
	}
}
