package com.lening.test1005a_dengxiaonan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lening.test1005a_dengxiaonan.entity.UserBean;
import com.lening.test1005a_dengxiaonan.mapper.UserMapper;
import com.lening.test1005a_dengxiaonan.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public PageInfo<UserBean> getUserPage(Integer page, Integer pagesize, String mname, Integer aspoints, Integer bspoints) {
        //开始分页，设置分页参数
        PageHelper.startPage(page, pagesize);
        List<UserBean> list = userMapper.getUserPage(mname , aspoints , bspoints );
        PageInfo<UserBean> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public void deleteUserById(String id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public UserBean getUserByid(String id) {
        return userMapper.getUserByid(id);
    }

    @Override
    public void updStu(UserBean userBean) {
        userMapper.updStu(userBean);
    }
}
