import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LearnCucumber {
    @Given("that I have created the file correctly")
    public void that_i_have_created_the_file_correctly() {
        System.out.println("teste");
    }

    @When("I run it")
    public void i_run_it() {
        System.out.println("teste");
    }

    @Then("the specification should finish successfully")
    public void the_specification_should_finish_successfully() {
        System.out.println("teste");
    }
}