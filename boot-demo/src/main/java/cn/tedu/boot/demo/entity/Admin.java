package cn.tedu.boot.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @Classname: Admin
 * @Author: bromide
 * @CreateTime: 2022/6/2--10:51
 * @Version: V1.0
 * @Description:
 */
@Data
public class Admin implements Serializable {
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private String avatar;
    private String phone;
    private String email;
    private String description;
    private Integer isEnable;
    private String lastLoginIp;
    private Integer loginCount;
    private LocalDateTime gmtLastLogin;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

}
