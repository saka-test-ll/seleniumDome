package page;

import Base.BasePage;
import Base.DriverBase;
import Utils.GetByLocator;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CoursePage extends BasePage {

    /**
     * 构造方法
     */
    public CoursePage(DriverBase driver) {
        super(driver);
    }

    /**
     *  获取实战课程最外层Element
     */
    public WebElement getCoursesAll(){
        return element(GetByLocator.getLocator("coursesAllKey"));
    }

    /**
     *  获取实战课程的Element
     */
    public List<WebElement> getCoursesList(){
        return this.getCoursesAll().findElements(GetByLocator.getLocator("coursesListKey"));
    }

    /**
     *  获取课程简介的Element
     */
    public List<String> getCourseIntroduction(){
        List<String> stringList = new ArrayList<String>();
        for(WebElement el:this.getCoursesList()){
            stringList.add(getText(el.findElement(GetByLocator.getLocator("courseintroductionKey"))));
        }
        return stringList;
    }

    /**
     *  获取课程标题Element
     */
    public WebElement getCourseTitleElement(){
        return nodeElement(GetByLocator.getLocator("courseInfoKey"), GetByLocator.getLocator("courseInfoTextKey"));
    }

    /**
     *  获取课程折扣价格Element
     */
    public WebElement getCourseSalePriceElement(){
        try{
            return element(GetByLocator.getLocator("courseSalePriceKey"));
        }catch (Exception e){
            return null;
        }
    }

    /**
     *  获取课程原价价格Element
     */
    public WebElement getCourseOriPriceElement(){
        return element(GetByLocator.getLocator("courseOriPriceKey"));
    }

    /**
     *  获取购物车图标Element
     */
    public WebElement getShopCartElement(){
        return element(GetByLocator.getLocator("shopCartKey"));
    }

    /**
     *  获取购物车中物品数量Element
     */
    public WebElement getShopCartNumElement(){
        return element(GetByLocator.getLocator("cartNumKey"));
    }

    /**
     *  获取立即购买按钮Element
     */
    public WebElement getCourseBuyNowButtonElement(){
        return element(GetByLocator.getLocator("courseBuyNowKey"));
    }

    /**
     *  获取添加购物车按钮Element
     */
    public WebElement getAddShopCartButtonElement(){
        return element(GetByLocator.getLocator("courseAddcartKey"));
    }

    /**
     *  获取已添加购物车模态框继续逛逛Element
     */
    public WebElement readyBuySureElement(){
        return element(GetByLocator.getLocator("readyBuySureKey"));
    }

    /**
     *  获取已添加购物车模态框去购物车结算Element
     */
    public WebElement readyBuyOrderElement(){
        return element(GetByLocator.getLocator("readyBuyOrderKey"));
    }

    /**
     *  获取模态框Element
     */
    public WebElement modelDialogElement(){
        try {
            return element(GetByLocator.getLocator("modelDialogKey"));
        }catch (Exception e){
            return null;
        }
    }
}
