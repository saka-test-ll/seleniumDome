package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *  根据用户输入创建不同浏览器的driver对象
 */
public class SelectDriver {

    public WebDriver driverName(String browser){

        if(browser.equalsIgnoreCase("fireFox")){
            System.setProperty("webdriver.fireFox.marionette","");
            return new FirefoxDriver();
        }else {
            System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
            return new ChromeDriver();
        }

    }

}
