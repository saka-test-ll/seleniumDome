package page;

import Base.BasePage;
import Base.DriverBase;
import Utils.GetByLocator;
import org.openqa.selenium.WebElement;

public class PlayCenterPage extends BasePage {

    public PlayCenterPage(DriverBase driver){
         super(driver);
    }

    /**
     *  获取支付中心界面订单Element
     */
    public WebElement getOrderElement(){
        return element(GetByLocator.getLocator("courseOrderKey"));
    }

    /**
     *  获取支付中心界面课程标题Element
     */
    public WebElement getOrderCourseTitleElement(){
        return nodeElement(GetByLocator.getLocator("orderCourseKey"), GetByLocator.getLocator("orderCourseNodeKey"));
    }

    /**
     *  获取支付中心立即支付按钮
     */
    public WebElement getOrderPlayButtonElement(){
        return element(GetByLocator.getLocator("orderPlayKey"));
    }
}
