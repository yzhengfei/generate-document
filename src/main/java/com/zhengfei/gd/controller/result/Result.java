package com.zhengfei.gd.controller.result;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 5819132722496207820L;

    /**
     * 错误码
     */
    private Integer code;
    /**
     * 数据集
     */
    private T data;

    public Result() {
        this.code = 0;
    }

    public Result(T data) {
        this.code = 0;
        this.data = data;
    }

}