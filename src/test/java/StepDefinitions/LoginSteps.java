package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.P01_LoginPage;

public class LoginSteps
{
    WebDriver driver;
    P01_LoginPage loginPage=new P01_LoginPage(driver);

    @Given("user in login page")
    public void login()
    {

    }
    @When("user enters valid {String} and {String}")
    public void when(String name,String password)
    {
        loginPage.setUsername(name);
        loginPage.setUserPassword(password);

    }
    @And("user clicks on login button")
    public void and()
    {
        loginPage.setLoginBtn();
    }
    @Then("display login successfully")
    public void then()
    {
        System.out.println("login successfully");
    }
}
