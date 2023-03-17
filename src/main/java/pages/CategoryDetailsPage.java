package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://rain.us/blog/categories/announcements")
public class CategoryDetailsPage extends PageObject {

    @FindBy(xpath = "//*[@class='css-rsyr8f e5jly33']")
    public WebElementFacade currentTabSelected;

    @FindBy(xpath = "//*[@class='css-1o3u7d3 e5jly33'][2]")
    public WebElementFacade businessTab;

    @FindBy(xpath = "//*[@class='css-frltxx ezjvwax4']")
    public List<WebElement> categories;
    public List<WebElement> getAllCategories() {
        return categories;
    }


}


