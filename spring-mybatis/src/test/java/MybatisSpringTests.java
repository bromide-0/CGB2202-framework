import cn.tedu.mybatis.SpringConfig;
import cn.tedu.mybatis.entity.Admin;
import cn.tedu.mybatis.mapper.AdminMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(SpringConfig.class)
public class MybatisSpringTests {

    @Autowired
    Environment environment;
    @Autowired
    DataSource dataSource;
    @Autowired(required = false)
    AdminMapper adminMapper;

    @Test
    public void contextLoads() {
        System.out.println("MybatisSpringTests.contextLoads()");
    }

    @Test
    public void testEnvironment() {
        System.out.println(environment.getProperty("datasource.url"));
        System.out.println(environment.getProperty("datasource.driver"));
        System.out.println(environment.getProperty("datasource.username"));
        System.out.println(environment.getProperty("datasource.password"));
        System.out.println(environment.getProperty("mybatis.mapper-locations"));
    }

    @Test
    public void testGetConnection() throws Exception {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Sql(value = "classpath:truncate.sql")
    @Sql(value = "classpath:truncate.sql",
            executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    @Test
    public void testInsert() {
        Admin admin = new Admin();
        admin.setUsername("test-user-003");
        admin.setPassword("000000");

        System.out.println("插入之前：" + admin);
        int rows = adminMapper.insert(admin);
        System.out.println("rows = " + rows);
        System.out.println("插入之后：" + admin);
    }

    // @Sql({"classpath:truncate.sql", "classpath:insert_data.sql"})
    @Test
    public void testDeleteByIdSuccessfully() {
        Long id = 1L;
        int rows = adminMapper.deleteById(id);
        System.out.println("rows = " + rows);
        assertEquals(1, rows);
    }

    @Test
    public void testDeleteByIdBecauseNotFound() {
        Long id = -1L;
        int rows = adminMapper.deleteById(id);
        System.out.println("rows = " + rows);
        assertEquals(0, rows);
    }

}
