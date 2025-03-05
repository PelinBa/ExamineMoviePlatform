package pb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver webDriver;

    private final By openMainPage = By.xpath("//img[@alt='testid-image-blutv-logo']");

    public RegisterPage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String pageTitle() {
        return webDriver.getTitle();
    }

    public void turnMainPage () {
        webDriver.findElement(openMainPage).click();
    }
}
