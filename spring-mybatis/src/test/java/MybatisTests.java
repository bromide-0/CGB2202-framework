import cn.tedu.mybatis.SpringConfig;
import org.junit.jupiter.api.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @Classname: MybatisTests
 * @Author: bromide
 * @CreateTime: 2022/5/27--18:21
 * @Version: V1.0
 * @Description:
 */
public class MybatisTests {
    @Test
    public void contextLoads() {
        System.out.println("MybatisTests.contextLoads()");
        AnnotationConfigApplicationContext ac
                = new AnnotationConfigApplicationContext(SpringConfig.class);
        ConfigurableEnvironment environment = ac.getEnvironment();
        System.out.println(environment.getProperty("datasource.url"));
        System.out.println(environment.getProperty("datasource.driver"));
        System.out.println(environment.getProperty("datasource.username"));
        System.out.println(environment.getProperty("datasource.password"));
        ac.close();
    }
    @Test
    public void testConnection() throws Exception {
        AnnotationConfigApplicationContext ac
                = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = ac.getBean("dataSource", DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        ac.close();
    }
}
