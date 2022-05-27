package cn.tedu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * @Classname: SpringBeanFactory
 * @Author: bromide
 * @CreateTime: 2022/5/24--15:22
 * @Version: V1.0
 * @Description:
 */
@Configuration
public class SpringBeanFactory {

    @Bean
    public Random random(){
        return new Random();
    }
}
