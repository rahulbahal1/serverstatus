package myngconnect_server_status.qa3;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;


import com.compro.automation.utils.CSVHandler;

public class Home {
		CSVHandler login_details = null;
        public void login(RemoteWebDriver driver) throws Exception {
            String baseurl = "http://qa3.myngconnect.com/";
            synchronized (driver){driver.wait(5000);}
            driver.get(baseurl + "/login/teacher/login.spr");
    	    driver.findElement(By.id("j_username")).clear();
    		driver.findElement(By.id("j_username")).sendKeys("testteacher1@wcg.com");
    		driver.findElement(By.id("passwordField")).clear();
    	    driver.findElement(By.id("passwordField")).sendKeys("PASSWORD");
    	    driver.findElement(By.id("imgLogin")).click();
 }
}
