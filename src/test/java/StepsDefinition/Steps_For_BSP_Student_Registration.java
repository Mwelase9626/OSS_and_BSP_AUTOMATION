package StepsDefinition;

import Pages.BSP.BSP_HomePage;
import Pages.BSP.BSP_LoginPage;
import Pages.BSP.BSP_RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class Steps_For_BSP_Student_Registration {


    @Steps
    BSP_LoginPage loginPage;
    @Steps
    BSP_HomePage homePage;

    @Steps
    BSP_RegistrationPage RegistrationPage;

    @Given("User is on the BSP home page.")
    public void user_is_on_the_bsp_home_page() {
        homePage.OpenApplication();
        homePage.click_Register();

    }
    @When("user enters valid details.")
    public void user_enters_valid_details() {

     RegistrationPage.SelectGender();
      RegistrationPage.Enter_Name();
      RegistrationPage.Enter_Surname();
      RegistrationPage.select_students_race();
      RegistrationPage.select_students_Nationality();
      RegistrationPage.Enter_ID_Number();
      RegistrationPage.Enter_students_username();
      RegistrationPage.Enter_students_PrimaryEmail();
      RegistrationPage.enter_students_secondaryEmail();
      RegistrationPage.Enter_Password();
      RegistrationPage.Confirm_Password();
      RegistrationPage.enter_Primary_Contact_Number();
      RegistrationPage.enter_secondary_Contact_Number();
      RegistrationPage.Enter_Town_or_City();
      RegistrationPage.select_province();
      RegistrationPage.enter_municipality();
      RegistrationPage.enter_ward_number();
      RegistrationPage.enter_religion();
      RegistrationPage.select_Tshirt_size();
      RegistrationPage.enter_dietary();
      RegistrationPage.select_Home_langugage();
      RegistrationPage.select_other_language();


    }
    @When("user clicks the register button.")
    public void user_clicks_the_register_button() {
        RegistrationPage.click_register();

    }
    @Then("User should be successfully registered on BSP.")
    public void user_should_be_successfully_registered_on_bsp() {
       loginPage.Success_Message();

    }


}
