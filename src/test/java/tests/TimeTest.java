package tests;

import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P05_TimePage;

public class TimeTest extends BaseTest
{
    P05_TimePage timePage=new P05_TimePage(driver);

    @Test
    public void setTimePage()
    {
        P01_LoginPage loginPage=new P01_LoginPage(driver);
        loginPage.validLogin("admin","admin123");
        timePage.setViewEmployeeTime();

        //Save and Reset
        timePage.saveViewEditTime();
        timePage.resetEditTime();

        //Save and Cancel
        timePage.saveViewEditTime();
        timePage.cancelEditTime();

        //Save and Delete
        timePage.saveViewEditTime();
        timePage.deleteEditTime();

        //View Time Sheets
        timePage.viewTimeSheets();

    }

}
