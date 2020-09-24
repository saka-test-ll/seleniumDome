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

    //获取菜单栏用户中心Element元素
    public WebElement getUserCenterMenuElement(){
        return element(GetByLocator.getLocator("userCenterMenu"));
    }

    //获取用户管理页面Element元素
    public WebElement getUserManagerMenuElement(){
        return element(GetByLocator.getLocator("userManagerMenu"));
    }

    //获取用户管理iframe页面Element元素
    public WebElement getUserManagerIframe(){
        return element(GetByLocator.getLocator("userManagerIframe"));
    }

    //获取新建用户按钮Element元素
    public WebElement getAddUserButtonElement(){
        return element(GetByLocator.getLocator("addUserButton"));
    }

    //获取新建用户iframe页面Element元素
    public WebElement getAddUserIfrme(){return  element(GetByLocator.getLocator("addUserIframe"));}

    //获取新建用户的基本信息页签Element元素
    public WebElement getBasicInfoElement(){
        return element(GetByLocator.getLocator("basicInfo"));
    }

    //获取账号输入框Element元素
    public WebElement getAccountElement(){
        return element(GetByLocator.getLocator("account"));
    }

    //获取密码输入框Element元素
    public WebElement getpasswordinElement(){
        return element(GetByLocator.getLocator("passwordin"));
    }

    // 获取用户名称Element元素
    public WebElement getFullnameElement(){
        return element(GetByLocator.getLocator("fullname"));
    }

   //获取新建用户选择组织页签Element元素
    public WebElement getorgInfoElement(){
        return element(GetByLocator.getLocator("OrgInfo"));
    }

    //获取选择组织Element元素
    public WebElement getselectOrgElement(){
        return element(GetByLocator.getLocator("selectOrg"));
    }

    //获取新建用户添加组织按钮Element元素
    public WebElement getAddOrgButtonElement(){
        return element(GetByLocator.getLocator("addOrgButton"));
    }

    //获取选择主组织Element元素
    public WebElement getselectPrimaryOrgElement(){
        return element(GetByLocator.getLocator("selectPrimaryOrg"));
    }

    //获取新建用户保存按钮Element元素
    public WebElement getSaveUserButtonElement(){
        return element(GetByLocator.getLocator("saveUserButton"));
    }

}

