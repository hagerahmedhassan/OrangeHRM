package tests;

import org.testng.annotations.Test;
import pages.P10_DirectoryPage;
import pages.P01_LoginPage;

public class DirectoryTest extends BaseTest
{
    P10_DirectoryPage directoryPage;

    @Test
    public void searchAdmin()
    {
        P01_LoginPage loginPage=new P01_LoginPage(driver);
        directoryPage=new P10_DirectoryPage(driver);

        loginPage.validLogin("admin","admin123");
        directoryPage.applySearch();

    }
}
