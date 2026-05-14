package reportGen2ReportNG;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class ScreenShotClass extends BaseClass{

	
	public void captureScreen() throws IOException, InterruptedException {
		
		Date CurrentDate = new Date();
		System.out.println(CurrentDate);
		String ScreenshotName = CurrentDate.toString().replace(" ", "-").replace(":", "_");
		//Take Screenshot
		File ScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		//Store Screenshots in a file
		FileUtils.copyFile(ScreenshotFile,new File("C://Screenshots/"+ScreenshotName+".png"));
		
		driver.quit();
}
}
