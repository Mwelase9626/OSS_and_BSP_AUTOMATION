package BSP_Implementation;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LandingPage extends PageObject {

    public void click_the_loginButton(){
        $(By.xpath("//a[@href = '/Users/Login']")).click();
    }
public void Click_the_RegisterButton(){
        $(By.xpath("//a[@href = '/Students/Create']")).click();
}


}
