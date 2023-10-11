package stepDefinitions;

import io.cucumber.java.en.*;
import pages.CommonPages;
import pages.OnboardingPages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class OnboardingSD {
    OnboardingPages onboardingElements = new OnboardingPages();
    CommonPages commonElements = new CommonPages();

    @Given("The user goes to staging url")
    public void the_user_goes_to_staging_url() {

        Driver.getDriver().get(ConfigurationReader.get("url"));

    }

    @And("User logs into the web application with the given test data as a requester")
    public void userLogsIntoTheWebApplicationWithTheGivenTestDataAsARequester() {
        ReusableMethods.login();
    }

    @Given("The User click on the “Onboarding” section in the Navigation Menu")
    public void the_user_click_on_the_onboarding_section_in_the_navigation_menu() {
        commonElements.navMenuOnboarding.click();

    }

    @Given("The user click on the “New Onboarding” button top right corner of the page")
    public void the_user_click_on_the_new_onboarding_button_top_right_corner_of_the_page() {
        onboardingElements.buttonNewOnboarding.click();

    }

    @Then("the user should seen Personal Information section")
    public void the_user_should_seen_personal_ınformation_section() {
        assert (onboardingElements.headlinePersonalInformation.isDisplayed());
    }

    @Then("the user should seen Company Registration section")
    public void theUserShouldSeenCompanyRegistrationSection() {
        assert (onboardingElements.headlineCompanyRegistration.isDisplayed());
    }

    @Then("the user should seen Resources section")
    public void theUserShouldSeenResourcesSection() {
        assert (onboardingElements.headlineResources.isDisplayed());
    }

    @Then("the user should seen Completion Date at The Latest section")
    public void theUserShouldSeenCompletionDateAtTheLatestSection() {
        assert (onboardingElements.headlineCompletionDateAtTheLatest.isDisplayed());
    }

    @Then("the user should seen Comments section")
    public void theUserShouldSeenCommentsSection() {
        assert (onboardingElements.headlineComments.isDisplayed());
    }

    @Then("The User verify that “Show Logs” button in the Action section is visible")
    public void theUserVerifyThatShowLogsButtonInTheActionSectionIsVisible() {
        assert(onboardingElements.buttonShowLogs.isDisplayed());
    }

    @And("The User click on Draft tab under the List of Onboardings headline")
    public void theUserClickOnDraftTabUnderTheListOfOnboardingsHeadline() {
        onboardingElements.draftsTab.click();
    }

    @And("The User click on edit icon in the Actions section of first element of list")
    public void theUserClickOnEditIconInTheActionsSectionOfFirstElementOfList() {
        onboardingElements.buttonEditDrafts.click();
    }

    @Then("the User verify that Completion Date at The Latest section in the Edit Onboarding page is visible")
    public void theUserVerifyThatCompletionDateAtTheLatestSectionInTheEditOnboardingPageIsVisible() {
        assert(onboardingElements.headlineCompletionDateAtTheLatest.isDisplayed());
    }

    @Then("the User verify that Comments section in the Edit Onboarding page is visible")
    public void theUserVerifyThatCommentsSectionInTheEditOnboardingPageIsVisible() {
        assert (onboardingElements.headlineComments.isDisplayed());
    }

    @And("The User scroll in to bottom of the page")
    public void theUserScrollInToBottomOfThePage() {
        ReusableMethods.scrollIntoVIewJS(commonElements.pageAmountBottomOfThePage);
    }

    @Then("The User verify that total number of elements in the List of Onboardings is visible")
    public void theUserVerifyThatTotalNumberOfElementsInTheListOfOnboardingsIsVisible() {
        assert(commonElements.totalPageAmount.isDisplayed());
    }

    @Then("The User verify that edit icon in the Actions section of first element of list should be visible")
    public void theUserVerifyThatEditIconInTheActionsSectionOfFirstElementOfListShouldBeVisible() {
        assert (onboardingElements.buttonEditDrafts.isDisplayed());
    }

    @Then("the User verify that Personel Information section in the Edit Onboarding page is visible")
    public void theUserVerifyThatPersonelInformationSectionInTheEditOnboardingPageIsVisible() {
        assert (onboardingElements.headlinePersonalInformation.isDisplayed());
    }

    @Then("the User verify that Company Registration section in the Edit Onboarding page is visible")
    public void theUserVerifyThatCompanyRegistrationSectionInTheEditOnboardingPageIsVisible() {
        assert (onboardingElements.headlineCompanyRegistration.isDisplayed());
    }

    @Then("the User verify that Resources section in the Edit Onboarding page is visible")
    public void theUserVerifyThatResourcesSectionInTheEditOnboardingPageIsVisible() {
        assert (onboardingElements.headlineResources.isDisplayed());
    }

    @Then("the user should seen Attachments section")
    public void theUserShouldSeenAttachmentsSection() {
        assert (onboardingElements.headlineAttachments.isDisplayed());
    }

    @Then("the user should seen “Select File” button in the Attachments section")
    public void theUserShouldSeenSelectFileButtonInTheAttachmentsSection() {
        assert (onboardingElements.buttonUploadAttachment.isDisplayed());
    }
}
