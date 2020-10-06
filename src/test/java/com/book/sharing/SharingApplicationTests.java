package com.book.sharing;

import com.book.sharing.model.user.UserModel;
import com.book.sharing.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

/**
 * @author code00000001
 * @version 1.0
 * @date 2020/9/26 12:11
 */
@SpringBootTest
class SharingApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void testSaveUser() {
        UserModel userModel = new UserModel();
        userModel.setUserName("zhangsan");
        userModel.setSex(1);
        userModel.setWechatId("123456");
        userModel.setLocation("shenzhen");
        userModel.setPhoneNum("10086");
        userModel.setCreateTime(LocalDateTime.now());
        userModel.setUpdateTime(LocalDateTime.now());
        userService.save(userModel);
    }

}
