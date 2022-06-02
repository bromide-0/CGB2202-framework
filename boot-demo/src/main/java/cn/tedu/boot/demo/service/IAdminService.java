package cn.tedu.boot.demo.service;

import cn.tedu.boot.demo.pojo.dto.AdminAddNewDTO;

/**
 * @Classname: IAdminService
 * @Author: bromide
 * @CreateTime: 2022/6/2--15:51
 * @Version: V1.0
 * @Description:
 */
public interface IAdminService {
    void addNew(AdminAddNewDTO adminAddNewDTO);
}
