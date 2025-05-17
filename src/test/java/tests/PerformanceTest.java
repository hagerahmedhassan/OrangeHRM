package tests;

import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P09_PerformancePage;

public class PerformanceTest extends BaseTest
{
    P09_PerformancePage performancePage=new P09_PerformancePage(driver);

    @Test
    public void employeeReview()
    {
        P01_LoginPage loginPage=new P01_LoginPage(driver);
        loginPage.validLogin("admin","admin123");

        performancePage.searchWithEmployeeReview();
        performancePage.ResetWWithEmployeeReview();

    }
}
