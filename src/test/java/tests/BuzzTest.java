package tests;

import org.testng.annotations.Test;
import pages.P12_BuzzNewsPost;
import pages.P01_LoginPage;

public class BuzzTest extends BaseTest
{
    P12_BuzzNewsPost buzzNewsPost=new P12_BuzzNewsPost(driver);
    @Test
    public void searchAdmin()
    {
        P01_LoginPage loginPage=new P01_LoginPage(driver);

        loginPage.validLogin("admin","admin123");
        buzzNewsPost.setSharePost();

    }
}
