package cn.tedu.boot.demo.util;

import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.util.UUID;

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
        // 加密过程
        // 1. 使用MD5算法
        // 2. 使用随机的盐值
        // 3. 循环五次
        // 4. 盐值的处理方式 : 盐 + 原密码 + 盐 +原密码
        // 注意:  因为使用了随机盐,盐值也是需要记录的
        String salt = UUID.randomUUID().toString().replace("-","");
        String encodedPassword = rawPassword;
        for (int i = 0; i < 5; i++) {
            encodedPassword = DigestUtils.md5DigestAsHex(
                    (salt + encodedPassword + salt + encodedPassword + salt).getBytes());
        }
        return salt + encodedPassword;
    }

    public boolean matches(String rawPassword, String encodedPassword) {
        String salt = encodedPassword.substring(0, 32);
        String newPassword = rawPassword;
        for (int i = 0; i < 5; i++) {
            newPassword = DigestUtils.md5DigestAsHex(
                    (salt + newPassword + salt + newPassword + salt).getBytes());
        }
        newPassword = salt + newPassword;
        return newPassword.equals(encodedPassword);
    }
}
