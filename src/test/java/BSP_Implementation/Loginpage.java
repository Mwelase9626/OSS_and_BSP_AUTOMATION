package BSP_Implementation;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Loginpage extends PageObject{



    public void Verify_Login_Successfully(){
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("Login"));


    }


}
