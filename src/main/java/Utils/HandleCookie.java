package Utils;

import Base.DriverBase;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class HandleCookie {

    public DriverBase driver;
    public Utils.ProUtil proUtil;

    public HandleCookie(DriverBase driver){
        this.driver = driver;
        proUtil = new Utils.ProUtil("src\\main\\resources\\cookie.properties");
    }

    /**
     *  读取配置文件中的cookie值
     */
    public void setCookie(){
        String value = proUtil.getPro("JSESSIONID");
        Cookie cookie = new Cookie("JSESSIONID",value,"monotest.ccp.casic.cs","/",null);
        driver.setCookie(cookie);
    }

    /**
     *  获取cookie内容
     */
    public void writeCookie(){
        Set<Cookie> cookies = driver.getCookie();
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("JSESSIONID")){
                proUtil.writePro(cookie.getName(),cookie.getValue());
            }
        }
    }

    /**
     *  清楚浏览器中的cookie
     */
    public void delectCookie(){
        Set<Cookie> cookies = driver.getCookie();
        //清除所有的缓存
        driver.deleteCookie();
    }


}
