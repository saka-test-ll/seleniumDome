package page;

import Base.BasePage;
import Base.DriverBase;
import Utils.GetByLocator;
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
    public WebElement getDengluElement(){
        return element(GetByLocator.getLocator("dengLuButtonKey"));
    }

    /**
     *  获取课程实战Element
     */
    public WebElement getCourseCombatElement(){
        return element(GetByLocator.getLocator("courseCombatKey"));
    }

    /**
     *  获取个人中心头像图标Element
     */
    public WebElement getHeaderElement(){
        return element(GetByLocator.getLocator("headerKey"));
    }

    /**
     *  获取个人中心用户昵称Element
     */
    public WebElement getNicknameElement(){
        return element(GetByLocator.getLocator("loginInfoKey"));
    }
}
