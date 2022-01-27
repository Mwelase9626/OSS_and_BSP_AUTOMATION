package Excel_Files;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BSP_Registration_data {
    public static XSSFWorkbook BSP_workbook_test_data;
    public static XSSFSheet sheet_test_data;



        public String bsp_name(){

            try {

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);

                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getRawValue();
                    XSSFCell Name;
                    if (status == null) {
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

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);
                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getStringCellValue();
                    XSSFCell Surname;
                    if (status == null) {
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

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);
                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getStringCellValue();
                    XSSFCell IDnumber;
                    if (status == null) {
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

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);
                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getStringCellValue();
                    XSSFCell username;
                    if (status == null) {
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

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);
                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getStringCellValue();
                    XSSFCell primaryEmail;
                    if (status == null) {
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

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);
                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getStringCellValue();
                    XSSFCell SecondaryEmail;
                    if (status == null) {
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

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);
                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getStringCellValue();
                    XSSFCell Password;
                    if (status == null) {
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

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);
                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getStringCellValue();
                    XSSFCell ConfirmPassword;
                    if (status == null) {
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

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);
                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getStringCellValue();
                    XSSFCell PrimaryContactNumber;
                    if (status == null) {
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

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);
                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getStringCellValue();
                    XSSFCell SecondaryContactNumber;
                    if (status == null) {
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

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);
                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getStringCellValue();
                    XSSFCell bsp_Town_or_City;
                    if (status == null) {
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

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);
                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getStringCellValue();
                    XSSFCell bsp_Municipality;
                    if (status == null) {
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

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);
                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getStringCellValue();
                    XSSFCell bsp_Ward_Number;
                    if (status == null) {
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

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);
                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getStringCellValue();
                    XSSFCell bsp_Religion;
                    if (status == null) {
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

                String document_path = "C:\\Users\\madoda\\Music\\BSP_Student_Profile_ datas.xlsx";

                FileInputStream fs = new FileInputStream(document_path);
                XSSFWorkbook  BSP_workbook_test_data = new XSSFWorkbook(fs);
                XSSFSheet sheetname = BSP_workbook_test_data .getSheet("Registration_Data");
                int lastrow = sheetname.getLastRowNum();

                for (int i = 1; i <= lastrow; i++) {
                    XSSFRow row = sheetname.getRow(i);
                    XSSFCell status = row.getCell(15);
//                    String Status_Value = status.getStringCellValue();
                    XSSFCell bsp_Dietary;
                    if (status == null) {
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


