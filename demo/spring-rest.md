### Java Code
``` java
package com.zhengfei.gd.api.controller;

import com.zhengfei.gd.api.model.EmployeeDTO;
import com.zhengfei.gd.api.result.Result;
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

```

**Generated:** [Generate Document plugin for IntelliJ platform IDEs](https://plugins.jetbrains.com/plugin/13086-generate-document)

**Author:** yinzhengfei

**Version:** 1.0.0-SNAPSHOT

# Class Name：com.zhengfei.gd.api.controller.DemoController

## 1.已支持注解Demo&nbsp;

**URL:** http://localhost/rest/demo/{pathVariable}

**Type:** ALL

**Content-Type:** application/json

**Request-cookies:**

Cookie | Type|Required|DefaultValue|Description
---|---|---|---|----
cookieValue|string|false|Cookie默认值|Cookie<br/>&nbsp;

**Request-headers:**

Header | Type|Required|DefaultValue|Description
---|---|---|---|----
requestHeader|string|false|请求头默认参数|请求头<br/>&nbsp;

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── pathVariable|string|false|&nbsp;|Path变量<br/>

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── requestParam|string|false|请求参数默认值|请求参数<br/>

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── body|object|true|&nbsp;|请求Body<br/>
&nbsp;&nbsp; ├── id|int64|&nbsp;|&nbsp;|员工ID&nbsp;
&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|员工姓名&nbsp;
&nbsp;&nbsp; └── role|string|&nbsp;|&nbsp;|员工角色&nbsp;

**Request-body-example:**
``` json
{
  "role": "hbpTxeg82",
  "name": "M84wb",
  "id": 1062
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|返回结果&nbsp;
├── code|int32|错误码&nbsp;
└── data|none|数据集&nbsp;

**Response-example:**
``` json
{
  "code": 3711
}
```

**Curl-example:**
``` bash
curl -X GET -H 'Content-Type: application/json' -H 'requestHeader:请求头默认参数' -i http://localhost/rest/demo/fR --data '{
  "role": "hbpTxeg82",
  "name": "M84wb",
  "id": 1062
}'
```
