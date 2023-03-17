package steps;

import pages.CategoryDetailsPage;
import utils.Util;

public class CategoryDetailsSteps {
    Util util;
    CategoryDetailsPage categoryDetailsPage;

    public CategoryDetailsSteps() {
        this.categoryDetailsPage = new CategoryDetailsPage();
        this.util = new Util();
    }

}
