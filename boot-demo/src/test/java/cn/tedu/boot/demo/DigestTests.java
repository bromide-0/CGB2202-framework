package cn.tedu.boot.demo;

import cn.tedu.boot.demo.util.PasswordEncoder;
import org.junit.jupiter.api.Test;
import org.springframework.util.DigestUtils;

/**
 * @Classname: DigestTests
 * @Author: bromide
 * @CreateTime: 2022/6/6--14:55
 * @Version: V1.0
 * @Description:
 */

public class DigestTests {

    @Test
    public void md5Test(){
        // SHA-1 160, MD5 128
        //
        String password = "123456";
        String salt = "bromide@163.com";
        String encodedPassword = DigestUtils.md5DigestAsHex((password + salt).getBytes());
        System.out.println("原密码:" + password);
        System.out.println("加密后密码: " + encodedPassword);
    }

    @Test
    public void testPasswordEncoded(){
        String rawPassword = "123456";
        String encodedPassword = new PasswordEncoder().encode(rawPassword);
        System.out.println(encodedPassword);
    }

    @Test
    public void testMatches(){
        String rawPassword = "123456";
        String encodedPassword = "8f4a5455322446b48889722034685aa9e00109c188f83fe84a7101a9ac9d27d2";
        boolean b = new PasswordEncoder().matches(rawPassword,encodedPassword);
        System.out.println(b);
    }
}