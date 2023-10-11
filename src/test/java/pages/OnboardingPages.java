package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OnboardingPages extends BasePage {

    @FindBy(xpath = "//*[text()='New Onboarding']")
    public WebElement buttonNewOnboarding;

    @FindBy(xpath = "//h2[text()='Personal Information']")
    public WebElement headlinePersonalInformation;

    @FindBy(xpath = "//h2[text()='Company Registration']")
    public WebElement headlineCompanyRegistration;
    @FindBy(xpath = "//h2[text()='Resources']")
    public WebElement headlineResources;
    @FindBy(xpath = "//h2[text()='Completion Date at The Latest']")
    public WebElement headlineCompletionDateAtTheLatest;
    @FindBy(xpath = "//h2[text()='Attachments']")
    public WebElement headlineAttachments;
    @FindBy(xpath = "//h2[text()='Comments']")
    public WebElement headlineComments;

    @FindBy(xpath = "(//*[@class='ant-space-item'])[4]")
    public WebElement buttonShowLogs;

    @FindBy(xpath = "//*[text()='Drafts']")
    public WebElement draftsTab;

    @FindBy(xpath = "(//*[@class='ant-space-item'])[5]")
    public WebElement buttonEditDrafts;

    @FindBy(xpath = "//span[@class='ant-upload']")
    public WebElement buttonUploadAttachment;
}
