package sharing;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import lombok.Data;

@Data
@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class FullName {

	private String firstName;
	
	private String lastName;
}
