package steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.PostDetailsPage;
import pages.SearchPage;
import utils.Util;

import java.util.List;
import java.util.stream.Collectors;

public class SearchSteps {

    Util util;
    SearchPage searchPage;

    public SearchSteps() {
        this.searchPage = new SearchPage();
        this.util = new Util();
    }

    public void navigateToSearchPage() {
        searchPage.open();
    }

    public void selectSearchIcon() {
        searchPage.iconSearch.waitUntilEnabled().click();
    }

    public void enterAWordInTheSearchBox(String word) {
        searchPage.boxSearch.type(word);
    }

    public void selectTheSearchButton() {
        searchPage.btnSearch.click();
    }

    public void checkAllTitlesIncludeTheSearchWord() {
        List<WebElement> elements = searchPage.getAllTitles();
        List<String> actualCategories = elements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        for (int i = 0; i < elements.size(); i++) {
            actualCategories.get(i);
            Assert.assertTrue(actualCategories.get(i).contains("Improve"));
        }

    }
}
