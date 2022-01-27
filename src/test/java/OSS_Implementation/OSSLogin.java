package OSS_Implementation;

import Excel_Files.BSP_Registration_data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class OSSLogin extends PageObject  {


    BSP_Registration_data bspdata = new BSP_Registration_data() ;


    public void enter_username(){


        $(By.xpath("//input[@id='userName']")).sendKeys(bspdata.bsp_username());


    }
    public void enter_Password(){
        $(By.xpath("//input[@id='password']")).type("Pass123$");
    }

    public void click_loginButton(){
        $(By.xpath("//input[@value='Login']")).click();
    }


}

