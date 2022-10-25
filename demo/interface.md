### Java Code
``` java
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
```

**Generated:** [Generate Document plugin for IntelliJ platform IDEs](https://plugins.jetbrains.com/plugin/13086-generate-document)

**Author:** yinzhengfei

**Dependency:**
``` xml
<dependency>
	<groupId>com.zhengfei</groupId>
	<artifactId>generate-document</artifactId>
	<version>1.0.0-SNAPSHOT</version>
</dependency>
```

# Class Name：com.zhengfei.gd.api.dubbo.InterfaceService


## 1.分页查询员工信息&nbsp;
**Method Name:** pageQuery

**Author:** 

**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── pageQuery|com.zhengfei.gd.api.param.PageQuery|&nbsp;|&nbsp;|分页参数<br/>&nbsp;
&nbsp;&nbsp; ├── pageNo|java.lang.Integer|&nbsp;|1|页码&nbsp;
&nbsp;&nbsp; └── pageSize|java.lang.Integer|&nbsp;|10|页大小&nbsp;

**Request-example:**
``` json
{
  "pageQuery": {
    "pageNo": "1",
    "pageSize": "10"
  }
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |com.zhengfei.gd.api.result.Result|返回结果&nbsp;
├── code|java.lang.Integer|错误码&nbsp;
└── data|com.zhengfei.gd.api.result.PageResult|数据集&nbsp;
&nbsp;&nbsp; ├── totalCount|java.lang.Integer|结果集总数&nbsp;
&nbsp;&nbsp; └── rows|java.util.List&lt;com.zhengfei.gd.api.model.EmployeeDTO&gt;|当前页码的结果集&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── id|java.lang.Long|员工ID&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── name|java.lang.String|员工姓名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── role|java.lang.String|员工角色&nbsp;

**Response-example:**
``` json
{
  "code": 9411,
  "data": {
    "totalCount": 68,
    "rows": [
      {
        "role": "EjyU0Vcv",
        "name": "VXx",
        "id": 1723
      }
    ]
  }
}
```

## 2.保存员工信息&nbsp;
**Method Name:** save

**Author:** 

**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── newEmployee|com.zhengfei.gd.api.model.EmployeeDTO|&nbsp;|&nbsp;|员工信息<br/>&nbsp;
&nbsp;&nbsp; ├── id|java.lang.Long|&nbsp;|&nbsp;|员工ID&nbsp;
&nbsp;&nbsp; ├── name|java.lang.String|&nbsp;|&nbsp;|员工姓名&nbsp;
&nbsp;&nbsp; └── role|java.lang.String|&nbsp;|&nbsp;|员工角色&nbsp;

**Request-example:**
``` json
{
  "newEmployee": {
    "role": "b2oPE9d",
    "name": "4zRS",
    "id": 1598
  }
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |com.zhengfei.gd.api.result.Result|返回结果&nbsp;
├── code|java.lang.Integer|错误码&nbsp;
└── data|java.lang.Long|数据集&nbsp;

**Response-example:**
``` json
{
  "code": 3343,
  "data": 878
}
```

## 3.根据员工ID查询员工信息&nbsp;
**Method Name:** getById

**Author:** 

**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|java.lang.Long|&nbsp;|&nbsp;|员工ID<br/>&nbsp;

**Request-example:**
``` json
{
  "id": 2623
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |com.zhengfei.gd.api.result.Result|返回结果&nbsp;
├── code|java.lang.Integer|错误码&nbsp;
└── data|com.zhengfei.gd.api.model.EmployeeDTO|数据集&nbsp;
&nbsp;&nbsp; ├── id|java.lang.Long|员工ID&nbsp;
&nbsp;&nbsp; ├── name|java.lang.String|员工姓名&nbsp;
&nbsp;&nbsp; └── role|java.lang.String|员工角色&nbsp;

**Response-example:**
``` json
{
  "code": 4772,
  "data": {
    "role": "x0oaux1aX",
    "name": "E6yHwzghUn",
    "id": 6223
  }
}
```

## 4.根据员工ID修改员工信息&nbsp;
**Method Name:** update

**Author:** 

**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── newEmployee|com.zhengfei.gd.api.model.EmployeeDTO|&nbsp;|&nbsp;|员工信息<br/>&nbsp;
&nbsp;&nbsp; ├── id|java.lang.Long|&nbsp;|&nbsp;|员工ID&nbsp;
&nbsp;&nbsp; ├── name|java.lang.String|&nbsp;|&nbsp;|员工姓名&nbsp;
&nbsp;&nbsp; └── role|java.lang.String|&nbsp;|&nbsp;|员工角色&nbsp;

**Request-example:**
``` json
{
  "newEmployee": {
    "role": "0SjZw",
    "name": "zZGm",
    "id": 9684
  }
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |com.zhengfei.gd.api.result.Result|返回结果&nbsp;
├── code|java.lang.Integer|错误码&nbsp;
└── data|java.lang.Long|数据集&nbsp;

**Response-example:**
``` json
{
  "code": 2352,
  "data": 5310
}
```

## 5.根据员工ID删除员工信息&nbsp;
**Method Name:** delete

**Author:** 

**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|java.lang.Long|&nbsp;|&nbsp;|员工ID<br/>&nbsp;

**Request-example:**
``` json
{
  "id": 6926
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |com.zhengfei.gd.api.result.Result|返回结果&nbsp;
├── code|java.lang.Integer|错误码&nbsp;
└── data|java.lang.Void|数据集&nbsp;

**Response-example:**
``` json
{
  "code": 193
}
```
