package Pages.BSP;

import BSP_Implementation.LandingPage;
import net.thucydides.core.annotations.Step;

public class BSP_HomePage {

    LandingPage landingPage;

 @Step("Open the BSP application")
 public void OpenApplication(){
     landingPage.open();

 }
@Step("Click the Register button on the landing page")
    public void click_Register(){
    landingPage.Click_the_RegisterButton();
}

@Step("Click the login button on the landing page")
public void click_login(){
    landingPage.click_the_loginButton();
}



}
