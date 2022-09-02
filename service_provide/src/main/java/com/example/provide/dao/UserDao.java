package com.example.provide.dao;

import com.example.provide.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

   int insertUser(UserDO userDO);

}
