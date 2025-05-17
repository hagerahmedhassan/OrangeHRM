package tests;

import org.testng.annotations.Test;
import pages.P04_LeavePage;
import pages.P01_LoginPage;

public class LeaveTest extends BaseTest
{
    P04_LeavePage leavePage=new P04_LeavePage(driver);
    @Test
    public void searchAdmin()
    {
        P01_LoginPage loginPage=new P01_LoginPage(driver);

        loginPage.validLogin("admin","admin123");
        leavePage.leaveSearch();
        leavePage.leaveReset();

    }
}
