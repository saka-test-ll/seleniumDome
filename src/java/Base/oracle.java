package common.conndb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.testng.annotations.Test;

public class oracle {
    public static  String txnstacd ;
    @test
    public static  void connoracle(String orderid) throws Exception{
        Connection con = null;// 创建一个数据库连接
        PreparedStatement pre1 = null;// 创建预编译语句对象，一般都是用这个而不用Statement
        ResultSet result1 = null;// 创建一个结果集对象
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("开始尝试连接数据库！");
//		        String url = "jdbc:oracle:" + "thin:@223.203.208.103:1521:test";// 127.0.0.1是本机地址，XE是精简版Oracle的默认数据库名
//		        String user = "newcieccpay_read";// 用户名,系统默认的账户名
//		        String password = "newcieccpay_read";// 你安装时选设置的密码
            String url = "jdbc:oracle:" + "thin:@211.88.2.93:1521:graydb";// 127.0.0.1是本机地址，XE是精简版Oracle的默认数据库名
            String user = "newcieccpay";// 用户名,系统默认的账户名
            String password = "ORCL#newcieccpay";// 你安装时选设置的密码
            con = DriverManager.getConnection(url, user, password);
            System.out.println("连接成功！");

            String sql1 = "SELECT b.gopay_order_id,b.txn_sta_cd FROM cps_gen_main_order b where b.gopay_order_id='"+orderid+"'";// 预编译语句，“？”代表参数
            pre1 = con.prepareStatement(sql1);// 实例化预编译语句
            result1 = pre1.executeQuery();// 执行查询，注意括号中不需要再加参数
            while(result1.next()){
                // 当结果集不为空时
                System.out.print("订单号:" + result1.getString("gopay_order_id") );
                System.out.println("订单状态:" + result1.getString("txn_sta_cd") );
                txnstacd = result1.getString("txn_sta_cd");
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }// 加载Oracle驱动程序
        finally
        {
            try
            {
                // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
                // 注意关闭的顺序，最后使用的最先关闭
                if (result1 != null)
                    result1.close();
                if (pre1 != null)
                    pre1.close();
                if (con != null)
                    con.close();
                System.out.println("数据库连接已关闭！");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
