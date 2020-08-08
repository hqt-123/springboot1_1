package cn.tedu.springboot1_1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootTest
public class DataSourceTests {
    @Resource
    DataSource dataSource;
    @Test
    void testDataSource(){
        String sql ="select 'Hello World!'";
        try(Connection conn = dataSource.getConnection()){
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString(1));
            }
        }catch ( Exception e){
            e.printStackTrace();
        }
    }

}
