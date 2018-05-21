package com.winterchen.service.user;

import com.github.pagehelper.PageInfo;
import com.winterchen.model.UserDomain;

import java.util.List;

/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
