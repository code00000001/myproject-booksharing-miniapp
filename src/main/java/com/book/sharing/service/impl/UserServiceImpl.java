package com.book.sharing.service.impl;

import com.book.sharing.dao.UserRepository;
import com.book.sharing.model.user.UserModel;
import com.book.sharing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return userRepository.save(userModel);
    }
}
