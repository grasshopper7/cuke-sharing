package sharing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import io.cucumber.java.en.Given;

@ContextConfiguration(classes = { Config.class })
public class CollectNameSteps {

	@Autowired
	private FullName name;

	@Given("First Name is {string}")
	public void first_Name_is(String firstName) {
		name.setFirstName(firstName);
	}

	@Given("Last Name is {string}")
	public void last_Name_is_Doe(String lastName) {
		name.setLastName(lastName);
	}
}
