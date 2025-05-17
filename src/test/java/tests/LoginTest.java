package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.P01_LoginPage;

public class LoginTest extends BaseTest
{
    P01_LoginPage loginPage=new P01_LoginPage(driver);

    @DataProvider(name = "LoginData")
    public Object[][]TestData()
    {
        return new Object[][]{
                {"Admin", "admin123"},
                {"Admin", "admin1234543"},
                {"Admin", "admin1234543421"}
        };
    }


    @Test
    public void validLogin()
    {
        loginPage.validLogin("Admin","admin123");
    }

    @Test
    public void inValidLogin()
    {
        loginPage.inValidLogin("dsgasd","admin123");
    }
    @Test(dataProvider = "LoginData")
    public void loginWithDataProvider(String username,String password)
    {
        loginPage.validLogin(username,password);
    }
}
