package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostSteps {
    @Given("^User should be logged in and should be present on her wall$")
    public void user_should_be_logged_in_and_should_be_present_on_her_wall()  {
        System.out.println("User should be logged in and should be present on her wall");
           }

    @When("^User type the message in the message box$")
    public void user_type_the_message_in_the_message_box()  {
        System.out.println("User type the message in the message box");
           }

    @Then("^Message should get posted$")
    public void message_should_get_posted()  {
        System.out.println("Message should get posted");
    }

    @And("^User clicks on Post button$")
    public void user_clicks_on_post_button()  {
        System.out.println("User clicks on Post button");
    }
}
