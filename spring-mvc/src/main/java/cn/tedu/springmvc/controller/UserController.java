package cn.tedu.springmvc.controller;

import cn.tedu.springmvc.web.JasonResult;
import cn.tedu.springmvc.dto.UserRegDTO;
import cn.tedu.springmvc.vo.UserVO;
import cn.tedu.springmvc.web.State;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname: UserController
 * @Author: bromide
 * @CreateTime: 2022/5/25--17:47
 * @Version: V1.0
 * @Description:
 */
@RestController
@RequestMapping("/users")
public class UserController {

    public UserController(){
        System.out.println("UserController.UserController()");
    }

    //http://localhost:8080/spring_mvc_war_exploded/hello.do
    //@RequestMapping 可用于配置[请求路径] 与 [处理请求的方法的映射关系]
    //@ResponseBody 用于讲方法的返回值以[响应正文]的方式响应到客户端
    // 注意: 在Spring MVC框架中,默认,响应的字符串正文并不支持中文
    @GetMapping("/hello.do")
    public JasonResult sayHello(String username){
        System.out.println("UserController.sayHello()");
        int l = username.length();
        return JasonResult.ok("username length= "+ l);

    }

    @GetMapping("/login.do")
    public JasonResult login(String username,String password){
        //假设用户名:"root" 密码:"123456"
        if ("root".equals(username)){
            if ("123456".equals(password)){
                return JasonResult.ok();
            }else {
                return JasonResult.fail(State.ERR_PASSWORD,"密码错误!");
            }
        }else {
            return JasonResult.fail(State.ERR_USERNAME,"用户名错误!");
        }
    }

    @GetMapping("/reg.do")
    public JasonResult reg(UserRegDTO user){
        System.out.println(user);
        return JasonResult.ok(user);
    }

    @GetMapping("/info.do")
    public JasonResult<UserVO> info(){
        UserVO user = new UserVO();
        user.setUsername("李涛");
        user.setPassword("66666");
        user.setEmail("bromide1988@163.com");

        return JasonResult.ok(user);
    }

    @GetMapping("/{id:[0-9]+}/info.do")
    public JasonResult getInfoById(@PathVariable Long id){
        return null;
    }

    @GetMapping("/{username:[a-zA-Z]+}/info.do")
    public String getInfoByUsername(@PathVariable String username){
        return "get user info,username="+username;
    }

    //当网址既满足正则表达式的网址,又满足其他网址的时候  优先查找精确网址
    @GetMapping("/list/info.do")
    public String getListInfo(){
        return "get user list-info";
    }

}
