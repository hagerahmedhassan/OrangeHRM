package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class P04_LeavePage extends BasePage
{
//    (//*[@class="oxd-date-input"])[1]
    @FindBy(xpath = "(//*[@class='oxd-date-input'])[1]")
    WebElement fromDateField;
    @FindBy(xpath = "(//*[@class='oxd-date-input'])[2]")
    WebElement toDateField;
    @FindBy(css = "[placeholder='Type for hints...']")
    WebElement empNameSearch;
    @FindBy(css = "[class='oxd-autocomplete-option']")
    WebElement getEmpNameSearchWait;
    //[class="oxd-select-text oxd-select-text--focus"]


    @FindBy(xpath = "(//*[@class='oxd-select-text oxd-select-text--active'])[1]")
    WebElement leaveStatus;
    @FindBy(xpath = "(//*[@class='oxd-select-text oxd-select-text--active'])[2]")
    WebElement leaveType;
    @FindBy(css = "[class='oxd-select-text oxd-select-text--focus']")
    WebElement subUnit;
    @FindBy(css = "[class='oxd-select-dropdown --positon-bottom']")
    WebElement list;

    @FindBy(xpath = "(//*[@type='checkbox'])[1]")
    WebElement radioBtnPastEmp;
    @FindBy(css = "[type='submit']")
    WebElement searchBtn;
    @FindBy(css = "[type='reset']")
    WebElement resetBtn;
    //constactor
    public P04_LeavePage(WebDriver driver)
    {
        super(driver);
    }

    //methods
    public P04_LeavePage setDateFrom(String date)
    {
        fromDateField.clear();
        fromDateField.sendKeys(date);
        return this;
    }
    public P04_LeavePage setDateTo(String date)
    {
        toDateField.clear();
        toDateField.sendKeys(date);
        return this;
    }

    public P04_LeavePage setSelectLeaveStatus()
    {
        waitElementClickable(leaveStatus);
        leaveStatus.click();
        Select select=new Select(list);
        select.selectByVisibleText("Pending Approval");
        return this;
    }
    public P04_LeavePage setSelectLeaveType()
    {
        waitElementClickable(leaveType);
        leaveType.click();
        Select select=new Select(list);
        select.selectByVisibleText("CAN - Bereavement");
        return this;
    }
    public P04_LeavePage setSubUnit()
    {
        waitElementClickable(subUnit);
        subUnit.click();
        Select select=new Select(list);
        select.selectByVisibleText("Quality Assurance");
        return this;
    }
    public P04_LeavePage setEmployeeName(String employeeName)
    {
        waitElementVisible(empNameSearch);
        empNameSearch.clear();
        empNameSearch.sendKeys(employeeName);
        waitElementVisible(getEmpNameSearchWait);
        getEmpNameSearchWait.click();
        return this;
    }
    public P04_LeavePage setPastEmployeeRatio()
    {
        waitElementClickable(radioBtnPastEmp);
        radioBtnPastEmp.click();
        return this;
    }
    public P04_LeavePage setSearchBtn()
    {
        waitElementClickable(searchBtn);
        searchBtn.click();
        return this;
    }
    public P04_LeavePage setResetBtn()
    {
        waitElementClickable(resetBtn);
        resetBtn.click();
        return this;
    }

    public P04_LeavePage leaveSearch()
    {
                 setDateFrom("2025-01-01")
                .setDateTo("2025-11-10")
                .setSelectLeaveStatus()
                .setSelectLeaveType()
                .setSubUnit()
                .setEmployeeName("hager ahmed hassan")
                .setPastEmployeeRatio()
                .setSearchBtn();
                 return this;
    }

    public P04_LeavePage leaveReset()
    {
                 setDateFrom("2025-01-01")
                .setDateTo("2025-11-10")
                .setSelectLeaveStatus()
                .setSelectLeaveType()
                .setSubUnit()
                .setEmployeeName("hager ahmed hassan")
                .setPastEmployeeRatio()
                .setResetBtn();
        return this;
    }
}
