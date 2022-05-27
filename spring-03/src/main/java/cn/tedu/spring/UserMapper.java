package cn.tedu.spring;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @Classname: UserMapper
 * @Author: bromide
 * @CreateTime: 2022/5/25--9:40
 * @Version: V1.0
 * @Description:
 */
// @Scope("prototype")
@Lazy
@Repository
public class UserMapper {
    public UserMapper(){
        System.out.println("UserMapper的无参构造方法");
    }
}
