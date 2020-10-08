package com.book.sharing.model.book;

import com.book.sharing.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author code00000001 on 2020/9/29
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "book_t")
public class BookModel extends BaseModel {
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "author_name")
    private String authorName;
    @Column(name = "publishing_house")
    private String publishingHouse;
    @Column(name = "sn_num")
    private String snNum;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "synopsis")
    private String synopsis;
    @Column(name = "book_photo_url")
    private String bookPhotoUrl;
    @Column(name = "book_category_id")
    private int bookCategoryId;
    @Column(name = "user_comment")
    private String userComment;
    @Column(name = "user_id")
    private String userId;
}
