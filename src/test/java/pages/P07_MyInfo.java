package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P07_MyInfo extends BasePage
{
    //Personal Details
    @FindBy(css = "[name='firstName']")
    WebElement firstname;
    @FindBy(css = "[name='middleName']")
    WebElement middleName;
    @FindBy(css = "[name='lastName']")
    WebElement lastName;

    @FindBy(xpath = "(//*[@class='oxd-grid-item oxd-grid-item--gutters']//input[@class='oxd-input oxd-input--active'])[1]")
    WebElement employeeIdField;
    @FindBy(xpath = "(//*[@class='oxd-grid-item oxd-grid-item--gutters']//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement otherEmployeeIdField;

    @FindBy(xpath = "(//*[@class='oxd-grid-item oxd-grid-item--gutters']//input[@class='oxd-input oxd-input--active'])[3]")
    WebElement driverLicenseNumberField;
    @FindBy(xpath = "//*[@class='oxd-grid-item oxd-grid-item--gutters']//input[@class='oxd-input oxd-input--active'])[4]")
    WebElement licenseExpiryDate;
    @FindBy(xpath = "//*[@class='oxd-grid-item oxd-grid-item--gutters']//input[@class='oxd-input oxd-input--active'])[5]")
    WebElement dateOfBirth;

    //Drob Down
    @FindBy(xpath = "(//*[@class='oxd-select-text oxd-select-text--active'])[1]")
    WebElement nationalityField;
    @FindBy(xpath = "(//*[@class='oxd-select-text oxd-select-text--active'])[2]")
    WebElement maritalStatusField;
    @FindBy(xpath = "(//*[@type='radio'])[2]")
    WebElement gender;
    @FindBy(xpath = "(//*[@type='submit'])[1]")
    WebElement savePersonalDataBtn;

    //Custom Field
    @FindBy(xpath = "(//*[@class='oxd-select-text oxd-select-text--active'])[3]")
    WebElement bloodType;
    @FindBy(xpath = "//*[@class='oxd-grid-item oxd-grid-item--gutters']//input[@class='oxd-input oxd-input--active'])[6]")
    WebElement testField;
    @FindBy(xpath = "(//*[@type='submit'])[2]")
    WebElement saveCustomBtn;

    //Add Attachment
    @FindBy(xpath = "(//*[@type='submit'])[3]")
    WebElement saveAttachedBtn;



    //constactor
    public P07_MyInfo(WebDriver driver)
    {
        super(driver);
    }

    //methods

    public P07_MyInfo setFirstName(String firstNameInput)
    {
        waitElementClickable(firstname);
        firstname.clear();
        firstname.sendKeys(firstNameInput);
        return this;
    }
    public P07_MyInfo setMiddleName(String middleNameInput)
    {
        waitElementClickable(middleName);
        middleName.clear();
        middleName.sendKeys(middleNameInput);
        return this;
    }
    public P07_MyInfo setLastName(String lastNameInput)
    {
        waitElementClickable(lastName);
        lastName.clear();
        lastName.sendKeys(lastNameInput);
        return this;
    }
    public P07_MyInfo setEmployeeId(int employeeId)
    {
        waitElementClickable(employeeIdField);
        employeeIdField.clear();
        employeeIdField.sendKeys(String.valueOf(employeeId));
        return this;
    }
    public P07_MyInfo setOtherEmployeeId(int employeeId)
    {
        waitElementClickable(otherEmployeeIdField);
        otherEmployeeIdField.clear();
        otherEmployeeIdField.sendKeys(String.valueOf(employeeId));
        return this;
    }
    public P07_MyInfo setDriverLicenseNumber(String licenseNumber)
    {
        waitElementClickable(driverLicenseNumberField);
        driverLicenseNumberField.clear();
        driverLicenseNumberField.sendKeys(licenseNumber);
        return this;
    }
    public P07_MyInfo setLicenseExpiryDate(String date)
    {
        licenseExpiryDate.clear();
        licenseExpiryDate.sendKeys(date);
        return this;
    }
    public P07_MyInfo setNationality(String nationality)
    {
        waitElementClickable(nationalityField);
        nationalityField.clear();
        nationalityField.sendKeys(nationality);
        return this;
    }
    public P07_MyInfo setMaritalStatus(String maritalStatus)
    {
        waitElementClickable(maritalStatusField);
        maritalStatusField.clear();
        maritalStatusField.sendKeys(maritalStatus);
        return this;
    }
    public P07_MyInfo setDateOfBirth(String date)
    {
        dateOfBirth.clear();
        dateOfBirth.sendKeys(date);
        return this;
    }
    public P07_MyInfo setGender()
    {
        gender.click();
        return this;
    }
    public P07_MyInfo savePersonalDetailBtn()
    {
        saveCustomBtn.click();
        return this;
    }
    public P07_MyInfo savePersonalDetail()
    {
                 setFirstName("Hager")
                .setMiddleName("Ahmed")
                .setLastName("Hassan")
                .setEmployeeId(1234567891)
                .setOtherEmployeeId(432543343)
                .setDriverLicenseNumber("124253123423")
                .setLicenseExpiryDate("2026-20-11")
                .setNationality("American")
                .setMaritalStatus("Married")
                .setDateOfBirth("2000-21-10")
                .setGender()
                .savePersonalDetailBtn();
        return this;
    }


}
