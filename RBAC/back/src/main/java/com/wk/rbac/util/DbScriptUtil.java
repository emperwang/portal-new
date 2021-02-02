package com.wk.rbac.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.jdbc.ScriptRunner;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
        final Connection connection = DriverManager.getConnection(properties.getProperty("dburl"), properties.getProperty("username"), properties.getProperty("password"));
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

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        log.info("begin script..");
        String propFile = "db.properties";
        String sqlName = "db.sql";
        String driver = "org.postgresql.Driver";
        initDbWithSql(driver,sqlName,propFile);
    }
}
