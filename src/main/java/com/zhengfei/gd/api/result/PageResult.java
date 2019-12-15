package com.zhengfei.gd.api.result;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = -5561172672058724155L;

    /**
     * 结果集总数
     */
    private Integer totalCount;
    /**
     * 当前页码的结果集
     */
    private List<T> rows;

}
