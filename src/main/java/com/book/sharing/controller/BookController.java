package com.book.sharing.controller;

import com.book.sharing.common.entity.ResultEntity;
import com.book.sharing.common.utils.GsonUtil;
import com.book.sharing.model.book.BookModel;
import com.book.sharing.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author code00000001 on 2020/10/7
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(value = "/save")
    public ResultEntity saveBook(@RequestBody BookModel bookModel) {
        Object book = bookService.save(bookModel);
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setResult(Optional.ofNullable(book).orElse(null));
        return resultEntity;
    }

    @GetMapping(value = "/get")
    public ResultEntity getBook(String id) {
        BookModel book = (BookModel) bookService.get(id);
        String gsonString = GsonUtil.gsonString(book);
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setResult(Optional.ofNullable(GsonUtil.gsonToBean(gsonString,BookModel.class)).orElse(null));
        return resultEntity;
    }
}
