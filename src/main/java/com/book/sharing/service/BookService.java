package com.book.sharing.service;

import com.book.sharing.model.book.BookModel;

/**
 * @author code00000001 on 2020/10/7
 * @version 1.0
 */
public interface BookService {
    Object save(BookModel bookModel);

    Object get(String id);
}
