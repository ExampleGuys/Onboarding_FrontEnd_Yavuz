package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPages extends BasePage {


    @FindBy(id = "email")
    public WebElement sectionEmail;
    @FindBy(id="password")
    public WebElement sectionPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement buttonsignIn;

    @FindBy(xpath = "//a[@href='/onboarding']")
    public WebElement navMenuOnboarding;

    @FindBy(xpath = "//a[@href='/sign-in']")
    public WebElement NavMenuLogout;

    @FindBy(xpath = "//span[@title='20 / page']")
    public WebElement pageAmountBottomOfThePage;

    @FindBy(xpath = "//*[@class='ant-pagination-total-text']")
    public WebElement totalPageAmount;




}
