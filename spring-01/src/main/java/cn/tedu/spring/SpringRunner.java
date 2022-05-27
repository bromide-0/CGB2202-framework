package cn.tedu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * @Classname: SpringRunner
 * @Author: bromide
 * @CreateTime: 2022/5/24--15:31
 * @Version: V1.0
 * @Description:
 */
public class SpringRunner {
    public static void main(String[] args) {
        //1.让Spring跑起来
        // AnnotationConfigApplicationContext 用于加载Spring配置,是Spring容器
        // 注意:需要在构造方法中添加参数
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringBeanFactory.class);

        //2.从Spring中获取对象
        //默认的bean name就是@Bean方法的名称
        Random random = (Random) ac.getBean("random");

        //3.测试使用
        System.out.println(random);

        //4.结束
        ac.close();
    }

}
