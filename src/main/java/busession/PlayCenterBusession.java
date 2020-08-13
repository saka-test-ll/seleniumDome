package busession;

import Base.DriverBase;
import handle.PlayCenterHandle;

public class PlayCenterBusession {

    public DriverBase driver;
    public PlayCenterHandle playCenterHandle;

    public PlayCenterBusession(DriverBase driver){
        this.driver = driver;
        playCenterHandle = new PlayCenterHandle(driver);
    }

    /**
     *  支付中心流程
     */
    public void playCenterPro(String course){
        String courseTitle = course.split(",")[0];
        String order = playCenterHandle.order();
        String orderCourseTitle = playCenterHandle.orderCourseTitle();
        if(order.equals("订单：")&&orderCourseTitle.equals(courseTitle)){
            playCenterHandle.orderPlayButton();
        }else{
            System.out.println(courseTitle+"没有订单号或者购买课程不一致");
        }
    }
}
