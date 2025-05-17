package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P12_BuzzNewsPost extends BasePage
{
    @FindBy(css = "[class='oxd-buzz-post-input']")
    WebElement writePost;
    @FindBy(css = "[type='submit']")
    WebElement postBtn;


    //constactor
    public P12_BuzzNewsPost(WebDriver driver)
    {
        super(driver);
    }

    //methods
    public P12_BuzzNewsPost setWritePost(String post)
    {
        waitElementClickable(writePost);
        writePost.clear();
        writePost.sendKeys(post);
        return this;
    }
    public P12_BuzzNewsPost setClickOnPost()
    {
        waitElementClickable(postBtn);
        postBtn.click();
        return this;
    }

    public P12_BuzzNewsPost setSharePost()
    {
        setWritePost("Hello");
        setClickOnPost();
        return this;
    }
}
