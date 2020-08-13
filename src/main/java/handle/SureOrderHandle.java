package handle;

import Base.DriverBase;
import page.SureOrderPage;

public class SureOrderHandle {
    public DriverBase driver;
    public SureOrderPage sureOrderPage;

    public SureOrderHandle(DriverBase driver){
        this.driver = driver;
        sureOrderPage = new SureOrderPage(driver);
    }

    /**
     *  获取确认订单界面课程价格
     */
    public String courseOrderPrice(){
        return sureOrderPage.getText(sureOrderPage.getCourseOrderPriceElement());
    }

    /**
     *  点击确认订单界面提交订单按钮
     */
    public void clickOrderButton(){
        sureOrderPage.click(sureOrderPage.getSureOrderButtonElement());
    }
}
