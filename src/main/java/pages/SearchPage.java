package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://rain.us/blog/search?q=Mosaic")
public class SearchPage extends PageObject {

    @FindBy(xpath = "//*[@id='Capa_1']")
    public WebElementFacade iconSearch;

    @FindBy(xpath = "//*[@class='css-k3y62n e14wephv2']")
    public WebElementFacade boxSearch;

    @FindBy(xpath = "//*[@class='css-nuamn0 edrwwrs0']")
    public WebElementFacade btnSearch;

    @FindBy(xpath = "//*[@class='css-1unrqcp ezjvwax3']")
    private List<WebElement> title;
    public List<WebElement> getAllTitles() {
        return title;
    }

}




