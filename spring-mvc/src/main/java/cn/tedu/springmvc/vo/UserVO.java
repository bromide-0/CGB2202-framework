package cn.tedu.springmvc.vo;

/**
 * @Classname: UserVO
 * @Author: bromide
 * @CreateTime: 2022/5/26--11:40
 * @Version: V1.0
 * @Description:
 */
public class UserVO {
    // 不要使用JAVA 8 的日期时间属性
    private String username;
    private String password;
    private String email;

    @Override
    public String toString() {
        return "UserVO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
