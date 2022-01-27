package StepsDefinition;

import Pages.OSS.HomePage;
import Pages.OSS.LoggedIn;
import Pages.OSS.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class stepsForLoginApplication {



    @Steps
    HomePage home;
    @Steps
    LoginPage login;

    @Steps
    LoggedIn Dash;


    @Given("User is on home page")
    public void user_is_on_home_page() {

       home.openApplication();
       home.click_login_hyperlink();
    }

    @When("user enter bsptrainingmanager@yahoo.com as username.")
    public void user_enter_bsptrainingmanager_yahoo_com_as_username() {



     login.enter_Username();

    }

    @When("user enters Pass123$ as password.")
    public void user_enters_pass123$_as_password() {

      login.enter_Password();
    }

    @Then("user should be able to login.")
    public void user_should_be_able_to_login() {

       login.click_login_button();
       Dash.verify_User_Logged_in();
    }


}

