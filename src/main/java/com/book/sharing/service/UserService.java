package com.book.sharing.service;

import com.book.sharing.model.user.UserModel;

/**
 * @author code00000001 on 2020/9/29
 * @version 1.0
 */
public interface UserService {
    Object save(UserModel userModel);

    Object get(String id);
}
