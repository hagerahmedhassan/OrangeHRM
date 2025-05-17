package tests;


import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P06_RecruitmentPage;

public class RequirementTest extends BaseTest
{
    P06_RecruitmentPage requirementPage=new P06_RecruitmentPage(driver);
    @Test
    public void searchAdmin()
    {
        P01_LoginPage loginPage=new P01_LoginPage(driver);

        loginPage.validLogin("admin","admin123");

        requirementPage.addCandidate();
        requirementPage.cancelCandidate();

        requirementPage.addCandidate();
        requirementPage.searchOnCandidates();
        requirementPage.restCandidates();

    }

}
