package cn.tedu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname: SpringConfig
 * @Author: bromide
 * @CreateTime: 2022/5/25--11:40
 * @Version: V1.0
 * @Description:
 */
@Configuration
@ComponentScan("cn.tedu.spring")
public class SpringConfig {
    /*@Bean
    public UserMapper userMapper(){
        return new UserMapper();
    }

    @Bean
    public UserController userController(UserMapper userMapper){
        UserController userController = new UserController();
        userController.userMapper = userMapper;
        return userController;
    }*/
}
