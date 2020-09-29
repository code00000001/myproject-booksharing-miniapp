package com.book.sharing.dao;

import com.book.sharing.model.user.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author code00000001 on 2020/9/29
 * @version 1.0
 */
public interface UserRepository extends JpaRepository<UserModel,String> {
}
