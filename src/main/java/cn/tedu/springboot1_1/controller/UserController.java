package cn.tedu.springboot1_1.controller;


import cn.tedu.springboot1_1.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    /*
    处理用户注册功能的控制器。
    PostMapping 只能处理Post请求的控制，
    http://localhost:8080/handle_reg
    @Param user 浏览器提交的表单数据
    @return
     */


    @PostMapping("/handle_reg")
    public R handleReg(User user){
        System.out.println(user);
        return R.ok("收到信息！");

    }

}
