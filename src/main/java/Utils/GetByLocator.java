package Utils;

import org.openqa.selenium.By;

public class GetByLocator {

    /**
     * 封装By by
     */
    public static By getLocator(String key){

        //调用配置文件
        ProUtil properties = new ProUtil("src\\main\\resources\\element.properties");
        String locator = properties.getPro(key);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];

        if(locatorType.equals("id")){
            return By.id(locatorValue);
        }else if(locatorType.equals("name")){
            return By.name(locatorValue);
        }else if(locatorType.equals("className")){
            return By.className(locatorValue);
        }else if(locatorType.equals("cssSelector")){
            return By.cssSelector(locatorValue);
        }else if(locatorType.equals("linkText")){
            return By.linkText(locatorValue);
        }else {
            return By.xpath(locatorValue);
        }
    }

}
