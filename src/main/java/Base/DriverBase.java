package Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 *  产生driver对象
 */
public class DriverBase {
    public WebDriver driver;
    public Actions action;
    public DriverBase(String browser){
        SelectDriver selectDriver = new SelectDriver();
        this.driver = selectDriver.driverName(browser);
        action = new Actions(driver);
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

    //封装返回一组element元素方法
    public List<WebElement> findElements(By by){
        List<WebElement> elementList = driver.findElements(by);
        return elementList;
    }

    /**
     *   封装鼠标悬停操作
     */
    public void moveToElement(WebElement element){
        action.moveToElement(element).perform();
    }

    /**
     *  鼠标左键点击事件
     */
    public void leftClickMouse(WebElement element){
        action.click(element).perform();
    }

    //封装鼠标拖拽操作
    public void dragAction(WebElement source,WebElement target){
        action.dragAndDrop(source,target).perform();
    }

    /**
     *  封装切换进入iframe窗口
     */
    public WebDriver findIframeElement(WebElement iframe){
        return driver.switchTo().frame(iframe);
    }

    /**
     *  封装切换退出iframe窗口
     */
    public WebDriver outIframeElement(){
        return driver.switchTo().parentFrame();
    }

    /**
     *  获取当前窗口
     */
    public String getWindowHandle(){
        return driver.getWindowHandle();
    }

    /**
     *  切换windows窗口
     */
    public void switchWindows(String name){
        driver.switchTo().window(name);
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

   //封装浏览器隐式等待
    public void implicitlywait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //封装浏览器刷新当前窗口
    public void refresh(){driver.navigate().refresh();}

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
