package com.lening.test1005a_dengxiaonan.mapper;

import com.lening.test1005a_dengxiaonan.entity.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<UserBean> getUserPage(@Param("mname") String mname, @Param("aspoints") Integer aspoints,@Param("bspoints") Integer bspoints);

    void deleteUserById(@Param("id") String id);

    UserBean getUserByid(@Param("id") String id);

    void updStu(UserBean userBean);
}
