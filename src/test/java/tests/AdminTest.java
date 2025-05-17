package tests;

import io.cucumber.java.en.Given;
import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P02_AdminPage;

public class AdminTest extends BaseTest
{

    P02_AdminPage adminPage=new P02_AdminPage(driver);
    P01_LoginPage loginPage=new P01_LoginPage(driver);

    @Test
    public void searchAdmin()
    {
        loginPage.validLogin("admin","admin123");

        adminPage.setAddEmployee();
        adminPage.cancelAddEmployee();

        adminPage.setAddEmployee();
        adminPage.searchWithEmployeeName();

        adminPage.editEmployee();
        adminPage.cancelEditingEmployee();

        adminPage.editEmployee();
        adminPage.deleteAddEmployee();

        adminPage.deleteRecord();
    }
}
