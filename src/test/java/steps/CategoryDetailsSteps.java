package steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CategoryDetailsPage;
import utils.Util;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryDetailsSteps {
    Util util;
    CategoryDetailsPage categoryDetailsPage;

    public CategoryDetailsSteps() {
        this.categoryDetailsPage = new CategoryDetailsPage();
        this.util = new Util();
    }

    public void navigateToCategoryDetailsPage() {
        categoryDetailsPage.open();
    }

    public void selectBusinessCategory() {
        categoryDetailsPage.businessTab.click();
    }

    public void checkThePostsDisplayedBelongToTheCorrespondingCategory() {
        List<WebElement> elements = categoryDetailsPage.getAllCategories();
        List<String> actualCategories = elements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        for (int i = 0; i < elements.size(); i++) {
            Assert.assertEquals("BUSINESS", actualCategories.get(i));
        }
    }
}
