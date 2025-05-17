package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P03_PIMPage extends BasePage
{
    //Locators
    @FindBy(css = "[href='/web/index.php/pim/viewPimModule']")
    WebElement pimBtn;
    @FindBy(css = "[class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addBtn;

    //Add Employee
    @FindBy(css = "[class='oxd-icon bi-plus']")
    WebElement photo;
    @FindBy(css = "[name='firstName']")
    WebElement firstname;
    @FindBy(css = "[name='middleName']")
    WebElement middleName;
    @FindBy(css = "[name='lastName']")
    WebElement lastName;
    @FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
    WebElement employeeId;

    //Login Details
    @FindBy(css = "[class='oxd-switch-input oxd-switch-input--active --label-right']")
    WebElement loginDetailRatio;
    @FindBy(css= "[class='oxd-input oxd-input--focus']")
    WebElement userName;
    @FindBy(css = "[value='1']")
    WebElement enable;
    @FindBy(xpath = "(//*[@type='password'])[1]")
    WebElement password;
    @FindBy(xpath = "(//*[@type='password'])[2]")
    WebElement confirmPassword;
    @FindBy(css = "[type='submit']")
    WebElement saveBtn;

    //Search Field
    @FindBy(css = "[placeholder='Type for hints...']")
    WebElement empNameSearch;
    @FindBy(css = "[class='oxd-autocomplete-dropdown --positon-bottom']")
    WebElement getEmpNameSearchWait;
    @FindBy(css = "[type='submit']")
    WebElement searchBtn;
    @FindBy(css = "[type='reset']")
    WebElement resetBtn;

    //constactor
    public P03_PIMPage(WebDriver driver)
    {
        super(driver);
    }

    //methods
    public P03_PIMPage setProfilePicture(String path)
    {
        waitElementClickable(photo);
        photo.sendKeys(path);
        return this;
    }
    public P03_PIMPage setAddBtn()
    {
        waitElementClickable(pimBtn);
        pimBtn.click();
        waitElementClickable(addBtn);
        addBtn.click();
        return this;
    }
    public P03_PIMPage setFirstName(String firstNameInput)
    {
        waitElementClickable(firstname);
        firstname.clear();
        firstname.sendKeys(firstNameInput);
        return this;
    }
    public P03_PIMPage setMiddleName(String middleNameInput)
    {
        waitElementClickable(middleName);
        middleName.clear();
        middleName.sendKeys(middleNameInput);
        return this;
    }
    public P03_PIMPage setLastName(String lastNameInput)
    {
        waitElementClickable(lastName);
        lastName.clear();
        lastName.sendKeys(lastNameInput);
        return this;
    }
    public P03_PIMPage setEmployeeId(int employeeIdInput)
    {
        waitElementClickable(employeeId);
        employeeId.sendKeys(String.valueOf(employeeIdInput));
        return this;
    }
    public P03_PIMPage setStatus()
    {
        waitElementClickable(enable);
        enable.click();
        return this;
    }
    public P03_PIMPage setLoginRatio()
    {
        waitElementClickable(loginDetailRatio);
        loginDetailRatio.click();
        return this;
    }
    public P03_PIMPage setUserName(String userNameInput)
    {
        waitElementClickable(userName);
        userName.clear();
        userName.sendKeys(userNameInput);
        return this;
    }
    public P03_PIMPage setPassword(String passwordInput)
    {
        waitElementClickable(password);
        password.clear();
        password.sendKeys(passwordInput);
        return this;
    }
    public P03_PIMPage setConfirmPassword(String passwordInput)
    {
        waitElementClickable(confirmPassword);
        confirmPassword.clear();
        confirmPassword.sendKeys(passwordInput);
        return this;
    }
    public P03_PIMPage setSaveBtn()
    {
        waitElementClickable(saveBtn);
        saveBtn.click();
        return this;
    }
    public P03_PIMPage addEmployee()
    {
        setAddBtn()
                .setProfilePicture("C:\\Users\\hager\\OneDrive\\Desktop\\ID Front.jpg")
                .setFirstName("wahp").setMiddleName("mohamed").setLastName("Ali")
                .setEmployeeId(123456789)
                .setLoginRatio().setStatus()
                .setUserName("wahp_Ali").setPassword("wahp1234").setConfirmPassword("wahp1234")
                .setSaveBtn();
        return this;
    }

    //search features
    public P03_PIMPage setEmployeeNameSearch(String employeeName)
    {
        waitElementVisible(empNameSearch);
        empNameSearch.clear();
        empNameSearch.sendKeys(employeeName);
        waitElementVisible(getEmpNameSearchWait);
        getEmpNameSearchWait.click();
        return this;
    }
    public P03_PIMPage setSearchBtn()
    {
        waitElementClickable(searchBtn);
        searchBtn.click();
        return this;
    }
    public P03_PIMPage setResetBtn()
    {
       waitElementClickable(resetBtn);
       resetBtn.click();
        return this;
    }
    public P03_PIMPage searchWithEmployeeName()
    {
      setEmployeeNameSearch("wahp mohamed ali")
              .setSearchBtn();
        return this;
    }
    public P03_PIMPage resethWithEmployeeName()
    {
                 setEmployeeNameSearch("wahp mohamed ali")
                .setResetBtn();
        return this;
    }




}
