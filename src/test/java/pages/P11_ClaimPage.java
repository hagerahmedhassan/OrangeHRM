package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P11_ClaimPage extends BasePage
{
    @FindBy(css = "[placeholder='Type for hints...']")
    WebElement employeeName;
    @FindBy(css = "[class='oxd-textarea oxd-textarea--focus oxd-textarea--resize-vertical']")
    WebElement remarks;
    @FindBy(css = "[type='submit']")
    WebElement createBtn;
    @FindBy(css = "[class='oxd-button oxd-button--medium oxd-button--ghost']")
    WebElement cancelBtn;
    @FindBy(css = "[class='oxd-select-text oxd-select-text--focus']")
    WebElement event;
    @FindBy(xpath = "//*[@class='oxd-select-text-input'][contains(.,'Accommodation')]")
    WebElement accommodationSelection;
    @FindBy(css = "[class='oxd-select-text oxd-select-text--focus']")
    WebElement currencyField;
    @FindBy(xpath = "//*[@class='oxd-select-text oxd-select-text--active'][contains(.,'Angolan New Kwanza')]")
    WebElement currencyInput;




    //constactor
    public P11_ClaimPage(WebDriver driver)
    {
        super(driver);
    }

    //methods
    public P11_ClaimPage setEmployeeName(String empName)
    {
        waitElementVisible(employeeName);
        employeeName.sendKeys(empName);
        return this;
    }
    public P11_ClaimPage setEvent()
    {
        waitElementVisible(event);
        event.click();
        waitElementClickable(accommodationSelection);
        accommodationSelection.click();
        return this;
    }

    public P11_ClaimPage setCurrency()
    {
        waitElementVisible(currencyField);
        currencyField.click();
        waitElementClickable(currencyInput);
        currencyInput.click();
        return this;
    }

    public P11_ClaimPage setRemarks(String remarkDescription)
    {
        waitElementVisible(remarks);
        employeeName.sendKeys(remarkDescription);
        return this;
    }
    public P11_ClaimPage setClickOnCreat()
    {
        waitElementVisible(createBtn);
        createBtn.click();
        return this;
    }
    public P11_ClaimPage setClickOnCancle()
    {
        waitElementVisible(cancelBtn);
        createBtn.click();
        return this;
    }

    public P11_ClaimPage submitForm()
    {
        setEmployeeName("Hager Ahmed Hassan");
        setEvent();
        setCurrency();
        setRemarks("hello i'm hager ahmed");
        setClickOnCreat();

        return this;
    }
    public P11_ClaimPage cancelForm()
    {
        setEmployeeName("Hager Ahmed Hassan");
        setRemarks("hello i'm hager ahmed");
        setClickOnCancle();

        return this;
    }









}
