package com.book.sharing.dao;

import com.book.sharing.model.book.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author code00000001 on 2020/10/7
 * @version 1.0
 */
public interface BookRepository extends JpaRepository<BookModel, String> {
}
