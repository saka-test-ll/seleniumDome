package busession;

import Base.DriverBase;
import handle.CourseHandle;

import java.util.List;

public class CourseBusession {
    public DriverBase driver;
    public CourseHandle courseHandle;

    /**
     *  构造方法
     */
    public CourseBusession(DriverBase driver){
        this.driver = driver;
        courseHandle = new CourseHandle(driver);
    }

    /**
     *  获取所有课程
     */
    public void courseList(){
        courseHandle.courseIntroduction();
    }

    /**
     *  立即购买提交订单流程
     */
    public String courseBugPlayPro(){
        courseHandle.courseRandom();
        String courseTitle = courseHandle.courseTitle();
        String coursePrice = courseHandle.coursePrice();
        courseHandle.clickBuyNowButton();
        String course = courseTitle +","+ coursePrice;
        return course;
    }

    /**
     *  添加购物车流程
     */
    public void addShopCartPro(){
        int beforeNum = 0;
        int afterNum;
        courseHandle.courseRandom();
        String courseNum = courseHandle.shopCartNum();
        try{
            beforeNum = Integer.valueOf(courseNum);
        }catch (Exception e){
            beforeNum = 0;
        }
        if(courseHandle.assertAddShopCart()){
            courseHandle.clickAddShopCartButton();
            if(courseHandle.assertModelDialog()){
                driver.switchToMode();
                courseHandle.clickReadyBuySure();
                System.out.println(courseHandle.courseTitle()+"课程已添加入购物车");
            }
            try{
                afterNum = Integer.parseInt(courseHandle.shopCartNum());
            }catch (Exception e){
                afterNum = beforeNum;
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(afterNum == beforeNum+1){
                System.out.println(courseHandle.courseTitle()+"课程添加购物车成功");
                courseHandle.clickShopCartButton();
            }else if(afterNum>0){
                courseHandle.clickShopCartButton();
            }else{
                System.out.println(courseHandle.courseTitle()+"课程添加购物车失败,购物车数据不正常");
            }
        }else{
            System.out.println(courseHandle.courseTitle()+"课程不能添加购物车");
            driver.back();
            addShopCartPro();
        }
    }

}
