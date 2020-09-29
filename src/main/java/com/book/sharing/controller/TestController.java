package com.book.sharing.controller;

import com.book.sharing.common.exception.CustomException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author code00000001
 * @version 1.0
 * @date 2020/9/26 16:48
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/advice", method = RequestMethod.GET)
    public String test() {
        int i = 0;
        if (i == 0) {
            throw new CustomException("-1","i==0");
        }
        return null;
    }
}
