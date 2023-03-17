package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.PostDetailsPage;
import utils.Util;
import utils.Variables;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class PostDetailsSteps {

    Util util;
    PostDetailsPage postDetailsPage;

    public PostDetailsSteps() {
        this.postDetailsPage = new PostDetailsPage();
        this.util = new Util();
    }

    public void navigateToPostDetailsPage() throws IOException, ParseException {
        postDetailsPage.open();
        Variables.jsonObject = util.extractFromJSONFile(Variables.PostDetailsPath);
    }

    public void checkTheTitleIsCorrect() {
        Assert.assertEquals(Variables.jsonObject.get("pageTitle"), postDetailsPage.getTitle());
    }

    public void checkTheParagraphIsCorrect() {

        //get paragraphs from auto
        List<WebElementFacade> paragraphs = postDetailsPage.paragraph.thenFindAll(By.tagName("p"));
        List<String> par = paragraphs.stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());

        //get paragraphs from JSON file
        Variables.postsList = (JSONArray) Variables.jsonObject.get("paragraphs");

        System.out.println("HOLRA\n");
        for (int i = 0; i < Variables.postsList.size(); i++) {
            JSONObject paragraph = (JSONObject) Variables.postsList.get(i);
            String mewParA = par.get(i).replace("’","").replace("”","").replace("“","");
            String newParB = paragraph.get("text").toString().replace("’","").replace("”","").replace("???","");
            Assert.assertEquals(mewParA, newParB);

        }
    }

    public void checkTheLinksInCertainWordsOfTheParagraph() {
        List<WebElementFacade> links = postDetailsPage.paragraph.thenFindAll(By.tagName("a"));
        boolean link1 = links.stream().anyMatch(a -> a.getAttribute("href").equals("https://www.beekeeper.io/en"));
        Assert.assertTrue(link1);

        boolean link2 = links.stream().anyMatch(a -> a.getAttribute("href").equals("http://6683043.hs-sites.com/get-rain-beekeeper"));
        Assert.assertTrue(link2);
    }

}
