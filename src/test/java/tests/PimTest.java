package tests;

import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P03_PIMPage;

public class PimTest extends BaseTest
{
    P03_PIMPage pimPage=new P03_PIMPage(driver);

    @Test
    public void addEmployeePIM()
    {
        P01_LoginPage loginPage=new P01_LoginPage(driver);
        loginPage.validLogin("admin","admin123");
        pimPage.addEmployee();
        pimPage.searchWithEmployeeName();
        pimPage.resethWithEmployeeName();

    }

}
