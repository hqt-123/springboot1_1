package cn.tedu.springboot1_1.mapper;

import cn.tedu.springboot1_1.entity.User;
import org.apache.ibatis.annotations.Insert;

public interface UserMapper {
    @Insert("INSERT INTO user("+
            "username,"+
            "password,"+
            "age,"+
            "phone,"+
            "email,"+
            "dpet_id"+
            ") VALUES("+
             "#{username},"+
            "#{password},"+
            "#{age},"+
            "#{phone},"+
            "#{email},"+
            "#{deptId}"+
                ")")
    int insertUser(User user);
    int updateUser(User user);

}
