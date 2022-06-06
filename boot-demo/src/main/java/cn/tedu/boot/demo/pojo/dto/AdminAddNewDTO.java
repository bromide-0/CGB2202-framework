package cn.tedu.boot.demo.pojo.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Classname: AdminAddNewDTO
 * @Author: bromide
 * @CreateTime: 2022/6/2--15:50
 * @Version: V1.0
 * @Description:
 */
@Data
public class AdminAddNewDTO implements Serializable {
    private String username;
    private String password;
    private String nickname;
    private String avatar;
    private String phone;
    private String email;
    private String description;
}
