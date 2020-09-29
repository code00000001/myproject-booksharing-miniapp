package com.book.sharing.common.exception;

import com.book.sharing.common.entity.ResultEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局捕获异常处理类
 *
 * @author code00000001
 * @version 1.0
 * @date 2020/9/26 16:36
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    /**
     * 捕获处理自定义异常
     *
     * @param exception exception
     * @return map
     */
    @ResponseBody
    @ExceptionHandler(value = CustomException.class)
    public ResultEntity customExceptionHandler(HttpServletRequest request, CustomException exception) {
        log.error("发生业务异常！原因是: {}" ,exception.getErrorMsg());
        return ResultEntity.error(exception.getErrorCode(), exception.getErrorMsg());
    }


    /**
     * 处理空指针的异常
     * @param request request
     * @param exception exception
     * @return
     */
    @ExceptionHandler(value =NullPointerException.class)
    @ResponseBody
    public ResultEntity exceptionHandler(HttpServletRequest request, NullPointerException exception){
        log.error("发生空指针异常！原因是:",exception);
        return ResultEntity.error(CommonEnum.BODY_NOT_MATCH.getResultCode());
    }


    /**
     * 处理其他异常
     * @param request request
     * @param exception exception
     * @return
     */
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public ResultEntity exceptionHandler(HttpServletRequest request, RuntimeException exception){
        log.error("未知异常！原因是:",exception);
        return ResultEntity.error(CommonEnum.INTERNAL_SERVER_ERROR.getResultCode(), exception.getMessage());

    }

}
