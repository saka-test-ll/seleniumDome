package testCase;

import Base.DriverBase;
import Utils.HandleCookie;
import busession.CourseBusession;
import busession.PlayCenterBusession;
import busession.SureOrderBusession;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testCourseList extends CaseBase{
    public DriverBase driver;
    public CourseBusession courseBusession;
    public SureOrderBusession sureOrderBusession;
    public PlayCenterBusession playCenterBusession;
    public HandleCookie handleCookie;

    /**
     *  进入网页并窗口最大化
     */
    @BeforeClass
    public void CourseHome(){
        this.driver = InitDriver("chrowe");
        courseBusession = new CourseBusession(driver);
        sureOrderBusession = new SureOrderBusession(driver);
        playCenterBusession = new PlayCenterBusession(driver);
        handleCookie = new HandleCookie(driver);
        driver.getUrl("https://coding.imooc.com/");
        handleCookie.setCookie();
        driver.getUrl("https://coding.imooc.com/");
        driver.windowMax();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void afterClass(){
        driver.stop();
    }

    /**
     *  添加购物车流程
     */
    @Test
    public void addShopCart(){
        courseBusession.addShopCartPro();
    }

    /**
     *  测试立即购买提交订单流程
     */
    @Test
    public void orderBuyNowPro(){
        String course = courseBusession.courseBugPlayPro();
        sureOrderBusession.sureOrderPro(course);
        playCenterBusession.playCenterPro(course);
    }

    /**
     *  遍历所有课程
     */
    public void CourseList(){
        courseBusession.courseList();
        driver.stop();
    }
}
