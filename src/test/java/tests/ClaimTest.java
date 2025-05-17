package tests;

import org.testng.annotations.Test;
import pages.P11_ClaimPage;
import pages.P01_LoginPage;

public class ClaimTest extends BaseTest
{
    P11_ClaimPage claimPage=new P11_ClaimPage(driver);

    @Test
    public void searchAdmin()
    {
        P01_LoginPage loginPage=new P01_LoginPage(driver);

        loginPage.validLogin("admin","admin123");
        claimPage.submitForm();
        claimPage.cancelForm();

    }

}
