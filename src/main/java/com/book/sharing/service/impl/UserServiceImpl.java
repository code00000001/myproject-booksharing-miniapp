package com.book.sharing.service.impl;

import com.book.sharing.dao.UserRepository;
import com.book.sharing.model.user.UserModel;
import com.book.sharing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author code00000001 on 2020/9/29
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Object save(UserModel userModel) {
        userModel.setCreateTime(LocalDateTime.now());
        userModel.setUpdateTime(LocalDateTime.now());
        return userRepository.save(userModel);
    }

    @Override
    public Object get(String id) {
        Optional<UserModel> optional = userRepository.findById(id);
        return optional.orElse(null);
    }
}
