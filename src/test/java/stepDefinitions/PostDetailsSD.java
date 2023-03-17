package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.json.simple.parser.ParseException;
import steps.PostDetailsSteps;

import java.io.IOException;

public class PostDetailsSD {

    @Steps
    PostDetailsSteps postDetailsSteps;

    @Given("that a user has selected an article")
    public void thatAUserHasSelectedAnArticle() {
    }

    @When("the article's page is open")
    public void theArticleSPageIsOpen() throws IOException, ParseException {
        postDetailsSteps.navigateToPostDetailsPage();
    }

    @Then("check the title is correct")
    public void checkTheTitleIsCorrect() {
        postDetailsSteps.checkTheTitleIsCorrect();
    }

    @And("check the paragraph is correct")
    public void checkTheParagraphIsCorrect() {
        postDetailsSteps.checkTheParagraphIsCorrect();
    }

    @And("check the links in certain words of the paragraph")
    public void checkTheLinksInCertainWordsOfTheParagraph() {
        postDetailsSteps.checkTheLinksInCertainWordsOfTheParagraph();
    }


}
