package excel.utils.convertor;

import jxl.Cell;
import jxl.CellFeatures;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;


/**
 * jExcelApi
 * 下载地址: https://sourceforge.net/projects/jexcelapi/files/
 */
public class ExcelUtils {
    public static void createXls(){

    }

    public static void open() throws IOException, BiffException {
        File file = new File("C:\\Users\\Administrator\\Desktop\\test.xls");
        Workbook workbook = Workbook.getWorkbook(file);
        Sheet sheet = workbook.getSheet(0);
        Cell cell = sheet.getCell(0, 1);
        CellFeatures cellFeatures = cell.getCellFeatures();
        System.out.println(cell.getContents());
    }

    public static void main(String[] args) throws IOException, BiffException {
        open();
    }
}
