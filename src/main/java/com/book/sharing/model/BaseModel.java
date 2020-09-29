package com.book.sharing.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 基类
 *
 * @author code00000001
 * @version 1.0
 * @date 2020/9/26 15:18
 */
@Data
public class BaseModel implements Serializable {
    private static final long serialVersionUID = 8856195448675836303L;

    private Date createTime;

    private Date updateTime;

}
