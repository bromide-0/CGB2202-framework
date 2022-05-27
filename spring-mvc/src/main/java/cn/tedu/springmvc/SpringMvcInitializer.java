package cn.tedu.springmvc;

import cn.tedu.springmvc.config.SpringConfig;
import cn.tedu.springmvc.config.SpringMvcConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Classname: SpringMvcInitializer
 * @Author: bromide
 * @CreateTime: 2022/5/25--17:30
 * @Version: V1.0
 * @Description: SpringMvc项目的初始化类,类名不重要
 */
public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        //返回Spring的配置类
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //返回SpringMvc的配置类
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        // 返回SpringMvc框架处理的请求的路径
        // http://localhost:8080/1.jpg  不按Spring MVC的流程,直接响应即可
        // http://localhost:8080/1.do   按照Spring MVC的流程执行
        return new String[] {"*.do"};
    }
}
