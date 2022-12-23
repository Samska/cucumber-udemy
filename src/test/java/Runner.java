import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        features = {"classpath:features/"},
        glue = {"com.examples.cucumber"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false
        )
public class Runner {

}
