package base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	
    protected WebDriver driver;
	Properties prop;
	
	public WebDriver getDriver() {
    	return driver;
    }
	
	// Read the config.properties file
	public void readprop() throws IOException {
		FileReader f1=new FileReader("C:\\Users\\sayoojya\\OneDrive\\Desktop\\SDETCourse\\ICTAK_TECH_ADMIN_PROJECT\\ICTAK_TECHBLOG_ADMIN\\src\\test\\resources\\config.properties");
		prop=new Properties();
		prop.load(f1);
	}
	 // Runs before tests to open browser and go to URL
		@BeforeClass
		public void setUp() throws IOException {
			readprop();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(prop.getProperty("url"));
		}
		
		//To quit browser after test
		@AfterClass
		public void tearDown() {
			if(driver!=null) {
				driver.quit();
			}
		}

	}