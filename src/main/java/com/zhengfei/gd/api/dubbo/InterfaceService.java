package com.zhengfei.gd.api.dubbo;

import com.zhengfei.gd.api.model.EmployeeDTO;
import com.zhengfei.gd.api.param.PageQuery;
import com.zhengfei.gd.api.result.PageResult;
import com.zhengfei.gd.api.result.Result;

public interface InterfaceService {

    /**
     * 分页查询员工信息
     *
     * @param pageQuery 分页参数
     * @return 返回结果
     */
    Result<PageResult<EmployeeDTO>> pageQuery(PageQuery pageQuery);

    /**
     * 保存员工信息
     *
     * @param newEmployee 员工信息
     * @return 返回结果
     */
    Result<Long> save(EmployeeDTO newEmployee);

    /**
     * 根据员工ID查询员工信息
     *
     * @param id 员工ID
     * @return 返回结果
     */
    Result<EmployeeDTO> getById(Long id);

    /**
     * 根据员工ID修改员工信息
     *
     * @param newEmployee 员工信息
     * @return 返回结果
     */
    Result<Long> update(EmployeeDTO newEmployee);

    /**
     * 根据员工ID删除员工信息
     *
     * @param id 员工ID
     * @return 返回结果
     */
    Result<Void> delete(Long id);
}
