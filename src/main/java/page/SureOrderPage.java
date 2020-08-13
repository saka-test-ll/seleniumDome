package page;

import Base.BasePage;
import Base.DriverBase;
import Utils.GetByLocator;
import org.openqa.selenium.WebElement;

public class SureOrderPage extends BasePage {

    public SureOrderPage(DriverBase driver){
        super(driver);
    }

    /**
     *  获取确认订单界面课程价格Element
     */
    public WebElement getCourseOrderPriceElement(){
        return element(GetByLocator.getLocator("courseOrderPriceKey"));
    }

    /**
     *  获取确认订单界面提交订单按钮Element
     */
    public WebElement getSureOrderButtonElement(){
        return element(GetByLocator.getLocator("sureOrderKey"));
    }
}
