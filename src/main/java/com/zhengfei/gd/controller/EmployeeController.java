package com.zhengfei.gd.controller;

import com.zhengfei.gd.controller.model.EmployeeDTO;
import com.zhengfei.gd.controller.result.PageResult;
import com.zhengfei.gd.controller.result.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/employees")
class EmployeeController {

    /**
     * 分页查询员工信息
     *
     * @param pageNo   页码
     * @param pageSize 页大小
     * @return 返回结果
     */
    @GetMapping("/page")
    Result<PageResult<EmployeeDTO>> pageQuery(@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo
            , @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        return null;
    }

    /**
     * 保存员工信息
     *
     * @param newEmployee 员工信息
     * @return 返回结果
     */
    @PostMapping
    Result<Long> save(@RequestBody EmployeeDTO newEmployee) {
        return null;
    }

    /**
     * 根据员工ID查询员工信息
     *
     * @param id 员工ID
     * @return 返回结果
     */
    @GetMapping("/{id}")
    Result<EmployeeDTO> getById(@PathVariable("id") Long id) {
        return null;
    }

    /**
     * 根据员工ID修改员工信息
     *
     * @param newEmployee 员工信息
     * @param id          员工ID
     * @return 返回结果
     */
    @PutMapping("/{id}")
    Result<Long> update(@RequestBody EmployeeDTO newEmployee, @PathVariable Long id) {
        return null;
    }

    /**
     * 根据员工ID删除员工信息
     *
     * @param id 员工ID
     * @return 返回结果
     */
    @DeleteMapping("/{id}")
    Result<Void> deleteEmployee(@PathVariable Long id) {
        return null;
    }

}
