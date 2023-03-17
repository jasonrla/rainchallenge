package pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

@DefaultUrl("https://rain.us/blog")

public class MainScreenPage extends PageObject {

    @FindBy(xpath = "//*[@class='css-1unrqcp ezjvwax3']")
    private List<WebElement> title;
    public List<WebElement> getAllTitles() {
        return title;
    }

    @FindBy(xpath = "//*[@class='css-frltxx ezjvwax4']")
    private List<WebElement> categories;
    public List<WebElement> getAllCategories() {
        return categories;
    }

    @FindBy(xpath = "//*[@class='css-1g2x3ok ezjvwax5']")
    private List<WebElement> authorPublicationDateAndReadingTime;
    public List<WebElement> getAllauthorPublicationDateAndReadingTime() {
        return authorPublicationDateAndReadingTime;
    }
}