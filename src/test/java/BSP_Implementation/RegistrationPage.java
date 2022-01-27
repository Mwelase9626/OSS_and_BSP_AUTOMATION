package BSP_Implementation;

import Excel_Files.BSP_Registration_data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class RegistrationPage extends PageObject {
    BSP_Registration_data bspdata = new BSP_Registration_data() ;


    public void select_gender_Male(){
      Select Gender = new Select($(By.xpath("//select[@id = 'student.Gender']")));
      Gender.selectByVisibleText("Male");
    }

    public void select_gender_Female(){
        Select Gender = new Select($(By.xpath("//select[@id = 'student.Gender']")));
        Gender.selectByVisibleText("Female");
    }
    public void enter_Name(){
        $(By.xpath("//input[@id='student_Name']")).sendKeys(bspdata.bsp_name());

    }
    public void enter_Surname(){

        $(By.xpath("//input[@id='student_Surname']")).sendKeys(bspdata.surname());
    }
    public void select_race(){
        String fullx = "/html/body/div[3]/div/div/div[2]/form/fieldset[1]/div/div[4]/div/select";

        Select Race= new Select($(By.xpath(fullx)));
        Race.selectByIndex(1);
//        List<WebElement> Races = $s(By.xpath("//*[@id=\"student.Race\"]"));
//        int SizeOfRaces = Races.size();
//        if (SizeOfRaces <= 4){
//            Select selectAfrican = new Select($(By.xpath("//*[@id=\"student.Race\"]")));
//            selectAfrican.selectByVisibleText("African");
        }
 //

    public void Select_Nationality(){

        String Fullx = "/html/body/div[3]/div/div/div[2]/form/fieldset[1]/div/div[5]/div/select";
        Select Nationality= new Select($(By.xpath(Fullx)));
        Nationality.selectByIndex(3);
        //        List<WebElement> Nationality= $s(By.xpath("//*[@id=\"student.Race\"]"));
//        int sizeOfnationality = Nationality.size();
//        if (sizeOfnationality > 4 ){
//            Select selectSA = new Select($(By.xpath("//*[@id=\"student.Race\"]")));
//            selectSA.selectByVisibleText("South African");
        }

    public void enter_SA_IDnum(){

        $(By.xpath("//input[@name='student.IdNum']")).sendKeys(bspdata.bsp_IDnumber());

    }

    public void Enter_Username(){
        $(By.xpath("//input[@id='username']")).sendKeys(bspdata.bsp_username());

    }

    public void enter_PrimaryEmail(){
        $(By.xpath("//input[@id='student_PrimaryEmail']")).sendKeys(bspdata.bsp_PrimaryEmail());
    }
    public void enter_SecondaryEmail(){
        $(By.xpath("//input[@id='student_SecondaryEmail']")).sendKeys(bspdata.bsp_SecondaryEmail());
    }
    public void enter_password(){
        $(By.xpath("//input[@id=\"password\"]")).sendKeys(bspdata.bsp_Password());
    }
    public void enter_ConfirmPassword(){
        $(By.xpath("//input[@id=\"confirmPassword\"]")).sendKeys(bspdata.bsp_ConfirmPassword());
    }


    public void enter_Town_Or_City (){
        $(By.xpath("//input[@id=\"student_TownCity\"]")).sendKeys(bspdata.bsp_Town_or_City());
    }
    public void Select_Province (){
        Select selectProvince = new Select($(By.xpath("//select[@name=\"student.HomeProvince\"]")));
        selectProvince.selectByIndex(2);
}

    public void enter_Municipality (){
        $(By.xpath("//input[@name=\"student.Municipality\"]")).sendKeys(bspdata.bsp_Municipality());
    }
     public void enter_ward_number(){
        $(By.xpath("//input[@id='student_WardNumber']")).sendKeys(bspdata.bsp_Ward_Number());
}
     public void enter_religion(){
        $(By.xpath("//input[@name=\"student.Religion\"]")).sendKeys(bspdata.bsp_Religion());
}

public void select_Tshirt(){
        Select selectTshirt = new Select($(By.xpath("//select[@name=\"student.Tshirt\"]")));
        selectTshirt.selectByIndex(2);
}
public void enter_dietary(){
        $(By.xpath("//input[@name=\"student.Dietary\"]")).sendKeys(bspdata.bsp_Dietary());
}

public void select_HomeLangugae(){
        Select HomeLanguage = new Select($(By.xpath("//select[@name=\"student.HomeLang\"]")));
        HomeLanguage.selectByIndex(2);
}
public void select_OtherLanguage(){
        Select OtherLanguage = new Select($(By.xpath("//select[@name=\"student.OtherLang\"]")));
        OtherLanguage.selectByIndex(3);
}

public void enter_primaryContact_number(){
        $(By.xpath("//input[@id=\"student_PriContact\"]")).sendKeys(bspdata.bsp_Primary_Contact_Number());
}

public void enter_SecondaryContact_number(){
        $(By.xpath("//input[@id=\"student_SecContact\"]")).sendKeys(bspdata.bsp_Secondary_Contact_Number());
}

public void Register_StudentButton(){
    Boolean registerButtonEnabled = $(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/div/button")).isEnabled();
    System.out.println(registerButtonEnabled);
    $(By.xpath("/html/body/div[3]/div/div/div[2]/form/div/div/button")).click();
}

}
