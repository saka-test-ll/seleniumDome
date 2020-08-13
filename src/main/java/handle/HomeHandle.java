package handle;

import Base.DriverBase;
import page.HomePage;

public class HomeHandle {

    public DriverBase driver;
    public HomePage homePage;

    public HomeHandle(DriverBase driver){
        this.driver = driver;
        homePage = new HomePage(driver);

    }
    /**
     *  点击主界面登录按钮
     */
    public void clickDengLuButton(){
        homePage.click(homePage.getDengluElement());
    }

    /**
     *  判断登录按钮是否存在
     */
    public Boolean asserDengluButton(){
        return homePage.assertElementIs(homePage.getDengluElement());
    }

    /**
     *  点击课程实战
     */
    public void clickCourseCombat(){
        homePage.click(homePage.getCourseCombatElement());
    }

    /**
     *  鼠标移动到头像图标
     */
    public void performHeader(){
        homePage.moveToElement(homePage.getHeaderElement());
    }

    /**
     *  获取个人信息用户昵称
     */
    public String getUsernick(){
        return homePage.getText(homePage.getNicknameElement());
    }
}
