package tests;

import org.testng.annotations.Test;
import pages.P08_DashboardPage;
import pages.P04_LeavePage;
import pages.P01_LoginPage;

public class DashboardTest extends BaseTest
{
    P08_DashboardPage dashboardPage=new P08_DashboardPage(driver);
    P04_LeavePage leavePage =new P04_LeavePage(driver);
    @Test
    public void searchAdmin()
    {
        P01_LoginPage loginPage=new P01_LoginPage(driver);
        loginPage.validLogin("admin","admin123");
        dashboardPage.getLeavePage();
        leavePage.leaveSearch();

    }
}
