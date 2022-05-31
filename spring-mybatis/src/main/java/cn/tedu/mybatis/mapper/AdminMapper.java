package cn.tedu.mybatis.mapper;

import cn.tedu.mybatis.entity.Admin;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname: AdminMapper
 * @Author: bromide
 * @CreateTime: 2022/5/30--10:45
 * @Version: V1.0
 * @Description:
 */
public interface AdminMapper {
    int insert(Admin admin);

    int deleteById(Long id);

    int updatePasswordById(
            @Param("id") Long id,
            @Param("password") String password);

    int count();
}
