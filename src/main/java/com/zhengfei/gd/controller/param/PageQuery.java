package com.zhengfei.gd.controller.param;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页查询的参数
 */
@Data
public class PageQuery implements Serializable {

    /**
     * 页码
     */
    private Integer pageNo = 1;

    /**
     * 页大小
     */
    private Integer pageSize = 10;

    public Integer getOffset() {
        return pageNo <= 0 ? 0 : (pageNo - 1) * pageSize;
    }

}
