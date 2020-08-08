package cn.tedu.springboot1_1.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    public  DemoController(){
        System.out.println("Init DemoController");
    }
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }
    /*
    设置了@ResponseBody 以后如果控制器方法返回Java Bean 对象
    则这个JavaBean 会被转换为JSON对象，放到响应的正文发送浏览器
    而且响应的ContentType 是application/json，表示JSON类型数据
    @return JavaBean
     */
    @RequestMapping("/test")

    @ResponseBody
    public  R test(){
        R r = new R();
        r.setStatus(R.OK);
        r.setMessage("测试信息");
        return r;
    }
}
