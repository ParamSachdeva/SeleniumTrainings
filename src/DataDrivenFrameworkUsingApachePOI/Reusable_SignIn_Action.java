package DataDrivenFrameworkUsingApachePOI;

        import org.openqa.selenium.WebDriver;

      
    // Now this method does not need any arguments

    public class Reusable_SignIn_Action {

		public static void Login(WebDriver driver) throws Exception{

			//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
			String sUserName = ExcelUtils.getCellData(2, 4);
			String sPassword = ExcelUtils.getCellData(3, 4);			
			LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);
			LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
			LogIn_Page.btn_LogIn(driver).click();
			
        }

}