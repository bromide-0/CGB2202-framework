package cn.tedu.boot.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname: MybatisConfig
 * @Author: bromide
 * @CreateTime: 2022/6/2--10:38
 * @Version: V1.0
 * @Description:
 */
@Configuration
@MapperScan("cn.tedu.boot.demo.mapper")
public class MybatisConfig {

}
