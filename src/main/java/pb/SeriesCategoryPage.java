package pb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeriesCategoryPage {

    private WebDriver webDriver;

    private final By chooseLogin = By.xpath("//div[@class='cursor-pointer text-color-white']");

    public SeriesCategoryPage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String pageTitle() {
        return webDriver.getTitle();
    }

    public void clickLogin () {
        webDriver.findElement(chooseLogin).click();
    }
}
