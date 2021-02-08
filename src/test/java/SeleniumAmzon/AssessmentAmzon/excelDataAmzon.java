package SeleniumAmzon.AssessmentAmzon;

import java.io.IOException;

import utilities.ExcelData;

public class excelDataAmzon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		ExcelData excel = new ExcelData(projectPath+ "/excel/data.xlsx", "Sheet1");
		//excel.getRowCount();
		//excel.getCellDataString(0,2);
		excel.getCellDataString(1,2);
		//excel.getCellDataNumber(1,0);
		//excel.getCellDataNumber(1,1);
	}

}
