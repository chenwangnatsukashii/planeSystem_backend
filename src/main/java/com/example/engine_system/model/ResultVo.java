package com.example.engine_system.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVo<T> {

    // 状态码
    private int code;

    // 状态信息
    private String msg;

    // 返回对象
    private T data;

    public static <T> ResultVo<T> success(T data) {
        return new ResultVo<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), data);
    }

    public static <T> ResultVo<T> success(String message, T data) {
        return new ResultVo<>(ResultCode.SUCCESS.getCode(), message, data);
    }

    public static ResultVo<?> failed() {
        return new ResultVo<>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMsg(), null);
    }

    public static ResultVo<?> failed(String message) {
        return new ResultVo<>(ResultCode.FAILED.getCode(), message, null);
    }

    public static ResultVo<?> failed(StatusCode errorResult) {
        return new ResultVo<>(errorResult.getCode(), errorResult.getMsg(), null);
    }

    public static <T> ResultVo<T> instance(Integer code, String message, T data) {
        ResultVo<T> result = new ResultVo<>();
        result.setCode(code);
        result.setMsg(message);
        result.setData(data);
        return result;
    }
}
