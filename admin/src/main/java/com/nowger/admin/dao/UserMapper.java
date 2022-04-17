package com.nowger.admin.dao;

import com.nowger.admin.model.UserModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteById(Long id);

    int insert(UserModel record);

    int insertById(UserModel record);

    UserModel findById(Long id);

    int update(UserModel record);

    int updateById(UserModel record);

    /**
     * 查询全部
     * @return
     */
    List<UserModel> findAll();
    UserModel findByName(@Param(value="name") String name);
}

