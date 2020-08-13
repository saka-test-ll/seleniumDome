package busession;

import Base.DriverBase;
import handle.SureOrderHandle;

public class SureOrderBusession {

    public DriverBase driver;
    public SureOrderHandle sureOrderHandle;

    public SureOrderBusession(DriverBase driver){
        this.driver = driver;
        sureOrderHandle = new SureOrderHandle(driver);
    }

    /**
     *  确认订单流程
     */
    public void sureOrderPro(String course){
        double coursePrice = Double.parseDouble(course.split(",")[1]);
        double courseOrderPrice = Double.parseDouble(sureOrderHandle.courseOrderPrice());
        if(coursePrice == courseOrderPrice){
            sureOrderHandle.clickOrderButton();
        }else{
            System.out.println(sureOrderHandle+"购买价格不一致");
        }
    }

}
