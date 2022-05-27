package cn.tedu.spring;

import org.springframework.stereotype.Repository;

/**
 * @Classname: UserMapper
 * @Author: bromide
 * @CreateTime: 2022/5/25--11:43
 * @Version: V1.0
 * @Description:
 */
@Repository
public class UserMapper {
    public void insert(){
        System.out.println("UserMapper.insert()");
    }
}
