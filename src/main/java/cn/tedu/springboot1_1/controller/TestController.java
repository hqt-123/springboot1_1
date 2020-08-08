package cn.tedu.springboot1_1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController 定义发控制所有方法默认返回的都是 @ResponseBody
的方法，都会将返回值转换为JSON
@RestControler=@Controller+@ResponseBody
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test2" )
    public  R test2(){

        return R.ok("测试方法2 OK");
    }

    /*
     @GetMapping（"/get_test"）和
     @RequesttMapping(value ="/get_test",method=RequestMethod.Get)
     等价的就是为了简化RequestMapper 专门用于处理Get请求
     @return
     */
    @GetMapping("/get_test")
    public  R getTest(){
        return R.ok("Get请求测试！");
    }
}
