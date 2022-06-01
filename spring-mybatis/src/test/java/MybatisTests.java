import cn.tedu.mybatis.SpringConfig;
import cn.tedu.mybatis.entity.Admin;
import cn.tedu.mybatis.mapper.AdminMapper;
import cn.tedu.mybatis.vo.AdminDetailsVO;
import org.junit.jupiter.api.Test;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

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
        DataSource dataSource = (DataSource)ac.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        ac.close();
    }

    @Test
    public void testInsert(){
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        AdminMapper adminMapper = (AdminMapper) ac.getBean("adminMapper");
        Admin admin = new Admin();
        admin.setUsername("admin006");
        admin.setPassword("1234333356");
        System.out.println("执行插入前:"+admin);
        adminMapper.insert(admin);
        System.out.println("执行插入后:"+admin);
        ac.close();
    }

    @Test
    public void testDeleteById(){
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        AdminMapper adminMapper = (AdminMapper) ac.getBean("adminMapper");

        Long id = 1L;
        int row = adminMapper.deleteById(id);
        System.out.println("受影响行数 = "+row);
        ac.close();
    }

    @Test
    public void testUpdatePasswordById(){
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        AdminMapper adminMapper = (AdminMapper) ac.getBean("adminMapper");

        Long id = 8L;
        String password = "jhfjh6666";
        int row = adminMapper.updatePasswordById(id,password);
        System.out.println("受影响行数 = "+row);
        ac.close();
    }

    @Test
    public void testCount(){
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        AdminMapper adminMapper = (AdminMapper) ac.getBean("adminMapper");

        int count = adminMapper.count();
        System.out.println(count);
        ac.close();
    }

    @Test
    public void testGetById(){
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        AdminMapper adminMapper = (AdminMapper) ac.getBean("adminMapper");

        Long id = 3L;
        Admin admin = adminMapper.getById(id);
        System.out.println("admin  =  " +admin);
        ac.close();
    }

    @Test
    public void testGetDetailsById(){
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        AdminMapper adminMapper = (AdminMapper) ac.getBean("adminMapper");

        Long id = 3L;
        AdminDetailsVO adminDetailsVO = adminMapper.getDetailsById(id);
        System.out.println(adminDetailsVO);
        ac.close();
    }

    @Test
    public void testSelectOrderById(){
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        AdminMapper adminMapper = (AdminMapper) ac.getBean("adminMapper");

        List<Admin> admins = adminMapper.selectOrderById();
        admins.forEach(System.out::println);
        //admins.forEach(admin -> System.out.println(admin));
        /*for(Admin admin : admins){
            System.out.println(admin);
        }*/
        ac.close();
    }


}
