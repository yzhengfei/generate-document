### Class Name：com.zhengfei.gd.controller.EmployeeController
#### 1.分页查询员工信息
**URL:** http://localhost/rest/employees/page

**Type:** GET



**Request-parameters:**

Parameter | Type|Required|DefaultValue|Description
---|---|---|---|---
├─pageNo|java.lang.Integer|true|1|页码 
└─pageSize|java.lang.Integer|true|10|页大小 

**Request-example:**
```
http://localhost/rest/employees/page?pageNo=1&pageSize=10
```


**Response-fields:**

Field | Type|Description
---|---|---
┌─|com.zhengfei.gd.controller.result.Result|返回结果
├─code|java.lang.Integer|错误码
└─data|com.zhengfei.gd.controller.result.PageResult|数据集
&nbsp;&nbsp;├─totalCount|java.lang.Integer|结果集总数
&nbsp;&nbsp;└─rows|java.util.List<com.zhengfei.gd.controller.model.EmployeeDTO>|当前页码的结果集
&nbsp;&nbsp;&nbsp;&nbsp;├─id|java.lang.Long|员工ID
&nbsp;&nbsp;&nbsp;&nbsp;├─name|java.lang.String|员工姓名
&nbsp;&nbsp;&nbsp;&nbsp;└─role|java.lang.String|员工角色

**Response-example:**
```
{
  "code": 5033,
  "data": {
    "totalCount": 4240,
    "rows": [
      {
        "role": "qp",
        "name": "CZrs",
        "id": 1823
      }
    ]
  }
}
```

#### 2.保存员工信息
**URL:** http://localhost/rest/employees/

**Type:** POST



**Request-parameters:**

Parameter | Type|Required|DefaultValue|Description
---|---|---|---|---
└─newEmployee|com.zhengfei.gd.controller.model.EmployeeDTO|true|&nbsp;|员工信息 
&nbsp;&nbsp;├─id|java.lang.Long|&nbsp;|&nbsp;|员工ID
&nbsp;&nbsp;├─name|java.lang.String|&nbsp;|&nbsp;|员工姓名
&nbsp;&nbsp;└─role|java.lang.String|&nbsp;|&nbsp;|员工角色

**Request-example:**
```
http://localhost/rest/employees/
```

**Request-body-example:**
```
{
  "role": "x",
  "name": "lWOQA",
  "id": 8847
}
```

**Response-fields:**

Field | Type|Description
---|---|---
┌─|com.zhengfei.gd.controller.result.Result|返回结果
├─code|java.lang.Integer|错误码
└─data|java.lang.Long|数据集

**Response-example:**
```
{
  "code": 4111,
  "data": 983
}
```

#### 3.根据员工ID查询员工信息
**URL:** http://localhost/rest/employees/{id}

**Type:** GET



**Request-parameters:**

Parameter | Type|Required|DefaultValue|Description
---|---|---|---|---
└─id|java.lang.Long|true|&nbsp;|员工ID 

**Request-example:**
```
http://localhost/rest/employees/4204
```


**Response-fields:**

Field | Type|Description
---|---|---
┌─|com.zhengfei.gd.controller.result.Result|返回结果
├─code|java.lang.Integer|错误码
└─data|com.zhengfei.gd.controller.model.EmployeeDTO|数据集
&nbsp;&nbsp;├─id|java.lang.Long|员工ID
&nbsp;&nbsp;├─name|java.lang.String|员工姓名
&nbsp;&nbsp;└─role|java.lang.String|员工角色

**Response-example:**
```
{
  "code": 2200,
  "data": {
    "role": "vca1",
    "name": "1AF4xnj",
    "id": 1023
  }
}
```

#### 4.根据员工ID修改员工信息
**URL:** http://localhost/rest/employees/{id}

**Type:** PUT



**Request-parameters:**

Parameter | Type|Required|DefaultValue|Description
---|---|---|---|---
├─newEmployee|com.zhengfei.gd.controller.model.EmployeeDTO|true|&nbsp;|员工信息 
&nbsp;&nbsp;├─id|java.lang.Long|&nbsp;|&nbsp;|员工ID
&nbsp;&nbsp;├─name|java.lang.String|&nbsp;|&nbsp;|员工姓名
&nbsp;&nbsp;└─role|java.lang.String|&nbsp;|&nbsp;|员工角色
└─id|java.lang.Long|true|&nbsp;|员工ID 

**Request-example:**
```
http://localhost/rest/employees/6363
```

**Request-body-example:**
```
{
  "role": "aI5uYS",
  "name": "ms8eWu",
  "id": 4022
}
```

**Response-fields:**

Field | Type|Description
---|---|---
┌─|com.zhengfei.gd.controller.result.Result|返回结果
├─code|java.lang.Integer|错误码
└─data|java.lang.Long|数据集

**Response-example:**
```
{
  "code": 5085,
  "data": 3488
}
```

#### 5.根据员工ID删除员工信息
**URL:** http://localhost/rest/employees/{id}

**Type:** DELETE



**Request-parameters:**

Parameter | Type|Required|DefaultValue|Description
---|---|---|---|---
└─id|java.lang.Long|true|&nbsp;|员工ID 

**Request-example:**
```
http://localhost/rest/employees/6137
```


**Response-fields:**

Field | Type|Description
---|---|---
┌─|com.zhengfei.gd.controller.result.Result|返回结果
├─code|java.lang.Integer|错误码
└─data|java.lang.Void|数据集

**Response-example:**
```
{
  "code": 318
}
```