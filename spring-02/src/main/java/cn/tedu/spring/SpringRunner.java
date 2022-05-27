package cn.tedu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname: SpringRunner
 * @Author: bromide
 * @CreateTime: 2022/5/24--16:29
 * @Version: V1.0
 * @Description:
 */
public class SpringRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        //当写完了值,却海没有声明变量时,在值后输入 .var 并回车,会自动声明变量
        UserMapper bean = ac.getBean(UserMapper.class);
        System.out.println(bean);

        ac.close();
    }
}
