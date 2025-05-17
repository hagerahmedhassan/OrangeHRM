package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class P06_RecruitmentPage extends BasePage
{
    //Search Candidates
    //Job Title Locators
    @FindBy(xpath = "((//*[@class='oxd-select-text oxd-select-text--active'])[1]")
    WebElement jobField;
    @FindBy(css = "[class='oxd-select-dropdown --positon-bottom']")
    WebElement list;

    //Vacancy Locators
    @FindBy(xpath = "((//*[@class='oxd-select-text oxd-select-text--active'])[2]")
    WebElement vacancyField;

    //Hiring Manager
    @FindBy(xpath = "((//*[@class='oxd-select-text oxd-select-text--active'])[3]")
    WebElement hiringManagerField;

    //Status
    @FindBy(xpath = "((//*[@class='oxd-select-text oxd-select-text--active'])[4]")
    WebElement statusField;

    //Method Fo Applications
    @FindBy(xpath = "((//*[@class='oxd-select-text oxd-select-text--active'])[5]")
    WebElement methodAppField;

    @FindBy(css = "[type='submit']")
    WebElement saveBtn;
    @FindBy(css = "[type='reset']")
    WebElement cancelBtn;

    @FindBy(css = "[placeholder='Type for hints...']")
    WebElement candidateNameField;
    @FindBy(css = "[class='oxd-autocomplete-option']")
    WebElement candidateNameSearchWait;

    @FindBy(css = "[placeholder='Enter comma seperated words...'")
    WebElement keyWordsField;

    //Dates
    @FindBy(xpath = "(//*[@class='oxd-date-input'])[1]")
    WebElement fromDateField;
    @FindBy(xpath = "(//*[@class='oxd-date-input'])[2]")
    WebElement toDateField;

    //Add Candidate
    @FindBy(css = "[name='firstName']")
    WebElement firstname;
    @FindBy(css = "[name='middleName']")
    WebElement middleName;
    @FindBy(css = "[name='lastName']")
    WebElement lastName;

    @FindBy(xpath = "//*[@class='oxd-date-input']")
    WebElement applyDate;
    @FindBy(xpath = "(//*[@placeholder='Type here'])[1]")
    WebElement emailField;
    @FindBy(xpath = "(//*[@placeholder='Type here'])[2]")
    WebElement connectNumberField;
    @FindBy(css = "[class='oxd-file-div oxd-file-div--active']")
    WebElement browser;
    @FindBy(css = "[class='oxd-file-div oxd-file-div--active']")
    WebElement notesField;
    @FindBy(css = "[class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement checkBox;

    public P06_RecruitmentPage(WebDriver driver)
    {
        super(driver);
    }



    //Job Title
    public P06_RecruitmentPage setJobTitle(String jobTitle)
    {
        waitElementClickable(jobField);
        jobField.click();
        waitElementClickable(list);
        Select selectJobTile=new Select(list);
        selectJobTile.selectByVisibleText(jobTitle);
        return this;
    }
    public P06_RecruitmentPage setVacancy(String vacancy)
    {
        waitElementClickable(vacancyField);
        vacancyField.click();
        waitElementClickable(list);
        Select selectJobTile=new Select(list);
        selectJobTile.selectByVisibleText(vacancy);
        return this;
    }
    public P06_RecruitmentPage setHiringManager(String hiringManager)
    {
        waitElementClickable(hiringManagerField);
        hiringManagerField.click();
        waitElementClickable(list);
        Select selectJobTile=new Select(list);
        selectJobTile.selectByVisibleText(hiringManager);
        return this;
    }
    public P06_RecruitmentPage setStatus(String status)
    {
        waitElementClickable(statusField);
        statusField.click();
        waitElementClickable(list);
        Select selectJobTile=new Select(list);
        selectJobTile.selectByVisibleText(status);
        return this;
    }
    public P06_RecruitmentPage setCandidateName(String candidateName)
    {
        waitElementVisible(candidateNameField);
        candidateNameField.clear();
        candidateNameField.sendKeys(candidateName);

        waitElementVisible(candidateNameSearchWait);
        candidateNameSearchWait.click();
        return this;
    }
    public P06_RecruitmentPage setKeywords(String keywords)
    {
        waitElementVisible(keyWordsField);
        keyWordsField.clear();
        keyWordsField.sendKeys(keywords);
        return this;
    }
    public P06_RecruitmentPage setMethodApp(String methodApplication)
    {
        waitElementClickable(methodAppField);
        methodAppField.click();
        waitElementClickable(list);
        Select selectJobTile=new Select(list);
        selectJobTile.selectByVisibleText(methodApplication);
        return this;
    }
    public P06_RecruitmentPage setDateFrom(String date)
    {
        fromDateField.clear();
        fromDateField.sendKeys(date);
        return this;
    }
    public P06_RecruitmentPage setDateTo(String date)
    {
        toDateField.clear();
        toDateField.sendKeys(date);
        return this;
    }


    public P06_RecruitmentPage setSearchBtn()
    {
        waitElementClickable(saveBtn);
        saveBtn.click();
        return this;
    }
    public P06_RecruitmentPage setResetBtn()
    {
        waitElementClickable(cancelBtn);
        cancelBtn.click();
        return this;
    }
    public P06_RecruitmentPage searchOnCandidates()
    {
                 setJobTitle("Automaton Tester")
                .setVacancy("Senior QA Lead")
                .setHiringManager("Hager Ahmed Hassan")
                .setStatus("Interview Passed")
                .setCandidateName("Hager Wahp")
                .setKeywords("Testing")
                .setDateFrom("2025-01-05")
                .setDateTo("2025-16-05")
                .setMethodApp("Online")
                .setSearchBtn();
        return this;
    }
    public P06_RecruitmentPage restCandidates()
    {
        setJobTitle("Automaton Tester")
                .setVacancy("Senior QA Lead")
                .setHiringManager("Hager Ahmed Hassan")
                .setStatus("Interview Passed")
                .setCandidateName("Hager Wahp")
                .setKeywords("Testing")
                .setDateFrom("2025-01-05")
                .setDateTo("2025-16-05")
                .setMethodApp("Online")
                .setResetBtn();
        return this;
    }

    //Add Candidate
    public P06_RecruitmentPage setFirstName(String firstNameInput)
    {
        waitElementClickable(firstname);
        firstname.clear();
        firstname.sendKeys(firstNameInput);
        return this;
    }
    public P06_RecruitmentPage setMiddleName(String middleNameInput)
    {
        waitElementClickable(middleName);
        middleName.clear();
        middleName.sendKeys(middleNameInput);
        return this;
    }
    public P06_RecruitmentPage setLastName(String lastNameInput)
    {
        waitElementClickable(lastName);
        lastName.clear();
        lastName.sendKeys(lastNameInput);
        return this;
    }
    public P06_RecruitmentPage setApplyDate(String date)
    {
        applyDate.clear();
        applyDate.sendKeys(date);
        return this;
    }
    public P06_RecruitmentPage setEmail(String email)
    {
        waitElementClickable(emailField);
        emailField.sendKeys(email);
        return this;
    }
    public P06_RecruitmentPage setConnectNumber(String connectNumber)
    {
        waitElementClickable(connectNumberField);
        connectNumberField.sendKeys(String.valueOf(connectNumber));
        return this;
    }
    public P06_RecruitmentPage setBrowser(String path)
    {
        waitElementClickable(browser);
        browser.sendKeys(path);
        return this;
    }
    public P06_RecruitmentPage setNotes(String note)
    {
        waitElementClickable(notesField);
        notesField.sendKeys(note);
        return this;
    }
    public P06_RecruitmentPage setCheckBox()
    {
        waitElementClickable(checkBox);
        checkBox.click();
        return this;
    }
    public P06_RecruitmentPage addCandidate()
    {
                 setFirstName("Hager")
                 .setMiddleName("Ahmed")
                 .setLastName("Hassan")
                 .setVacancy("Senior QA Lead")
                 .setEmail("hager@gmail.com")
                 .setConnectNumber("01132456343")
                 .setBrowser("D:\\Software Testing\\CVS\\Hager Ahmed_QC")
                 .setKeywords("Testing")
                 .setApplyDate("2025-16-05")
                 .setNotes("hello i am software tester")
                 .setCheckBox()
                 .setSearchBtn();
        return this;
    }
    public P06_RecruitmentPage cancelCandidate()
    {
        setFirstName("Hager")
                .setMiddleName("Ahmed")
                .setLastName("Hassan")
                .setVacancy("Senior QA Lead")
                .setEmail("hager@gmail.com")
                .setConnectNumber("01132456343")
                .setBrowser("D:\\Software Testing\\CVS\\Hager Ahmed_QC")
                .setKeywords("Testing")
                .setApplyDate("2025-16-05")
                .setNotes("hello i am software tester")
                .setCheckBox()
                .setResetBtn();
        return this;
    }


}
