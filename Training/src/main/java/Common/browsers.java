package Common;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class browsers {
	public static WebDriver driver;
  @BeforeClass
  @Parameters({"url","browser"})
  public void beforeClass(String wbsite, String br) {
			 if(br.equalsIgnoreCase("chrome")){
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\pmg22\\Downloads\\Compressed\\Training-20200223T152233Z-001\\Training\\Drivers\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.navigate().to(wbsite);
			 driver.manage().window().maximize();
		  }else if(br.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver", "C:\\Users\\pmg22\\Downloads\\Compressed\\Training-20200223T152233Z-001\\Training\\Drivers\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  driver.navigate().to(wbsite);
			  driver.manage().window().maximize();
		  }else{
			  System.out.println("Please check name");
		  }
		}
	  
  

  @AfterClass
  public void afterClass() {
  }
  public void screenshots(String Source) throws IOException {
		 
	  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(shots,new File(Source+timestamp()+"screenshot.png"));
			}
  public String timestamp() {
      return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
  }
}
