package com.zhengfei.gd.controller;

import com.zhengfei.gd.controller.model.EmployeeDTO;
import com.zhengfei.gd.controller.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rest/demo")
public class DemoController {

    /**
     * 已支持注解Demo
     *
     * @param cookie   Cookie
     * @param variable Path变量
     * @param param    请求参数
     * @param header   请求头
     * @param body     请求Body
     * @return 返回结果
     */
    @RequestMapping("/{pathVariable}")
    Result<Void> demo(@CookieValue(value = "cookieValue", required = false, defaultValue = "Cookie默认值") String cookie
            , @PathVariable(value = "pathVariable", required = false) String variable
            , @RequestParam(value = "requestParam", required = false, defaultValue = "请求参数默认值") String param
            , @RequestHeader(value = "requestHeader", required = false, defaultValue = "请求头默认参数") String header
            , @RequestBody EmployeeDTO body) {
        return null;
    }

}
