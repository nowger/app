package com.nowger.admin.service;

import com.nowger.admin.model.UserModel;

import java.util.List;

public interface UserService {


    int deleteById(Long id);
    int insert(UserModel record);

    int insertById(UserModel record);

    UserModel findById(Long id);

    int update(UserModel record);

    int updateById(UserModel record);

    List<UserModel> findAll();
    UserModel findByName(String username);

}
