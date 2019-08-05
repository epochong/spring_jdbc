package com.epochong;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author epochong
 * @date 2019/8/2 23:35
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class SpringJdbcTest {
    private ApplicationContext context = null;
    private JdbcTemplate jdbcTemplate = null;

    @Before
    public void testInit() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void  testDataBase() {
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource);
    }

    @Test
    public void testUpdate() {
        int flag = 0;
        //获取jdbc模板
        jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        String strSql = "update employee set employeeName=? where employeeId=?";
        try {
            flag = jdbcTemplate.update(strSql,"YYY",1);
            System.out.println("flag = " + flag);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
