package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P01_LoginPage extends BasePage
{
    @FindBy(xpath = "//*[@name='username']")
    WebElement userName;
    @FindBy(xpath = "//*[@type='password']")
    WebElement passWord;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement loginBtn;


    //constactor
    public P01_LoginPage(WebDriver driver)
    {
        super(driver);
    }
    //methods
    public P01_LoginPage setUsername(String username)
    {
        waitElementClickable(userName);
        userName.clear();
        userName.sendKeys(username);
        logger.error("error in username");
        return this;
    }
    public P01_LoginPage setUserPassword(String userPassword)
    {
        waitElementClickable(passWord);
        passWord.clear();
        passWord.sendKeys(userPassword);
        logger.error("error in password");
        return this;
    }
    public P01_LoginPage setLoginBtn()
    {
        waitElementClickable(loginBtn);
        loginBtn.click();
        return this;
    }
    public P01_LoginPage validLogin(String username, String userPassword)
    {
            setUsername(username).setUserPassword(userPassword).setLoginBtn();
            return this;
    }

    public void inValidLogin(String username,String userPassword)
    {
        try
        {
            setUsername(username);
            setUserPassword(userPassword);
            setLoginBtn();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }


}
