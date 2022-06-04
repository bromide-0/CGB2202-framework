package cn.tedu.boot.demo.service.impl;

import cn.tedu.boot.demo.entity.Admin;
import cn.tedu.boot.demo.ex.InsertException;
import cn.tedu.boot.demo.ex.UsernameDuplicateException;
import cn.tedu.boot.demo.mapper.AdminMapper;
import cn.tedu.boot.demo.pojo.dto.AdminAddNewDTO;
import cn.tedu.boot.demo.service.IAdminService;
import cn.tedu.boot.demo.util.PasswordEncoder;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @Classname: AdminServiceImpl
 * @Author: bromide
 * @CreateTime: 2022/6/2--15:52
 * @Version: V1.0
 * @Description:
 */
@Service
public class AdminServiceImpl implements IAdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void addNew(AdminAddNewDTO adminAddNewDTO) {
        // 通过参数获取用户名
        String username = adminAddNewDTO.getUsername();
        // 调用adminMapper的 getByUsername(String username) 方法执行查询
        Admin queryResult = adminMapper.getByUsername(username);
        // 判断查询结果是否为null
        if (queryResult!=null){
            //  否:表示用户名已经被暂用,则判处UsernameDuplicateException
            throw new UsernameDuplicateException();
        }
        //  是:表示用户名未被占用,则执行插入数据  ( 无需写 )
        // 通过参数获取原密码
        String password = adminAddNewDTO.getPassword();
        // 通过加密方式,得到加密后的密码encodedPassword
        String encodedPassword =passwordEncoder.encode(password);
        // 创建当前时间对象now > LocalDateTime.now()
        LocalDateTime now = LocalDateTime.now();
        // 创建admin对象
        Admin admin = new Admin();
        // 补全admin对象的属性值  通过adminAddNewDTO获取部分参数
        admin.setUsername(username);
        admin.setPassword(encodedPassword);
        admin.setNickname(adminAddNewDTO.getNickname());
        admin.setAvatar(adminAddNewDTO.getAvatar());
        admin.setPhone(adminAddNewDTO.getPhone());
        admin.setEmail(adminAddNewDTO.getEmail());
        admin.setDescription(adminAddNewDTO.getDescription());
        // 以上这些从一个对象中把属性赋到另一个对象中,还可以使用:  (需要两个类中的属性名完全一致)
        // BeanUtils.copyProperties(adminAddNewDTO,admin);

        // 补全admin对象的属性值  isEnable > 1
        admin.setIsEnable(1);
        // 补全admin对象的属性值  lastLoginIp > null
        admin.setLastLoginIp(null);
        // 补全admin对象的属性值  loginCount > 0
        admin.setLoginCount(0);
        // 补全admin对象的属性值  gmtLastLogin > null
        admin.setGmtLastLogin(null);
        // 补全admin对象的属性值  gmtCreate > now
        admin.setGmtCreate(now);
        // 补全admin对象的属性值  gmtModified > now
        admin.setGmtModified(now);
        // 调用adminMapper insert(Admin admin) 方法插入管理员数据,获取返回值
        int row = adminMapper.insert(admin);
        // 判断以上返回的结果是否为1, 若不是,则抛出insertException
        if (row != 1){
            throw new InsertException();
        }
    }
}
