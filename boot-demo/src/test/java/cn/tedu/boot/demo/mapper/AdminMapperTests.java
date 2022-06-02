package cn.tedu.boot.demo.mapper;

import cn.tedu.boot.demo.controller.AdminController;
import cn.tedu.boot.demo.entity.Admin;
import cn.tedu.boot.demo.pojo.dto.AdminAddNewDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

/**
 * @Classname: AdminMapperTests
 * @Author: bromide
 * @CreateTime: 2022/6/2--11:01
 * @Version: V1.0
 * @Description:
 */
@SpringBootTest
public class AdminMapperTests {

    @Autowired
    AdminMapper adminMapper;
    @Autowired
    AdminController adminController;

    @Sql(value = "classpath:truncate.sql")
    @Test
    void testInsert(){
        Admin admin = new Admin();
        admin.setUsername("ABCEFG4");
        admin.setPassword("12314");
        System.out.println("插入前: " +admin);
        int row = adminMapper.insert(admin);
        System.out.println("插入条数: " +row);
        System.out.println("插入后: " +admin);
    }

    @Sql(value = "classpath:insert.sql")
    @Sql(value = "classpath:truncate.sql" , executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    @Test
    void testSelectByUsername(){
        String username = "test009";
        Admin admin = adminMapper.getByUsername(username);
        Assertions.assertNull(admin);
    }


}
