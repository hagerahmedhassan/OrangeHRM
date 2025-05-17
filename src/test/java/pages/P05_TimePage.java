package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class P05_TimePage extends BasePage
{
    //Employee Name
    @FindBy(css = "[placeholder='Type for hints...']")
    WebElement employeeName;
    @FindBy(css = "[class='oxd-autocomplete-dropdown --positon-bottom']")
    WebElement displayEmployee;
    @FindBy(css = "[type='submit']")
    WebElement viewBtn;

    //Create Time Sheet
    @FindBy(css = "[class='orangehrm-timesheet-footer--options']")
    WebElement createTimeSheet;

    // View Actions
    @FindBy(css = "[class='oxd-button oxd-button--medium oxd-button--ghost']")
    WebElement editBtn;
    @FindBy(xpath= "(//*[@type='button'])[4]")
    WebElement actionsView;

    //project Name
    @FindBy(css = "[placeholder='Type for hints...']")
    WebElement projectNameField;
    @FindBy(css = "[class='oxd-autocomplete-dropdown --positon-bottom']")
    WebElement projectNameSearch;

    //Activity Dorb DownList
    @FindBy(css = "[class='oxd-select-text oxd-select-text--active']")
    WebElement activityField;
    @FindBy(css = "[class='oxd-select-dropdown --positon-bottom']")
    WebElement list;

    // Set Times
    @FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
    WebElement time1;
    @FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[3]")
    WebElement time2;
    @FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[4]")
    WebElement time3;
    @FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[5]")
    WebElement time4;
    @FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[6]")
    WebElement time5;
    @FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[7]")
    WebElement time6;
    @FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[8]")
    WebElement time7;

    //Save
    @FindBy(css = "[type='submit']")
    WebElement saveBtn;

    //Reset
    @FindBy(xpath = "(//*[@class='oxd-button oxd-button--medium oxd-button--ghost'])[2]")
    WebElement resetBtn;

    //Cancel
    @FindBy(xpath = "(//*[@class='oxd-button oxd-button--medium oxd-button--ghost'])[1]")
    WebElement cancelBtn;

    //Delete
    @FindBy(xpath = "[class='oxd-icon bi-trash']")
    WebElement deleteBtn;



    //constactor
    public P05_TimePage(WebDriver driver)
    {
        super(driver);
    }

    //methods
    //view Time schedule
    public P05_TimePage setEmployeeName(String empName)
    {
        waitElementClickable(employeeName);
        employeeName.clear();
        employeeName.sendKeys(empName);
        waitElementVisible(displayEmployee);
        displayEmployee.click();
        return this;
    }
    public P05_TimePage setViewBtn()
    {
        waitElementClickable(viewBtn);
        viewBtn.click();
        return this;
    }
    public P05_TimePage setCreateTimeSheet()
    {
        waitElementClickable(createTimeSheet);
        createTimeSheet.click();
        return this;
    }
    public P05_TimePage setViewEmployeeTime()
    {
                 setEmployeeName("Hager Ahmed Hassan")
                .setViewBtn()
                .setCreateTimeSheet();
        return this;
    }
    public P05_TimePage setEditBtn()
    {
        waitElementClickable(editBtn);
        editBtn.click();
        return this;
    }

    public P05_TimePage setActionsViewBtn()
    {
        waitElementClickable(actionsView);
        actionsView.click();
        return this;
    }

    //Edit Functions


    public P05_TimePage setViewTime()
    {
                 setEmployeeName("Hager Ahmed Hassan")
                .setViewBtn();
        return this;
    }

    //Edit Time
    public P05_TimePage setProjectNameSearch(String projectName)
    {
        waitElementVisible(projectNameField);
        projectNameField.clear();
        projectNameField.sendKeys(projectName);
        waitElementVisible(projectNameSearch);
        projectNameSearch.click();
        return this;
    }
    public P05_TimePage setActivity(String activityName)
    {
        waitElementVisible(activityField);
        projectNameField.click();
        Select selectActivity=new Select(list);
        selectActivity.selectByVisibleText(activityName);
        projectNameSearch.click();
        return this;
    }
    public P05_TimePage setTime1(String addTime)
    {
        waitElementClickable(time1);
        time1.sendKeys(addTime);
        return this;
    }
    public P05_TimePage setTime2(String addTime)
    {
        waitElementClickable(time2);
        time2.sendKeys(addTime);
        return this;
    }
    public P05_TimePage setTime3(String addTime)
    {
        waitElementClickable(time3);
        time3.sendKeys(addTime);
        return this;
    }
    public P05_TimePage setTime4(String addTime)
    {
        waitElementClickable(time4);
        time4.sendKeys(addTime);
        return this;
    }
    public P05_TimePage setTime5(String addTime)
    {
        waitElementClickable(time5);
        time5.sendKeys(addTime);
        return this;
    }
    public P05_TimePage setTime6(String addTime)
    {
        waitElementClickable(time6);
        time6.sendKeys(addTime);
        return this;
    }
    public P05_TimePage setTime7(String addTime)
    {
        waitElementClickable(time7);
        time7.sendKeys(addTime);
        return this;
    }
    public P05_TimePage setSaveBtn()
    {
        waitElementClickable(saveBtn);
        saveBtn.click();
        return this;
    }
    public P05_TimePage setResetBtn()
    {
        waitElementClickable(resetBtn);
        resetBtn.click();
        return this;
    }
    public P05_TimePage setCancelBtn()
    {
        waitElementClickable(cancelBtn);
        cancelBtn.click();
        return this;
    }
    public P05_TimePage setDeleteBtn()
    {
        waitElementClickable(deleteBtn);
        deleteBtn.click();
        return this;
    }

    //save editing time
    public P05_TimePage saveViewEditTime()
    {
                         setCreateTimeSheet()
                        .setEditBtn()
                        .setProjectNameSearch("ACME Ltd - ACME Ltd")
                         .setActivity("Bug Fixes")
                        .setTime1("06:00")
                        .setTime2("06:40")
                        .setTime3("07:30")
                        .setTime4("08:00")
                        .setTime5("9:43")
                        .setTime6("12.50")
                        .setTime7("5:45")
                         .setSaveBtn()
                ;
        return this;
    }
    public P05_TimePage resetEditTime()
    {
        setCreateTimeSheet()
                .setEditBtn()
                .setProjectNameSearch("ACME Ltd - ACME Ltd")
                .setActivity("Bug Fixes")
                .setTime1("06:00")
                .setTime2("06:40")
                .setTime3("07:30")
                .setTime4("08:00")
                .setTime5("9:43")
                .setTime6("12.50")
                .setTime7("5:45")
                .setResetBtn()
        ;
        return this;
    }
    public P05_TimePage cancelEditTime()
    {
        setCreateTimeSheet()
                .setEditBtn()
                .setProjectNameSearch("ACME Ltd - ACME Ltd")
                .setActivity("Bug Fixes")
                .setTime1("06:00")
                .setTime2("06:40")
                .setTime3("07:30")
                .setTime4("08:00")
                .setTime5("9:43")
                .setTime6("12.50")
                .setTime7("5:45")
                .setCancelBtn()
        ;
        return this;
    }
    public P05_TimePage deleteEditTime()
    {
                 setCreateTimeSheet()
                .setEditBtn()
                .setProjectNameSearch("ACME Ltd - ACME Ltd")
                 .setActivity("Bug Fixes")
                .setTime1("06:00")
                .setTime2("06:40")
                .setTime3("07:30")
                .setTime4("08:00")
                .setTime5("9:43")
                .setTime6("12.50")
                .setTime7("5:45")
                .setDeleteBtn()
        ;
        return this;
    }

    // view Time Sheets
    public P05_TimePage viewTimeSheets()
    {
        waitElementClickable(actionsView);
        actionsView.click();
        return this;
    }




}
