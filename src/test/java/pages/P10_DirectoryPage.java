package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class P10_DirectoryPage extends BasePage
{
    @FindBy(css = "[placeholder='Type for hints...']")
    WebElement employeeName;
    @FindBy(css = "[role='listbox']")
    WebElement employeeNameWait;

    //jobTitle drobBoxList
    @FindBy(xpath = "(//*[@class='oxd-select-wrapper'])[1]")
    WebElement jobField;
    @FindBy(css = "[class='oxd-select-dropdown --positon-bottom']")
    WebElement jobList;

    //LocationTitle drobBoxList
    @FindBy(xpath = "(//*[@class='oxd-select-text oxd-select-text--active'])[2]")
    WebElement locationField;
    @FindBy(css = "[class='oxd-select-dropdown --positon-bottom']")
    WebElement locationList;


    //constactor
    public P10_DirectoryPage(WebDriver driver)
    {
        super(driver);
    }

    //methods
    public P10_DirectoryPage setEmployeeName(String empName)
    {
        waitElementClickable(employeeName);
        employeeName.clear();
        employeeName.sendKeys(empName);
        waitElementVisible(employeeNameWait);
        employeeNameWait.click();

        return this;
    }

    public P10_DirectoryPage setJobTitle()
    {
        waitElementClickable(jobField);
        jobField.click();
        waitElementClickable(jobList);
        Select selectJobTile=new Select(jobList);
        selectJobTile.selectByVisibleText("Automaton Tester");
        return this;
    }
    public P10_DirectoryPage setLocation()
    {
        waitElementClickable(locationField);
        locationField.click();
        waitElementClickable(locationList);
        Select selectLocation=new Select(locationList);
        selectLocation.selectByVisibleText("New York Sales Office");
        return this;
    }

    public P10_DirectoryPage applySearch()
    {
        setEmployeeName("Hager Ahmed Hassan").setJobTitle().setLocation();

        return this;
    }

}
