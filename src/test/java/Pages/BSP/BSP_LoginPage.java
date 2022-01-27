package Pages.BSP;

import BSP_Implementation.Loginpage;
import net.thucydides.core.annotations.Step;

public class BSP_LoginPage {

    Loginpage loginpage;

    @Step("Verify that student registered successfully")
    public void Success_Message(){
        loginpage.Verify_Login_Successfully();
    }


}
