package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import pages.MainPage;
import java.io.*;

public class ExcelUtils {



    public static void writeToExcel(WebElement productNameElement, WebElement productPriceElement, String fileName) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Product Information");

        Row row = sheet.createRow(0);
        Cell cellProductName = row.createCell(0);
        Cell cellProductPrice = row.createCell(1);

        String productName = productNameElement.getText();
        String productPrice = productPriceElement.getText();

        cellProductName.setCellValue(productName);
        cellProductPrice.setCellValue(productPrice);

        try {
            // Kaydedilecek dosya yolu
            String filePath = "src/test/java/resources/" + "urunlistesi.xlsx";
            OutputStream outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Veriler başarıyla Excel dosyasına yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToTextBoxFromExcel() {
        MainPage mainPage = new MainPage(); // MainPage sınıfından bir örnek oluşturulduğunu varsayalım

        try {
            // Excel dosyasını oku
            String filePath = "src/test/java/resources/urunlistesi.xlsx";
            InputStream inputStream = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);

            // Excel dosyasından verileri al ve siteye yaz
            Row row = sheet.getRow(0); // İlk satırı al (başlık satırı değilse düzeltilmelidir)
            String emailValue = row.getCell(0).getStringCellValue(); // 1. sütun (0 indexli)
            String passwordValue = row.getCell(1).getStringCellValue(); // 2. sütun (1 indexli)

            // Eposta ve şifre bilgilerini gerekli alanlara gönder
           mainPage.eposta.sendKeys(emailValue);
            mainPage.password.sendKeys(passwordValue);

            // Değişiklikleri kaydet
            OutputStream outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Excel'den veriler başarıyla siteye yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
