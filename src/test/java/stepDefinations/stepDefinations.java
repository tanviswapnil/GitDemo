package stepDefinations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinations {

    @Given("^Initialise browser with chrome$")
    public void initialise_browser_with_chrome() throws Throwable {
        
    }

    @When("^User enter \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enter_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
        
    }

    @When("^User enter (.+) and (.+) and logs in$")
    public void user_enter_and_and_logs_in(String username, String password) throws Throwable {
    
    }
    
    @Then("^varify that user is successfully logged in$")
    public void varify_that_user_is_successfully_logged_in() throws Throwable {
        
    }

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
        
    }

    @And("^Click on Login in Home page to land on sign In page $")
    public void click_on_login_in_home_page_to_land_on_sign_in_page() throws Throwable {
        
    }

}