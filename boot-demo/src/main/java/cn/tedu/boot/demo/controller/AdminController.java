package cn.tedu.boot.demo.controller;

import cn.tedu.boot.demo.pojo.dto.AdminAddNewDTO;
import cn.tedu.boot.demo.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Classname: AdminController
 * @Author: bromide
 * @CreateTime: 2022/6/2--15:55
 * @Version: V1.0
 * @Description:
 */
@Controller
public class AdminController {

    @Autowired
    AdminServiceImpl adminService;

    void addNew(AdminAddNewDTO admin){
        adminService.addNew(admin);
    }

}
