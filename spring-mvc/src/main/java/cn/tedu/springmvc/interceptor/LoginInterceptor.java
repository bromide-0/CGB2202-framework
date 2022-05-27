package cn.tedu.springmvc.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname: HandlerInterceptor
 * @Author: bromide
 * @CreateTime: 2022/5/27--15:53
 * @Version: V1.0
 * @Description:
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("LoginInterceptor.preHandle()");
        //在处理请求的方法之前执行

        // true 表示放行    false表示拦截
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 仅当处理请求的方法顺利执行结束之后执行(若这个请求处理过程中出现异常,则不会执行)

        System.out.println("LoginInterceptor.postHandle()");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 处理完请求或异常之后执行
        System.out.println("LoginInterceptor.afterCompletion()");
    }
}
