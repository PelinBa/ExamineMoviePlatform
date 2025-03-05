package pb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BluTvMainPage {

    private WebDriver webDriver;

    private final By closeButton = By.className("banner-close-button");
    private final By chosenMovie = By.xpath("//div[@id='__next']/section[1]//div[2]//div[@class='jsx-89449705 thumbnail-img-wrapper z-20 transition-all duration-500 ease-out after:absolute after:inset-0 hover:opacity-100 hover:rounded-[3px] after:hover:rounded-[3px]']");
    private final By chosenChildCategory = By.cssSelector("a[href='/cocuk']");

    public BluTvMainPage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String pageTitle() {
        return webDriver.getTitle();
    }

    public void clickCloseButton () {
        webDriver.findElement(closeButton).click();
    }

    public void selectRandomMovie () {
        webDriver.findElement(chosenMovie).click();
    }

    public void selectChildCategory () {
        webDriver.findElement(chosenChildCategory).click();
    }
}
