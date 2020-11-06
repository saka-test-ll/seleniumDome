package Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

    //先把全部已经打开的窗口的句柄丢到一个集合中，然后取出来当前焦点所在的句柄，从集合中提出当前句柄，然后再切换到下一个句柄就可以了，切换到新Tab页后，就可以用webdriver进行后续的页面操作了
    public void switchWindow() throws NoSuchWindowException,NoSuchWindowException{
        //得到所有窗口的句柄
        Set<String> handles =driver.getWindowHandles();
        //获取当前窗口的句柄
        String currentWindow =driver.getWindowHandle();
        //不包括当前窗口
        handles.remove(currentWindow);
        //判断是否存在窗口
        System.out.println(handles.size());
        if(handles.size()>0){
            try {
                //定位窗口
                driver.switchTo().window((handles.iterator().next()));
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    //封装根据句柄切换到原来窗口的方法
    public void switchOldwindows(){
        //封装切换窗口句柄
        Set<String> winHandels = driver.getWindowHandles(); //得到当前窗口的set集合
        List<String> handle = new ArrayList<String>(winHandels); //将set集合存入list对象
        driver.switchTo().window(handle.get(0)); //切换到原窗口
    }

    //封装通过title切换窗口
    public boolean switchToWindowTitle(String windowTitle){
        boolean flag = false;
        try {
            String currentHandle = driver.getWindowHandle();
            Set<String> handles = driver.getWindowHandles();
            for (String s : handles) {
                if (s.equals(currentHandle))
                    continue;
                else {
                    driver.switchTo().window(s);
                    if (driver.getTitle().contains(windowTitle)) {
                        flag = true;
                        System.out.println("Switch to window: " + windowTitle + " successfully!");
                        break; }
                    else
                        continue;
                }
            }
        } catch (NoSuchWindowException e) {
            System.out.printf("Window:" + windowTitle+ " cound not found!", e.fillInStackTrace());
            flag = false;
        }
        return flag;
    }

    /**
     *  切换windows窗口
     */
    public void switchWindows(String name){
        driver.switchTo().window(name);
    }

    public void switchDefaultWindows(){driver.switchTo().defaultContent();}

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
