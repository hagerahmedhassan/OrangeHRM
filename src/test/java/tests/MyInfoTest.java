package tests;

import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P07_MyInfo;

public class MyInfoTest extends BaseTest
{
    P07_MyInfo myInfo=new P07_MyInfo(driver);
    
    @Test
    public void saveInformation()
    {
        P01_LoginPage loginPage=new P01_LoginPage(driver);

        loginPage.validLogin("admin","admin123");
        myInfo.savePersonalDetailBtn();

    }
}
