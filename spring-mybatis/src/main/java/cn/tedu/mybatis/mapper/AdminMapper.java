package cn.tedu.mybatis.mapper;

import cn.tedu.mybatis.entity.Admin;
import cn.tedu.mybatis.vo.AdminDetailsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    int deleteByIds(Long[] id);

    int updatePasswordById(
            @Param("id") Long id,
            @Param("password") String password);

    int count();

    Admin getById(Long id);

    AdminDetailsVO getDetailsById(Long id);

    List<Admin> selectOrderById();
}
