package pb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {

    private WebDriver webDriver;

    private final By platformName = By.id("APjFqb");
    private final By chosenOption = By.id("jZ2SBf");
    private final By chosenSite =By.cssSelector("a[href='https://www.blutv.com/']");

    public GooglePage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void writeName () {
        webDriver.findElement(platformName).sendKeys("blutv");
    }

    public void selectOption () {
        webDriver.findElement(chosenOption).click();
    }

    public void selectSite () {
        webDriver.findElement(chosenSite).click();
    }
}
