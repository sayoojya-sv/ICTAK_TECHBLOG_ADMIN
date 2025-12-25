package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	
	public static void capture(WebDriver driver, String testName) throws IOException  {

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\sayoojya\\OneDrive\\Desktop\\SDETCourse\\ICTAK_TECH_ADMIN_PROJECT\\ICTAK_TECHBLOG_ADMIN\\target\\screenshots" + testName + ".png");
        FileUtils.copyFile(src, dest);
    }

}