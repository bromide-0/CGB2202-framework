package cn.tedu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Classname: UserContriller
 * @Author: bromide
 * @CreateTime: 2022/5/25--11:45
 * @Version: V1.0
 * @Description:
 */
@Controller
public class UserController {
    @Autowired
    public UserMapper subUserMapper;

    public void reg(){
        System.out.println("UserController.reg()");
        subUserMapper.insert();
    }
}
