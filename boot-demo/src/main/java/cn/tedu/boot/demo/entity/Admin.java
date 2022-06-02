package cn.tedu.boot.demo.entity;

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

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", avatar='" + avatar + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", isEnable=" + isEnable +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", loginCount=" + loginCount +
                ", gmtLastLogin=" + gmtLastLogin +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(id, admin.id) &&
                Objects.equals(username, admin.username) &&
                Objects.equals(password, admin.password) &&
                Objects.equals(nickname, admin.nickname) &&
                Objects.equals(avatar, admin.avatar) &&
                Objects.equals(phone, admin.phone) &&
                Objects.equals(email, admin.email) &&
                Objects.equals(description, admin.description) &&
                Objects.equals(isEnable, admin.isEnable) &&
                Objects.equals(lastLoginIp, admin.lastLoginIp) &&
                Objects.equals(loginCount, admin.loginCount) &&
                Objects.equals(gmtLastLogin, admin.gmtLastLogin) &&
                Objects.equals(gmtCreate, admin.gmtCreate) &&
                Objects.equals(gmtModified, admin.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, nickname, avatar, phone, email, description, isEnable, lastLoginIp, loginCount, gmtLastLogin, gmtCreate, gmtModified);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public LocalDateTime getGmtLastLogin() {
        return gmtLastLogin;
    }

    public void setGmtLastLogin(LocalDateTime gmtLastLogin) {
        this.gmtLastLogin = gmtLastLogin;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}
