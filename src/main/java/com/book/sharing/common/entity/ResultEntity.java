package com.book.sharing.common.entity;

import com.book.sharing.common.exception.BaseErrorInfoInterface;
import com.book.sharing.common.exception.CommonEnum;
import com.book.sharing.common.utils.GsonUtil;

/**
 * @author code00000001
 * @version 1.0
 * @date 2020/9/26 17:33
 */
public class ResultEntity {
    /**
     * 响应代码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应结果
     */
    private Object result;

    public ResultEntity() {
    }

    public ResultEntity(BaseErrorInfoInterface errorInfo) {
        this.code = errorInfo.getResultCode();
        this.message = errorInfo.getResultMsg();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    /**
     * 成功
     *
     * @return
     */
    public static ResultEntity success() {
        return success(null);
    }

    /**
     * 成功
     * @param data
     * @return
     */
    public static ResultEntity success(Object data) {
        ResultEntity rb = new ResultEntity();
        rb.setCode(CommonEnum.SUCCESS.getResultCode());
        rb.setMessage(CommonEnum.SUCCESS.getResultMsg());
        rb.setResult(data);
        return rb;
    }

    /**
     * 失败
     */
    public static ResultEntity error(BaseErrorInfoInterface errorInfo) {
        ResultEntity rb = new ResultEntity();
        rb.setCode(errorInfo.getResultCode());
        rb.setMessage(errorInfo.getResultMsg());
        rb.setResult(null);
        return rb;
    }

    /**
     * 失败
     */
    public static ResultEntity error(String code, String message) {
        ResultEntity rb = new ResultEntity();
        rb.setCode(code);
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }

    /**
     * 失败
     */
    public static ResultEntity error( String message) {
        ResultEntity rb = new ResultEntity();
        rb.setCode("-1");
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }

    @Override
    public String toString() {
        return GsonUtil.gsonString(this);
    }
}
