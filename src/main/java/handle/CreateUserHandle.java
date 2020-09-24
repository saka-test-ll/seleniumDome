package handle;

import Base.DriverBase;
import page.CreateUserPage;

public class CreateUserHandle {

    public DriverBase driver;
    public CreateUserPage createUserPage;

    /**
     *  构造方法
     * @param driver
     */
    public CreateUserHandle(DriverBase driver){
        this.driver = driver;
        createUserPage = new CreateUserPage(driver);
    }

    //点击用户中心菜单项
    public void clickuserCenterMenu(){
        createUserPage.leftClickMouse(createUserPage.getUserCenterMenuElement());
    }

    //点击用户管理菜单项
    public void clickuserManagerMenu(){
        createUserPage.leftClickMouse(createUserPage.getUserManagerMenuElement());
    }

    //进入用户管理iframe页面
    public void goToUserManagerIframe(){
        createUserPage.findIframeElement(createUserPage.getUserManagerIframe());
    }

    //退出用户管理iframe页面
    public void outUserManagerIframe(){
        driver.outIframeElement();
    }

    //点击新增用户
    public void clickaddUserButton(){
        createUserPage.click(createUserPage.getAddUserButtonElement());
    }

    //进入基本信息页签
    public void LBClickbasicInfo(){
        createUserPage.leftClickMouse(createUserPage.getBasicInfoElement());
    }

    //输入账号
    public void sendKeyAccount(String account){
        createUserPage.sendKeys(createUserPage.getAccountElement(),account);
    }

    //输入密码
    public void sendKeypasswordin(String passwordin){
        createUserPage.sendKeys(createUserPage.getpasswordinElement(),passwordin);
    }

    //输入用户姓名
    public void sendKeyfullName(String fullName){
        createUserPage.sendKeys(createUserPage.getFullnameElement(),fullName);
    }

    //进入组织选择页签
    public void LBClickOrgInfo(){
        createUserPage.leftClickMouse(createUserPage.getorgInfoElement());
    }

    //选择组织
    public void LBClickSelectOrg(){
        createUserPage.leftClickMouse(createUserPage.getselectOrgElement());
    }

    //添加组织
    public void clickaddOrgButton(){
        createUserPage.click(createUserPage.getAddOrgButtonElement());
    }

    //选择主组织
    public void clickSelectPrimaryOrg(){
        createUserPage.click(createUserPage.getselectPrimaryOrgElement());
    }

    //保存用户
    public void clicksaveUserButton(){
        createUserPage.click(createUserPage.getSaveUserButtonElement());
    }

    public boolean assertCreateUserPage() {
        return createUserPage.assertElementIs(createUserPage.getAccountElement());
    }

}