package cn.tedu.boot.demo.controller;

import cn.tedu.boot.demo.pojo.dto.AdminAddNewDTO;
import cn.tedu.boot.demo.service.IAdminService;
import cn.tedu.boot.demo.service.impl.AdminServiceImpl;
import cn.tedu.boot.demo.web.JasonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: AdminController
 * @Author: bromide
 * @CreateTime: 2022/6/2--15:55
 * @Version: V1.0
 * @Description:
 */
@RestController
@RequestMapping(value = "/admins" , produces = "application/json;charset=utf-8")
public class AdminController {

    @Autowired
    private IAdminService adminService;

    // 注意: 暂时使用@RequestMapping,不要使用@PostMapping,以便于直接再浏览器中测试
    // http://localhost:8080/admins/add-new?username=root&password=root
    @RequestMapping("/add-new")
    public JasonResult<Void> addNew(AdminAddNewDTO adminAddNewDTO){
        adminService.addNew(adminAddNewDTO);
        return JasonResult.ok();
    }

}
