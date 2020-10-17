package com.lening.test1005a_dengxiaonan.service;

import com.github.pagehelper.PageInfo;
import com.lening.test1005a_dengxiaonan.entity.UserBean;

public interface UserService {
    PageInfo<UserBean> getUserPage(Integer page, Integer pagesize, String mname, Integer aspoints, Integer bspoints);

    void deleteUserById(String id);

    UserBean getUserByid(String id);

    void updStu(UserBean userBean);
}
