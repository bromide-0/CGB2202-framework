package cn.tedu.boot.demo.web;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname: JasonResult
 * @Author: bromide
 * @CreateTime: 2022/5/27--9:02
 * @Version: V1.0
 * @Description:
 */
@Data
public class JasonResult<T> implements Serializable {
    //状态码
    private Integer state;
    //消息
    private String message;
    //数据
    private T data;

    //将构造方法写成私有的,使外部不能创建JasonResult对象(默认提供的无参构造是public,所以必须重写)
    private JasonResult(){}

    public static JasonResult<Void> ok(){
        //  这样写愚蠢至极
        // JasonResult jasonResult = new JasonResult();
        // jasonResult.setState(1);
        // return jasonResult;
        return ok(null);
    }

    public static <T> JasonResult<T> ok(T data){
        JasonResult<T> jasonResult = new JasonResult<>();
        jasonResult.setState(State.OK.getValue());
        jasonResult.setData(data);
        return jasonResult;
    }

    public static JasonResult<Void> fail(State state,String message){
        JasonResult<Void> jasonResult = new JasonResult<>();
        jasonResult.setState(state.getValue());
        jasonResult.setMessage(message);
        return jasonResult;
    }

}
