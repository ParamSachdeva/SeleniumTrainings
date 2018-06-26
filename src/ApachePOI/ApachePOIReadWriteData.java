package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ApachePOIReadWriteData {

	private static XSSFWorkbook excelWBook;
	private static XSSFSheet excelWSheet;

	public static void main(String[] args) throws Exception {

		//http://mvnrepository.com/artifact/org.apache.poi/poi/3.10-FINAL

		String Path = "E://Project//IIJT//Selenium2.X//Test.xlsx";
		String SheetName = "Testing";
		String CellDataS = null;	

		FileInputStream ExcelFile = new FileInputStream(Path);
		excelWBook = new XSSFWorkbook(ExcelFile);
		excelWSheet = excelWBook.getSheet(SheetName);

		for (int ColNum =0 ; ColNum <=1; ColNum ++){
			for (int RowNum =1 ; RowNum <=6; RowNum ++){
				CellDataS = excelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
				System.out.println(CellDataS);
			}
		}


		XSSFSheet newSheet = excelWBook.createSheet("small student Details");
		int rownum = 0;
		int cellnum = 0;
		Row row = newSheet.createRow(rownum++);

		for (int ColNum =0 ; ColNum <=3; ColNum ++){
			for (int RowNum =1 ; RowNum <=3; RowNum ++){
				Cell cell = row.createCell(cellnum++);
				cell.setCellValue(("XYZ"));				
			}
		}
		
		
		try {
			FileOutputStream out = new FileOutputStream(new File(Path));
			excelWBook.write(out);
			out.close();
			System.out.println("data written successfully on disk.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		
		
		//+++++++++++++++++++ Real Time Scenario+++++++++++++++++++++++++
		/*
		Create a sheet in workbook
		Create a row in sheet
		Add cells in sheet
		Repeat step 3 and 4 to write more data
	 */

		
		
		/*
		// This data needs to be written (Object[])
		Map<String, Object[]> data = new HashMap<String, Object[]>();
		data.put("1", new Object[]{ "ID", "NAME", "LASTNAME" });
		data.put("2", new Object[]{ 1, "Pankaj", "Kumar" });
		data.put("3", new Object[]{ 2, "Prakashni", "Yadav" });
		data.put("4", new Object[]{ 3, "Ayan", "Mondal" });
		data.put("5", new Object[]{ 4, "Virat", "kohli" });



		// Iterate over data and write to sheet
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset) {
			// this creates a new row in the sheet
			Row row = newSheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				// this line creates a cell in the next column of that row
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof String)
					cell.setCellValue((String)obj);
				else if (obj instanceof Integer)
					cell.setCellValue((Integer)obj);
			}
		}
		try {
			FileOutputStream out = new FileOutputStream(new File(Path));
			excelWBook.write(out);
			out.close();
			System.out.println("data written successfully on disk.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		 */
	}
}