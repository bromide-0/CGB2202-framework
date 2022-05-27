package cn.tedu.spring;

import org.springframework.stereotype.Repository;

/**
 * @Classname: SubUserMapper
 * @Author: bromide
 * @CreateTime: 2022/5/25--15:31
 * @Version: V1.0
 * @Description:
 */
@Repository
public class SubUserMapper extends UserMapper{
    public void insert(){
        System.out.println("SubUserMapper.insert()");
    }
}
