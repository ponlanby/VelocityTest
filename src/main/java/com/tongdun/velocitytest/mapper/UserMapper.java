package com.tongdun.velocitytest.mapper;

import com.tongdun.velocitytest.model.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Created by trc on 16/12/14.
 */
public interface UserMapper {
    @Select("select * from users where id = #{userId}")
    User getUser(@Param("userId")String userId);

    @Select("select * from users")
    List<User> getAllUsers();

    @Insert("insert into users(name,age) values(#{userName}, #{userAge})")
    void addUser(@Param("userName")String userName, @Param("userAge")String userAge);

    @Delete("delete from users where id=#{userId}")
    void deleteUser(@Param("userId")String userId);
}
