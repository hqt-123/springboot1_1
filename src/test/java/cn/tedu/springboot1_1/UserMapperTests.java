package cn.tedu.springboot1_1;

import cn.tedu.springboot1_1.entity.User;
import cn.tedu.springboot1_1.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserMapperTests {
    @Resource
    UserMapper userMapper;
    @Test
    public void insertUsert(){
        User user = new User();
        user.setUsername("熊大");
        user.setPassword("123456");
        user.setAge(18);
        user.setPhone("25555");
        user.setPhone("2244@qq.com");
        user.setDeptId(5);
        int n = userMapper.insertUser(user);
        System.out.println(n);
}
    @Test
    void  updateUser(){
        User user = new User();
        user.setId(13);
        user.setUsername("天王盖地虎");
        int n = userMapper.updateUser(user);
        System.out.println(n);
    }
}
