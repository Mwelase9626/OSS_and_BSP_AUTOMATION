package Pages.OSS;

import OSS_Implementation.OSSHomePage;
import net.thucydides.core.annotations.Step;

public class HomePage {
    OSSHomePage landingPage;


    @Step
    public void openApplication(){
        landingPage.open();
    }

    @Step("Click the login hyperlink text")
    public void click_login_hyperlink(){
        landingPage.click_LoginText();

    }
    @Step("Click the Register hyperlink")
    public void click_register_HyperlinkText(){
        landingPage.click_RegisterText();
    }

    @Step("Click the Get Started button")
    public void click_GetStarted_Button(){
        landingPage.click_the_Get_StartedButton();
    }


}


