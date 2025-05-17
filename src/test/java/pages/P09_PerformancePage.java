package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class P09_PerformancePage extends BasePage
{
    @FindBy(css = "[placeholder='Type for hints...']")
    WebElement empNameSearch;
    @FindBy(css = "[class='oxd-autocomplete-option']")
    WebElement getEmpNameSearchWait;

    @FindBy(xpath = "(//*[@class='oxd-select-text oxd-select-text--active'])[1]")
    WebElement jobField;
    @FindBy(xpath = "(//*[@class='oxd-select-text oxd-select-text--active'])[1]")
    WebElement subUnitField;
    @FindBy(xpath = "(//*[@class='oxd-select-text oxd-select-text--active'])[1]")
    WebElement includeField;
    @FindBy(xpath = "(//*[@class='oxd-select-text oxd-select-text--active'])[1]")
    WebElement reviewStatusField;
    @FindBy(css = "[class='oxd-select-dropdown --positon-bottom']")
    WebElement list;

    @FindBy(xpath = "(//*[@class='oxd-date-input'])[1]")
    WebElement fromDateField;
    @FindBy(xpath = "(//*[@class='oxd-date-input'])[2]")
    WebElement toDateField;
    @FindBy(css = "[type='submit']")
    WebElement searchBtn;
    @FindBy(css = "[type='reset']")
    WebElement resetBtn;


    //constactor
    public P09_PerformancePage(WebDriver driver)
    {
        super(driver);
    }

    //methods
    public P09_PerformancePage setEmployeeNameSearch(String employeeName)
    {
        waitElementVisible(empNameSearch);
        empNameSearch.clear();
        empNameSearch.sendKeys(employeeName);
        waitElementVisible(getEmpNameSearchWait);
        getEmpNameSearchWait.click();
        return this;
    }
    public P09_PerformancePage setJobTitle(String jobTitle)
    {
        waitElementClickable(jobField);
        jobField.click();
        waitElementClickable(list);
        Select selectJobTile=new Select(list);
        selectJobTile.selectByVisibleText(jobTitle);
        return this;
    }
    public P09_PerformancePage setSubUnit(String subUnit)
    {
        waitElementClickable(subUnitField);
        subUnitField.click();
        waitElementClickable(list);
        Select selectJobTile=new Select(list);
        selectJobTile.selectByVisibleText(subUnit);
        return this;
    }
    public P09_PerformancePage setInclude(String include)
    {
        waitElementClickable(includeField);
        includeField.click();
        waitElementClickable(list);
        Select selectJobTile=new Select(list);
        selectJobTile.selectByVisibleText(include);
        return this;
    }
    public P09_PerformancePage setReviewStatus(String reviewStatus)
    {
        waitElementClickable(reviewStatusField);
        reviewStatusField.click();
        waitElementClickable(list);
        Select selectJobTile=new Select(list);
        selectJobTile.selectByVisibleText(reviewStatus);
        return this;
    }

    public P09_PerformancePage setDateFrom(String date)
    {
        fromDateField.clear();
        fromDateField.sendKeys(date);
        return this;
    }
    public P09_PerformancePage setDateTo(String date)
    {
        toDateField.clear();
        toDateField.sendKeys(date);
        return this;
    }
    public P09_PerformancePage setSearchBtn()
    {
        waitElementClickable(searchBtn);
        searchBtn.click();
        return this;
    }
    public P09_PerformancePage setResetBtn()
    {
        waitElementClickable(resetBtn);
        resetBtn.click();
        return this;
    }
 //Search With Employee Reviews
    public P09_PerformancePage searchWithEmployeeReview()
    {
        setEmployeeNameSearch("Hager Ahmed Hassan")
                .setJobTitle("Automaton Tester")
                .setSubUnit("OrangeHRM")
                .setInclude("Current and Past Employees")
                .setReviewStatus("Activated")
                .setDateFrom("2025-01-01")
                .setDateTo("2025-18-12")
                .setSearchBtn();
        return this;
    }

    public P09_PerformancePage ResetWWithEmployeeReview()
    {
        setEmployeeNameSearch("Hager Ahmed Hassan")
                .setJobTitle("Automaton Tester")
                .setSubUnit("OrangeHRM")
                .setInclude("Current and Past Employees")
                .setReviewStatus("Activated")
                .setDateFrom("2025-01-01")
                .setDateTo("2025-18-12")
                .setSearchBtn();
        return this;
    }


}
