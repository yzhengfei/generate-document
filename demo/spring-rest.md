### Class Name：[com.zhengfei.gd.controller.DemoController](src/main/java/com/zhengfei/gd/controller/DemoController.java)
#### 1.已支持注解Demo
**URL:** http://localhost/rest/demo/{pathVariable}

**Type:** ALL

**Request-cookies:**

Cookie | Type|Required|DefaultValue|Description
---|---|---|---|----
cookieValue|java.lang.String|false|Cookie默认值|Cookie 

**Request-headers:**

Header | Type|Required|DefaultValue|Description
---|---|---|---|----
requestHeader|java.lang.String|false|请求头默认参数|请求头 

**Request-parameters:**

Parameter | Type|Required|DefaultValue|Description
---|---|---|---|---
├─pathVariable|java.lang.String|false|&nbsp;|Path变量 
├─requestParam|java.lang.String|false|请求参数默认值|请求参数 
└─body|com.zhengfei.gd.controller.model.EmployeeDTO|true|&nbsp;|请求Body 
&nbsp;&nbsp;├─id|java.lang.Long|&nbsp;|&nbsp;|员工ID
&nbsp;&nbsp;├─name|java.lang.String|&nbsp;|&nbsp;|员工姓名
&nbsp;&nbsp;└─role|java.lang.String|&nbsp;|&nbsp;|员工角色

**Request-example:**
```
http://localhost/rest/demo/DzTLHvLX?requestParam=%E8%AF%B7%E6%B1%82%E5%8F%82%E6%95%B0%E9%BB%98%E8%AE%A4%E5%80%BC
```

**Request-body-example:**
```
{
  "role": "XF",
  "name": "k",
  "id": 4850
}
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
  "code": 4827
}
```