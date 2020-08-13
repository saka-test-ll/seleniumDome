package handle;

import Base.DriverBase;
import org.openqa.selenium.By;
import page.CoursePage;

import java.util.List;
import java.util.Random;

public class CourseHandle {
    public DriverBase driver;
    public CoursePage coursePage;

    public CourseHandle(DriverBase driver){
        this.driver = driver;
        coursePage = new CoursePage(driver);
    }

    /**
     *  获取所有课程列表
     */
    public List<String> getCoursesList(){
        return coursePage.getCourseIntroduction();
    }

    /**
     *  随机获取某堂课程
     */
    public void courseRandom(){
        List<String> stringList = getCoursesList();
        Random random = new Random();
        coursePage.click(coursePage.element(By.xpath("//*[contains(text(),'"+ stringList.get(random.nextInt(stringList.size())) +"')]")));
    }

    /**
     *  判断课程是否存在添加购物车按钮
     */
    public boolean assertAddShopCart(){
        return coursePage.assertElementIs(coursePage.getAddShopCartButtonElement());
    }

    /**
     *  遍历获得所有课程
     */
    public void courseIntroduction(){
        List<String> stringList = getCoursesList();
        for(int i=0;i<stringList.size();i++){
            coursePage.click(coursePage.element(By.xpath("//*[contains(text(),'"+ stringList.get(i) +"')]")));
            driver.back();
        }
    }

    /**
     *  获取课程标题
     */
    public String courseTitle(){
        return coursePage.getText(coursePage.getCourseTitleElement());
    }

    /**
     *  获取课程价格
     */
    public String coursePrice(){
        if (coursePage.getCourseSalePriceElement() != null) {
            return coursePage.getCourseSalePriceElement().getText().split("￥")[0];
        }else{
            return coursePage.getCourseOriPriceElement().getText().split("￥")[0];
        }
    }

    /**
     *  获取购物车中物品数量
     */
    public String shopCartNum(){
        return coursePage.getText(coursePage.getShopCartNumElement());
    }

    /**
     *  点击添加购物车按钮
     */
    public void clickAddShopCartButton(){
        coursePage.click(coursePage.getAddShopCartButtonElement());
    }

    /**
     *  判断模态框是否存在
     */
    public boolean assertModelDialog(){
        if(coursePage.modelDialogElement() == null){
            return false;
        }else{
            return true;
        }
    }

    /**
     *  点击已添加购物车模态框继续逛逛按钮
     */
    public int clickReadyBuySure(){
        coursePage.click(coursePage.readyBuySureElement());
        //标记点击继续逛逛
        return 0;
    }

    /**
     *  点击已添加购物车模态框去购物车结算按钮
     */
    public int clickReadyBuyOrder(){
        coursePage.click(coursePage.readyBuyOrderElement());
        //标记去购物车结算
        return 1;
    }

    /**
     *  判断是否是已添加购物车
     */
    public boolean assertReadyBuy(){
        return coursePage.assertElementIs(coursePage.readyBuySureElement());
    }

    /**
     *  点击购物车按钮
     */
    public void clickShopCartButton(){
        coursePage.click(coursePage.getShopCartElement());
    }

    /**
     *  单击立即购买
     */
    public void clickBuyNowButton(){
        coursePage.click(coursePage.getCourseBuyNowButtonElement());
    }
}
