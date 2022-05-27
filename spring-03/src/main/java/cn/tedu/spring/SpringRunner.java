package cn.tedu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname: SpringRunner
 * @Author: bromide
 * @CreateTime: 2022/5/25--9:41
 * @Version: V1.0
 * @Description:
 */
public class SpringRunner {
    public static void main(String[] args) {
        System.out.println("1.加载Spring配置....");
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println("1.加载Spring配置完成!");
        System.out.println("------------------------------");

        System.out.println("2.从Spring容器中获取对象...");
        Object userMapper1 = ac.getBean("userMapper");
        Object userMapper2 = ac.getBean("userMapper");
        Object userMapper3 = ac.getBean("userMapper");
        System.out.println("2.从Spring容器中获取对象完成!");
        System.out.println("------------------------------");

        System.out.println("3.操作对象....");
        System.out.println(userMapper1);
        System.out.println(userMapper2);
        System.out.println(userMapper3);
        System.out.println("3.操作对象完成!");
        System.out.println("------------------------------");

        System.out.println("4.结束");
        ac.close();
    }
}
