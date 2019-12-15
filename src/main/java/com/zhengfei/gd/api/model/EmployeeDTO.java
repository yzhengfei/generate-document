package com.zhengfei.gd.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO implements Serializable {

    /**
     *员工ID
     */
    private Long id;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工角色
     */
    private String role;

}
