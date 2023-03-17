package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.CategoryDetailsSteps;

public class CategoryDetailsSD {

    @Steps
    CategoryDetailsSteps categoryDetailsSteps;

    @Given("user")
    public void user() {
        categoryDetailsSteps.navigateToCategoryDetailsPage();
    }

    @When("selects Business category")
    public void selectBusinessCategory() {
        categoryDetailsSteps.selectBusinessCategory();
    }

    @Then("check the posts displayed belong to the corresponding category")
    public void checkThePostsDisplayedBelongToTheCorrespondingCategory() {
        categoryDetailsSteps.checkThePostsDisplayedBelongToTheCorrespondingCategory();
    }

}
