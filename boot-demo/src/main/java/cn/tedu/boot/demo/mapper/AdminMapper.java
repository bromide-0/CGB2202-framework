package cn.tedu.boot.demo.mapper;

import cn.tedu.boot.demo.entity.Admin;
import org.springframework.stereotype.Repository;

/**
 * @Classname: AdminMapper
 * @Author: bromide
 * @CreateTime: 2022/6/2--10:51
 * @Version: V1.0
 * @Description:
 */
@Repository
public interface AdminMapper {

    int insert(Admin admin);

    Admin getByUsername(String username);
}
