package com.book.sharing.common.exception;

/**
 * @author code00000001
 * @version 1.0
 * @date 2020/9/26 17:23
 */
public enum CommonEnum implements BaseErrorInfoInterface{
    // 数据操作错误定义
    SUCCESS("200", "成功!"),
    BODY_NOT_MATCH("400","请求的数据格式不符!"),
    SIGNATURE_NOT_MATCH("401","请求的数字签名不匹配!"),
    NOT_FOUND("404", "未找到该资源!"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误!"),
    SERVER_BUSY("503","服务器正忙，请稍后再试!")
    ;

    private String resultCode;
    private String resultMsg;

    CommonEnum(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    @Override
    public String getResultCode() {
        return null;
    }

    @Override
    public String getResultMsg() {
        return null;
    }
}
