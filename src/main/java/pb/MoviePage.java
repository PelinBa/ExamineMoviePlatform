package pb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoviePage {

    private WebDriver webDriver;

    private final By thirdEpisode = By.xpath("//img[@src='https://blutv-images.mncdn.com/q/t/i/bluv2/100/432x243/648c2f9b866ac314880e8e15']");
    private final By thirdFAQ = By.xpath("//div[text()='BluTV aboneliğine neler dahildir?']");
    private final By forthFAQ = By.xpath("//div[@class='mt-6 space-y-4 divide-y divide-color-mulledWine']/div[4]//img[@alt='testid-image-collapse-down-icon']");
    private final By openMainPage = By.cssSelector("img[alt='testid-image-blutv-logo']");

    public MoviePage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String pageTitle() {
        return webDriver.getTitle();
    }

    public void selectThirdEpisode () {
        webDriver.findElement(thirdEpisode).click();
    }

    public void selectThirdFAQ () {
        webDriver.findElement(thirdFAQ).click();
    }

    public void selectFourthFAQ () {
        webDriver.findElement(forthFAQ).click();
    }

    public void clickMainPage () {
        webDriver.findElement(openMainPage).click();
    }
}
