package com.jdc.jsb.javaspringboot.mapper;

import com.jdc.jsb.javaspringboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id = #{id}")
    User getUserById(Integer id);
}
