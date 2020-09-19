package src.java.handle;

import src.java.Base.DriverBase;
import src.java.page.HomePage;

public class HomeHandle {

    public DriverBase driver;
    public HomePage homePage;

    public HomeHandle(DriverBase driver){
        this.driver = driver;
        homePage = new HomePage(driver);

    }
    /**
     *  获取个人信息用户昵称
     */
    public String getLoginUsername(){ return homePage.getText(homePage.getLoginUsername()); }

}

