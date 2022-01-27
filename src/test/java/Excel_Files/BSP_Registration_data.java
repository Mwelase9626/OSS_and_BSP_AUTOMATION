package Excel_Files;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BSP_Registration_data  {
public static XSSFWorkbook BSP_workbook_test_data;
public static XSSFSheet sheet_test_data;

       public String bsp_name() {

           try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell Name = null;
                    if (Status_Value.equals("")) {
                    Name = row.getCell(0);
//                    XSSFCell create_status = row.createCell(15);
//                    create_status.setCellValue("used");
//
//                    FileOutputStream fos = new FileOutputStream(document_path);
//                    BSP_workbook_test_data.write(fos);
                    return Name.getStringCellValue();


                    }
            }

} catch (IOException e) {
            e.printStackTrace();
        }
           return null;
       }

    public String surname() {

        try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell Surname = null;
                if (Status_Value.equals("")) {
                    Surname = row.getCell(1);
//                    XSSFCell create_status = row.createCell(15);
//                    create_status.setCellValue("used");
//
//                    FileOutputStream fos = new FileOutputStream(document_path);
//                    BSP_workbook_test_data.write(fos);
                    return Surname.getStringCellValue();


                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String bsp_IDnumber() {

        try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell IDnumber = null;
                if (Status_Value.equals("")) {
                    IDnumber = row.getCell(2);
//                    XSSFCell create_status = row.createCell(15);
//                    create_status.setCellValue("used");
//
//                    FileOutputStream fos = new FileOutputStream(document_path);
//                    BSP_workbook_test_data.write(fos);
                    return IDnumber.getStringCellValue();


                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String bsp_username() {

        try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell username = null;
                if (Status_Value.equals("")) {
                    username = row.getCell(3);


//                    XSSFCell create_status = row.createCell(15);
//                    create_status.setCellValue("used");
//

//                    FileOutputStream fos = new FileOutputStream(document_path);
//                    BSP_workbook_test_data.write(fos);
                    return username.getStringCellValue();


                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String bsp_PrimaryEmail() {

        try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell primaryEmail = null;
                if (Status_Value.equals("")) {
                    primaryEmail = row.getCell(4);

//                    XSSFCell create_status = row.createCell(15);
//                    create_status.setCellValue("used");
//
//                    FileOutputStream fos = new FileOutputStream(document_path);
//                    BSP_workbook_test_data.write(fos);
                    return primaryEmail.getStringCellValue();


                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    public String bsp_SecondaryEmail() {

        try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell SecondaryEmail = null;
                if (Status_Value.equals("")) {
                    SecondaryEmail = row.getCell(5);
//                    XSSFCell create_status = row.createCell(15);
//                    create_status.setCellValue("used");
//
//                    FileOutputStream fos = new FileOutputStream(document_path);
//                    BSP_workbook_test_data.write(fos);
                    return SecondaryEmail.getStringCellValue();


                }



            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
    public String bsp_Password() {

        try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell Password = null;
                if (Status_Value.equals("")) {
                    Password = row.getCell(6);
//                    XSSFCell create_status = row.createCell(15);
//                    create_status.setCellValue("used");
//
//                    FileOutputStream fos = new FileOutputStream(document_path);
//                    BSP_workbook_test_data.write(fos);
                    return Password.getStringCellValue();


                }



            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    public String bsp_ConfirmPassword() {

        try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell ConfirmPassword = null;
                if (Status_Value.equals("")) {
                    ConfirmPassword = row.getCell(7);
//                    XSSFCell create_status = row.createCell(15);
//                    create_status.setCellValue("used");
//
//                    FileOutputStream fos = new FileOutputStream(document_path);
//                    BSP_workbook_test_data.write(fos);
                    return ConfirmPassword.getStringCellValue();


                }



            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
    public String bsp_Primary_Contact_Number() {

        try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell PrimaryContactNumber = null;
                if (Status_Value.equals("")) {
                    PrimaryContactNumber = row.getCell(8);
//                    XSSFCell create_status = row.createCell(15);
//                    create_status.setCellValue("used");
//
//                    FileOutputStream fos = new FileOutputStream(document_path);
//                    BSP_workbook_test_data.write(fos);
                    return PrimaryContactNumber.getStringCellValue();


                }



            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    public String bsp_Secondary_Contact_Number() {

        try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell SecondaryContactNumber = null;
                if (Status_Value.equals("")) {
                    SecondaryContactNumber = row.getCell(9);
//                    XSSFCell create_status = row.createCell(15);
//                    create_status.setCellValue("used");
//
//                    FileOutputStream fos = new FileOutputStream(document_path);
//                    BSP_workbook_test_data.write(fos);
                    return SecondaryContactNumber.getStringCellValue();


                }



            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
    public String bsp_Town_or_City() {

        try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell bsp_Town_or_City = null;
                if (Status_Value.equals("")) {
                    bsp_Town_or_City = row.getCell(10);
//                    XSSFCell create_status = row.createCell(15);
//                    create_status.setCellValue("used");
//
//                    FileOutputStream fos = new FileOutputStream(document_path);
//                    BSP_workbook_test_data.write(fos);
                    return bsp_Town_or_City.getStringCellValue();


                }



            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
    public String bsp_Municipality() {

        try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell bsp_Municipality = null;
                if (Status_Value.equals("")) {
                    bsp_Municipality = row.getCell(11);
//                    XSSFCell create_status = row.createCell(15);
//                    create_status.setCellValue("used");
//
//                    FileOutputStream fos = new FileOutputStream(document_path);
//                    BSP_workbook_test_data.write(fos);
                    return bsp_Municipality.getStringCellValue();


                }



            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
    public String bsp_Ward_Number() {

        try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell bsp_Ward_Number = null;
                if (Status_Value.equals("")) {
                    bsp_Ward_Number = row.getCell(12);
//                    XSSFCell create_status = row.createCell(15);
//                    create_status.setCellValue("used");
//
//                    FileOutputStream fos = new FileOutputStream(document_path);
//                    BSP_workbook_test_data.write(fos);
                    return bsp_Ward_Number.getStringCellValue();


                }



            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    public String bsp_Religion() {

        try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell bsp_Religion = null;
                if (Status_Value.equals("")) {
                    bsp_Religion = row.getCell(13);
                    XSSFCell create_status = row.createCell(15);
//                    create_status.setCellValue("used");
//
//                    FileOutputStream fos = new FileOutputStream(document_path);
//                    BSP_workbook_test_data.write(fos);
                    return bsp_Religion.getStringCellValue();


                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
    public String bsp_Dietary() {

        try {

            String document_path = "C:\\Users\\madoda\\OneDrive - FUNDI\\BSP_Student_Profile_ data..xlsx";

            FileInputStream fs = new FileInputStream(document_path);
            XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
            XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
            int lastrow = sheetname.getLastRowNum();

            for (int i = 1; i <= lastrow; i++) {
                XSSFRow row = sheetname.getRow(i);
                XSSFCell status = row.getCell(15);
                String Status_Value = status.getStringCellValue();
                XSSFCell bsp_Dietary = null;
                if (Status_Value.equals("")) {
                    bsp_Dietary = row.getCell(14);
                    XSSFCell create_status = row.createCell(15);
                    create_status.setCellValue("used");

                    FileOutputStream fos = new FileOutputStream(document_path);
                    BSP_workbook_test_data.write(fos);
                    return bsp_Dietary.getStringCellValue();


                }



            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}





