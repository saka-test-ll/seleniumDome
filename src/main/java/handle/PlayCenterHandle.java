package handle;

import Base.DriverBase;
import page.PlayCenterPage;

public class PlayCenterHandle {

    public DriverBase driver;
    public PlayCenterPage playCenterPage;

    public PlayCenterHandle(DriverBase driver){
        this.driver = driver;
        playCenterPage = new PlayCenterPage(driver);
    }

    /**
     *  获取支付订单界面订单
     */
    public String order(){
        return playCenterPage.getText(playCenterPage.getOrderElement());
    }

    /**
     *  获取支付订单界面课程标题
     */
    public String orderCourseTitle(){
        return playCenterPage.getText(playCenterPage.getOrderCourseTitleElement());
    }

    /**
     *  点击支付订单界面立即支付按钮
     */
    public void orderPlayButton(){
        playCenterPage.click(playCenterPage.getOrderPlayButtonElement());
    }

}
