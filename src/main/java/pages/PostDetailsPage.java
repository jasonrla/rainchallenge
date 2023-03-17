package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://rain.us/blog/improve-employee-engagement-with-beekeeper-rain")
public class PostDetailsPage extends PageObject {

    @FindBy(xpath = "//*[@class='css-xgeb6y e1rf0zx19']")
    public WebElementFacade paragraph;


}