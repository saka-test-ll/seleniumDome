package busession;

import Base.DriverBase;
import handle.HomeHandle;

public class HomeBusession {

    public HomeHandle homeHandle;
    public HomeBusession(DriverBase driver) {
        homeHandle = new HomeHandle(driver);
    }

    /**
     *  进入登录界面
     */
    public void dengLuButtom(){
        if(homeHandle.asserDengluButton()){
            homeHandle.clickDengLuButton();
        }else{
            System.out.println("已有用户登录");
        }
    }

    /**
     *  进入课程实战界面
     */
    public void courseCombat(){
        homeHandle.clickCourseCombat();
    }

    /**
     *  判断登录用户名信息
     */
    public boolean assertNickName(String expectedName){
        homeHandle.performHeader();
        String nickName = homeHandle.getUsernick();
        if(nickName.equals(expectedName)){
            return true;
        }
        return false;
    }
}
