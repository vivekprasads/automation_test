package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class URLsteps {

    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C://Automation//chromedriver_win32/chromedriver.exe");
        driver=new ChromeDriver();
    }

    @When("I open URL")
    public void i_open_URL() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
            Thread.sleep(10000);
    }

    @Then("I verify that the logo on the page")
    public void i_verify_that_the_logo_on_the_page() {
        boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true,status);
     }

    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }
}
