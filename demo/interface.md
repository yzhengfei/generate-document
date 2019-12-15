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

### Class Name：com.zhengfei.gd.api.dubbo.InterfaceService
#### 1.分页查询员工信息
**Method Name:** pageQuery

**Parameters:**

Parameter | Type|Required|DefaultValue|Description
---|---|---|---|---
└─pageQuery|com.zhengfei.gd.api.param.PageQuery|&nbsp;|&nbsp;|分页参数 
&nbsp;&nbsp;├─pageNo|java.lang.Integer|&nbsp;|&nbsp;|页码
&nbsp;&nbsp;└─pageSize|java.lang.Integer|&nbsp;|&nbsp;|页大小

**Parameter-example:**
```
{
  "pageQuery": {
    "pageNo": 4697,
    "pageSize": 1861
  }
}
```

**Result-fields:**

Field | Type|Description
---|---|---
┌─|com.zhengfei.gd.api.result.Result|返回结果
├─code|java.lang.Integer|错误码
└─data|com.zhengfei.gd.api.result.PageResult|数据集
&nbsp;&nbsp;├─totalCount|java.lang.Integer|结果集总数
&nbsp;&nbsp;└─rows|java.util.List<com.zhengfei.gd.api.model.EmployeeDTO>|当前页码的结果集
&nbsp;&nbsp;&nbsp;&nbsp;├─id|java.lang.Long|员工ID
&nbsp;&nbsp;&nbsp;&nbsp;├─name|java.lang.String|员工姓名
&nbsp;&nbsp;&nbsp;&nbsp;└─role|java.lang.String|员工角色

**Result-example:**
```
{
  "code": 9600,
  "data": {
    "totalCount": 504,
    "rows": [
      {
        "role": "gMVnJ78UY",
        "name": "6hJx",
        "id": 6074
      }
    ]
  }
}
```

#### 2.保存员工信息
**Method Name:** save

**Parameters:**

Parameter | Type|Required|DefaultValue|Description
---|---|---|---|---
└─newEmployee|com.zhengfei.gd.api.model.EmployeeDTO|&nbsp;|&nbsp;|员工信息 
&nbsp;&nbsp;├─id|java.lang.Long|&nbsp;|&nbsp;|员工ID
&nbsp;&nbsp;├─name|java.lang.String|&nbsp;|&nbsp;|员工姓名
&nbsp;&nbsp;└─role|java.lang.String|&nbsp;|&nbsp;|员工角色

**Parameter-example:**
```
{
  "newEmployee": {
    "role": "84",
    "name": "1GY",
    "id": 906
  }
}
```

**Result-fields:**

Field | Type|Description
---|---|---
┌─|com.zhengfei.gd.api.result.Result|返回结果
├─code|java.lang.Integer|错误码
└─data|java.lang.Long|数据集

**Result-example:**
```
{
  "code": 5583,
  "data": 4837
}
```

#### 3.根据员工ID查询员工信息
**Method Name:** getById

**Parameters:**

Parameter | Type|Required|DefaultValue|Description
---|---|---|---|---
└─id|java.lang.Long|&nbsp;|&nbsp;|员工ID 

**Parameter-example:**
```
{
  "id": 4648
}
```

**Result-fields:**

Field | Type|Description
---|---|---
┌─|com.zhengfei.gd.api.result.Result|返回结果
├─code|java.lang.Integer|错误码
└─data|com.zhengfei.gd.api.model.EmployeeDTO|数据集
&nbsp;&nbsp;├─id|java.lang.Long|员工ID
&nbsp;&nbsp;├─name|java.lang.String|员工姓名
&nbsp;&nbsp;└─role|java.lang.String|员工角色

**Result-example:**
```
{
  "code": 3034,
  "data": {
    "role": "vE",
    "name": "pKB2g2QIi",
    "id": 3766
  }
}
```

#### 4.根据员工ID修改员工信息
**Method Name:** update

**Parameters:**

Parameter | Type|Required|DefaultValue|Description
---|---|---|---|---
└─newEmployee|com.zhengfei.gd.api.model.EmployeeDTO|&nbsp;|&nbsp;|员工信息 
&nbsp;&nbsp;├─id|java.lang.Long|&nbsp;|&nbsp;|员工ID
&nbsp;&nbsp;├─name|java.lang.String|&nbsp;|&nbsp;|员工姓名
&nbsp;&nbsp;└─role|java.lang.String|&nbsp;|&nbsp;|员工角色

**Parameter-example:**
```
{
  "newEmployee": {
    "role": "Z5",
    "name": "s5dlKL",
    "id": 4056
  }
}
```

**Result-fields:**

Field | Type|Description
---|---|---
┌─|com.zhengfei.gd.api.result.Result|返回结果
├─code|java.lang.Integer|错误码
└─data|java.lang.Long|数据集

**Result-example:**
```
{
  "code": 9833,
  "data": 4595
}
```

#### 5.根据员工ID删除员工信息
**Method Name:** delete

**Parameters:**

Parameter | Type|Required|DefaultValue|Description
---|---|---|---|---
└─id|java.lang.Long|&nbsp;|&nbsp;|员工ID 

**Parameter-example:**
```
{
  "id": 3541
}
```

**Result-fields:**

Field | Type|Description
---|---|---
┌─|com.zhengfei.gd.api.result.Result|返回结果
├─code|java.lang.Integer|错误码
└─data|java.lang.Void|数据集

**Result-example:**
```
{
  "code": 7256
}
```