package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Logger logger= LogManager.getLogger(BasePage.class);


    public BasePage(WebDriver driver)
    {
        BasePage.driver =driver;
        PageFactory.initElements(driver,this);
        logger.info("object created successfully");
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void waitElementVisible(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitElementClickable(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
