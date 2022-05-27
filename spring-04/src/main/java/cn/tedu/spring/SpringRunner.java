package cn.tedu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname: SpringRunner
 * @Author: bromide
 * @CreateTime: 2022/5/25--11:41
 * @Version: V1.0
 * @Description:
 */
public class SpringRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = (UserController) ac.getBean("userController");
        userController.reg();
        ac.close();
    }
}
