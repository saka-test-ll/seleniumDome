package src.java.Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.Set;

/**
 *  产生driver对象
 */
public class DriverBase {
    public WebDriver driver;
    public DriverBase(String browser){
        SelectDriver selectDriver = new SelectDriver();
        this.driver = selectDriver.driverName(browser);
    }

    /**
     *  将常用的方法进行封装
     *  封装stop方法，关闭浏览器
     */
    public void stop(){
        driver.close();
    }

    /**
     *  封装element方法
     */
    public WebElement findElement(By by){
        WebElement element = driver.findElement(by);
        return element;
    }

    /**
     *  封装get方法
     */
    public void getUrl(String url){
        driver.get(url);
    }

    /**
     *  封装窗口最大化
     */
    public void windowMax(){
        driver.manage().window().maximize();
    }

    /**
     *  封装实例化Actions函数
     */
    public Actions getActions(){
        Actions actions = new Actions(driver);
        return actions;
    }

    /**
     *  封装返回方法
     */
    public void back(){
        driver.navigate().back();
    }

    /**
     *  模态框切换
     */
    public void switchToMode(){
        driver.switchTo().activeElement();
    }

    /**
     *  获取cookie
     */
    public Set<Cookie> getCookie(){
        Set<Cookie> cookies = driver.manage().getCookies();
        return cookies;
    }

    /**
     *  删除cookie
     */
    public void deleteCookie(){
        driver.manage().deleteAllCookies();
    }

    /**
     *  设置cookie
     */
    public void setCookie(Cookie cookie){
        driver.manage().addCookie(cookie);
    }

    /**
     *  封装截图方法
     */
    public void takeScreenShot(){
        //获取时间戳
        long date = System.currentTimeMillis();
        String path = String.valueOf(date);
        //获取系统当前地址
        //String curPath = System.getProperty("user.dir");
        path = path + ".png";
        File dir = new File(".//test-output//snapshot");
        if (!dir.exists()){
            dir.mkdirs();
        }
        String screenPath = dir.getAbsolutePath() + "/" + path;
        //String screenPath = curPath + "/" + path;
        //截图
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screen,new File(screenPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
