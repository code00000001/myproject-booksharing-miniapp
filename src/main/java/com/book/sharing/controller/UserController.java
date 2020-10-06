package com.book.sharing.controller;

import com.book.sharing.common.entity.ResultEntity;
import com.book.sharing.model.user.UserModel;
import com.book.sharing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author code00000001 on 2020/9/29
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/save")
    public ResultEntity saveUser(@RequestBody UserModel userModel) {
        Object user = userService.save(userModel);
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setResult(Optional.ofNullable(user).orElse(null));
        return resultEntity;
    }

    @GetMapping(value = "/get")
    public ResultEntity getUser(String id) {
        Object user = userService.get(id);
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setResult(Optional.ofNullable(user).orElse(null));
        return resultEntity;
    }
}
