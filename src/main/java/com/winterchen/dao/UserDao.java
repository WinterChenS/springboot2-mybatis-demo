package com.winterchen.dao;


import com.winterchen.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}