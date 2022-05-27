package cn.tedu.springmvc.controller;

import cn.tedu.springmvc.web.JasonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: BolgController
 * @Author: bromide
 * @CreateTime: 2022/5/27--14:23
 * @Version: V1.0
 * @Description:
 */
@RestController
@RequestMapping("/blogs")
public class BlogController {
    @GetMapping("/add-new.do")
    public JasonResult addNew(String title){
        title.length();
        return JasonResult.ok("BlogController -> add-new title :"+title);
    }
    @GetMapping("/delete.do")
    public JasonResult delete(String id){
        Long idNum = Long.valueOf(id);
        return JasonResult.ok("BlogController.delete -> id "+ idNum);
    }

}