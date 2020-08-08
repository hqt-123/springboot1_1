package cn.tedu.springboot1_1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//设置MyBatis的Mapper接口扫描功能
@MapperScan("cn.tedu.springboot1_1.mapper")
public class Springboot11Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot11Application.class, args);
    }


}
