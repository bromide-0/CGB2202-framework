package cn.tedu.springmvc.dto;

/**
 * @Classname: UserRegDTO
 * @Author: bromide
 * @CreateTime: 2022/5/26--15:29
 * @Version: V1.0
 * @Description:
 */
public class UserRegDTO {
    private String username;
    private String password;
    private Integer age;

    @Override
    public String toString() {
        return "UserRegDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
