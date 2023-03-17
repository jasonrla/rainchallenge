package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.SearchSteps;

public class SearchSD {

    @Steps
    SearchSteps searchSteps;

    @Given("user who wishes to perform a search")
    public void userWhoWishesToPerformASearch() {
        searchSteps.navigateToSearchPage();
    }

    @When("selects enter a word {string} in the search box")
    public void selectsEnterAWordInTheSearchBox(String word) {
        searchSteps.selectSearchIcon();
        searchSteps.enterAWordInTheSearchBox(word);
        searchSteps.selectTheSearchButton();
    }

    @Then("check all titles include the search word")
    public void checkAllTitlesIncludeTheSearchWord() {
        searchSteps.checkAllTitlesIncludeTheSearchWord();
    }
}
