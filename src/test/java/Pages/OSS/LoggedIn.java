package Pages.OSS;

import OSS_Implementation.OSSLoggedIn;
import net.thucydides.core.annotations.Step;

public class LoggedIn {

    OSSLoggedIn LandingPage;


    @Step("Verify that the user is logged in")
    public void verify_User_Logged_in(){
        LandingPage.verify_User_LoggedIn();

    }

}

