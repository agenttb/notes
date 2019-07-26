package com.agenttb.code.sql.mybatis;


import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCQueryDataDemo {

    public static void jdbcQueryDataFromDB() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            //加载数据库驱动
            Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
            clazz.newInstance();

            String url = "jdbc:mysql://192.168.229.133:3306/test_school";
            String user = "tb_test";
            String password = "tianbing";
            // 获取数据库连接
            conn = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM t_student WHERE s_no = ? ";
            //创建statement对象，(每一个Statement对象为一次数据库执行请求)
            stmt = conn.prepareStatement(sql);
            //设置传入参数
            stmt.setLong(1, 10001);
            //执行sql语句
            rs = stmt.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();

            List<Map<String, Object>> list = new ArrayList<>();
            int num = metaData.getColumnCount();
            //处理查询结果
            while (rs.next()) {
                Map<String, Object> map = new HashMap<>();
                for (int i = 0; i < num; i++) {
                    String columnName = metaData.getColumnName(i + 1);
                    map.put(columnName, rs.getObject(columnName));
                }
                list.add(map);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                    rs = null;
                }
                if (stmt != null) {
                    stmt.close();
                    stmt = null;
                }
                if (conn != null) {
                    conn.close();
                    conn = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
