package cn.tedu.boot.demo.util;

import org.springframework.stereotype.Component;

/**
 * @Classname: PasswordEncoder
 * @Author: bromide
 * @CreateTime: 2022/6/2--17:37
 * @Version: V1.0
 * @Description:  用于密码加密
 */
@Component
public class PasswordEncoder {
    public String encode(String rawPassword){
        return rawPassword + "aaa";
    }
}
