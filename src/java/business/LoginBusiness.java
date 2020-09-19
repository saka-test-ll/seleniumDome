package src.java.business;

import src.java.Base.DriverBase;
import src.java.handle.LoginHandle;

/**
 *  业务层
 */
public class LoginBusiness {
    public LoginHandle loginHandle;

    /**
     * 构造方法
     *
     * @param driver
     */
    public LoginBusiness(DriverBase driver) {
        loginHandle = new LoginHandle(driver);
    }

    /**
     * 用户登录
     */
    public void login(String userName, String passWord) {
        if (loginHandle.assertLoginPage()) {

            loginHandle.sendKeyUsername(userName);
            loginHandle.sendKeyPassword(passWord);
            loginHandle.clickLoginButton();
        } else {
            System.out.println("页面不存在或者状态不正确");
        }
    }
}