package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest
{
    WebDriver driver;

    @BeforeClass
    public void setUp()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

     @AfterMethod
     public void cleanAfterMethod()
     {
         driver.manage().deleteAllCookies();
     }


    @AfterClass
    public void CloseUp()
    {
        driver.quit();
    }
}
