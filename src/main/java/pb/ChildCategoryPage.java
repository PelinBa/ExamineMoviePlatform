package pb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChildCategoryPage {

    private WebDriver webDriver;

    private final By chosenSeriesCategory = By.xpath("//a[@href='/dizi']");

    public ChildCategoryPage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String pageTitle() {
        return webDriver.getTitle();
    }

    public void selectSeriesCategory () {
        webDriver.findElement(chosenSeriesCategory).click();
    }
}
