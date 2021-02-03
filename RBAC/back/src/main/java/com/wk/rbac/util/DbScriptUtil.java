package com.wk.rbac.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.jdbc.ScriptRunner;

import java.io.*;
import java.sql.*;
import java.util.Map;
import java.util.Properties;

/**
 * @author: wk
 * @Date: 2021/2/2 11:05
 * @Description
 */
@Slf4j
public class DbScriptUtil {

    public static void initDbWithSql(String driver,String sqlname, String prop) throws IOException, ClassNotFoundException, SQLException {
        final InputStream inputStream = DbScriptUtil.class.getClassLoader().getResourceAsStream(prop);
        final Properties properties = new Properties();
        properties.load(inputStream);
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            log.info("key:{}, values:{}", entry.getKey(), entry.getValue());
        }
        Class.forName(driver);
        final Connection connection = DriverManager.getConnection(properties.getProperty("dburl"), properties.getProperty("username"),
                properties.getProperty("password"));
        final ScriptRunner runner = new ScriptRunner(connection);
        try {
            runner.setAutoCommit(false);
            runner.setDelimiter(";");
            runner.setSendFullScript(false);
            runner.setStopOnError(true);
            runner.setLogWriter(new PrintWriter(System.out));
            final InputStream is = ClassLoader.getSystemResourceAsStream(sqlname);
            final InputStreamReader reader = new InputStreamReader(is);
            runner.runScript(reader);
        }catch (Exception e) {
            log.error(" script exception:{}", e.getMessage());
            connection.rollback();
        }
    }

    public static void baseSql(String driver,String prop) throws IOException, SQLException, ClassNotFoundException {
        final InputStream inputStream = DbScriptUtil.class.getClassLoader().getResourceAsStream(prop);
        final Properties properties = new Properties();
        properties.load(inputStream);
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            log.info("key:{}, values:{}", entry.getKey(), entry.getValue());
        }
        Class.forName(driver);
        final Connection connection = DriverManager.getConnection(properties.getProperty("dburl"),
                properties.getProperty("username"), properties.getProperty("password"));
        // 在注入 asc  desc 时 出错
        //String sql = "select * from rb_menu order by ?  ?";
        String sql = "select * from rb_menu order by ? ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"order_num");
        // statement.setString(2,"desc");
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            String id = rs.getString("id");
            String p_id = rs.getString("p_id");
            String menu_text = rs.getString("menu_text");
            String menu_url = rs.getString("menu_url");
            String menu_icon = rs.getString("menu_icon");
            int order_num = rs.getInt("order_num");
            boolean menu_disable = rs.getBoolean("menu_disable");
            log.info("id{}, pd_id:{},menu_text:{},menu_url:{},menu_icon:{},order_num:{},menu_disable:{}",
                    id,p_id,menu_text,menu_url,menu_icon,order_num,menu_disable);
        }
        rs.close();
        statement.close();
        connection.close();
    }

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        log.info("begin script..");
        String propFile = "db.properties";
        String sqlName = "db.sql";
        String driver = "org.postgresql.Driver";
//        initDbWithSql(driver,sqlName,propFile);
        baseSql(driver,propFile);
    }
}
