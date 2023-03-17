package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.json.simple.parser.ParseException;
import steps.MainScreenSteps;

import java.io.IOException;

public class MainScreenSD {

    @Steps
    MainScreenSteps mainScreenSteps;

    @Given("that a user goes to the rain's blog")
    public void thatAUserGoesToTheRainSBlog() throws IOException, ParseException {
        mainScreenSteps.navigateToMainScreen();
    }

    @When("the main page is shown")
    public void theMainPageIsShown() {
        mainScreenSteps.checkTheTitleOfTheWeb();
    }

    @Then("check the number of post that the user should see")
    public void checkTheNumberOfPostThatTheUserShouldSee() {
        mainScreenSteps.checkTheNumberOfPostThatTheUserShouldSee();
    }

    @And("check that the posts shown are those detailed in the articles file.")
    public void checkThatThePostsShownAreThoseDetailedInTheArticlesFile() {
        mainScreenSteps.checkThatThePostsShownAreThoseDetailedInTheArticlesFile();
    }
}
