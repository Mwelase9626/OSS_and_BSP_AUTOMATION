package OSS_Implementation;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class OSSHomePage extends PageObject {

    public void click_LoginText(){
        $(By.xpath("//*[@id=\"mainNav\"]/div[1]/div/ul[1]/li[2]/a")).click();

    }
    public void click_RegisterText(){

        $(By.xpath("//*[@id=\"mainNav\"]/div[1]/div/ul[1]/li[3]/a")).click();

    }

    public void click_the_Get_StartedButton(){

        $(By.xpath("//button[@class='btn btn-tertiary']")).click();
    }

}

