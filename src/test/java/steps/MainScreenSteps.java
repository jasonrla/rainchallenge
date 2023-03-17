package steps;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import pages.MainScreenPage;
import net.thucydides.core.annotations.Step;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.Util;
import utils.Variables;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class MainScreenSteps {

    Util util;
    MainScreenPage mainScreenPage;

    public MainScreenSteps() {
        this.mainScreenPage = new MainScreenPage();
        this.util = new Util();
    }

    @Step
    public void navigateToMainScreen() throws IOException, ParseException {
        mainScreenPage.open();
        Variables.jsonObject = util.extractFromJSONFile(Variables.path);
    }

    public void checkTheTitleOfTheWeb() {
        Assert.assertEquals(Variables.jsonObject.get("pageTitle"), mainScreenPage.getTitle());
    }

    public void checkTheNumberOfPostThatTheUserShouldSee() {
        List<WebElement> elements = mainScreenPage.getAllTitles();
        Assert.assertEquals(Variables.jsonObject.get("visiblePosts").toString(),String.valueOf(elements.size()));
    }

    public void checkThatThePostsShownAreThoseDetailedInTheArticlesFile() {
        List<WebElement> categories = mainScreenPage.getAllCategories();
        List<String> actualCategories = categories.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        List<WebElement> titles = mainScreenPage.getAllTitles();
        List<String> actualTitles = titles.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        List<WebElement> authorPublicationDateAndReadingTime = mainScreenPage.getAllauthorPublicationDateAndReadingTime();
        List<String> actualPublicationsAndReadingTime = authorPublicationDateAndReadingTime.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        Variables.postsList = (JSONArray) Variables.jsonObject.get("posts");

        for (int i = 0;i<Variables.postsList.size(); i++){
            JSONObject post = (JSONObject) Variables.postsList.get(i);
            Assert.assertEquals(post.get("category"), actualCategories.get(i));
            Assert.assertEquals(post.get("title"), actualTitles.get(i));
            Assert.assertEquals(post.get("author")+"\n"+post.get("publicationDate")+"\n"+post.get("readingTime"), actualPublicationsAndReadingTime.get(i));
        }
    }
}
