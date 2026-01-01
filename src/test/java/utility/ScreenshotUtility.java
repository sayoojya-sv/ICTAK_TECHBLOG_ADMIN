package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	
	public static void capture(WebDriver driver, String testName) throws IOException  {

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
        File dest = new File("C:\\Users\\sayoojya\\OneDrive\\Desktop\\SDETCourse\\ICTAK_TECH_ADMIN_PROJECT\\ICTAK_TECHBLOG_ADMIN\\target\\screenshots" + testName + "_" + timestamp + ".png");
        FileUtils.copyFile(src, dest);
        
    }

}
