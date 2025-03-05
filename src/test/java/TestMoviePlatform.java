import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pb.*;

public class TestMoviePlatform {

    private WebDriver webDriver;
    private JavascriptExecutor javascriptExecutor;

    private GooglePage googlePage;
    private BluTvMainPage bluTvMainPage;
    private MoviePage moviePage;
    private ChildCategoryPage childCategoryPage;
    private SeriesCategoryPage seriesCategoryPage;
    private LoginPage loginPage;
    private RegisterPage registerPage;

    @Before
    public void before() {

        System.setProperty("webdriver.chrome.driver", "/Users/pelinbasormanci/Downloads/drivers/chromedriver-mac-x64/chromedriver");
        webDriver = new ChromeDriver();

        webDriver.get("https://www.google.com");
        webDriver.manage().window().maximize();
        javascriptExecutor = (JavascriptExecutor) webDriver;

        googlePage = new GooglePage(webDriver);
        bluTvMainPage = new BluTvMainPage(webDriver);
        moviePage = new MoviePage(webDriver);
        childCategoryPage = new ChildCategoryPage(webDriver);
        seriesCategoryPage = new SeriesCategoryPage(webDriver);
        loginPage = new LoginPage(webDriver);
        registerPage = new RegisterPage(webDriver);
    }

    @After
    public void after() {
        webDriver.quit();
    }

    @Test
    public void test_movie_platform() throws InterruptedException {
        //Write platform name
        googlePage.writeName();
        Thread.sleep(1000);
        //Select the platform name from options
        googlePage.selectOption();
        Thread.sleep(1000);
        //Click on the platform site
        googlePage.selectSite();
        Thread.sleep(2000);
        //Check the main page title
        String mainPageTitle = "BluTV - Türkiyenin İnternet Televizyonu";
        Assert.assertEquals(bluTvMainPage.pageTitle(), mainPageTitle);
        //Click on the close button on the cookies option
        bluTvMainPage.clickCloseButton();
        Thread.sleep(1000);
        //Scroll down to select movie
        javascriptExecutor.executeScript("scrollBy(0,850)");
        Thread.sleep(1000);
        //Select a random movie
        bluTvMainPage.selectRandomMovie();
        Thread.sleep(1000);
        //Check the movie page title
        String moviePageTitle = "Prens";
        Assert.assertEquals(moviePage.pageTitle(), moviePageTitle);
        //Scroll down to select an episode
        javascriptExecutor.executeScript("scrollBy(0,800)");
        Thread.sleep(1000);
        //Select a random episode
        moviePage.selectThirdEpisode();
        Thread.sleep(1000);
        //Back to the movie page
        webDriver.navigate().back();
        Thread.sleep(1000);
        //Scroll down to select questions from the FAQ
        javascriptExecutor.executeScript("scrollBy(0,3000)");
        Thread.sleep(1000);
        //Select questions from FAQ
        moviePage.selectThirdFAQ();
        Thread.sleep(1000);
        moviePage.selectFourthFAQ();
        Thread.sleep(1000);
        //Turn the main page
        moviePage.clickMainPage();
        Thread.sleep(2000);
        //Check the main page title again
        String mainPageTitle2 = "BluTV - Türkiyenin İnternet Televizyonu";
        Assert.assertEquals(bluTvMainPage.pageTitle(), mainPageTitle2);
        //Scroll down to select categories
        javascriptExecutor.executeScript("scrollBy(0,3500)");
        Thread.sleep(1000);
        //Select categories
        bluTvMainPage.selectChildCategory();
        Thread.sleep(1000);
        //Check the child category page title
        String childCategoryPageTitle = "Çizgi Film - Çizgi Filmleri İzle BluTV'de";
        Assert.assertEquals(childCategoryPage.pageTitle(), childCategoryPageTitle);
        javascriptExecutor.executeScript("scrollBy(0,3500)");
        Thread.sleep(1000);
        childCategoryPage.selectSeriesCategory();
        Thread.sleep(1000);
        //Check the series category page title
        String seriesCategoryPageTitle = "Dizi - HD Dizi İzle - BluTV";
        Assert.assertEquals(seriesCategoryPage.pageTitle(), seriesCategoryPageTitle);
        //Click on the login
        seriesCategoryPage.clickLogin();
        Thread.sleep(2000);
        //Check the login page title
        String loginPageTitle = "BluTV";
        Assert.assertEquals(loginPage.pageTitle(), loginPageTitle);
        //Click on the 'Maybe Later' button
        loginPage.clickMaybeLaterButton();
        Thread.sleep(1000);
        //Click on the register
        loginPage.clickRegister();
        Thread.sleep(2000);
        //Check the register page title
        String registerPageTitle = "BluTV";
        Assert.assertEquals(registerPage.pageTitle(), registerPageTitle);
        //Back to the main page
        registerPage.turnMainPage();
        Thread.sleep(2000);
        //Check the main page title last time
        String mainPageTitle3 = "BluTV - Türkiyenin İnternet Televizyonu";
        Assert.assertEquals(bluTvMainPage.pageTitle(), mainPageTitle3);
    }
}
