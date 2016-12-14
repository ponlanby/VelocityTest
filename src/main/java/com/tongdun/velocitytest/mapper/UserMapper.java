package com.tongdun.velocitytest.mapper;

import com.tongdun.velocitytest.module.*;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;

/**
 * Created by trc on 16/12/14.
 */
public interface UserMapper {
    @Select("select * from users where id = #{userId}")
    User getUser(@Param("userId")String userId);
}
