package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P08_DashboardPage extends BasePage
{
    @FindBy(css = "[href='/web/index.php/dashboard/index']")
    WebElement dashBoardBtn;

    @FindBy(xpath = "(//*[@title='Leave List'])[1]")
    WebElement leaveListBtn;

    //constactor
    public P08_DashboardPage(WebDriver driver)
    {
        super(driver);
    }

    //methods
    public P08_DashboardPage setDashBoardBtn()
    {
        waitElementClickable(dashBoardBtn);
        dashBoardBtn.click();
        return this;
    }
    public P08_DashboardPage setLeaveListBtn()
    {
        waitElementClickable(leaveListBtn);
        leaveListBtn.click();
        return this;
    }

    public P08_DashboardPage getLeavePage()
    {
                 setDashBoardBtn()
                .setLeaveListBtn();
        return this;
    }
}
