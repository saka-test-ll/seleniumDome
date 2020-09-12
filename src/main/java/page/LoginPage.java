package page;

import Base.BasePage;
import Base.DriverBase;
import Utils.GetByLocator;
import org.openqa.selenium.WebElement;

/**
 *  元素层
 */
public class LoginPage extends BasePage {
    /**
     *  构造方法
     * @param driver
     */
    public LoginPage(DriverBase driver){
        super(driver);
    }

    /**
     *  获取用户名输入框Element
     */
    public WebElement getUsernameElement(){
        return element(GetByLocator.getLocator("userNameKey"));
    }

    /**
     *  获取密码输入框Element
     */
    public WebElement getPasswordElement(){
        return element(GetByLocator.getLocator("passWordKey"));
    }

    /**
     *  获取登录界面登录按钮Element
     */
    public WebElement getLoginButtonElement(){
        return element(GetByLocator.getLocator("loginButtonKey"));
    }
}
