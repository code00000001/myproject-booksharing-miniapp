package com.book.sharing.model.user;

import com.book.sharing.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author code00000001
 * @version 1.0
 * @date 2020/9/26 16:20
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "user_t")
public class UserModel extends BaseModel {

    @Column(name = "user_name")
    private String userName;
    @Column(name = "sex")
    private int sex;
    @Column(name = "photo_url")
    private String photoUrl;
    @Column(name = "wechat_id")
    private String wechatId;
    @Column(name = "phone_num")
    private String phoneNum;
    @Column(name = "location")
    private String location;
}
