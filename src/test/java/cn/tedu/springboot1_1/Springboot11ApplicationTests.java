package cn.tedu.springboot1_1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootTest
class Springboot11ApplicationTests {
    @Resource
    DataSource dataSource;
    @Test
    void contextLoads() {
        System.out.println(dataSource);
    }
}
