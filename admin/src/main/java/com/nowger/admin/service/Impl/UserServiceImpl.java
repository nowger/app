package com.nowger.admin.service.Impl;

import com.nowger.admin.dao.UserMapper;
import com.nowger.admin.model.UserModel;
import com.nowger.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<UserModel> findAll(){
        return userMapper.findAll();
    }

    public int deleteById(Long id) {
        return userMapper.deleteById(id);
    }


    public int insert(UserModel record) {
        return userMapper.insert(record);
    }


    public int insertById(UserModel record) {
        return userMapper.insertById(record);
    }


    public UserModel findById(Long id) {
        return userMapper.findById(id);
    }


    public int update(UserModel record) {
        return userMapper.update(record);
    }


    public int updateById(UserModel record) {
        return userMapper.updateById(record);
    }

    public UserModel findByName(String name) {
        return userMapper.findByName(name);
    }

}
