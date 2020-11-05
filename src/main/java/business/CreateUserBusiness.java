package business;

import Base.DriverBase;
import Utils.ProUtil;
import handle.CreateUserHandle;
import handle.HomeHandle;

public class CreateUserBusiness {
    public DriverBase driver;
    public ProUtil proUtil;
    public CreateUserHandle createUserHandle;
    public HomeHandle homeHandle;
    public CreateUserBusiness(DriverBase driver) {
        this.driver = driver;
        createUserHandle = new CreateUserHandle(driver);
        homeHandle = new HomeHandle(driver);
    }

    //关闭IM聊天窗口，进入用户管理菜单及Iframe页面
    public void goToCreateUserIframe(){
        driver.implicitlywait();
        createUserHandle.clickuserCenterMenu();
        createUserHandle.clickuserManagerMenu();
        createUserHandle.goToUserManagerIframe();
    }

    //新增用户
    public void createUser(){
        createUserHandle.clickaddUserButton();
        createUserHandle.goToAddUserIframe();
        driver.implicitlywait();
        createUserHandle.clickBasicInfo();
        driver.implicitlywait();
        ProUtil proutil=  new ProUtil("src\\main\\resources\\loginTest.properties");
        String account = proutil.getPro("accountValue");
        createUserHandle.sendKeyAccount(account);
        String passwordin = proutil.getPro("passwordValue");
        createUserHandle.sendKeypasswordin(passwordin);
        String fullName = proutil.getPro("fullnameValue");
        createUserHandle.sendKeyfullName(fullName);
        createUserHandle.clickOrgInfo();
        createUserHandle.clickSelectOrg();
        createUserHandle.clickaddOrgButton();
        createUserHandle.clickSelectPrimaryOrg();
        createUserHandle.clicksaveUserButton();
        createUserHandle.outAddUserFrame();
        createUserHandle.clicksaveUserSureButton();
    }

    //查询用户
    public void queryUser(){
        createUserHandle.goToUserManagerIframe();
        ProUtil proutil=  new ProUtil("src\\main\\resources\\loginTest.properties");
        String queryAccountBox = proutil.getPro("accountValue");
        createUserHandle.sendKeyqueryAccountBox(queryAccountBox);
        createUserHandle.clickQueryUserButton();
    }

}