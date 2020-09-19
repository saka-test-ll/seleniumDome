package src.java.Utils;

import java.io.*;
import java.util.Properties;

public class ProUtil {

    private Properties prop;
    private String filePath;

    /**
     * 构造方法
     */
    public ProUtil(String filePath){
        this.filePath = filePath;
        this.prop = readProperties();
    }

    /**
     * 读取配置文件
     */
    private Properties readProperties(){
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream(filePath);
            BufferedInputStream in = new BufferedInputStream(inputStream);
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    /**
     * 获得配置文件中数据，并判断是否为空值
     */
    public String getPro(String key) {
        if(prop.containsKey(key)){
            String endKey = prop.getProperty(key);
            return endKey;
        }else {
            System.out.println("您获取的Key值不对");
            return "";
        }
    }

    /**
     *  在配置文件写入信息
     */
    public void writePro(String key, String value) {
        Properties pro = new Properties();
        try {
            FileOutputStream file = new FileOutputStream(filePath);
            pro.setProperty(key, value);
            pro.store(file, key);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
