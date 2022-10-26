### Java Code
```java
package com.zhengfei.gd.api.controller;

import com.zhengfei.gd.api.model.EmployeeDTO;
import com.zhengfei.gd.api.result.PageResult;
import com.zhengfei.gd.api.result.Result;
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
```

**Generated:** [Generate Document plugin for IntelliJ platform IDEs](https://plugins.jetbrains.com/plugin/13086-generate-document)

**Author:** yinzhengfei

**Version:** 1.0.0-SNAPSHOT

# Class Name：com.zhengfei.gd.api.controller.EmployeeController

## 1.分页查询员工信息&nbsp;

**URL:** http://localhost/rest/employees/page

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── pageNo|int32|true|1|页码<br/>
└── pageSize|int32|true|10|页大小<br/>

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|返回结果&nbsp;
├── code|int32|错误码&nbsp;
└── data|object|数据集&nbsp;
&nbsp;&nbsp; ├── totalCount|int32|结果集总数&nbsp;
&nbsp;&nbsp; └── rows|array&lt;object&gt;|当前页码的结果集&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── id|int64|员工ID&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── name|string|员工姓名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── role|string|员工角色&nbsp;

**Response-example:**
``` json
{
  "code": 5554,
  "data": {
    "totalCount": 2050,
    "rows": [
      {
        "role": "TYJuq",
        "name": "hk",
        "id": 2759
      }
    ]
  }
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/rest/employees/page --data 'pageNo=1&pageSize=10'
```

## 2.保存员工信息&nbsp;

**URL:** http://localhost/rest/employees/

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── newEmployee|object|true|&nbsp;|员工信息<br/>
&nbsp;&nbsp; ├── id|int64|&nbsp;|&nbsp;|员工ID&nbsp;
&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|员工姓名&nbsp;
&nbsp;&nbsp; └── role|string|&nbsp;|&nbsp;|员工角色&nbsp;

**Request-body-example:**
``` json
{
  "role": "05B",
  "name": "bF",
  "id": 7800
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|返回结果&nbsp;
├── code|int32|错误码&nbsp;
└── data|int64|数据集&nbsp;

**Response-example:**
``` json
{
  "code": 589,
  "data": 2137
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/rest/employees/ --data '{
  "role": "05B",
  "name": "bF",
  "id": 7800
}'
```

## 3.根据员工ID查询员工信息&nbsp;

**URL:** http://localhost/rest/employees/{id}

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|int64|true|&nbsp;|员工ID<br/>

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|返回结果&nbsp;
├── code|int32|错误码&nbsp;
└── data|object|数据集&nbsp;
&nbsp;&nbsp; ├── id|int64|员工ID&nbsp;
&nbsp;&nbsp; ├── name|string|员工姓名&nbsp;
&nbsp;&nbsp; └── role|string|员工角色&nbsp;

**Response-example:**
``` json
{
  "code": 9295,
  "data": {
    "role": "LtTt",
    "name": "Ds25H",
    "id": 2217
  }
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/rest/employees/5031
```

## 4.根据员工ID修改员工信息&nbsp;

**URL:** http://localhost/rest/employees/{id}

**Type:** PUT

**Content-Type:** application/json

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|int64|true|&nbsp;|员工ID<br/>

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── newEmployee|object|true|&nbsp;|员工信息<br/>
&nbsp;&nbsp; ├── id|int64|&nbsp;|&nbsp;|员工ID&nbsp;
&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|员工姓名&nbsp;
&nbsp;&nbsp; └── role|string|&nbsp;|&nbsp;|员工角色&nbsp;

**Request-body-example:**
``` json
{
  "role": "KPXCoStb8",
  "name": "pxQoXav",
  "id": 1793
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|返回结果&nbsp;
├── code|int32|错误码&nbsp;
└── data|int64|数据集&nbsp;

**Response-example:**
``` json
{
  "code": 4275,
  "data": 2076
}
```

**Curl-example:**
``` bash
curl -X PUT -H 'Content-Type: application/json' -i http://localhost/rest/employees/2248 --data '{
  "role": "KPXCoStb8",
  "name": "pxQoXav",
  "id": 1793
}'
```

## 5.根据员工ID删除员工信息&nbsp;

**URL:** http://localhost/rest/employees/{id}

**Type:** DELETE

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|int64|true|&nbsp;|员工ID<br/>

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|返回结果&nbsp;
├── code|int32|错误码&nbsp;
└── data|none|数据集&nbsp;

**Response-example:**
``` json
{
  "code": 8494
}
```

**Curl-example:**
``` bash
curl -X DELETE -i http://localhost/rest/employees/182
```
