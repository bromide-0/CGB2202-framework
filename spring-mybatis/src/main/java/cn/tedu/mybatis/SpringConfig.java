package cn.tedu.mybatis;

import org.apache.commons.dbcp2.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;


/**
 * @Classname: SpringConfig
 * @Author: bromide
 * @CreateTime: 2022/5/28--12:40
 * @Version: V1.0
 * @Description:
 */
@Configuration
@PropertySource("classpath:datasource.properties")
@MapperScan("cn.tedu.mybatis.mapper")
public class SpringConfig {
    @Bean
    public DataSource dataSource(Environment env) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(env.getProperty("datasource.url"));
        dataSource.setDriverClassName(env.getProperty("datasource.driver"));
        dataSource.setUsername(env.getProperty("datasource.username"));
        dataSource.setPassword(env.getProperty("datasource.password"));
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource,
            @Value("${mybatis.mapper-location}")Resource mapperLocations){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(mapperLocations);
        return sqlSessionFactoryBean;
    }
}
