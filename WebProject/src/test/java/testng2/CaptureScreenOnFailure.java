package testng2;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

public class CaptureScreenOnFailure extends LaunchDriver{
public void getScreenshot() throws IOException {
	Date CurrentDate = new Date();
	String CapScreen = CurrentDate.toString().replace(" ", "-").replace(":", "-");
	File ScreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ScreenshotFile, new File("C://Screenshots/"+CapScreen+".png"));
}
}
	


