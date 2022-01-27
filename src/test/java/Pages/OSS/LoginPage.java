package Pages.OSS;

import OSS_Implementation.OSSLogin;
import net.thucydides.core.annotations.Step;

public class LoginPage {

    OSSLogin ossimplemen;

    @Step("Enter user Username")
    public void enter_Username (){
        ossimplemen.enter_username();

    }

    @Step("Enter user password")
    public void enter_Password(){
        ossimplemen.enter_Password();
    }

    @Step("Click login button")
    public void click_login_button(){
        ossimplemen.click_loginButton();
    }


}


