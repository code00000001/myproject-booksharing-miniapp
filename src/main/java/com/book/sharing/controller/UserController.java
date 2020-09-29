package com.book.sharing.controller;

import com.book.sharing.common.entity.ResultEntity;
import com.book.sharing.model.user.UserModel;
import com.book.sharing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author code00000001 on 2020/9/29
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/save")
    public ResultEntity saveUser(UserModel userModel) {
        Object user = userService.save(userModel);
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setResult(Optional.ofNullable(user).orElse(null));
        return resultEntity;
    }
}
