package page;

import Base.BasePage;
import Base.DriverBase;
import Utils.GetByLocator;
import org.openqa.selenium.WebElement;

/**
 *  元素层
 */
public class CreateUserPage extends BasePage {
    /**
     *  构造方法
     * @param driver
     */
    public CreateUserPage(DriverBase driver){
        super(driver);
    }

    //进入菜单栏用户中心
    public WebElement getUserCenterMenuElement(){ return element(GetByLocator.getLocator("userCenterMenu")); }

    //进入用户管理页面
    public WebElement getUserManagerMenuElement(){ return element(GetByLocator.getLocator("userManagerMenu")); }

    //获取新建用户按钮
    public WebElement getAddUserButtonElement(){
        return element(GetByLocator.getLocator("addUserButton"));
    }

    //进入新建用户的基本信息页签Element
    public WebElement getBasicInfoElement(){ return element(GetByLocator.getLocator("BasicInfo")); }

    //获取账号输入框Element
    public WebElement getAccountElement(){ return element(GetByLocator.getLocator("account")); }

    //获取密码输入框Element
    public WebElement getpasswordinElement(){ return element(GetByLocator.getLocator("passwordin")); }

    // 获取用户名称Element
    public WebElement getFullnameElement(){ return element(GetByLocator.getLocator("fullname")); }

   //进入新建用户选择组织页签Element
    public WebElement getorgInfoElement(){ return element(GetByLocator.getLocator("OrgInfo")); }

    //获取选择组织Element
    public WebElement getselectOrgElement(){ return element(GetByLocator.getLocator("SelectOrg")); }

    //进入新建用户添加组织按钮Element
    public WebElement getAddOrgButtonElement(){ return element(GetByLocator.getLocator("AddOrgButton")); }

    //选择主组织Element
    public WebElement getselectPrimaryOrigElement(){ return element(GetByLocator.getLocator("SelectPrimaryOrig")); }

    //进入新建用户保存按钮Element
    public WebElement getSaveUserButtonElement(){ return element(GetByLocator.getLocator("SaveUserButton")); }

}

