package cn.tedu.springmvc.web;

/**
 * @Classname: State
 * @Author: bromide
 * @CreateTime: 2022/5/27--10:17
 * @Version: V1.0
 * @Description:
 */
public enum  State {
    OK(200),
    ERR_USERNAME(201),
    ERR_PASSWORD(202);
    private Integer value;

    private State (Integer value){
        this.value = value;
    }

    public Integer getValue(){
        return value;
    }
}
