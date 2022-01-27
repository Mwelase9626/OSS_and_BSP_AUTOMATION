package Pages.BSP;

import BSP_Implementation.RegistrationPage;
import net.thucydides.core.annotations.Step;

public class BSP_RegistrationPage {

    RegistrationPage registrationPage;

    @Step("Select the Gender")
    public void SelectGender(){ registrationPage.select_gender_Male();}

   @Step("Enter the students name")
    public void Enter_Name(){registrationPage.enter_Name(); }

    @Step("Enter the students surname")
    public void Enter_Surname(){registrationPage.enter_Surname();}

    @Step("Select Race")
    public void select_students_race(){registrationPage.select_race(); }

    @Step("Select Nationality")
    public void select_students_Nationality(){registrationPage.Select_Nationality();}

    @Step("enter SA ID Number")
    public void Enter_ID_Number(){registrationPage.enter_SA_IDnum();}

    @Step("Enter username")
    public void Enter_students_username(){registrationPage.Enter_Username();}

    @Step("Enter Primary Email")
    public void Enter_students_PrimaryEmail(){registrationPage.enter_PrimaryEmail();}

    @Step("Enter secondary email")
    public void enter_students_secondaryEmail(){registrationPage.enter_SecondaryEmail();}

    @Step("Enter Password")
    public void Enter_Password(){registrationPage.enter_password();}

    @Step("Confirm Password")
    public void Confirm_Password(){registrationPage.enter_ConfirmPassword();}

    @Step("Enter primary contact number ")
    public void enter_Primary_Contact_Number(){registrationPage.enter_primaryContact_number();}

    @Step("Enter Secondary Contact Number")
    public void enter_secondary_Contact_Number(){registrationPage.enter_SecondaryContact_number();}

    @Step("Enter town or City")
    public void Enter_Town_or_City(){registrationPage.enter_Town_Or_City();}

    @Step("Select province")
    public void select_province(){registrationPage.Select_Province();}

    @Step("Enter municipality")
    public void enter_municipality(){registrationPage.enter_Municipality();}

    @Step("enter ward number")
    public void enter_ward_number(){registrationPage.enter_ward_number();}

    @Step("Enter religion")
    public void enter_religion(){registrationPage.enter_religion();}

    @Step("Select Tshirt size")
    public void select_Tshirt_size(){registrationPage.select_Tshirt();}


    @Step("enter dietary")
    public void enter_dietary(){registrationPage.enter_dietary();}

    @Step("Select Home language")
    public void select_Home_langugage(){registrationPage.select_HomeLangugae();}

    @Step("Select other language")
    public void select_other_language(){registrationPage.select_OtherLanguage();}

@Step("click register button")
 public void click_register(){
     registrationPage.Register_StudentButton();
}















}
