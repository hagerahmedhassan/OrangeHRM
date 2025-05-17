package pages;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class P02_AdminPage extends BasePage
{

    @FindBy(xpath = "//*[@class='oxd-main-menu'] //span[contains(.,'Admin')]")
    WebElement admin;

    //search inputs
    @FindBy(css = "[class='oxd-input oxd-input--focus']")
    WebElement userName;
    @FindBy(xpath = "(//*[@class='oxd-select-text oxd-select-text--active'])[1]")
    WebElement userRole;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement searchBtn;
    @FindBy(css = "[class='oxd-autocomplete-dropdown --positon-bottom']")
    WebElement EmployeeNameList;

    //Edit user name
    @FindBy(xpath = "(//*[@class='oxd-table-cell-actions']//*[@type='button'])[2]")
    WebElement editBtn;

    //Delete user name
    @FindBy(xpath = "(//*[@class='oxd-table-cell-actions']//*[@type='button'])[1]")
    WebElement deleteBtn;

    //Add User

    @FindBy(xpath = "[class='oxd-select-dropdown --positon-bottom']")
    WebElement list;
    @FindBy(css = "[class='oxd-select-text oxd-select-text--focus']")
    WebElement status;

    @FindBy(xpath = "(//*[@type='password'])[1]")
    WebElement password;
    @FindBy(xpath = "(//*[@type='password'])[2]")
    WebElement confirmPassword;
    @FindBy(css = "[placeholder='Type for hints...']")
    WebElement empNameSearch;
    @FindBy(css = "[class='oxd-autocomplete-option']")
    WebElement getEmpNameSearchWait;
    @FindBy(css = "[type='submit']")
    WebElement saveBtn;
    @FindBy(css = "[type='reset']")
    WebElement cancelBtn;

   //Constractor
    public P02_AdminPage(WebDriver driver)
    {
        super(driver);
    }

    //Methods
    //Search with Employee Name

    public P02_AdminPage setAdmin()
    {
        waitElementVisible(admin);
        admin.click();
        return this;
    }
    public P02_AdminPage setUserName(String name)
    {
        waitElementClickable(userName);
        userName.clear();
        userName.sendKeys(name);
        return this;
    }
    public P02_AdminPage setSearchBtn()
    {
      waitElementClickable(searchBtn);
      searchBtn.click();
      return this;
    }
    public P02_AdminPage searchWithEmployeeName()
    {
       setAdmin().setUserName("Hager Ahmed Hassan").setSearchBtn();
       return this;
   }

   //Add New User
    public P02_AdminPage setUserRole()
    {
        waitElementClickable(userRole);
        userRole.click();
        Select selectUseradd=new Select(list);
        selectUseradd.selectByVisibleText("Admin");
        return this;
    }
    public P02_AdminPage setStatus()
    {
        waitElementClickable(status);
        status.click();
        Select selectStatus=new Select(list);
        selectStatus.selectByVisibleText("Enabled");
        return this;
    }
    public P02_AdminPage setAddUserName(String userNameInput)
    {
        waitElementClickable(userName);
        userName.clear();
        userName.sendKeys(userNameInput);
        return this;
    }
    public P02_AdminPage setEmployeeNameSearch(String employeeName)
    {
        waitElementVisible(empNameSearch);
        empNameSearch.clear();
        empNameSearch.sendKeys(employeeName);
        waitElementVisible(getEmpNameSearchWait);
        getEmpNameSearchWait.click();
        return this;
    }
    public P02_AdminPage setPassword(String passwordInput)
    {
        waitElementClickable(password);
        password.clear();
        password.sendKeys(passwordInput);
        return this;
    }
    public P02_AdminPage setConfirmPassword(String passwordInput)
    {
        waitElementClickable(confirmPassword);
        confirmPassword.clear();
        confirmPassword.sendKeys(passwordInput);
        return this;
    }
    public P02_AdminPage setSaveBtn()
    {
        waitElementClickable(saveBtn);
        saveBtn.click();
        return this;
    }
    public P02_AdminPage setCancelBtn()
    {
        waitElementClickable(cancelBtn);
        cancelBtn.click();
        return this;
    }
    @When("Add User Name")
    public P02_AdminPage setAddEmployee()
    {
                 setUserRole()
                .setStatus()
                .setAddUserName("Hager Ahmed Hassan")
                .setEmployeeNameSearch("hager wahp")
                .setPassword("hager123")
                .setConfirmPassword("hager123")
                .setSaveBtn();
        return this;
    }

    //Cancel Adding User Name
    public P02_AdminPage cancelAddEmployee()
    {
        setUserRole()
                .setStatus()
                .setAddUserName("Hager Ahmed Hassan")
                .setEmployeeNameSearch("hager wahp")
                .setPassword("hager123")
                .setConfirmPassword("hager123")
                .setCancelBtn();
        return this;
    }

    //Edit Employee
    public P02_AdminPage setEditBtn()
    {
        waitElementClickable(editBtn);
        editBtn.click();
        return this;
    }
    public P02_AdminPage setDeleteBtn()
    {
        waitElementClickable(deleteBtn);
        deleteBtn.click();
        return this;
    }
    public P02_AdminPage editEmployee()
    {
          setEditBtn()
         .setUserRole()
         .setStatus()
         .setEmployeeNameSearch("hager ahmed hassan")
         .setUserName("hager ahmed hassan")
         .setSaveBtn();
        return this;
    }
    public P02_AdminPage cancelEditingEmployee()
    {
                 setEditBtn()
                .setUserRole()
                .setStatus()
                .setEmployeeNameSearch("hager ahmed hassan")
                .setUserName("hager ahmed hassan")
                .setCancelBtn();
        return this;
    }

    //DeleteEmployee
    public P02_AdminPage deleteAddEmployee()
    {
        setUserRole()
                .setStatus()
                .setAddUserName("Hager Ahmed Hassan")
                .setEmployeeNameSearch("hager wahp")
                .setPassword("hager123")
                .setConfirmPassword("hager123")
                .setCancelBtn();
        return this;
    }

    //delete record
    public P02_AdminPage deleteRecord()
    {
        setDeleteBtn();
        return this;
    }

}
