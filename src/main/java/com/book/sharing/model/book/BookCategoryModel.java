package com.book.sharing.model.book;

import com.book.sharing.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author code00000001 on 2020/10/3
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "book_category_t")
public class BookCategoryModel extends BaseModel {
    @Column(name = "book_category_name")
    private String bookCategoryName;
}
