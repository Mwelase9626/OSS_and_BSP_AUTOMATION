package OSS_Implementation;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class OSSLoggedIn extends PageObject {

    public void verify_User_LoggedIn(){

        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("Dashboard"));
    }

}

