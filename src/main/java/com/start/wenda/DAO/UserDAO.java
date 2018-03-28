package com.start.wenda.DAO;

import com.start.wenda.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
    @Insert({"insert into user (name ,password) values (#{name},#{password})"})
    int addUser(User user);
}
