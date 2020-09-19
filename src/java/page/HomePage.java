package src.java.page;

import src.java.Base.BasePage;
import src.java.Base.DriverBase;
import src.java.Utils.GetByLocator;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    /**
     * 构造方法
     *
     * @param driver
     */
    public HomePage(DriverBase driver) {
        super(driver);
    }

    /**
     *  获取主界面登录按钮Element
     */

    public WebElement getLoginUsername(){
        return element(GetByLocator.getLocator("loginUsername"));
    }

}
