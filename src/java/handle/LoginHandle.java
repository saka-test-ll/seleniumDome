package src.java.handle;

import src.java.Base.DriverBase;
import src.java.page.LoginPage;

/**
 *  操作层
 */
public class LoginHandle {

    public DriverBase driver;
    public LoginPage loginPage;

    /**
     *  构造方法
     * @param driver
     */
    public LoginHandle(DriverBase driver){
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    /**
     *  输入用户名
     */
    public void sendKeyUsername(String userName){ loginPage.sendKeys(loginPage.getUsernameElement(),userName); }

    /**
     *  输入密码
     */
    public void sendKeyPassword(String passWord){ loginPage.sendKeys(loginPage.getPasswordElement(),passWord); }

    /**
     *  点击登录界面登录按钮
     */
    public void clickLoginButton(){
        loginPage.click(loginPage.getLoginButtonElement());
    }
    /*
     * 判断是否是登录页面
     * 判断标准:只要能够识别登录页面的一个输入框即可，这里使用用户名来识别
     *
     * */
    public boolean assertLoginPage() {
        return loginPage.assertElementIs(loginPage.getUsernameElement());
    }
}
