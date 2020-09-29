package com.book.sharing.common.exception;

/**
 * @author code00000001
 * @version 1.0
 * @date 2020/9/26 17:20
 */
public interface BaseErrorInfoInterface {
    /**
     * 错误码
     * @return String
     */
    String getResultCode();

    /**
     * 错误描述
     * @return String
     */
    String getResultMsg();

}
