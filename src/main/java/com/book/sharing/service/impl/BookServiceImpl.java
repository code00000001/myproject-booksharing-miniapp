package com.book.sharing.service.impl;

import com.book.sharing.dao.BookRepository;
import com.book.sharing.model.book.BookModel;
import com.book.sharing.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author code00000001 on 2020/10/7
 * @version 1.0
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository repository;

    @Override
    public Object save(BookModel bookModel) {
        bookModel.setCreateTime(LocalDateTime.now());
        bookModel.setUpdateTime(LocalDateTime.now());
        return repository.save(bookModel);
    }

    @Override
    public Object get(String id) {
        return repository.getOne(id);
    }
}
