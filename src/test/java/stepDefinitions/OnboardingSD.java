package stepDefinitions;

import io.cucumber.java.en.*;
import pages.CommonPages;
import pages.OnboardingPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class OnboardingSD {
    OnboardingPages onboardingElements = new OnboardingPages();
    CommonPages commonElements=new CommonPages();

    @Given("The user goes to staging url")
    public void the_user_goes_to_staging_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

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
        assert(onboardingElements.headlinePersonalInformation.isDisplayed());

    }

    @Then("the user should seen Company Registration section")
    public void theUserShouldSeenCompanyRegistrationSection() {
        assert(onboardingElements.headlineCompanyRegistration.isDisplayed());
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
}
