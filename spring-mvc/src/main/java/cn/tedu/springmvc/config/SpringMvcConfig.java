package cn.tedu.springmvc.config;

import cn.tedu.springmvc.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Classname: SpringMvcConfig
 * @Author: bromide
 * @CreateTime: 2022/5/25--17:20
 * @Version: V1.0
 * @Description: SpringMvc的配置类
 */
@Configuration
@EnableWebMvc
@ComponentScan("cn.tedu.springmvc")
public class SpringMvcConfig implements WebMvcConfigurer {

    @Autowired
    LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 可以自己new 也可以通过@Compont 注解让SpringMVC进行自动装配
        // registry.addInterceptor(loginInterceptor);
        /**
         * 拦截器是可以注册多个的,按顺序拦截
         */
        registry.addInterceptor(loginInterceptor)
        .addPathPatterns("/users/**")
        .excludePathPatterns("/users/login.do","/users/reg.do");

    }
}
