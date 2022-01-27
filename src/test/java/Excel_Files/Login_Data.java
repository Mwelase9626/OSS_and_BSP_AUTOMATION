package Excel_Files;

import org.apache.bcel.generic.NEW;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Login_Data {

    public static void main(String[] args) throws IOException {

        String document_path = "C:\\Users\\madoda\\Downloads\\BSP_Student_Profile_ datas.xlsx";

    FileInputStream fs =  new FileInputStream(document_path);

        XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
        XSSFSheet REGISTRA = BSP_workbook_test_data.createSheet("data_for_login");
        XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
        int lastrow = sheetname.getLastRowNum();
         int last = REGISTRA.getLastRowNum();
        for (int i = 1; i <= lastrow; i++) {
            try {
                XSSFRow row = sheetname.getRow(i);
                Cell status = row.getCell(15);
                String dd = status.getStringCellValue();
 //               Assert.assertEquals(dd);
                //            String Status_Value = status.getStringCellValue();


            XSSFCell username = null;
            XSSFCell Password = null;
                assert false;
                if (dd.equalsIgnoreCase("used")) {
                username = row.getCell(3);
                Password = row.getCell(6);
                String Username = username.getStringCellValue();

                String Password_Login = Password.getStringCellValue();



                      XSSFSheet loginData =   BSP_workbook_test_data.getSheet("Login_Details");
                      int lastrow_logins = loginData.getLastRowNum();

                        for (int b = 1; b <=lastrow_logins; b++){


                            try{

                            XSSFRow rows_logins = loginData.getRow(b);
                            XSSFCell logins_Created = rows_logins.createCell(2);

                            String status_login = logins_Created.getStringCellValue();
 //                           String status_Value_Logins = status_login.getStringCellValue();
 //                           Assert.assertNull(status_login);

                            if (status_login.equalsIgnoreCase("")) {

                                XSSFCell login_Username = rows_logins.createCell(0);
                                XSSFCell login_Password = rows_logins.createCell(1);


                                login_Username.setCellValue(Username);
                                login_Password.setCellValue(Password_Login);
                                logins_Created.setCellValue("Logins created");

                                FileOutputStream foss = new FileOutputStream(document_path);
                                BSP_workbook_test_data.write(foss);
                            }
                        } catch (IOException e) {
                                e.printStackTrace();
                            }


                        }
            } ;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }}
                      //                      XSSFCell create_status = loginData.getRow(i).
//                    create_status.setCellValue("used");
//




            }




