package cn.tedu.boot.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class BootDemoApplicationTests {
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
    }


    @Test
    void testGetConnection() throws Exception {
        System.out.println(dataSource.getConnection());
    }

}
