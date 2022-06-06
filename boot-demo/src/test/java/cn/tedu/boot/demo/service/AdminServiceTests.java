package cn.tedu.boot.demo.service;

import cn.tedu.boot.demo.ex.UsernameDuplicateException;
import cn.tedu.boot.demo.pojo.dto.AdminAddNewDTO;
import cn.tedu.boot.demo.service.impl.AdminServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

/**
 * @Classname: AdminServiceTests
 * @Author: bromide
 * @CreateTime: 2022/6/2--17:26
 * @Version: V1.0
 * @Description:
 */
@SpringBootTest
public class AdminServiceTests {
    @Autowired
    IAdminService service;

    // @Sql(value = "classpath:truncate.sql")
    // @Sql(value = "classpath:truncate.sql",executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
    @Test
    void testAddNewSuccessfully(){
        AdminAddNewDTO adminAddNewDTO = new AdminAddNewDTO();
        adminAddNewDTO.setUsername("test001");
        adminAddNewDTO.setPassword("12344");
        adminAddNewDTO.setNickname("bromide");
        adminAddNewDTO.setAvatar("11");
        adminAddNewDTO.setPhone("13164644038");
        adminAddNewDTO.setEmail("bromide1988@163.com");
        adminAddNewDTO.setDescription("描述");

        System.out.println(adminAddNewDTO);

        // 断言执行成功
        Assertions.assertDoesNotThrow(() -> service.addNew(adminAddNewDTO));
    }

    @Sql(value = "classpath:insert.sql")
    @Test
    void testAddNewNotSuccessfully(){
        AdminAddNewDTO adminAddNewDTO = new AdminAddNewDTO();
        adminAddNewDTO.setUsername("test001");
        adminAddNewDTO.setPassword("12344");
        adminAddNewDTO.setNickname("bromide");
        adminAddNewDTO.setAvatar("11");
        adminAddNewDTO.setPhone("13164644038");
        adminAddNewDTO.setEmail("bromide1988@163.com");
        adminAddNewDTO.setDescription("描述");

        // 断言执行失败
        Assertions.assertThrows(UsernameDuplicateException.class,()->service.addNew(adminAddNewDTO));
    }
}
