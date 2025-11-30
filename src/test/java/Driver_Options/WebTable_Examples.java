package Driver_Options;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class WebTable_Examples {

    public static void main(String[] args) throws IOException {

        ChromeDriver driver=new ChromeDriver();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("FrameData");
        int rowCount = 0;
        List<WebElement> row = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));

        System.out.println(row.size());

        for (int i = 1; i < row.size(); i++) {
            List<WebElement> cell = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td"));
            Row excelRow = sheet.createRow(rowCount++);
            String countryName = cell.get(0).getText();
            for (int j = 1; j < cell.size(); j++) {

           String text=   driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td["+j+"]")).getText();
                System.out.print(text+"|");
                excelRow.createCell(j - 1).setCellValue(text);
            }
            System.out.println("");
            if (countryName.equalsIgnoreCase("Austria")) {
                // Assuming checkbox is in the last column
                WebElement checkbox = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[" + i + "]/td[last()]/input[@type='checkbox']"));
                if (!checkbox.isSelected()) {
                    checkbox.click();
                    System.out.println("Checkbox clicked for Austria");
                }
            }
        }

        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Admin\\Desktop\\WebTableData.xlsx");
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();
        //driver.quit();
        System.out.println("Excel file created successfully!");

    }
}
