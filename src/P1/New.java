package P1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class New {
@Test
void launch()
{

//		URL url =new URL("http://localhost:4444/wd/hub");
//		DesiredCapabilities dc = DesiredCapabilities.chrome();
//		dc.setBrowserName("chrome");
//		WebDriver driver = new RemoteWebDriver(url, dc);
//		driver.get("http://google.com");
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/c.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
	
//	} catch (MalformedURLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
}
	
}
