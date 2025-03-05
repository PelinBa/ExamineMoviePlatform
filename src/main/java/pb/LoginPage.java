package pb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver webDriver;

    private final By chooseMaybeLater = By.className("dn-slide-deny-btn");
    private final By chooseRegister = By.cssSelector("a[data-testid='registerLink-login']");

    public LoginPage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String pageTitle() {
        return webDriver.getTitle();
    }

    public void clickMaybeLaterButton () {
        webDriver.findElement(chooseMaybeLater).click();
    }

    public void clickRegister () {
        webDriver.findElement(chooseRegister).click();
    }
}
