package pers.harry.modules.test;

import java.sql.*;

public class MysqlTest {
    public static void main(String[] args)throws Exception{
        try{
            //调用Class.forName()方法加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("load MySQL driver success");

            String url="jdbc:mysql://192.168.152.128:3306/employees";    //JDBC的URL
            Connection conn;

            conn = DriverManager.getConnection(url, "zhou", "zhou");
            Statement stmt = conn.createStatement(); //创建Statement对象
            System.out.println("access database employees success");

            //查询数据的代码
            String sql = "select emp_no, first_name, last_name from employees limit 5;";    //要执行的SQL
            ResultSet rs = stmt.executeQuery(sql);//创建数据对象
            System.out.println("emp_no"+"\t"+"first_name"+"\t"+"last_name");
            while (rs.next()){
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.println();
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
