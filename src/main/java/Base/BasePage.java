package Base;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import testCase.LoginCase;

/**
 *  封装页面可能用到的操作方法
 */
public class BasePage {

    public Base.DriverBase driver;
    static Logger logger;

    /**
     *  构造方法
     * @param driver
     */
    public BasePage(Base.DriverBase driver){
        this.driver = driver;
        logger = Logger.getLogger(LoginCase.class);
    }

    /**
     *  封装定位element
     */
    public WebElement element(By by){
        WebElement element = driver.findElement(by);
        Assert.assertNotNull(element,"未定位到"+ by + "元素");
        if(element != null){
            return element;
        }else {
            logger.error("未定位到"+ by + "元素");
            return null;
        }
    }

    /**
     *  层级定位，通过父节点定位到子节点
     *  需要传入父节点和子节点的by
     */
    public WebElement nodeElement(By by,By nodeby){
        WebElement el = this.element(by);
        Assert.assertNotNull(el,"未定位到"+ by + "元素");
        if(el != null){
            WebElement nodebyElement = el.findElement(nodeby);
            Assert.assertNotNull(nodebyElement,"未定位到"+ nodeby + "元素");
            if(nodebyElement != null){
                return nodebyElement;
            }else {
                return null;
            }
        }else {
            logger.error("未定位到"+ by + "元素");
            return null;
        }
    }

    /**
     * 封装点击事件
     */
    public void click(WebElement element){
        if(element != null){
            element.click();
        }else{
            System.out.println("你要点击的元素不存在，点击失败");
        }
    }

    /**
     *  封装输入
     */
    public void sendKeys(WebElement element,String value){
        if(element != null){
            element.sendKeys(value);
        }else{
            System.out.println("元素没有定位到，输入" + value + "失败");
        }
    }

    /**
     *  封装判断元素是否存在
     */
    public boolean assertElementIs(WebElement element){
            return  element.isDisplayed();
    }

    /**
     *   封装鼠标悬停操作
     */
    public void moveToElement(WebElement element){
        driver.getActions().moveToElement(element).perform();
    }

    /**
     *  封装获取文本信息
     */
    public String getText(WebElement element){
        if(element != null){
            return element.getText();
        }else{
            System.out.println("你要获取文本的元素不存在，获取失败");
            return null;
        }
    }


}
