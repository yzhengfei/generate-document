**Generated:** [Generate Document plugin for IntelliJ platform IDEs](https://plugins.jetbrains.com/plugin/13086-generate-document)

**Author:** yinzhengfei

**Version:** 0.0.1-SNAPSHOT

# 循环引用依赖测试

## 1.循环依赖参数推导
**URL:** http://localhost/circularReference

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── a|string|&nbsp;|&nbsp;|属性a
&nbsp;&nbsp; └── b|object|&nbsp;|&nbsp;|对象b
&nbsp;&nbsp; &nbsp;&nbsp; ├── b|string|&nbsp;|&nbsp;|属性b
&nbsp;&nbsp; &nbsp;&nbsp; └── c|object|&nbsp;|&nbsp;|对象c
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── c|string|&nbsp;|&nbsp;|属性c
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; └── a|object|&nbsp;|&nbsp;|对象A

**Request-example:**
``` json
http://localhost/circularReference
```

**Request-body-example:**
``` json
{
  "a": "EC",
  "b": {
    "b": "P0k",
    "c": {
      "c": "1sqe1rBv"
    }
  }
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── a|string|属性a
└── b|object|对象b
&nbsp;&nbsp; ├── b|string|属性b
&nbsp;&nbsp; └── c|object|对象c
&nbsp;&nbsp; &nbsp;&nbsp; ├── c|string|属性c
&nbsp;&nbsp; &nbsp;&nbsp; └── a|object|对象A

**Response-example:**
``` json
{
  "a": "2",
  "b": {
    "b": "f",
    "c": {
      "c": "PiIHozAi52"
    }
  }
}
```

# 枚举参数测试

## 1.获取枚举参数1
**URL:** http://localhost/enum

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── simpleEnum|enum|&nbsp;|&nbsp;|RED<br/>BLUE

**Request-example:**
``` json
http://localhost/enum
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"QjIPY"
```

## 2.获取枚举参数2
**URL:** http://localhost/enum/{orderEnum}

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── orderEnum|enum|true|&nbsp;|WAIT_PAY("0", "已支付")<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")

**Request-example:**
``` json
http://localhost/enum/EXPIRED
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"YpaQra"
```

## 3.获取枚举参数3
**URL:** http://localhost/enum/{simpleEnum}

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── simpleEnum|enum|true|&nbsp;|RED<br/>BLUE

**Request-example:**
``` json
http://localhost/enum/BLUE
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"YNTjEYg"
```

## 4.获取枚举参数4
**URL:** http://localhost/enum/test1

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── order|object|true|&nbsp;|简单枚举<br/>
&nbsp;&nbsp; ├── orderId|int32|&nbsp;|0|订单id
&nbsp;&nbsp; └── orderType|enum|&nbsp;|&nbsp;|订单类型<br/>WAIT_PAY("0", "已支付")<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")

**Request-example:**
``` json
http://localhost/enum/test1
```

**Request-body-example:**
``` json
{
  "orderType": "EXPIRED",
  "orderId": 0
}
```

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"o"
```

## 5.枚举响应
**URL:** http://localhost/enum/resp

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/enum/resp
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|enum|RED<br/>BLUE

**Response-example:**
``` json
"BLUE"
```

# 文件下载

## 1.下载文件
**URL:** http://localhost/download1/{filename}

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── filename|string|true|&nbsp;|文件名│me<br/>

**Request-example:**
``` json
http://localhost/download1/fdKoIrRvJ
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|file|&nbsp;


## 2.下载普通文件文件
**URL:** http://localhost/text/

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── response|object|&nbsp;|&nbsp;|

**Request-example:**
``` json
http://localhost/text/
```


**Response-fields:**

None


## 3.分页查询
**URL:** http://localhost/list

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── t|object|true|&nbsp;|&nbsp;

**Request-example:**
``` json
http://localhost/list
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|object|&nbsp;


# 文件上传测试

## 1.上传单个文件
**URL:** http://localhost/upload

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── userId|string|&nbsp;|&nbsp;|用户id<br/>
└── file|file|true|<br/>		<br/>		<br/><br/>				<br/>|文件<br/>

**Request-example:**
``` json
http://localhost/upload?file=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "zuYDU",
  "success": false,
  "message": "Rc5amotY",
  "timestamp": "p"
}
```

## 2.批量上传文件
**URL:** http://localhost/batchUpload

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── file|array|&nbsp;|&nbsp;|文件<br/>
&nbsp;&nbsp; └── &nbsp;|file|&nbsp;|&nbsp;|&nbsp;

**Request-example:**
``` json
http://localhost/batchUpload
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "wnUpp",
  "success": false,
  "message": "W",
  "timestamp": "nD68"
}
```

## 3.批量上传文件1
**URL:** http://localhost/batchUpload1

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── file|array&lt;file&gt;|&nbsp;|&nbsp;|文件<br/>

**Request-example:**
``` json
http://localhost/batchUpload1
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "P",
  "success": false,
  "message": "DnhaPr",
  "timestamp": "WEVbihO8z8"
}
```

## 4.批量上传文件2
**URL:** http://localhost/batchUpload2

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── files|array|&nbsp;|&nbsp;|批量文件<br/>
&nbsp;&nbsp; └── &nbsp;|file|&nbsp;|&nbsp;|&nbsp;

**Request-example:**
``` json
http://localhost/batchUpload2
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "2z3ySu",
  "success": false,
  "message": "owd4lzPJ7",
  "timestamp": "ogZ00az"
}
```

## 5.批量上传文件3
**URL:** http://localhost/batchUpload3

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── files|array&lt;file&gt;|&nbsp;|&nbsp;|批量文件<br/>

**Request-example:**
``` json
http://localhost/batchUpload3
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "KLI0c66fS",
  "success": false,
  "message": "R1ukA",
  "timestamp": "mBZ8EqN5"
}
```

# 接收表单参数

## 1.Post请求发表单文件
**URL:** http://localhost/formData2

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── userId|string|&nbsp;|&nbsp;|
├── userData|string|&nbsp;|&nbsp;|&nbsp;
└── file|file|&nbsp;|&nbsp;|&nbsp;

**Request-example:**
``` json
http://localhost/formData2
```


**Response-fields:**

None


## 2.Get请求发表单文件 暂不支持完全解析
**URL:** http://localhost/formData2

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── userId|string|&nbsp;|&nbsp;|
├── userData|string|&nbsp;|&nbsp;|
└── file|file|&nbsp;|&nbsp;|&nbsp;

**Request-example:**
``` json
http://localhost/formData2
```


**Response-fields:**

None


## 3.表单 包含复杂对象的Get 暂不支持完全解析
**URL:** http://localhost/formData4

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── userId|string|&nbsp;|&nbsp;|
├── userData|string|&nbsp;|&nbsp;|
└── simpleUser|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── AGE|int32|&nbsp;|100|&nbsp;
&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;|120|&nbsp;
&nbsp;&nbsp; ├── gender|enum|&nbsp;|&nbsp;|性别<br/>WOMAN(0,"女人")<br/>MAN(2,"男人")
&nbsp;&nbsp; ├── simpleEnum|enum|&nbsp;|&nbsp;|简单枚举<br/>RED<br/>BLUE
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; └── mobile|string|&nbsp;|&nbsp;|电话

**Request-example:**
``` json
http://localhost/formData4
```


**Response-fields:**

None


## 4.测试formData带路径参数
**URL:** http://localhost/formData7/{id}

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── id|string|true|&nbsp;|
└── simpleUser|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── AGE|int32|&nbsp;|100|&nbsp;
&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;|120|&nbsp;
&nbsp;&nbsp; ├── gender|enum|&nbsp;|&nbsp;|性别<br/>WOMAN(0,"女人")<br/>MAN(2,"男人")
&nbsp;&nbsp; ├── simpleEnum|enum|&nbsp;|&nbsp;|简单枚举<br/>RED<br/>BLUE
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; └── mobile|string|&nbsp;|&nbsp;|电话

**Request-example:**
``` json
http://localhost/formData7/OBtAthXP
```


**Response-fields:**

None


## 5.测试formData带路多个路径参数
**URL:** http://localhost/formData8/{id}/{age}

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── id|string|true|&nbsp;|
├── age|int32|true|&nbsp;|
└── simpleUser|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── AGE|int32|&nbsp;|100|&nbsp;
&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;|120|&nbsp;
&nbsp;&nbsp; ├── gender|enum|&nbsp;|&nbsp;|性别<br/>WOMAN(0,"女人")<br/>MAN(2,"男人")
&nbsp;&nbsp; ├── simpleEnum|enum|&nbsp;|&nbsp;|简单枚举<br/>RED<br/>BLUE
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; └── mobile|string|&nbsp;|&nbsp;|电话

**Request-example:**
``` json
http://localhost/formData8/xHfijudj/5587
```


**Response-fields:**

None


# java泛型解析测试

## 1.测试多泛型1
**URL:** http://localhost/generics/test1

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/generics/test1
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── test|string|托尔斯泰
├── value|object|value
│&nbsp;&nbsp; ├── AGE|int32|&nbsp;
│&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;
│&nbsp;&nbsp; ├── gender|enum|性别<br/>WOMAN(0,"女人")<br/>MAN(2,"男人")
│&nbsp;&nbsp; ├── simpleEnum|enum|简单枚举<br/>RED<br/>BLUE
│&nbsp;&nbsp; ├── username|string|用户名
│&nbsp;&nbsp; ├── password|string|密码
│&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; └── mobile|string|电话
└── key|object|key
&nbsp;&nbsp; ├── roleId|int32|角色id
&nbsp;&nbsp; └── roleName|string|角色名称

**Response-example:**
``` json
{
  "test": "77zDXj",
  "value": {
    "password": "q5B",
    "gender": "MAN",
    "MAX_SPEED": "120",
    "simpleEnum": "BLUE",
    "nickName": "txSAiDu5K",
    "mobile": "8PCY",
    "AGE": "100",
    "username": "rsMh"
  },
  "key": {
    "roleId": 2120,
    "roleName": "2xT6tF"
  }
}
```

## 2.测试多泛型2
**URL:** http://localhost/generics/test2

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/generics/test2
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|author: hcy<br/>version: 1.0.0V<br/>date:  2019/12/5 14:36<br/>description: 分页返回工具类
├── total|int32|总条数
├── other|object|其他信息
│&nbsp;&nbsp; ├── AGE|int32|&nbsp;
│&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;
│&nbsp;&nbsp; ├── gender|enum|性别<br/>WOMAN(0,"女人")<br/>MAN(2,"男人")
│&nbsp;&nbsp; ├── simpleEnum|enum|简单枚举<br/>RED<br/>BLUE
│&nbsp;&nbsp; ├── username|string|用户名
│&nbsp;&nbsp; ├── password|string|密码
│&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; └── mobile|string|电话
└── rows|array&lt;object&gt;|数据列表
&nbsp;&nbsp; ├── roleId|int32|角色id
&nbsp;&nbsp; └── roleName|string|角色名称

**Response-example:**
``` json
{
  "total": 0,
  "other": {
    "password": "5W6Omrc3",
    "gender": "MAN",
    "MAX_SPEED": "120",
    "simpleEnum": "BLUE",
    "nickName": "72C3I3r",
    "mobile": "1Z5hWyVc",
    "AGE": "100",
    "username": "GM3MyQeqm"
  },
  "rows": [
    {
      "roleId": 7808,
      "roleName": "QWgy"
    }
  ]
}
```

## 3.测试单泛型嵌套
**URL:** http://localhost/generics/test3

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/generics/test3
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|角色
│&nbsp;&nbsp; ├── roleId|int32|角色id
│&nbsp;&nbsp; └── roleName|string|角色名称
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "oIzv",
  "data": {
    "roleId": 8598,
    "roleName": "LYY"
  },
  "success": false,
  "message": "NEIMsVlMeE",
  "timestamp": "lC4uK32kSC"
}
```

# https测试

## 1.测试https
**URL:** http://localhost/testHttps

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/testHttps
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "gL99mKw",
  "data": "pQz8fr",
  "success": false,
  "message": "iVwh4Gakoo",
  "timestamp": "QAWGOvgc"
}
```

## 2.测试http
**URL:** http://localhost/testHttp

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/testHttp
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "N7vJn",
  "data": "LrOAl4PQv",
  "success": false,
  "message": "GdiaUmpJ",
  "timestamp": "AaPhuwvH"
}
```

# Test inner class

## 1.Return A object contains Inner class
**URL:** http://localhost/inner/class

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/inner/class
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|用于测试内部类解析
├── name|string|姓名
└── innerClass|object|内部类
&nbsp;&nbsp; └── phone|string|电话

**Response-example:**
``` json
{
  "name": "c5",
  "innerClass": {
    "phone": "IWz"
  }
}
```

# JDK8的时间测试

## 1.LocalDate和LocalDateTime测试
**URL:** http://localhost/dateEntity

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── dateEntity|object|true|&nbsp;|
&nbsp;&nbsp; ├── localDate|string|&nbsp;|&nbsp;|创建日期
&nbsp;&nbsp; ├── localDateTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; ├── localTime|string|&nbsp;|&nbsp;|jdk8 LocalTime
&nbsp;&nbsp; └── createDate|string|&nbsp;|&nbsp;|创建时间

**Request-example:**
``` json
http://localhost/dateEntity
```

**Request-body-example:**
``` json
{
  "localDateTime": {
    "date": {
      "year": 2091,
      "month": 2,
      "day": 7
    },
    "time": {
      "hour": 9,
      "minute": 44,
      "second": 50,
      "nano": 969000000
    }
  },
  "localTime": {
    "hour": 9,
    "minute": 45,
    "second": 54,
    "nano": 0
  },
  "localDate": {
    "year": 2016,
    "month": 7,
    "day": 13
  },
  "createDate": {
    "date": {
      "year": 2027,
      "month": 6,
      "day": 16
    },
    "time": {
      "hour": 13,
      "minute": 10,
      "second": 6,
      "nano": 568000000
    }
  }
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── localDate|string|创建日期
├── localDateTime|string|创建时间
├── localTime|string|jdk8 LocalTime
└── createDate|string|创建时间

**Response-example:**
``` json
{
  "localDateTime": {
    "date": {
      "year": 2069,
      "month": 5,
      "day": 27
    },
    "time": {
      "hour": 23,
      "minute": 49,
      "second": 16,
      "nano": 140000000
    }
  },
  "localTime": {
    "hour": 23,
    "minute": 56,
    "second": 24,
    "nano": 0
  },
  "localDate": {
    "year": 2057,
    "month": 9,
    "day": 25
  },
  "createDate": {
    "date": {
      "year": 2057,
      "month": 3,
      "day": 30
    },
    "time": {
      "hour": 23,
      "minute": 55,
      "second": 29,
      "nano": 920000000
    }
  }
}
```

# Jpa代码测试

## 1.~~Jpa Page~~
**URL:** http://localhost/test

**Type:** POST



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/test
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;object&gt;|&nbsp;
└── &nbsp;|object|角色
&nbsp;&nbsp; ├── roleId|int32|角色id
&nbsp;&nbsp; └── roleName|string|角色名称

**Response-example:**
``` json
[
  {
    "roleId": 3388,
    "roleName": "3RisXMWi"
  }
]
```

## 2.Jpa Pageable查询参数重渲染
**URL:** http://localhost/pageableParam

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── pageable|object|true|&nbsp;|com.power.doc.model.PageRequestDto

**Request-example:**
``` json
http://localhost/pageableParam
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "WvdzHV6D",
  "success": false,
  "message": "CpNgFYsc1P",
  "timestamp": "2WPjlV8uEX"
}
```

# 测试json

## 1.RequestParam+json
**URL:** http://localhost/getUserJson

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── name|string|true|<br/>		<br/>		<br/><br/>				<br/>|
└── pramInfo|object|true|&nbsp;|
&nbsp;&nbsp; ├── dataExpressionEnum|enum|&nbsp;|&nbsp;|枚举<br/>SENSIRION("2101", new HashMap&lt;&gt;()) - temperature
&nbsp;&nbsp; ├── menuPermissionCodes|array&lt;enum&gt;|&nbsp;|&nbsp;|菜单/权限编码
&nbsp;&nbsp; ├── date|string|&nbsp;|&nbsp;|学好
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; ├── idCard|string|&nbsp;|&nbsp;|身份证号
&nbsp;&nbsp; ├── age|int32|&nbsp;|0|&nbsp;
&nbsp;&nbsp; └── age2|int32|&nbsp;|&nbsp;|&nbsp;

**Request-example:**
``` json
http://localhost/getUserJson?name=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A
```

**Request-body-example:**
``` json
{
  "date": "Dec 8, 2070, 12:56:36 AM",
  "idCard": "e3xyAJek",
  "menuPermissionCodes": [
    "WAIT_PAY"
  ],
  "dataExpressionEnum": "SENSIRION",
  "age": 0,
  "age2": 5637,
  "username": "53m33yQzvC"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"cUR"
```

# FastJson和Jackson注解支持测试

## 1.Jackson注解支持测试
**URL:** http://localhost/json/jacksonTest

**Type:** ALL



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── annotation|object|true|&nbsp;|
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; └── idCard|string|&nbsp;|&nbsp;|身份证号

**Request-example:**
``` json
http://localhost/json/jacksonTest
```

**Request-body-example:**
``` json
{
  "idCard": "zL",
  "username": "1Sy"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── username|string|用户名
└── idCard|string|身份证号

**Response-example:**
``` json
{
  "idCard": "Ou",
  "username": "mrsI5JHa"
}
```

## 2.FastJson注解支持测试
**URL:** http://localhost/json/fastJsonTest

**Type:** ALL



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── fastJson|object|true|&nbsp;|
&nbsp;&nbsp; ├── dataExpressionEnum|enum|&nbsp;|&nbsp;|枚举<br/>SENSIRION("2101", new HashMap&lt;&gt;()) - temperature
&nbsp;&nbsp; ├── menuPermissionCodes|array&lt;enum&gt;|&nbsp;|&nbsp;|菜单/权限编码
&nbsp;&nbsp; ├── date|string|&nbsp;|&nbsp;|学好
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; ├── idCard|string|&nbsp;|&nbsp;|身份证号
&nbsp;&nbsp; ├── age|int32|&nbsp;|0|&nbsp;
&nbsp;&nbsp; └── age2|int32|&nbsp;|&nbsp;|&nbsp;

**Request-example:**
``` json
http://localhost/json/fastJsonTest
```

**Request-body-example:**
``` json
{
  "date": "Nov 7, 2023, 10:41:07 AM",
  "idCard": "Isxb",
  "menuPermissionCodes": [
    "WAIT_PAY"
  ],
  "dataExpressionEnum": "SENSIRION",
  "age": 0,
  "age2": 6836,
  "username": "mueJ"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── dataExpressionEnum|enum|枚举<br/>SENSIRION("2101", new HashMap&lt;&gt;()) - temperature
├── menuPermissionCodes|array&lt;enum&gt;|菜单/权限编码
├── date|string|学好
├── username|string|用户名
├── idCard|string|身份证号
├── age|int32|&nbsp;
└── age2|int32|&nbsp;

**Response-example:**
``` json
{
  "date": "Aug 30, 2029, 4:03:23 AM",
  "idCard": "Gom",
  "menuPermissionCodes": [
    "EXPIRED"
  ],
  "dataExpressionEnum": "SENSIRION",
  "age": 0,
  "age2": 8520,
  "username": "x8DiqWP"
}
```

# List返回接口Api文档测试

## 1.List&lt;String&gt;结构
**URL:** http://localhost/list/listString

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/list/listString
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;string&gt;|&nbsp;
└── &nbsp;|string|&nbsp;

**Response-example:**
``` json
[
  "fjkKTSwg"
]
```

## 2.List&lt;Map&lt;String,String&gt;&gt;结构
**URL:** http://localhost/list/listMap

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/list/listMap
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;map&gt;|&nbsp;
└── &nbsp;|map&lt;string, string&gt;|&nbsp;
&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; └── &nbsp;|string|&nbsp;

**Response-example:**
``` json
[
  {
    "null": "j7Y"
  }
]
```

## 3.List&lt;自动义对象&gt;
**URL:** http://localhost/list/listObject

**Type:** POST



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/list/listObject
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;object&gt;|&nbsp;
└── &nbsp;|object|Description:<br/>用户对象
&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; └── telephone|string|固定电话

**Response-example:**
``` json
[
  {
    "userAddress": "W8T",
    "small": 9704.19,
    "userList": [
      {
        "userAddress": "ts4ZBxGKA",
        "small": 4266.3,
        "userList": [],
        "money": 1493.02,
        "phone": "YdNq",
        "createTime": 1862,
        "nickName": "zqf",
        "ipv6": "M95pV0I87",
        "telephone": "p",
        "userName": "E8QePlB",
        "userDetails": [
          {
            "githubAddress": "u"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 4381.91,
    "phone": "f",
    "createTime": 9347,
    "nickName": "DVUxNj",
    "ipv6": "XDf60ewLq",
    "telephone": "hzpAzJWJ",
    "userName": "riwm",
    "userDetails": [
      {
        "githubAddress": "dyB"
      }
    ],
    "userAge": 0
  }
]
```

## 4.List&lt;Map&lt;String,T&gt;&gt;结构
**URL:** http://localhost/list/listMap2

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/list/listMap2
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;map&gt;|&nbsp;
└── &nbsp;|map&lt;string, object&gt;|&nbsp;
&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>学生信息
&nbsp;&nbsp; &nbsp;&nbsp; ├── stuName|string|姓名
&nbsp;&nbsp; &nbsp;&nbsp; ├── stuAge|boolean|年龄
&nbsp;&nbsp; &nbsp;&nbsp; ├── stuAddress|string|地址
&nbsp;&nbsp; &nbsp;&nbsp; ├── user|object|用户对象
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; ├── userMap|map&lt;string, object&gt;|map用户信息
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; ├── userTreeSet|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; └── user1|object|用户对象2
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话

**Response-example:**
``` json
[
  {
    "null": {
      "user1": {
        "userAddress": "du9Ewm",
        "small": 5864.28,
        "userList": [
          {
            "userAddress": "F",
            "small": 8949.99,
            "userList": [],
            "money": 7286.03,
            "phone": "A",
            "createTime": 6833,
            "nickName": "zgSWDECfFx",
            "ipv6": "AkG2Edi",
            "telephone": "VAy",
            "userName": "GYY",
            "userDetails": [
              {
                "githubAddress": "2"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 4789.28,
        "phone": "xW6M",
        "createTime": 3343,
        "nickName": "mUo",
        "ipv6": "s28K0",
        "telephone": "ehOq36Bl9g",
        "userName": "hfDavKNO",
        "userDetails": [
          {
            "githubAddress": "oaBuaV"
          }
        ],
        "userAge": 0
      },
      "userTreeSet": [
        {
          "userAddress": "l",
          "small": 1394.99,
          "userList": [
            {
              "userAddress": "pFJJZ6g9bU",
              "small": 1931.6,
              "userList": [],
              "money": 2133.99,
              "phone": "VIg",
              "createTime": 6030,
              "nickName": "rt",
              "ipv6": "Dn8YsA",
              "telephone": "MJ",
              "userName": "LJB0MN",
              "userDetails": [
                {
                  "githubAddress": "2i6GYY"
                }
              ],
              "userAge": 0
            }
          ],
          "money": 1904.21,
          "phone": "uaH",
          "createTime": 5744,
          "nickName": "TsUEFfSy",
          "ipv6": "8tyPoSq0op",
          "telephone": "xadN2gM",
          "userName": "mV0SE",
          "userDetails": [
            {
              "githubAddress": "ssZDOZORA"
            }
          ],
          "userAge": 0
        }
      ],
      "stuAddress": "Y9bUj",
      "stuName": "xjJzzw",
      "userMap": {
        "null": {
          "userAddress": "NJna",
          "small": 6968.15,
          "userList": [
            {
              "userAddress": "K",
              "small": 1362.99,
              "userList": [],
              "money": 1549.65,
              "phone": "p",
              "createTime": 1350,
              "nickName": "OGmt3",
              "ipv6": "Jr",
              "telephone": "rV0FsfRO7",
              "userName": "v7yowB",
              "userDetails": [
                {
                  "githubAddress": "tkG52cij"
                }
              ],
              "userAge": 0
            }
          ],
          "money": 9290.67,
          "phone": "P5yyacm",
          "createTime": 4558,
          "nickName": "Vj4Tfl",
          "ipv6": "Ldk7Kt",
          "telephone": "KNa38AK",
          "userName": "2565DRo",
          "userDetails": [
            {
              "githubAddress": "ZCUm5xsHeS"
            }
          ],
          "userAge": 0
        }
      },
      "stuAge": true,
      "user": {
        "userAddress": "6Tjx5",
        "small": 8686.1,
        "userList": [
          {
            "userAddress": "oeS3mY8JIP",
            "small": 8802.71,
            "userList": [],
            "money": 2801.26,
            "phone": "R5HOWpE4",
            "createTime": 2073,
            "nickName": "G",
            "ipv6": "4S",
            "telephone": "6c3",
            "userName": "lzISGJXpX",
            "userDetails": [
              {
                "githubAddress": "BJA4A"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 5320.33,
        "phone": "m",
        "createTime": 8967,
        "nickName": "t",
        "ipv6": "o",
        "telephone": "M",
        "userName": "2r8",
        "userDetails": [
          {
            "githubAddress": "3g3c"
          }
        ],
        "userAge": 0
      }
    }
  }
]
```

## 5.List&lt;Map&lt;M,N&lt;P,k&gt;&gt;&gt;超复杂结构
**URL:** http://localhost/list/listMap3

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/list/listMap3
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;map&gt;|&nbsp;
└── &nbsp;|map&lt;string, object&gt;|&nbsp;
&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>老师
&nbsp;&nbsp; &nbsp;&nbsp; ├── data|object|泛型data
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; ├── data1|object|泛型data1
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; ├── data2|object|data2
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; └── age|int32|年龄

**Response-example:**
``` json
[
  {
    "null": {
      "data": {
        "userAddress": "6jrprNk",
        "small": 5702.31,
        "userList": [
          {
            "userAddress": "6",
            "small": 3411.79,
            "userList": [],
            "money": 2710.37,
            "phone": "I",
            "createTime": 2821,
            "nickName": "j",
            "ipv6": "brr",
            "telephone": "LTR05UdpP",
            "userName": "fRmZ",
            "userDetails": [
              {
                "githubAddress": "3zTd"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 2624.08,
        "phone": "3c",
        "createTime": 7268,
        "nickName": "HQP",
        "ipv6": "Kn2GxaO",
        "telephone": "R",
        "userName": "3cCKA3TCe",
        "userDetails": [
          {
            "githubAddress": "CBPFd"
          }
        ],
        "userAge": 0
      },
      "data2": {
        "userAddress": "XwQIsjXiF",
        "small": 3180.68,
        "userList": [
          {
            "userAddress": "VkVcL",
            "small": 7333.36,
            "userList": [],
            "money": 4322.31,
            "phone": "Yt",
            "createTime": 4739,
            "nickName": "9",
            "ipv6": "mx7jYonlhW",
            "telephone": "w",
            "userName": "8nOX3",
            "userDetails": [
              {
                "githubAddress": "5s"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 2160.0,
        "phone": "T",
        "createTime": 2255,
        "nickName": "UVWsrzLh",
        "ipv6": "hiz8d2L4Y",
        "telephone": "gzfQ",
        "userName": "Tg6z",
        "userDetails": [
          {
            "githubAddress": "sFZ"
          }
        ],
        "userAge": 0
      },
      "data1": {
        "userAddress": "rXSKNqeiei",
        "small": 9644.02,
        "userList": [
          {
            "userAddress": "Utt",
            "small": 5792.83,
            "userList": [],
            "money": 3439.99,
            "phone": "SaUjr",
            "createTime": 4430,
            "nickName": "YVpPsDJ",
            "ipv6": "80",
            "telephone": "wGYanXL9v",
            "userName": "CJnqOpx",
            "userDetails": [
              {
                "githubAddress": "68"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 1798.86,
        "phone": "omkj",
        "createTime": 7608,
        "nickName": "57XxQlwA",
        "ipv6": "q0C",
        "telephone": "KR3hP8Dg",
        "userName": "g6Chsq",
        "userDetails": [
          {
            "githubAddress": "nx"
          }
        ],
        "userAge": 0
      },
      "age": 0
    }
  }
]
```

## 6.List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构
**URL:** http://localhost/list/listTeacher

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/list/listTeacher
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;object&gt;|&nbsp;
└── &nbsp;|object|Description:<br/>老师
&nbsp;&nbsp; ├── data|array&lt;object&gt;|泛型data
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── data1|array&lt;object&gt;|泛型data1
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── data2|array&lt;object&gt;|data2
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; └── age|int32|年龄

**Response-example:**
``` json
[
  {
    "data": [
      {
        "userAddress": "82v",
        "small": 6423.57,
        "userList": [
          {
            "userAddress": "EFB",
            "small": 9753.87,
            "userList": [],
            "money": 3689.87,
            "phone": "kL1S",
            "createTime": 6817,
            "nickName": "jDJrjQqQgM",
            "ipv6": "cy4myWm",
            "telephone": "slNJgkFZbm",
            "userName": "dl06du",
            "userDetails": [
              {
                "githubAddress": "O44VcSI"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 5813.16,
        "phone": "Ixlkt0yWv",
        "createTime": 6928,
        "nickName": "Hhf4",
        "ipv6": "CjrY7s5",
        "telephone": "QaQs",
        "userName": "6uXcwXxf",
        "userDetails": [
          {
            "githubAddress": "TRxL"
          }
        ],
        "userAge": 0
      }
    ],
    "data2": [
      {
        "userAddress": "exEVI",
        "small": 9680.22,
        "userList": [
          {
            "userAddress": "mvbCL9M",
            "small": 9017.64,
            "userList": [],
            "money": 6854.23,
            "phone": "65",
            "createTime": 6025,
            "nickName": "2Kxr",
            "ipv6": "B8rY9hyw",
            "telephone": "xvYihEs0AC",
            "userName": "CCek6Om",
            "userDetails": [
              {
                "githubAddress": "EifKbwg"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 6262.74,
        "phone": "7oz8dX5p",
        "createTime": 7614,
        "nickName": "gjFtSOFI",
        "ipv6": "2QJjJ48",
        "telephone": "YsY5",
        "userName": "p5L",
        "userDetails": [
          {
            "githubAddress": "xfp"
          }
        ],
        "userAge": 0
      }
    ],
    "data1": [
      {
        "userAddress": "cNrIhpgfb",
        "small": 1806.46,
        "userList": [
          {
            "userAddress": "hjVPia",
            "small": 8963.24,
            "userList": [],
            "money": 811.66,
            "phone": "2kanLpZ",
            "createTime": 8867,
            "nickName": "2lRRN",
            "ipv6": "o6Cz7HgWKQ",
            "telephone": "W",
            "userName": "H",
            "userDetails": [
              {
                "githubAddress": "S9AwYew"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 1171.87,
        "phone": "7BH",
        "createTime": 4879,
        "nickName": "te77CJ",
        "ipv6": "CjawTDBAn",
        "telephone": "55ALAK53sH",
        "userName": "W",
        "userDetails": [
          {
            "githubAddress": "p7u1Wwo"
          }
        ],
        "userAge": 0
      }
    ],
    "age": 0
  }
]
```

## 7.List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构
**URL:** http://localhost/list/listString1

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/list/listString1
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;object&gt;|&nbsp;
└── &nbsp;|object|Description:<br/>老师
&nbsp;&nbsp; ├── data|object|泛型data
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data|object|泛型data
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data1|object|泛型data1
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data2|object|data2
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; └── age|int32|年龄
&nbsp;&nbsp; ├── data1|object|泛型data1
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── data2|object|data2
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; └── age|int32|年龄

**Response-example:**
``` json
[
  {
    "data": {
      "data": {
        "userAddress": "YA",
        "small": 4210.38,
        "userList": [
          {
            "userAddress": "BS6cvpGE",
            "small": 696.97,
            "userList": [],
            "money": 3627.5,
            "phone": "Vsb79u2bcL",
            "createTime": 9894,
            "nickName": "DXuKey",
            "ipv6": "1un8xI3",
            "telephone": "hQilyIz",
            "userName": "id35rf",
            "userDetails": [
              {
                "githubAddress": "PP15A"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 2142.38,
        "phone": "0r5y8lK",
        "createTime": 1221,
        "nickName": "Y",
        "ipv6": "1yl3oNKdUO",
        "telephone": "tqxBZH",
        "userName": "zSRALZ91yd",
        "userDetails": [
          {
            "githubAddress": "D0C7Q2h0z"
          }
        ],
        "userAge": 0
      },
      "data2": {
        "userAddress": "RZrC",
        "small": 6820.5,
        "userList": [
          {
            "userAddress": "cZf7qNw7d4",
            "small": 7304.16,
            "userList": [],
            "money": 2507.46,
            "phone": "XDtPE",
            "createTime": 8577,
            "nickName": "sQyzg",
            "ipv6": "kspCIwpS",
            "telephone": "AHFL",
            "userName": "gNHX",
            "userDetails": [
              {
                "githubAddress": "Zy"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 2269.6,
        "phone": "HC",
        "createTime": 4525,
        "nickName": "dE7F",
        "ipv6": "dyRM",
        "telephone": "QGv",
        "userName": "UcTTetkdN",
        "userDetails": [
          {
            "githubAddress": "ahzG9MhU4"
          }
        ],
        "userAge": 0
      },
      "data1": {
        "userAddress": "eRu",
        "small": 8842.32,
        "userList": [
          {
            "userAddress": "UCy",
            "small": 4286.18,
            "userList": [],
            "money": 1241.81,
            "phone": "quJvhcUss",
            "createTime": 5524,
            "nickName": "7n7F",
            "ipv6": "TqQjfp",
            "telephone": "pc8GxhWrvr",
            "userName": "zgpI4",
            "userDetails": [
              {
                "githubAddress": "BLk"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 1975.37,
        "phone": "QhJSEtTOEN",
        "createTime": 2851,
        "nickName": "4Gg",
        "ipv6": "IW",
        "telephone": "g4z0N",
        "userName": "CVxzcDSK",
        "userDetails": [
          {
            "githubAddress": "9k"
          }
        ],
        "userAge": 0
      },
      "age": 0
    },
    "data2": {
      "userAddress": "VpzNN",
      "small": 8016.65,
      "userList": [
        {
          "userAddress": "HSDu2",
          "small": 4716.31,
          "userList": [
            {
              "userAddress": "nhUoAf",
              "small": 1525.11,
              "userList": [],
              "money": 8956.88,
              "phone": "b8703R",
              "createTime": 3673,
              "nickName": "D93HRE7CVg",
              "ipv6": "MN",
              "telephone": "M61",
              "userName": "kiVxaj",
              "userDetails": [
                {
                  "githubAddress": "DEebloGS"
                }
              ],
              "userAge": 0
            }
          ],
          "money": 767.8,
          "phone": "qmOhWArB",
          "createTime": 5671,
          "nickName": "QgZY1UB",
          "ipv6": "7",
          "telephone": "DDDXOQ6",
          "userName": "ArpKxqgLa",
          "userDetails": [
            {
              "githubAddress": "3qqxN40Pj"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 9200.87,
      "phone": "Pcrdd",
      "createTime": 2887,
      "nickName": "OQxGQz",
      "ipv6": "bsBjY6",
      "telephone": "Z2",
      "userName": "JH9fIY88",
      "userDetails": [
        {
          "githubAddress": "rm4vJ2sNO"
        }
      ],
      "userAge": 0
    },
    "data1": {
      "userAddress": "Ead",
      "small": 3336.6,
      "userList": [
        {
          "userAddress": "xlUc",
          "small": 9189.13,
          "userList": [
            {
              "userAddress": "3nd",
              "small": 2324.83,
              "userList": [],
              "money": 4395.82,
              "phone": "z67FfHP7d",
              "createTime": 6628,
              "nickName": "eiGcqwdp",
              "ipv6": "nPaYLvB4",
              "telephone": "bKhkBIM5Qu",
              "userName": "HoGSrS",
              "userDetails": [
                {
                  "githubAddress": "5"
                }
              ],
              "userAge": 0
            }
          ],
          "money": 8005.71,
          "phone": "UEop6Bv86",
          "createTime": 5036,
          "nickName": "dI8EaG",
          "ipv6": "hFn",
          "telephone": "JJT8iMe",
          "userName": "pFE0e3DJA",
          "userDetails": [
            {
              "githubAddress": "j177LuC"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 5571.82,
      "phone": "IiYSnO",
      "createTime": 1193,
      "nickName": "Xa99GZ",
      "ipv6": "3yJD9",
      "telephone": "wfM3pV",
      "userName": "jk",
      "userDetails": [
        {
          "githubAddress": "GolTr"
        }
      ],
      "userAge": 0
    },
    "age": 0
  }
]
```

## 8.List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;
**URL:** http://localhost/list/listString2

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/list/listString2
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;object&gt;|&nbsp;
└── &nbsp;|object|Description:<br/>老师
&nbsp;&nbsp; ├── data|object|泛型data
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data|object|泛型data
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data1|object|泛型data1
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data2|object|data2
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; └── age|int32|年龄
&nbsp;&nbsp; ├── data1|object|泛型data1
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data|object|泛型data
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data1|object|泛型data1
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data2|object|data2
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; └── age|int32|年龄
&nbsp;&nbsp; ├── data2|object|data2
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data|object|泛型data
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data1|object|泛型data1
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data2|object|data2
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; └── age|int32|年龄
&nbsp;&nbsp; └── age|int32|年龄

**Response-example:**
``` json
[
  {
    "data": {
      "data": {
        "userAddress": "8AQpD",
        "small": 8067.51,
        "userList": [
          {
            "userAddress": "avyod8B",
            "small": 4675.63,
            "userList": [],
            "money": 4111.72,
            "phone": "hD",
            "createTime": 1384,
            "nickName": "Q50Mo",
            "ipv6": "yG0g",
            "telephone": "O",
            "userName": "Aq1y3",
            "userDetails": [
              {
                "githubAddress": "MPKo"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 3845.43,
        "phone": "47AhVg",
        "createTime": 1740,
        "nickName": "tReZtyd",
        "ipv6": "A",
        "telephone": "aoW",
        "userName": "AE7",
        "userDetails": [
          {
            "githubAddress": "GWkIav9X"
          }
        ],
        "userAge": 0
      },
      "data2": {
        "userAddress": "6FgMV4",
        "small": 9090.8,
        "userList": [
          {
            "userAddress": "ls6OdMo",
            "small": 2127.14,
            "userList": [],
            "money": 3900.86,
            "phone": "Q",
            "createTime": 5109,
            "nickName": "qZeM3POCN",
            "ipv6": "mrI",
            "telephone": "lR5JNHVxjB",
            "userName": "UBIzZl",
            "userDetails": [
              {
                "githubAddress": "LEzk5kh"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 6064.57,
        "phone": "wemmserPl",
        "createTime": 5590,
        "nickName": "BGkc4k0PPH",
        "ipv6": "ffsgNx",
        "telephone": "3VvPwm1e",
        "userName": "v",
        "userDetails": [
          {
            "githubAddress": "x"
          }
        ],
        "userAge": 0
      },
      "data1": {
        "userAddress": "YIbXS",
        "small": 6796.05,
        "userList": [
          {
            "userAddress": "InSIch",
            "small": 6798.5,
            "userList": [],
            "money": 1122.92,
            "phone": "3IJA6k",
            "createTime": 1422,
            "nickName": "VCiAzuFX",
            "ipv6": "xdE5BnD",
            "telephone": "qT3c2Mov7z",
            "userName": "BeNmj",
            "userDetails": [
              {
                "githubAddress": "Uc"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 316.67,
        "phone": "hLxnN6zih",
        "createTime": 8753,
        "nickName": "1YD",
        "ipv6": "xwDE04",
        "telephone": "qe5Jr",
        "userName": "tCLtlSZ",
        "userDetails": [
          {
            "githubAddress": "RhqT"
          }
        ],
        "userAge": 0
      },
      "age": 0
    },
    "data2": {
      "data": {
        "userAddress": "V3",
        "small": 4002.22,
        "userList": [
          {
            "userAddress": "sGIxdNEt6f",
            "small": 2790.58,
            "userList": [],
            "money": 8604.68,
            "phone": "GAwkHi",
            "createTime": 4645,
            "nickName": "aOi",
            "ipv6": "RW06FhO7y",
            "telephone": "v0vWQ5d",
            "userName": "7oEHkxV",
            "userDetails": [
              {
                "githubAddress": "2"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 8643.97,
        "phone": "69x4iepK4",
        "createTime": 8643,
        "nickName": "Wn9J4s",
        "ipv6": "fPljbP",
        "telephone": "JPI4WLQA",
        "userName": "y1lOqloD",
        "userDetails": [
          {
            "githubAddress": "ymTkWUyZ"
          }
        ],
        "userAge": 0
      },
      "data2": {
        "userAddress": "XrVNAjQhz",
        "small": 5165.04,
        "userList": [
          {
            "userAddress": "LjB",
            "small": 5250.38,
            "userList": [],
            "money": 5415.54,
            "phone": "lX",
            "createTime": 7601,
            "nickName": "ltGU2r",
            "ipv6": "KLp",
            "telephone": "ADBp",
            "userName": "fezrAjy8C",
            "userDetails": [
              {
                "githubAddress": "l"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 7912.42,
        "phone": "xGRINAtIoh",
        "createTime": 5043,
        "nickName": "ydW8RmT",
        "ipv6": "Plj",
        "telephone": "HXW2tVV",
        "userName": "QinoWxM0",
        "userDetails": [
          {
            "githubAddress": "1SMrx"
          }
        ],
        "userAge": 0
      },
      "data1": {
        "userAddress": "KtCV",
        "small": 7450.07,
        "userList": [
          {
            "userAddress": "mgn",
            "small": 5442.27,
            "userList": [],
            "money": 5339.88,
            "phone": "dTxMJM",
            "createTime": 5518,
            "nickName": "t",
            "ipv6": "Kfe10GBT8",
            "telephone": "D5Sh6",
            "userName": "Eevi",
            "userDetails": [
              {
                "githubAddress": "Ux4E5rr"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 9006.15,
        "phone": "sn7u",
        "createTime": 5995,
        "nickName": "6sDF9D",
        "ipv6": "XdsJlAkyz",
        "telephone": "YJGADWOOVU",
        "userName": "z",
        "userDetails": [
          {
            "githubAddress": "19vy3OBgJO"
          }
        ],
        "userAge": 0
      },
      "age": 0
    },
    "data1": {
      "data": {
        "userAddress": "BhOR",
        "small": 1867.66,
        "userList": [
          {
            "userAddress": "Dz0",
            "small": 3354.68,
            "userList": [],
            "money": 7424.06,
            "phone": "IkHf7pX",
            "createTime": 5935,
            "nickName": "a21mjsskK",
            "ipv6": "9elqgRzBLH",
            "telephone": "LmGudXl",
            "userName": "Iibq9Ylg",
            "userDetails": [
              {
                "githubAddress": "3As9"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 336.66,
        "phone": "eC9",
        "createTime": 5722,
        "nickName": "NPR9C",
        "ipv6": "VexsbLry",
        "telephone": "pWnR5",
        "userName": "q",
        "userDetails": [
          {
            "githubAddress": "lJe5fakSc"
          }
        ],
        "userAge": 0
      },
      "data2": {
        "userAddress": "BBIddAHX",
        "small": 8767.71,
        "userList": [
          {
            "userAddress": "xgoROjrRNs",
            "small": 9225.54,
            "userList": [],
            "money": 7362.38,
            "phone": "jPW3n1JF",
            "createTime": 5381,
            "nickName": "WMBeycYc",
            "ipv6": "vtZHBs",
            "telephone": "HwK7",
            "userName": "tF",
            "userDetails": [
              {
                "githubAddress": "taCiZuRu"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 7272.56,
        "phone": "dffA",
        "createTime": 8106,
        "nickName": "WKzSNha",
        "ipv6": "MKdUUby3f",
        "telephone": "kQ16p",
        "userName": "AXT",
        "userDetails": [
          {
            "githubAddress": "V8v6H7D3m"
          }
        ],
        "userAge": 0
      },
      "data1": {
        "userAddress": "kXJvQiO0W",
        "small": 5744.16,
        "userList": [
          {
            "userAddress": "5h",
            "small": 4455.03,
            "userList": [],
            "money": 613.65,
            "phone": "x6jRWLvgP",
            "createTime": 4990,
            "nickName": "Od",
            "ipv6": "Jy1HPM5",
            "telephone": "ro",
            "userName": "c",
            "userDetails": [
              {
                "githubAddress": "4mwmP9x"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 4014.63,
        "phone": "QgEDVb0",
        "createTime": 5564,
        "nickName": "QdSfL22Y",
        "ipv6": "P913ZgV",
        "telephone": "2vY",
        "userName": "vMTQ5",
        "userDetails": [
          {
            "githubAddress": "X0j6ev"
          }
        ],
        "userAge": 0
      },
      "age": 0
    },
    "age": 0
  }
]
```

## 9.CommonResult&lt;List&lt;UserDto&gt;&gt;
**URL:** http://localhost/list/listUserDto

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/list/listUserDto
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; ├── token|string|token
│&nbsp;&nbsp; └── LoginList|array&lt;object&gt;|UserDto 用户信息列表
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; &nbsp;&nbsp; └── password|string|密码
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "k4q5WCg8k",
  "data": [
    {
      "LoginList": [
        {
          "password": "B",
          "userName": "C"
        }
      ],
      "token": "EGXgUXYU"
    }
  ],
  "success": false,
  "message": "g",
  "timestamp": "Cdgx6vWUAm"
}
```

# Map返回型接口api文档测试

## 1.Map&lt;String,Integer&gt;结构
**URL:** http://localhost/map/primitive

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/map/primitive
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, int32&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|int32|&nbsp;

**Response-example:**
``` json
{
  "null": 1280
}
```

## 2.Map&lt;String,Object&gt;结构
**URL:** http://localhost/map/objectValue

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/map/objectValue
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, object&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|object|&nbsp;

**Response-example:**
``` json
{
  "null": {}
}
```

## 3.Map&lt;String,User&gt;结构
**URL:** http://localhost/map/object

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/map/object
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, object&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|object|Description:<br/>用户对象
&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; └── telephone|string|固定电话

**Response-example:**
``` json
{
  "null": {
    "userAddress": "1pH2gUce",
    "small": 9358.85,
    "userList": [
      {
        "userAddress": "wcmW",
        "small": 5949.36,
        "userList": [],
        "money": 8695.44,
        "phone": "R0o7ldi",
        "createTime": 7174,
        "nickName": "r31AU",
        "ipv6": "VRz3fC6R",
        "telephone": "JW4CW",
        "userName": "h1LIN3NNQ",
        "userDetails": [
          {
            "githubAddress": "tgppqhLmcH"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 5922.67,
    "phone": "qur1R",
    "createTime": 4741,
    "nickName": "rO",
    "ipv6": "yH9",
    "telephone": "6qIA",
    "userName": "PrwUQE9r",
    "userDetails": [
      {
        "githubAddress": "yfYNnw"
      }
    ],
    "userAge": 0
  }
}
```

## 4.Map&lt;String,Student&gt;结构
**URL:** http://localhost/map/test1

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/map/test1
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, object&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|object|Description:<br/>学生信息
&nbsp;&nbsp; ├── stuName|string|姓名
&nbsp;&nbsp; ├── stuAge|boolean|年龄
&nbsp;&nbsp; ├── stuAddress|string|地址
&nbsp;&nbsp; ├── user|object|用户对象
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── userMap|map&lt;string, object&gt;|map用户信息
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── userTreeSet|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; └── user1|object|用户对象2
&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话

**Response-example:**
``` json
{
  "null": {
    "user1": {
      "userAddress": "0nBk2o",
      "small": 9362.46,
      "userList": [
        {
          "userAddress": "Hz",
          "small": 327.95,
          "userList": [],
          "money": 4304.27,
          "phone": "WR11Uz",
          "createTime": 7461,
          "nickName": "L",
          "ipv6": "m7",
          "telephone": "pAMcDvI",
          "userName": "iwmErqf",
          "userDetails": [
            {
              "githubAddress": "Sy6z7054FE"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 6898.11,
      "phone": "6FghFDmjH",
      "createTime": 8657,
      "nickName": "G",
      "ipv6": "AJW6XsOw",
      "telephone": "fS6",
      "userName": "txkos7h",
      "userDetails": [
        {
          "githubAddress": "3CCWFcrv"
        }
      ],
      "userAge": 0
    },
    "userTreeSet": [
      {
        "userAddress": "W",
        "small": 7593.73,
        "userList": [
          {
            "userAddress": "ihLBkLMxJ",
            "small": 1013.32,
            "userList": [],
            "money": 2444.91,
            "phone": "H4tRhRM",
            "createTime": 1182,
            "nickName": "m71XPnUFec",
            "ipv6": "n",
            "telephone": "t7ciJqnIj",
            "userName": "01kD",
            "userDetails": [
              {
                "githubAddress": "xnfJOfC0"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 3191.76,
        "phone": "A7Cgcghs",
        "createTime": 6230,
        "nickName": "q92cva4",
        "ipv6": "BmLrLm531E",
        "telephone": "hP",
        "userName": "Y",
        "userDetails": [
          {
            "githubAddress": "370dnz"
          }
        ],
        "userAge": 0
      }
    ],
    "stuAddress": "dziK",
    "stuName": "WLOBkgBn",
    "userMap": {
      "null": {
        "userAddress": "y7F",
        "small": 6374.28,
        "userList": [
          {
            "userAddress": "cSY",
            "small": 9156.2,
            "userList": [],
            "money": 565.49,
            "phone": "Ie4jWXA",
            "createTime": 1631,
            "nickName": "oWoN0IbE",
            "ipv6": "O",
            "telephone": "l05Pb9Vdws",
            "userName": "rqoh9Pvcg",
            "userDetails": [
              {
                "githubAddress": "Fr2X"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 9780.96,
        "phone": "UwVtwe",
        "createTime": 8545,
        "nickName": "v",
        "ipv6": "POTqE5",
        "telephone": "kNH",
        "userName": "rfoyPMv",
        "userDetails": [
          {
            "githubAddress": "CGBq"
          }
        ],
        "userAge": 0
      }
    },
    "stuAge": true,
    "user": {
      "userAddress": "wmTUAM",
      "small": 6236.76,
      "userList": [
        {
          "userAddress": "SVvJmep6p",
          "small": 6242.71,
          "userList": [],
          "money": 3679.64,
          "phone": "hSY",
          "createTime": 4062,
          "nickName": "HJNR6R",
          "ipv6": "oa",
          "telephone": "Kow2",
          "userName": "1Qt",
          "userDetails": [
            {
              "githubAddress": "1gJ"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 7541.25,
      "phone": "zkkX94Lt80",
      "createTime": 3248,
      "nickName": "DfwkO9Iq",
      "ipv6": "2lyU",
      "telephone": "G4Q53kkE",
      "userName": "LA40nZd",
      "userDetails": [
        {
          "githubAddress": "Y"
        }
      ],
      "userAge": 0
    }
  }
}
```

## 5.Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** http://localhost/map/test2

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/map/test2
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, object&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|object|Description:<br/>老师
&nbsp;&nbsp; ├── data|array&lt;object&gt;|泛型data
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── data1|object|泛型data1
&nbsp;&nbsp; │&nbsp;&nbsp; ├── stuName|string|姓名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── stuAge|boolean|年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── stuAddress|string|地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── user|object|用户对象
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userMap|map&lt;string, object&gt;|map用户信息
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userTreeSet|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; └── user1|object|用户对象2
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── data2|object|data2
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; └── age|int32|年龄

**Response-example:**
``` json
{
  "null": {
    "data": [
      {
        "userAddress": "3qq6",
        "small": 263.67,
        "userList": [
          {
            "userAddress": "cFz400LYz",
            "small": 4389.03,
            "userList": [],
            "money": 9106.01,
            "phone": "JkF",
            "createTime": 881,
            "nickName": "PItq",
            "ipv6": "v6D4NC",
            "telephone": "sJ7H",
            "userName": "V2",
            "userDetails": [
              {
                "githubAddress": "brwXK2e"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 5640.23,
        "phone": "Hst",
        "createTime": 4553,
        "nickName": "aH",
        "ipv6": "3VRY",
        "telephone": "5",
        "userName": "I2zEMzj9K",
        "userDetails": [
          {
            "githubAddress": "1y2YMcp"
          }
        ],
        "userAge": 0
      }
    ],
    "data2": {
      "userAddress": "ib51",
      "small": 4397.89,
      "userList": [
        {
          "userAddress": "br",
          "small": 6080.62,
          "userList": [],
          "money": 6312.19,
          "phone": "61bZwmkr",
          "createTime": 8734,
          "nickName": "qqaJ",
          "ipv6": "53bIXqvm",
          "telephone": "AWwR",
          "userName": "rxo2eUFnf",
          "userDetails": [
            {
              "githubAddress": "4N"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 4842.74,
      "phone": "9PV",
      "createTime": 5396,
      "nickName": "HUhOnB",
      "ipv6": "UKLPbUMcg",
      "telephone": "2kc",
      "userName": "U",
      "userDetails": [
        {
          "githubAddress": "a"
        }
      ],
      "userAge": 0
    },
    "data1": {
      "user1": {
        "userAddress": "TBu1IO2",
        "small": 1431.85,
        "userList": [],
        "money": 3351.46,
        "phone": "hRkECG",
        "createTime": 7475,
        "nickName": "JbM",
        "ipv6": "TG5C",
        "telephone": "3",
        "userName": "oWIkMkXL",
        "userDetails": [
          {
            "githubAddress": "m5NSuC"
          }
        ],
        "userAge": 0
      },
      "userTreeSet": [
        {
          "userAddress": "eHh",
          "small": 8000.81,
          "userList": [],
          "money": 4488.25,
          "phone": "Kqx5cf30m",
          "createTime": 6687,
          "nickName": "vCkK",
          "ipv6": "n55mLZ3",
          "telephone": "Im4XV",
          "userName": "ieLs7h54R",
          "userDetails": [
            {
              "githubAddress": "8"
            }
          ],
          "userAge": 0
        }
      ],
      "stuAddress": "f55NF",
      "stuName": "EE",
      "userMap": {
        "null": {
          "userAddress": "A7cHNVDgcs",
          "small": 217.51,
          "userList": [],
          "money": 152.03,
          "phone": "mSmn4h",
          "createTime": 9189,
          "nickName": "E",
          "ipv6": "zGoDz24MC0",
          "telephone": "8xPW0GoD",
          "userName": "yrH",
          "userDetails": [
            {
              "githubAddress": "JmWg"
            }
          ],
          "userAge": 0
        }
      },
      "stuAge": false,
      "user": {
        "userAddress": "6zRYVE",
        "small": 4666.97,
        "userList": [],
        "money": 2575.74,
        "phone": "c",
        "createTime": 4026,
        "nickName": "YOR",
        "ipv6": "87",
        "telephone": "qL2aFJb",
        "userName": "8R",
        "userDetails": [
          {
            "githubAddress": "6INwhJkBfy"
          }
        ],
        "userAge": 0
      }
    },
    "age": 0
  }
}
```

## 6.TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构
**URL:** http://localhost/map/test3

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/map/test3
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, object&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|object|Description:<br/>老师
&nbsp;&nbsp; ├── data|array&lt;object&gt;|泛型data
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── data1|object|泛型data1
&nbsp;&nbsp; │&nbsp;&nbsp; ├── stuName|string|姓名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── stuAge|boolean|年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── stuAddress|string|地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── user|object|用户对象
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userMap|map&lt;string, object&gt;|map用户信息
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userTreeSet|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; └── user1|object|用户对象2
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── data2|object|data2
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; └── age|int32|年龄

**Response-example:**
``` json
{
  "null": {
    "data": [
      {
        "userAddress": "3",
        "small": 4358.76,
        "userList": [
          {
            "userAddress": "G3gyl",
            "small": 3612.96,
            "userList": [],
            "money": 1102.15,
            "phone": "tjFR59L",
            "createTime": 7358,
            "nickName": "Xu6",
            "ipv6": "J6mccto",
            "telephone": "RmA6",
            "userName": "sCYMxL",
            "userDetails": [
              {
                "githubAddress": "WO"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 165.46,
        "phone": "VB",
        "createTime": 6186,
        "nickName": "QyNqUo2c",
        "ipv6": "q",
        "telephone": "4l4jIq",
        "userName": "uaoiFHlz",
        "userDetails": [
          {
            "githubAddress": "jGPDI0tho"
          }
        ],
        "userAge": 0
      }
    ],
    "data2": {
      "userAddress": "0tAzIQB0",
      "small": 8965.02,
      "userList": [
        {
          "userAddress": "PR",
          "small": 7567.61,
          "userList": [],
          "money": 6404.11,
          "phone": "VK8qVX",
          "createTime": 1935,
          "nickName": "VCP",
          "ipv6": "DJk4bBJbM",
          "telephone": "d",
          "userName": "o",
          "userDetails": [
            {
              "githubAddress": "aH9"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 6940.57,
      "phone": "dcG4",
      "createTime": 1933,
      "nickName": "KQI",
      "ipv6": "h6IqY",
      "telephone": "HLWKb",
      "userName": "0682uUlx",
      "userDetails": [
        {
          "githubAddress": "UMrT5cLY"
        }
      ],
      "userAge": 0
    },
    "data1": {
      "user1": {
        "userAddress": "qoFF6ogb",
        "small": 2764.07,
        "userList": [],
        "money": 4101.07,
        "phone": "egpvAVSS9",
        "createTime": 2019,
        "nickName": "rWIytnETk",
        "ipv6": "cNV",
        "telephone": "yRO0",
        "userName": "Sii",
        "userDetails": [
          {
            "githubAddress": "ZU0vpHU"
          }
        ],
        "userAge": 0
      },
      "userTreeSet": [
        {
          "userAddress": "RH0rH3rQn",
          "small": 1537.37,
          "userList": [],
          "money": 3538.2,
          "phone": "fHpdxotGU",
          "createTime": 8701,
          "nickName": "51h5IF",
          "ipv6": "FYB3p",
          "telephone": "VhvE8Q",
          "userName": "D7F",
          "userDetails": [
            {
              "githubAddress": "gFGXpniZfJ"
            }
          ],
          "userAge": 0
        }
      ],
      "stuAddress": "7",
      "stuName": "8S5EOFgH",
      "userMap": {
        "null": {
          "userAddress": "e6r7",
          "small": 3061.3,
          "userList": [],
          "money": 2911.59,
          "phone": "hYKh3nn",
          "createTime": 2152,
          "nickName": "bGSJAQHnDZ",
          "ipv6": "FGJ7",
          "telephone": "akfHH9",
          "userName": "1EYYJ",
          "userDetails": [
            {
              "githubAddress": "MaW2qXp7Z"
            }
          ],
          "userAge": 0
        }
      },
      "stuAge": false,
      "user": {
        "userAddress": "P83W",
        "small": 2881.83,
        "userList": [],
        "money": 9118.74,
        "phone": "Z3cqUYf8E",
        "createTime": 6079,
        "nickName": "3wz3",
        "ipv6": "dBXQb6",
        "telephone": "kLsYky1BTR",
        "userName": "PkdVjIjS",
        "userDetails": [
          {
            "githubAddress": "q8E4z9ZDhx"
          }
        ],
        "userAge": 0
      }
    },
    "age": 0
  }
}
```

## 7.Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构
**URL:** http://localhost/map/test4

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/map/test4
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, object&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|object|Description:<br/>老师
&nbsp;&nbsp; ├── data|map&lt;string, object&gt;|泛型data
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── data1|map&lt;string, object&gt;|泛型data1
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── data2|map&lt;string, object&gt;|data2
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; └── age|int32|年龄

**Response-example:**
``` json
{
  "null": {
    "data": {
      "null": {
        "userAddress": "Tv3",
        "small": 3420.46,
        "userList": [
          {
            "userAddress": "51N3BK",
            "small": 7213.36,
            "userList": [],
            "money": 6646.65,
            "phone": "jn",
            "createTime": 6687,
            "nickName": "mUQojeqS",
            "ipv6": "8OqL",
            "telephone": "8Ps0gw",
            "userName": "iuLVwZ",
            "userDetails": [
              {
                "githubAddress": "tnzYG"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 8395.79,
        "phone": "Z",
        "createTime": 3671,
        "nickName": "Wz3IYG",
        "ipv6": "2ox2njJ",
        "telephone": "Tw2rAXS",
        "userName": "iCsVDwuUAj",
        "userDetails": [
          {
            "githubAddress": "NVW5ojDvE7"
          }
        ],
        "userAge": 0
      }
    },
    "data2": {
      "null": {
        "userAddress": "FhH8nPgzv",
        "small": 2520.41,
        "userList": [
          {
            "userAddress": "yu",
            "small": 8739.12,
            "userList": [],
            "money": 1164.71,
            "phone": "VtN",
            "createTime": 5599,
            "nickName": "9Hx8BTQCRV",
            "ipv6": "Q2ZIq",
            "telephone": "8lhZzb0zu8",
            "userName": "WUqv",
            "userDetails": [
              {
                "githubAddress": "mvh6QMLa"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 1073.13,
        "phone": "R",
        "createTime": 1107,
        "nickName": "UrdWK",
        "ipv6": "xtOD",
        "telephone": "BiD7vvHD13",
        "userName": "GWQ",
        "userDetails": [
          {
            "githubAddress": "j72Z4d2zR9"
          }
        ],
        "userAge": 0
      }
    },
    "data1": {
      "null": {
        "userAddress": "iSPosqGI",
        "small": 7782.6,
        "userList": [
          {
            "userAddress": "B4",
            "small": 9629.79,
            "userList": [],
            "money": 7027.1,
            "phone": "u27jU5v1",
            "createTime": 38,
            "nickName": "8fqQRQPUg",
            "ipv6": "GdLhdQKUe8",
            "telephone": "anJFVqv",
            "userName": "bKgjQU",
            "userDetails": [
              {
                "githubAddress": "62p"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 3983.69,
        "phone": "f93",
        "createTime": 7216,
        "nickName": "L3X5boPE97",
        "ipv6": "dJj1",
        "telephone": "zj5ahE",
        "userName": "xXy",
        "userDetails": [
          {
            "githubAddress": "9Men46Ai0m"
          }
        ],
        "userAge": 0
      }
    },
    "age": 0
  }
}
```

# 多泛型测试

## 1.数组
**URL:** http://localhost/mulGenric/test/

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── data|object|true|&nbsp;|3423<br/>
&nbsp;&nbsp; ├── page|object|&nbsp;|&nbsp;|角色
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|int32|&nbsp;|&nbsp;|角色id
&nbsp;&nbsp; │&nbsp;&nbsp; └── roleName|string|&nbsp;|&nbsp;|角色名称
&nbsp;&nbsp; └── data1|array&lt;object&gt;|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── total|int32|&nbsp;|0|记录总数
&nbsp;&nbsp; &nbsp;&nbsp; ├── concurrentPage|int32|&nbsp;|0|当前页
&nbsp;&nbsp; &nbsp;&nbsp; └── pageSize|int32|&nbsp;|0|当前page

**Request-example:**
``` json
http://localhost/mulGenric/test/
```

**Request-body-example:**
``` json
{
  "data1": [
    {
      "total": 0,
      "concurrentPage": 0,
      "pageSize": 0
    }
  ],
  "page": {
    "roleId": 3522,
    "roleName": "0GYHt"
  }
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── page|object|角色
│&nbsp;&nbsp; ├── roleId|int32|角色id
│&nbsp;&nbsp; └── roleName|string|角色名称
└── data1|array&lt;object&gt;|&nbsp;
&nbsp;&nbsp; ├── total|int32|记录总数
&nbsp;&nbsp; ├── concurrentPage|int32|当前页
&nbsp;&nbsp; └── pageSize|int32|当前page

**Response-example:**
``` json
{
  "data1": [
    {
      "total": 0,
      "concurrentPage": 0,
      "pageSize": 0
    }
  ],
  "page": {
    "roleId": 9526,
    "roleName": "tpSGi"
  }
}
```

## 2.gitee #I1S8W验证
**URL:** http://localhost/mulGenric/test2

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/mulGenric/test2
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
│&nbsp;&nbsp; ├── page|object|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── records|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── username|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── password|string|密码
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── mobile|string|电话
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── email|string|邮箱
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── address|string|地址
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sex|int32|性别(男1 女 2)
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── avatar|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|状态
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|描述
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── roles|array&lt;object&gt;|用户拥有角色
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|角色名 以ROLE_开头
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── defaultRole|boolean|是否为注册默认角色
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|拥有权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|用户拥有的权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── total|int64|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── size|int64|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── current|int64|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── orders|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── column|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── asc|boolean|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── optimizeCountSql|boolean|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── isSearchCount|boolean|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── hitCount|boolean|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── countId|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── maxLimit|int64|&nbsp;
│&nbsp;&nbsp; └── data1|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── username|string|用户名
│&nbsp;&nbsp; &nbsp;&nbsp; ├── password|string|密码
│&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; &nbsp;&nbsp; ├── mobile|string|电话
│&nbsp;&nbsp; &nbsp;&nbsp; ├── email|string|邮箱
│&nbsp;&nbsp; &nbsp;&nbsp; ├── address|string|地址
│&nbsp;&nbsp; &nbsp;&nbsp; ├── sex|int32|性别(男1 女 2)
│&nbsp;&nbsp; &nbsp;&nbsp; ├── avatar|string|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── type|int32|类型
│&nbsp;&nbsp; &nbsp;&nbsp; ├── status|int32|状态
│&nbsp;&nbsp; &nbsp;&nbsp; ├── description|string|描述
│&nbsp;&nbsp; &nbsp;&nbsp; ├── roles|array&lt;object&gt;|用户拥有角色
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|角色名 以ROLE_开头
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── defaultRole|boolean|是否为注册默认角色
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|拥有权限
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; &nbsp;&nbsp; ├── permissions|array&lt;object&gt;|用户拥有的权限
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; &nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; &nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; &nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; &nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; &nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "kFAtH",
  "data": {
    "data1": [
      {
        "address": "AQf",
        "nickName": "g",
        "sex": 6583,
        "roles": [
          {
            "createBy": "ZcT",
            "defaultRole": false,
            "createTime": "Jul 6, 2006, 6:05:24 AM",
            "updateBy": "0Hush0go",
            "permissions": [
              {
                "level": 5005,
                "icon": "afuKX2v",
                "description": "aFS",
                "updateTime": "Apr 18, 2072, 7:53:30 AM",
                "type": 6537,
                "title": "nMDsIPAhEV",
                "delFlag": 7789,
                "parentId": "o9PW1jkZS",
                "permTypes": [
                  "LIcXXtA2K"
                ],
                "path": "hJ1JN",
                "component": "OfmTn",
                "expand": "true",
                "createBy": "L7",
                "buttonType": "4syxf7qw",
                "children": [
                  {
                    "level": 9215,
                    "icon": "AtH",
                    "description": "qr",
                    "updateTime": "Feb 23, 2037, 4:27:06 AM",
                    "type": 4136,
                    "title": "wRFv8",
                    "delFlag": 2143,
                    "parentId": "BMHCEjBrZ8",
                    "permTypes": [
                      "6iJPfcwdvu"
                    ],
                    "path": "Wht14D",
                    "component": "MPJS8M",
                    "expand": "true",
                    "createBy": "8",
                    "buttonType": "l",
                    "children": [
                      {
                        "level": 4295,
                        "icon": "8OZta7MZLa",
                        "description": "tg4emRd",
                        "updateTime": "Jan 19, 2052, 1:06:18 AM",
                        "type": 7667,
                        "title": "VcZrXrz",
                        "delFlag": 2972,
                        "parentId": "0",
                        "permTypes": [
                          "CdvAiz"
                        ],
                        "path": "Ej3mu",
                        "component": "NHOlWcNE",
                        "expand": "true",
                        "createBy": "atdjh",
                        "buttonType": "0KIj3X5dw",
                        "children": [],
                        "createTime": "Jul 2, 2086, 7:53:07 AM",
                        "updateBy": "jQyM54",
                        "sortOrder": 2151.6,
                        "name": "5",
                        "checked": "false",
                        "id": "PwX4",
                        "selected": "false",
                        "status": 6508
                      }
                    ],
                    "createTime": "Dec 14, 2009, 8:49:03 AM",
                    "updateBy": "Z3iqmP",
                    "sortOrder": 1842.17,
                    "name": "4k",
                    "checked": "false",
                    "id": "LBa",
                    "selected": "false",
                    "status": 3303
                  }
                ],
                "createTime": "Feb 20, 2032, 11:21:16 AM",
                "updateBy": "x",
                "sortOrder": 4302.01,
                "name": "xtWhvjmm",
                "checked": "false",
                "id": "rAcN",
                "selected": "false",
                "status": 3120
              }
            ],
            "name": "xou",
            "updateTime": "Jan 2, 2059, 3:00:11 AM",
            "id": "T4J1f",
            "delFlag": 75
          }
        ],
        "mobile": "dNTWhQYi6",
        "description": "mmN",
        "updateTime": "Nov 25, 2066, 8:14:18 AM",
        "avatar": "https://s1.ax1x.com/2018/05/19/CcdVQP.png",
        "type": 3476,
        "delFlag": 9644,
        "password": "AqQfFhz",
        "createBy": "l",
        "createTime": "Oct 17, 2045, 2:11:20 PM",
        "updateBy": "tt2mOFG8pi",
        "permissions": [
          {
            "level": 3892,
            "icon": "qSMUdO",
            "description": "u6",
            "updateTime": "Mar 30, 2096, 5:36:27 AM",
            "type": 878,
            "title": "QPJMqSMmL",
            "delFlag": 5793,
            "parentId": "KwpMADTfN",
            "permTypes": [
              "306kJ6"
            ],
            "path": "avE",
            "component": "bO",
            "expand": "true",
            "createBy": "J0cUfa1",
            "buttonType": "ADhOpjDHf",
            "children": [
              {
                "level": 6398,
                "icon": "sFfVewa1Mp",
                "description": "GVP2g",
                "updateTime": "May 9, 2090, 11:39:16 AM",
                "type": 4046,
                "title": "UsawSpK6",
                "delFlag": 3796,
                "parentId": "Eb1wGJH",
                "permTypes": [
                  "9zdq"
                ],
                "path": "Pb",
                "component": "D1xZierrt",
                "expand": "true",
                "createBy": "hDsU",
                "buttonType": "UpZAxpEdh",
                "children": [
                  {
                    "level": 48,
                    "icon": "YQuM6tbJ",
                    "description": "PObSp6b1",
                    "updateTime": "Feb 18, 2018, 11:15:34 AM",
                    "type": 9330,
                    "title": "j2zJ",
                    "delFlag": 4696,
                    "parentId": "yRMp6",
                    "permTypes": [
                      "F"
                    ],
                    "path": "c",
                    "component": "Mr7",
                    "expand": "true",
                    "createBy": "9",
                    "buttonType": "U",
                    "children": [
                      {
                        "level": 5501,
                        "icon": "eabQlUSwvO",
                        "description": "V5SM2Ll",
                        "updateTime": "Jul 4, 2017, 12:06:13 PM",
                        "type": 2950,
                        "title": "Ma6p9BA8",
                        "delFlag": 2205,
                        "parentId": "Z48AaWoE6",
                        "permTypes": [
                          "INO34"
                        ],
                        "path": "u2niZGFt",
                        "component": "VIJBDlMP",
                        "expand": "true",
                        "createBy": "AM6U34",
                        "buttonType": "QSTsp",
                        "children": [],
                        "createTime": "Dec 17, 2094, 10:19:20 AM",
                        "updateBy": "Tmagp3vg8",
                        "sortOrder": 8891.54,
                        "name": "XriQygrsj",
                        "checked": "false",
                        "id": "24jXFwWz",
                        "selected": "false",
                        "status": 5206
                      }
                    ],
                    "createTime": "Sep 7, 2095, 9:36:36 PM",
                    "updateBy": "aZ85LM8B",
                    "sortOrder": 9741.46,
                    "name": "V5CIk2pdOa",
                    "checked": "false",
                    "id": "ccZmw",
                    "selected": "false",
                    "status": 5746
                  }
                ],
                "createTime": "Apr 13, 2061, 2:34:50 AM",
                "updateBy": "90lj",
                "sortOrder": 8921.65,
                "name": "PSCZ",
                "checked": "false",
                "id": "J3Hp",
                "selected": "false",
                "status": 5105
              }
            ],
            "createTime": "May 12, 2041, 12:53:57 PM",
            "updateBy": "hm",
            "sortOrder": 8048.87,
            "name": "26gID5ew8",
            "checked": "false",
            "id": "X",
            "selected": "false",
            "status": 9308
          }
        ],
        "id": "YNZS",
        "email": "vM8w",
        "username": "S",
        "status": 3038
      }
    ],
    "page": {
      "total": 0,
      "current": 0,
      "hitCount": false,
      "size": 0,
      "optimizeCountSql": false,
      "records": [
        {
          "address": "2bv",
          "nickName": "H",
          "sex": 2552,
          "roles": [
            {
              "createBy": "5t8GfqG",
              "defaultRole": false,
              "createTime": "Nov 13, 2019, 3:56:50 AM",
              "updateBy": "1",
              "permissions": [
                {
                  "level": 8663,
                  "icon": "q13HZK",
                  "description": "uhGhj7F2E",
                  "updateTime": "Dec 12, 2017, 8:45:07 AM",
                  "type": 730,
                  "title": "I",
                  "delFlag": 8668,
                  "parentId": "cfPqCZisst",
                  "permTypes": [
                    "QyA"
                  ],
                  "path": "8Y1H",
                  "component": "dxE",
                  "expand": "true",
                  "createBy": "SDvUK",
                  "buttonType": "Ye",
                  "children": [
                    {
                      "level": 7545,
                      "icon": "VHoeg5",
                      "description": "DdW",
                      "updateTime": "Jan 5, 2003, 6:01:45 AM",
                      "type": 5876,
                      "title": "w9liP1",
                      "delFlag": 2748,
                      "parentId": "vRr",
                      "permTypes": [
                        "x"
                      ],
                      "path": "pxSI",
                      "component": "qui",
                      "expand": "true",
                      "createBy": "7gF6sTU",
                      "buttonType": "9ceQTUEf",
                      "children": [],
                      "createTime": "Sep 7, 2095, 2:54:42 PM",
                      "updateBy": "t7Xvs",
                      "sortOrder": 6189.09,
                      "name": "W",
                      "checked": "false",
                      "id": "a7c",
                      "selected": "false",
                      "status": 5117
                    }
                  ],
                  "createTime": "Aug 19, 2087, 8:54:02 AM",
                  "updateBy": "B",
                  "sortOrder": 5420.52,
                  "name": "xyoezq",
                  "checked": "false",
                  "id": "z",
                  "selected": "false",
                  "status": 3086
                }
              ],
              "name": "ZVxnyr",
              "updateTime": "Mar 7, 1994, 3:08:14 AM",
              "id": "DE",
              "delFlag": 7608
            }
          ],
          "mobile": "osu85F",
          "description": "QLXJl",
          "updateTime": "Nov 28, 1981, 6:56:23 PM",
          "avatar": "https://s1.ax1x.com/2018/05/19/CcdVQP.png",
          "type": 86,
          "delFlag": 354,
          "password": "jE",
          "createBy": "64Ga",
          "createTime": "Jan 10, 2060, 3:37:17 PM",
          "updateBy": "h5HvAXaOoS",
          "permissions": [
            {
              "level": 9413,
              "icon": "X",
              "description": "ZW",
              "updateTime": "Oct 28, 2090, 5:52:16 AM",
              "type": 4024,
              "title": "dSWKfPqal",
              "delFlag": 561,
              "parentId": "Sd",
              "permTypes": [
                "HWD"
              ],
              "path": "9MaspKkn1",
              "component": "5iOvQ",
              "expand": "true",
              "createBy": "95Kj1",
              "buttonType": "tbA7R4Hj",
              "children": [
                {
                  "level": 2810,
                  "icon": "nAU1A",
                  "description": "Z1RtU",
                  "updateTime": "Oct 12, 2079, 5:21:38 AM",
                  "type": 9763,
                  "title": "iwoBe",
                  "delFlag": 3135,
                  "parentId": "W3kAgEG",
                  "permTypes": [
                    "kx"
                  ],
                  "path": "vi",
                  "component": "k2wNOdB6Nc",
                  "expand": "true",
                  "createBy": "KF1ssN8",
                  "buttonType": "rwtGtH9q",
                  "children": [
                    {
                      "level": 7782,
                      "icon": "gkKqyt",
                      "description": "xwg9",
                      "updateTime": "Nov 20, 2054, 9:51:59 AM",
                      "type": 5544,
                      "title": "3DpL8",
                      "delFlag": 6573,
                      "parentId": "7V",
                      "permTypes": [
                        "nZ1kPTF5t"
                      ],
                      "path": "6xqZaOd",
                      "component": "b",
                      "expand": "true",
                      "createBy": "ZlHGEP3EUo",
                      "buttonType": "8xuIwe9Ou",
                      "children": [],
                      "createTime": "Jul 5, 2010, 2:20:05 AM",
                      "updateBy": "DCQDM",
                      "sortOrder": 8901.7,
                      "name": "l3sd",
                      "checked": "false",
                      "id": "xvSpipYOp",
                      "selected": "false",
                      "status": 5040
                    }
                  ],
                  "createTime": "Dec 8, 2094, 8:48:26 PM",
                  "updateBy": "yN813M57zk",
                  "sortOrder": 5375.03,
                  "name": "ACY2Mc3",
                  "checked": "false",
                  "id": "gV4rvDoczi",
                  "selected": "false",
                  "status": 4337
                }
              ],
              "createTime": "Jun 5, 1972, 1:43:14 PM",
              "updateBy": "3DlsB",
              "sortOrder": 5679.93,
              "name": "ybPm",
              "checked": "false",
              "id": "UKUCFf",
              "selected": "false",
              "status": 5079
            }
          ],
          "id": "Sfr0G6",
          "email": "sDXa5",
          "username": "8SdWkDW2",
          "status": 2267
        }
      ],
      "maxLimit": 2461,
      "orders": [
        {
          "asc": false,
          "column": "1SG"
        }
      ],
      "countId": "6XH9VxrNA",
      "isSearchCount": false
    }
  },
  "success": false,
  "message": "9UMfRehm41",
  "timestamp": "53P"
}
```

# mybatis-plus测试

## 1.mybatis-plus分页类测试
**URL:** http://localhost/mybatis/plus/page

**Type:** POST



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/mybatis/plus/page
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
│&nbsp;&nbsp; ├── records|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|int32|角色id
│&nbsp;&nbsp; │&nbsp;&nbsp; └── roleName|string|角色名称
│&nbsp;&nbsp; ├── total|int64|&nbsp;
│&nbsp;&nbsp; ├── size|int64|&nbsp;
│&nbsp;&nbsp; ├── current|int64|&nbsp;
│&nbsp;&nbsp; ├── orders|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── column|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── asc|boolean|&nbsp;
│&nbsp;&nbsp; ├── optimizeCountSql|boolean|&nbsp;
│&nbsp;&nbsp; ├── isSearchCount|boolean|&nbsp;
│&nbsp;&nbsp; ├── hitCount|boolean|&nbsp;
│&nbsp;&nbsp; ├── countId|string|&nbsp;
│&nbsp;&nbsp; └── maxLimit|int64|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "W9nR",
  "data": {
    "total": 0,
    "current": 0,
    "hitCount": false,
    "size": 0,
    "optimizeCountSql": false,
    "records": [
      {
        "roleId": 3200,
        "roleName": "SCAAGwGy6C"
      }
    ],
    "maxLimit": 4178,
    "orders": [
      {
        "asc": false,
        "column": "Rhz4jl"
      }
    ],
    "countId": "Mjz",
    "isSearchCount": false
  },
  "success": false,
  "message": "w",
  "timestamp": "yMb1"
}
```

# Path参数测试

## 1.接收数组类型pathVariable
**URL:** http://localhost/pathVariable/test/{id}

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|array|true|&nbsp;|
&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;

**Request-example:**
``` json
http://localhost/pathVariable/test/[ICDGArs]
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "Zx8cpCN",
  "success": false,
  "message": "pc",
  "timestamp": "lD8"
}
```

## 2.Path正则测试1
**URL:** http://localhost/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── fileId|string|true|&nbsp;|文件id<br/>

**Request-example:**
``` json
http://localhost/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "SrC8fPU3iI",
  "success": false,
  "message": "6zC",
  "timestamp": "gM49O7EI"
}
```

## 3.Path正则测试2
**URL:** http://localhost/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}/file

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── fileId|string|true|&nbsp;|文件id<br/>

**Request-example:**
``` json
http://localhost/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}/file
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "Ww",
  "success": false,
  "message": "b4mQF",
  "timestamp": "c"
}
```

## 4.Path正则测试3
**URL:** http://localhost/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}/file

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── fileId|string|true|&nbsp;|文件id<br/>

**Request-example:**
``` json
http://localhost/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}/file
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "MqctEzud",
  "success": false,
  "message": "t4l",
  "timestamp": "Q"
}
```

# RequestHeader注解测试

## 1.测试RequestHeader常规使用
**URL:** http://localhost/testRequestHeader

**Type:** GET


**Request-headers:**

Header | Type|Required|DefaultValue|Description
---|---|---|---|----
name|string|true|<br/>		<br/>		<br/><br/>				<br/>|请求头(name)<br/>

**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── age|int32|&nbsp;|&nbsp;|年龄

**Request-example:**
``` json
http://localhost/testRequestHeader
```


**Response-fields:**

None


## 2.测试RequestHeader绑定参数名
**URL:** http://localhost/testRequestHeader/value

**Type:** GET


**Request-headers:**

Header | Type|Required|DefaultValue|Description
---|---|---|---|----
token|string|false|<br/>		<br/>		<br/><br/>				<br/>|请求头(name)<br/>
age|int32|true|<br/>		<br/>		<br/><br/>				<br/>|年龄

**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/testRequestHeader/value
```


**Response-fields:**

None


## 3.测试RequestHeader绑定默认值
**URL:** http://localhost/testRequestHeader/DefaultVal

**Type:** GET


**Request-headers:**

Header | Type|Required|DefaultValue|Description
---|---|---|---|----
token|string|false|da|请求头(name)<br/>

**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── age|int32|&nbsp;|&nbsp;|年龄

**Request-example:**
``` json
http://localhost/testRequestHeader/DefaultVal
```


**Response-fields:**

None


## 4.测试Mapping中的headers属性
**URL:** http://localhost/testRequestHeader/foos

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/testRequestHeader/foos
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"3RFh7"
```

## 5.测试Mapping header属性
**URL:** http://localhost/ex/foos

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/ex/foos
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"ImW9SogKbD"
```

# Spring boot params test

## 1.Test Normal param binding
**URL:** http://localhost/testNormalParams/binding

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── name|string|true|&nbsp;|name<br/>
└── age|int32|&nbsp;|&nbsp;|age

**Request-example:**
``` json
http://localhost/testNormalParams/binding
```


**Response-fields:**

None


## 2.Test @RequestBody User
**URL:** http://localhost/testRequestBody

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|&nbsp;|&nbsp;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|&nbsp;|&nbsp;|测试
&nbsp;&nbsp; ├── userList|array&lt;object&gt;|&nbsp;|&nbsp;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|&nbsp;|&nbsp;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|&nbsp;|&nbsp;|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|&nbsp;|&nbsp;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|&nbsp;|&nbsp;|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|&nbsp;|0|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|&nbsp;|&nbsp;|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|&nbsp;|&nbsp;|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|&nbsp;|&nbsp;|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|&nbsp;|&nbsp;|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|&nbsp;|&nbsp;|固定电话
&nbsp;&nbsp; ├── userName|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; ├── userAddress|string|&nbsp;|&nbsp;|用户地址
&nbsp;&nbsp; ├── userAge|int32|&nbsp;|0|用户年龄
&nbsp;&nbsp; ├── phone|string|&nbsp;|&nbsp;|手机号
&nbsp;&nbsp; ├── createTime|int64|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; ├── small|float|&nbsp;|&nbsp;|钱少
&nbsp;&nbsp; ├── money|double|&nbsp;|&nbsp;|钱太多了
&nbsp;&nbsp; ├── ipv6|string|&nbsp;|&nbsp;|ipv6
&nbsp;&nbsp; └── telephone|string|&nbsp;|&nbsp;|固定电话

**Request-example:**
``` json
http://localhost/testRequestBody
```

**Request-body-example:**
``` json
{
  "userAddress": "Q0A",
  "small": 5302.35,
  "userList": [
    {
      "userAddress": "57AGjR",
      "small": 4619.19,
      "userList": [],
      "money": 8458.16,
      "phone": "dlaS42RC",
      "createTime": 2064,
      "nickName": "UJR",
      "ipv6": "w6C",
      "telephone": "fTLoMQDqV1",
      "userName": "IdS",
      "userDetails": [
        {
          "githubAddress": "j"
        }
      ],
      "userAge": 0
    }
  ],
  "money": 4893.0,
  "phone": "2Nn8obtU",
  "createTime": 9081,
  "nickName": "NT1a8Ir",
  "ipv6": "mdLGo9E",
  "telephone": "wvPa15G",
  "userName": "N1g5ogOy",
  "userDetails": [
    {
      "githubAddress": "C"
    }
  ],
  "userAge": 0
}
```

**Response-fields:**

None


## 3.Test @RequestBody Map
**URL:** http://localhost/testRequestBodyMap

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|map&lt;string, object&gt;|true|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; └── &nbsp;|object|&nbsp;|&nbsp;|Description:<br/>用户对象
&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|&nbsp;|&nbsp;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|&nbsp;|&nbsp;|测试
&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|&nbsp;|&nbsp;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|&nbsp;|&nbsp;|用户详情
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|&nbsp;|&nbsp;|测试
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|&nbsp;|&nbsp;|用户列表
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|&nbsp;|&nbsp;|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|&nbsp;|0|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|&nbsp;|&nbsp;|手机号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|&nbsp;|&nbsp;|钱少
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|&nbsp;|&nbsp;|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|&nbsp;|&nbsp;|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|&nbsp;|&nbsp;|固定电话
&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|&nbsp;|&nbsp;|用户地址
&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|&nbsp;|0|用户年龄
&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|&nbsp;|&nbsp;|手机号
&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|&nbsp;|&nbsp;|钱少
&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|&nbsp;|&nbsp;|钱太多了
&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|&nbsp;|&nbsp;|ipv6
&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|&nbsp;|&nbsp;|固定电话

**Request-example:**
``` json
http://localhost/testRequestBodyMap
```

**Request-body-example:**
``` json
{
  "null": {
    "userAddress": "8Lbe",
    "small": 361.77,
    "userList": [
      {
        "userAddress": "29IS4ei",
        "small": 4293.36,
        "userList": [],
        "money": 4993.0,
        "phone": "Tbmzz",
        "createTime": 797,
        "nickName": "nS",
        "ipv6": "bh",
        "telephone": "xbB1Q",
        "userName": "zcRqyLlW",
        "userDetails": [
          {
            "githubAddress": "NqgFaeUXb"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 5165.41,
    "phone": "evev5ayPOQ",
    "createTime": 5486,
    "nickName": "08iw0ib",
    "ipv6": "LPKR5sluFK",
    "telephone": "pVaf9E9",
    "userName": "2cN2oMqh",
    "userDetails": [
      {
        "githubAddress": "iEwGiyTVTC"
      }
    ],
    "userAge": 0
  }
}
```

**Response-fields:**

None


## 4.Test @RequestBody List
**URL:** http://localhost/testRequestBodyList

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── ids|array&lt;string&gt;|true|&nbsp;|array of user id

**Request-example:**
``` json
http://localhost/testRequestBodyList
```

**Request-body-example:**
``` json
[
  "cXI"
]
```

**Response-fields:**

None


## 5.Test Array Params
**URL:** http://localhost/testArray

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── fastJsons|array|true|&nbsp;|
&nbsp;&nbsp; └── &nbsp;|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── success|boolean|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── message|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── data|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── dataExpressionEnum|enum|&nbsp;|&nbsp;|枚举<br/>SENSIRION("2101", new HashMap&lt;&gt;()) - temperature
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── menuPermissionCodes|array&lt;enum&gt;|&nbsp;|&nbsp;|菜单/权限编码
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── date|string|&nbsp;|&nbsp;|学好
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── idCard|string|&nbsp;|&nbsp;|身份证号
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── age|int32|&nbsp;|0|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── age2|int32|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── code|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── timestamp|string|&nbsp;|&nbsp;|&nbsp;

**Request-example:**
``` json
http://localhost/testArray
```

**Request-body-example:**
``` json
[
  {
    "code": "rGB8Ys",
    "data": {
      "date": "Dec 23, 2052, 4:02:45 AM",
      "idCard": "2",
      "menuPermissionCodes": [
        "EXPIRED"
      ],
      "dataExpressionEnum": "SENSIRION",
      "age": 0,
      "age2": 6605,
      "username": "GQukMNNrw"
    },
    "success": false,
    "message": "tlJm9Jn",
    "timestamp": "g"
  }
]
```

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"B1R0"
```

## 6.Test @PathVariable
**URL:** http://localhost/test/{name}/{no}/info

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── name|string|true|&nbsp;|name<br/>
└── no|string|true|&nbsp;|no

**Request-example:**
``` json
http://localhost/test/P/5idTT/info
```


**Response-fields:**

None


## 7.Test @RequestParam
**URL:** http://localhost/testRequestParam

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── author|string|true|<br/>		<br/>		<br/><br/>				<br/>|author│詹姆斯<br/>
└── type|string|true|<br/>		<br/>		<br/><br/>				<br/>|type

**Request-example:**
``` json
http://localhost/testRequestParam?author=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A&type=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A
```


**Response-fields:**

None


## 8.Test @RequestParam with value
**URL:** http://localhost/testRequestParamWithValue

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── name|string|true|<br/>		<br/>		<br/><br/>				<br/>|user name<br/>

**Request-example:**
``` json
http://localhost/testRequestParamWithValue?name=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A
```


**Response-fields:**

None


## 9.Test @RequestParam with default value
**URL:** http://localhost/testRequestParamWithDefaultVal

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── userName|string|true|Jordan|user name<br/>

**Request-example:**
``` json
http://localhost/testRequestParamWithDefaultVal?userName=Jordan
```


**Response-fields:**

None


## 10.Test much path
**URL:** http://localhost/testMuchPath/get/{userId}

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── userId|int64|true|&nbsp;|userId<br/>

**Request-example:**
``` json
http://localhost/testMuchPath/get/8023
```


**Response-fields:**

None


## 11.Test much path much parameter
**URL:** http://localhost/get/{deptId}/{userId}

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── userId|int64|true|&nbsp;|userId<br/>
└── deptId|int64|true|&nbsp;|deptId

**Request-example:**
``` json
http://localhost/get/5791/8993
```


**Response-fields:**

None


## 12.Test Constants
**URL:** http://localhost/testConstants

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── page|int32|false|0|页码

**Request-example:**
``` json
http://localhost/testConstants?page=0
```


**Response-fields:**

None


## 13.测试mapping中的
**URL:** http://localhost/ex/bars

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|int64|true|<br/>		<br/>		<br/><br/>				<br/>|

**Request-example:**
``` json
http://localhost/ex/bars?id=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"A"
```

## 14.测试mapping中的2
**URL:** http://localhost/ex/bars

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|int64|true|<br/>		<br/>		<br/><br/>				<br/>|

**Request-example:**
``` json
http://localhost/ex/bars?id=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"QIS"
```

# 请求类型测试

## 1.测试GetMapping 无参数
**URL:** http://localhost/getMapping1

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/getMapping1
```


**Response-fields:**

None


## 2.测试PostMapping 无参数
**URL:** http://localhost/PostMapping1

**Type:** POST



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/PostMapping1
```


**Response-fields:**

None


## 3.测试PutMapping 无参数
**URL:** http://localhost/PutMapping1

**Type:** PUT



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/PutMapping1
```


**Response-fields:**

None


## 4.DeleteMapping 无参数
**URL:** http://localhost/DeleteMapping1

**Type:** DELETE



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/DeleteMapping1
```


**Response-fields:**

None


## 5.测试GetMapping
**URL:** http://localhost/getMapping

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── userId|int64|true|<br/>		<br/>		<br/><br/>				<br/>|userId

**Request-example:**
``` json
http://localhost/getMapping?userId=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A
```


**Response-fields:**

None


## 6.测试PostMapping json
**URL:** http://localhost/postMapping

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|user
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话
&nbsp;&nbsp; ├── email|string|&nbsp;|&nbsp;|邮箱
&nbsp;&nbsp; ├── address|string|&nbsp;|&nbsp;|地址
&nbsp;&nbsp; ├── sex|int32|&nbsp;|&nbsp;|性别(男1 女 2)
&nbsp;&nbsp; ├── avatar|string|&nbsp;|https://s1.ax1x.com/2018/05/19/CcdVQP.png|&nbsp;
&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型
&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|状态
&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|描述
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有角色
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|角色名 以ROLE_开头
&nbsp;&nbsp; │&nbsp;&nbsp; ├── defaultRole|boolean|&nbsp;|&nbsp;|是否为注册默认角色
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|拥有权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有的权限
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]

**Request-example:**
``` json
http://localhost/postMapping
```

**Request-body-example:**
``` json
{
  "address": "3tIPT50Yj",
  "nickName": "DIfZ5cZ",
  "sex": 6126,
  "roles": [
    {
      "createBy": "PSZ3mFr",
      "defaultRole": true,
      "createTime": "Apr 9, 2069, 4:52:58 AM",
      "updateBy": "8do",
      "permissions": [
        {
          "level": 5745,
          "icon": "AqGYF",
          "description": "8Av5qYjHRe",
          "updateTime": "Feb 19, 2004, 3:46:17 AM",
          "type": 3816,
          "title": "Q1l3",
          "delFlag": 5905,
          "parentId": "STr9jb",
          "permTypes": [
            "13B2x"
          ],
          "path": "eJ8lizlht",
          "component": "RE6WSjpyy6",
          "expand": "true",
          "createBy": "nq1AQB72m",
          "buttonType": "iZ",
          "children": [
            {
              "level": 9611,
              "icon": "7vG7",
              "description": "r",
              "updateTime": "Nov 12, 2011, 1:23:14 AM",
              "type": 5954,
              "title": "K",
              "delFlag": 1635,
              "parentId": "MT3f",
              "permTypes": [
                "dUZ3YaYDPX"
              ],
              "path": "4MU8",
              "component": "hNa",
              "expand": "true",
              "createBy": "ijXLsMU",
              "buttonType": "jPERE1",
              "children": [],
              "createTime": "Nov 10, 1986, 8:29:58 AM",
              "updateBy": "aHqjlKF7",
              "sortOrder": 1012.69,
              "name": "KUR",
              "checked": "false",
              "id": "7gW4",
              "selected": "false",
              "status": 3686
            }
          ],
          "createTime": "Jan 30, 1983, 7:39:40 PM",
          "updateBy": "ziw",
          "sortOrder": 2965.34,
          "name": "UQXK",
          "checked": "false",
          "id": "Uw97rO",
          "selected": "false",
          "status": 5886
        }
      ],
      "name": "dwy3lfXD",
      "updateTime": "Apr 8, 2038, 12:53:26 PM",
      "id": "y4cOrbh",
      "delFlag": 7747
    }
  ],
  "mobile": "6p8AcY",
  "description": "zDEnTRbMb",
  "updateTime": "Dec 19, 2057, 10:24:56 PM",
  "avatar": "https://s1.ax1x.com/2018/05/19/CcdVQP.png",
  "type": 3745,
  "delFlag": 1629,
  "password": "hIiJQqqPD",
  "createBy": "jPVoROnVly",
  "createTime": "Oct 18, 2055, 5:47:36 PM",
  "updateBy": "TSqGOxa7p",
  "permissions": [
    {
      "level": 6554,
      "icon": "w7uwcCV",
      "description": "z",
      "updateTime": "Jul 25, 2033, 6:07:29 AM",
      "type": 7272,
      "title": "f",
      "delFlag": 9440,
      "parentId": "BYY2A",
      "permTypes": [
        "5IoVSp6lcj"
      ],
      "path": "Wc",
      "component": "jzVU25",
      "expand": "true",
      "createBy": "x",
      "buttonType": "LoCcj5",
      "children": [
        {
          "level": 6870,
          "icon": "2Zgp7vJR",
          "description": "7i1tqE1s",
          "updateTime": "Feb 9, 2010, 9:26:02 AM",
          "type": 7658,
          "title": "K",
          "delFlag": 4640,
          "parentId": "HaFvkCmLd",
          "permTypes": [
            "AVj8bLqU"
          ],
          "path": "CQ",
          "component": "0Fa",
          "expand": "true",
          "createBy": "975AR",
          "buttonType": "XwH43J4p",
          "children": [
            {
              "level": 6238,
              "icon": "9tG",
              "description": "1m4gXpIM5O",
              "updateTime": "Mar 15, 2051, 9:59:00 PM",
              "type": 2901,
              "title": "sy",
              "delFlag": 8572,
              "parentId": "pIV",
              "permTypes": [
                "k0EeXVJvV"
              ],
              "path": "eM06Qnrs",
              "component": "HKaNEur",
              "expand": "true",
              "createBy": "S1kYwAduOr",
              "buttonType": "r9FqaS",
              "children": [],
              "createTime": "Oct 4, 1986, 7:14:31 AM",
              "updateBy": "t5lNekGM",
              "sortOrder": 3102.45,
              "name": "j",
              "checked": "false",
              "id": "Z990i2lwf",
              "selected": "false",
              "status": 9325
            }
          ],
          "createTime": "Dec 6, 2096, 9:56:41 AM",
          "updateBy": "f",
          "sortOrder": 7993.01,
          "name": "Pp8Ld",
          "checked": "false",
          "id": "j",
          "selected": "false",
          "status": 6175
        }
      ],
      "createTime": "Jul 30, 2092, 8:36:48 AM",
      "updateBy": "kyQD4q3",
      "sortOrder": 6421.25,
      "name": "CwauNgT",
      "checked": "false",
      "id": "UIFG9",
      "selected": "false",
      "status": 3098
    }
  ],
  "id": "ebAGXsB",
  "email": "760lHHA",
  "username": "UcSTgj",
  "status": 4721
}
```

**Response-fields:**

None


## 7.测试PostMapping表单
**URL:** http://localhost/postMapping2

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|&nbsp;|&nbsp;|user
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话
&nbsp;&nbsp; ├── email|string|&nbsp;|&nbsp;|邮箱
&nbsp;&nbsp; ├── address|string|&nbsp;|&nbsp;|地址
&nbsp;&nbsp; ├── sex|int32|&nbsp;|&nbsp;|性别(男1 女 2)
&nbsp;&nbsp; ├── avatar|string|&nbsp;|https://s1.ax1x.com/2018/05/19/CcdVQP.png|&nbsp;
&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型
&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|状态
&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|描述
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有角色
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|角色名 以ROLE_开头
&nbsp;&nbsp; │&nbsp;&nbsp; ├── defaultRole|boolean|&nbsp;|&nbsp;|是否为注册默认角色
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|拥有权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有的权限
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]

**Request-example:**
``` json
http://localhost/postMapping2
```


**Response-fields:**

None


## 8.测试PutMapping json
**URL:** http://localhost/putMapping

**Type:** PUT



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|user
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话
&nbsp;&nbsp; ├── email|string|&nbsp;|&nbsp;|邮箱
&nbsp;&nbsp; ├── address|string|&nbsp;|&nbsp;|地址
&nbsp;&nbsp; ├── sex|int32|&nbsp;|&nbsp;|性别(男1 女 2)
&nbsp;&nbsp; ├── avatar|string|&nbsp;|https://s1.ax1x.com/2018/05/19/CcdVQP.png|&nbsp;
&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型
&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|状态
&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|描述
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有角色
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|角色名 以ROLE_开头
&nbsp;&nbsp; │&nbsp;&nbsp; ├── defaultRole|boolean|&nbsp;|&nbsp;|是否为注册默认角色
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|拥有权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有的权限
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]

**Request-example:**
``` json
http://localhost/putMapping
```

**Request-body-example:**
``` json
{
  "address": "t6NoC",
  "nickName": "wR3P",
  "sex": 1255,
  "roles": [
    {
      "createBy": "oo8C1UTG",
      "defaultRole": true,
      "createTime": "Jan 11, 1991, 10:16:53 PM",
      "updateBy": "hq",
      "permissions": [
        {
          "level": 5502,
          "icon": "CjH0xta",
          "description": "oA4bPKKNO",
          "updateTime": "Feb 2, 2040, 2:03:33 AM",
          "type": 8793,
          "title": "PeFn",
          "delFlag": 6565,
          "parentId": "o8SB",
          "permTypes": [
            "jMC"
          ],
          "path": "Pyjo",
          "component": "QVYi",
          "expand": "true",
          "createBy": "Q",
          "buttonType": "kgztoA",
          "children": [
            {
              "level": 9341,
              "icon": "IATMJAwUu",
              "description": "6p3Qv6HLAq",
              "updateTime": "Jul 30, 2006, 9:30:53 AM",
              "type": 6816,
              "title": "ts",
              "delFlag": 2065,
              "parentId": "NpvSu",
              "permTypes": [
                "BjW8sfPAa"
              ],
              "path": "8KvfO",
              "component": "qUytpsH7t",
              "expand": "true",
              "createBy": "Yq",
              "buttonType": "Jmsu",
              "children": [],
              "createTime": "Feb 26, 2008, 11:51:40 AM",
              "updateBy": "H4QpKz",
              "sortOrder": 9198.02,
              "name": "yHDB8",
              "checked": "false",
              "id": "sC",
              "selected": "false",
              "status": 7898
            }
          ],
          "createTime": "Jul 2, 2058, 10:05:30 PM",
          "updateBy": "SX",
          "sortOrder": 9838.91,
          "name": "m0",
          "checked": "false",
          "id": "jxZOK4EzZQ",
          "selected": "false",
          "status": 7993
        }
      ],
      "name": "jDV",
      "updateTime": "Apr 9, 2010, 6:18:14 PM",
      "id": "o9NKFxX",
      "delFlag": 2971
    }
  ],
  "mobile": "BmQoxjyIhz",
  "description": "ViWKk",
  "updateTime": "Apr 13, 2100, 8:32:49 PM",
  "avatar": "https://s1.ax1x.com/2018/05/19/CcdVQP.png",
  "type": 3633,
  "delFlag": 5066,
  "password": "9G3",
  "createBy": "7Fl2Sjoo",
  "createTime": "Dec 12, 1977, 3:38:59 AM",
  "updateBy": "JxMQc",
  "permissions": [
    {
      "level": 8609,
      "icon": "drFyUKot",
      "description": "4UN",
      "updateTime": "Oct 19, 2074, 8:04:16 PM",
      "type": 1845,
      "title": "PruQujmDc",
      "delFlag": 7636,
      "parentId": "JlW",
      "permTypes": [
        "N"
      ],
      "path": "nK",
      "component": "ZVV0",
      "expand": "true",
      "createBy": "Sp",
      "buttonType": "9uW7hadC",
      "children": [
        {
          "level": 8329,
          "icon": "Ra",
          "description": "lCiU",
          "updateTime": "Oct 1, 1996, 5:43:07 PM",
          "type": 9870,
          "title": "IFCFWqs",
          "delFlag": 233,
          "parentId": "ECOCBk",
          "permTypes": [
            "Nm"
          ],
          "path": "7XD5",
          "component": "X02fO6Xjbv",
          "expand": "true",
          "createBy": "c3us2",
          "buttonType": "jLvqDRb",
          "children": [
            {
              "level": 6667,
              "icon": "zYyX",
              "description": "xG",
              "updateTime": "Nov 23, 2037, 11:59:57 PM",
              "type": 5727,
              "title": "XIL0FYV",
              "delFlag": 6789,
              "parentId": "BmNf4n6dLy",
              "permTypes": [
                "Dbm0x1"
              ],
              "path": "grGOQao",
              "component": "AYNGGncan",
              "expand": "true",
              "createBy": "VsgU3KnxD",
              "buttonType": "WQ",
              "children": [],
              "createTime": "Jan 29, 2084, 6:53:15 PM",
              "updateBy": "DpEhCJdhnh",
              "sortOrder": 6215.0,
              "name": "3ROt",
              "checked": "false",
              "id": "1",
              "selected": "false",
              "status": 9265
            }
          ],
          "createTime": "Apr 1, 2048, 3:27:55 AM",
          "updateBy": "ek",
          "sortOrder": 6562.03,
          "name": "npXmm",
          "checked": "false",
          "id": "kzh",
          "selected": "false",
          "status": 7348
        }
      ],
      "createTime": "Jan 19, 1984, 8:01:54 PM",
      "updateBy": "A5G5",
      "sortOrder": 1336.47,
      "name": "F",
      "checked": "false",
      "id": "ABLPo7",
      "selected": "false",
      "status": 6995
    }
  ],
  "id": "9",
  "email": "GvJlq1K",
  "username": "qvZlV",
  "status": 9215
}
```

**Response-fields:**

None


## 9.测试PutMapping表单
**URL:** http://localhost/putMapping2

**Type:** PUT



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|&nbsp;|&nbsp;|user
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话
&nbsp;&nbsp; ├── email|string|&nbsp;|&nbsp;|邮箱
&nbsp;&nbsp; ├── address|string|&nbsp;|&nbsp;|地址
&nbsp;&nbsp; ├── sex|int32|&nbsp;|&nbsp;|性别(男1 女 2)
&nbsp;&nbsp; ├── avatar|string|&nbsp;|https://s1.ax1x.com/2018/05/19/CcdVQP.png|&nbsp;
&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型
&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|状态
&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|描述
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有角色
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|角色名 以ROLE_开头
&nbsp;&nbsp; │&nbsp;&nbsp; ├── defaultRole|boolean|&nbsp;|&nbsp;|是否为注册默认角色
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|拥有权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有的权限
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型
&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]
&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号
&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人
&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人
&nbsp;&nbsp; ├── updateTime|string|&nbsp;|&nbsp;|修改时间
&nbsp;&nbsp; └── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]

**Request-example:**
``` json
http://localhost/putMapping2
```


**Response-fields:**

None


## 10.测试DeleteMapping
**URL:** http://localhost/deleteMapping

**Type:** DELETE



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── userId|int64|true|<br/>		<br/>		<br/><br/>				<br/>|userId

**Request-example:**
``` json
http://localhost/deleteMapping?userId=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A
```


**Response-fields:**

None


# Test ResponseEntity

## 1.ResponseEntity return List
**URL:** http://localhost/responseEntity/list

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/responseEntity/list
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;object&gt;|&nbsp;
└── &nbsp;|object|Description:<br/>用户对象
&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; └── telephone|string|固定电话

**Response-example:**
``` json
[
  {
    "userAddress": "gmCZD",
    "small": 4744.97,
    "userList": [
      {
        "userAddress": "ZB2pj",
        "small": 9556.94,
        "userList": [],
        "money": 3161.62,
        "phone": "Kl1Ia66B",
        "createTime": 9225,
        "nickName": "g1HgU",
        "ipv6": "fvuqIL",
        "telephone": "GheZK9Ncs",
        "userName": "FGNHncE",
        "userDetails": [
          {
            "githubAddress": "LgB"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 6320.33,
    "phone": "b1Z",
    "createTime": 2076,
    "nickName": "poh8lN",
    "ipv6": "jlUB",
    "telephone": "Y7An",
    "userName": "1Oto0",
    "userDetails": [
      {
        "githubAddress": "QLv1"
      }
    ],
    "userAge": 0
  }
]
```

# 普通java对象api文档测试

## 1.返回普通String测试
**URL:** http://localhost/simple/str

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/simple/str
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"T3z65RxA"
```

## 2.返回普通javabean
**URL:** http://localhost/simple/user

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|
&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|&nbsp;|&nbsp;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|&nbsp;|&nbsp;|测试
&nbsp;&nbsp; ├── userList|array&lt;object&gt;|&nbsp;|&nbsp;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|&nbsp;|&nbsp;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|&nbsp;|&nbsp;|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|&nbsp;|&nbsp;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|&nbsp;|&nbsp;|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|&nbsp;|0|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|&nbsp;|&nbsp;|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|&nbsp;|&nbsp;|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|&nbsp;|&nbsp;|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|&nbsp;|&nbsp;|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|&nbsp;|&nbsp;|固定电话
&nbsp;&nbsp; ├── userName|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; ├── userAddress|string|&nbsp;|&nbsp;|用户地址
&nbsp;&nbsp; ├── userAge|int32|&nbsp;|0|用户年龄
&nbsp;&nbsp; ├── phone|string|&nbsp;|&nbsp;|手机号
&nbsp;&nbsp; ├── createTime|int64|&nbsp;|&nbsp;|创建时间
&nbsp;&nbsp; ├── small|float|&nbsp;|&nbsp;|钱少
&nbsp;&nbsp; ├── money|double|&nbsp;|&nbsp;|钱太多了
&nbsp;&nbsp; ├── ipv6|string|&nbsp;|&nbsp;|ipv6
&nbsp;&nbsp; └── telephone|string|&nbsp;|&nbsp;|固定电话

**Request-example:**
``` json
http://localhost/simple/user
```

**Request-body-example:**
``` json
{
  "userAddress": "ckiZUjC",
  "small": 2001.41,
  "userList": [
    {
      "userAddress": "GlK6g5RoG",
      "small": 8749.73,
      "userList": [],
      "money": 4839.35,
      "phone": "M4fk5Zg",
      "createTime": 6595,
      "nickName": "b8",
      "ipv6": "8M",
      "telephone": "r6",
      "userName": "XztF8jJ",
      "userDetails": [
        {
          "githubAddress": "h"
        }
      ],
      "userAge": 0
    }
  ],
  "money": 7385.38,
  "phone": "BwK0yxp7",
  "createTime": 7759,
  "nickName": "kN",
  "ipv6": "J",
  "telephone": "3QuaeuttxI",
  "userName": "0vwjHAq",
  "userDetails": [
    {
      "githubAddress": "nH6Xksve"
    }
  ],
  "userAge": 0
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Description:<br/>用户对象
├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; └── githubAddress|string|测试
├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; └── telephone|string|固定电话
├── userName|string|用户名
├── nickName|string|昵称
├── userAddress|string|用户地址
├── userAge|int32|用户年龄
├── phone|string|手机号
├── createTime|int64|创建时间
├── small|float|钱少
├── money|double|钱太多了
├── ipv6|string|ipv6
└── telephone|string|固定电话

**Response-example:**
``` json
{
  "userAddress": "TldMCH5VR",
  "small": 2916.39,
  "userList": [
    {
      "userAddress": "yEg3oC",
      "small": 8696.26,
      "userList": [],
      "money": 2783.12,
      "phone": "jnBnz",
      "createTime": 9684,
      "nickName": "yCtJIo",
      "ipv6": "rh0cwcupwy",
      "telephone": "kspzpk5p",
      "userName": "iQGz",
      "userDetails": [
        {
          "githubAddress": "EWJt9J17A"
        }
      ],
      "userAge": 0
    }
  ],
  "money": 8415.36,
  "phone": "BKk",
  "createTime": 2477,
  "nickName": "WFVChFFmOq",
  "ipv6": "s0XTeEhyf",
  "telephone": "LS",
  "userName": "RP5FcPA",
  "userDetails": [
    {
      "githubAddress": "IH8HDv9d"
    }
  ],
  "userAge": 0
}
```

## 3.返回复杂实体数据
**URL:** http://localhost/simple/stu

**Type:** POST



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/simple/stu
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Description:<br/>学生信息
├── stuName|string|姓名
├── stuAge|boolean|年龄
├── stuAddress|string|地址
├── user|object|用户对象
│&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; └── telephone|string|固定电话
├── userMap|map&lt;string, object&gt;|map用户信息
│&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话
├── userTreeSet|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; └── telephone|string|固定电话
└── user1|object|用户对象2
&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
&nbsp;&nbsp; ├── userName|string|用户名
&nbsp;&nbsp; ├── nickName|string|昵称
&nbsp;&nbsp; ├── userAddress|string|用户地址
&nbsp;&nbsp; ├── userAge|int32|用户年龄
&nbsp;&nbsp; ├── phone|string|手机号
&nbsp;&nbsp; ├── createTime|int64|创建时间
&nbsp;&nbsp; ├── small|float|钱少
&nbsp;&nbsp; ├── money|double|钱太多了
&nbsp;&nbsp; ├── ipv6|string|ipv6
&nbsp;&nbsp; └── telephone|string|固定电话

**Response-example:**
``` json
{
  "user1": {
    "userAddress": "tYsTkRH",
    "small": 855.85,
    "userList": [
      {
        "userAddress": "8xWa",
        "small": 3657.78,
        "userList": [],
        "money": 5238.39,
        "phone": "1mivE",
        "createTime": 4826,
        "nickName": "b",
        "ipv6": "3YwrLJ",
        "telephone": "F9nZ",
        "userName": "a5vN4NCxP",
        "userDetails": [
          {
            "githubAddress": "b5"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 7120.74,
    "phone": "syZf173",
    "createTime": 449,
    "nickName": "wk",
    "ipv6": "puxj39",
    "telephone": "Sj",
    "userName": "Lo6H4",
    "userDetails": [
      {
        "githubAddress": "HlJq"
      }
    ],
    "userAge": 0
  },
  "userTreeSet": [
    {
      "userAddress": "Xi",
      "small": 5814.46,
      "userList": [
        {
          "userAddress": "oqnJaZK",
          "small": 691.49,
          "userList": [],
          "money": 4592.46,
          "phone": "pqxiDd",
          "createTime": 9062,
          "nickName": "QWNkc",
          "ipv6": "w0vwrk1",
          "telephone": "9Q7dnYE",
          "userName": "Y8RmWGw",
          "userDetails": [
            {
              "githubAddress": "NQuCK0"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 8825.52,
      "phone": "xRJUlDY7",
      "createTime": 7897,
      "nickName": "4",
      "ipv6": "DKT",
      "telephone": "zlnYqs6Wt",
      "userName": "Kxw6",
      "userDetails": [
        {
          "githubAddress": "zgV52F3we"
        }
      ],
      "userAge": 0
    }
  ],
  "stuAddress": "tFQft",
  "stuName": "hZ07RH",
  "userMap": {
    "null": {
      "userAddress": "XUfma",
      "small": 3922.91,
      "userList": [
        {
          "userAddress": "xa",
          "small": 2126.95,
          "userList": [],
          "money": 4848.59,
          "phone": "UtyfnHr",
          "createTime": 3167,
          "nickName": "idy",
          "ipv6": "P",
          "telephone": "t3xFPDd7",
          "userName": "y1uV4gGYDG",
          "userDetails": [
            {
              "githubAddress": "Dwt"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 9201.45,
      "phone": "HdAt",
      "createTime": 572,
      "nickName": "D5qA",
      "ipv6": "612R6w3Nq",
      "telephone": "C7",
      "userName": "A5",
      "userDetails": [
        {
          "githubAddress": "3wqDNRv"
        }
      ],
      "userAge": 0
    }
  },
  "stuAge": false,
  "user": {
    "userAddress": "Qzfp",
    "small": 2922.91,
    "userList": [
      {
        "userAddress": "HC0",
        "small": 5590.22,
        "userList": [],
        "money": 5800.5,
        "phone": "gQ",
        "createTime": 6037,
        "nickName": "8zaiYQiTc",
        "ipv6": "0ZRyYg6zyo",
        "telephone": "IMT",
        "userName": "ZUPym3SMh",
        "userDetails": [
          {
            "githubAddress": "KPRnoa"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 7257.22,
    "phone": "q1jz",
    "createTime": 6973,
    "nickName": "vFAG",
    "ipv6": "v",
    "telephone": "pn8zqNYB",
    "userName": "IUW2vXu",
    "userDetails": [
      {
        "githubAddress": "QQpQ2uO"
      }
    ],
    "userAge": 0
  }
}
```

## 4.Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构
**URL:** http://localhost/simple/teacher

**Type:** POST



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/simple/teacher
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Description:<br/>老师
├── data|object|泛型data
│&nbsp;&nbsp; ├── data|object|泛型data
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; ├── data1|object|泛型data1
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; ├── data2|object|data2
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; └── age|int32|年龄
├── data1|object|泛型data1
│&nbsp;&nbsp; ├── data|object|泛型data
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; ├── data1|object|泛型data1
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; ├── data2|object|data2
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; └── age|int32|年龄
├── data2|object|data2
│&nbsp;&nbsp; ├── data|object|泛型data
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; ├── data1|object|泛型data1
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; ├── data2|object|data2
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; └── age|int32|年龄
└── age|int32|年龄

**Response-example:**
``` json
{
  "data": {
    "data": {
      "userAddress": "XLsOR8AnH",
      "small": 2409.61,
      "userList": [
        {
          "userAddress": "s4Zw",
          "small": 7329.2,
          "userList": [],
          "money": 7042.12,
          "phone": "hRaxMYLq",
          "createTime": 2844,
          "nickName": "8fiu",
          "ipv6": "iNCyWf",
          "telephone": "lNi5GiyG",
          "userName": "w",
          "userDetails": [
            {
              "githubAddress": "q"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 2203.0,
      "phone": "C3LD1C9",
      "createTime": 3071,
      "nickName": "0sKHw",
      "ipv6": "kppe",
      "telephone": "YpTFkqe",
      "userName": "nyyRd0MzqE",
      "userDetails": [
        {
          "githubAddress": "QAN"
        }
      ],
      "userAge": 0
    },
    "data2": {
      "userAddress": "HlOvsstID",
      "small": 4563.12,
      "userList": [
        {
          "userAddress": "PAFgat",
          "small": 1098.25,
          "userList": [],
          "money": 23.51,
          "phone": "16hwKEM",
          "createTime": 7644,
          "nickName": "Fic",
          "ipv6": "C6",
          "telephone": "QX5t",
          "userName": "zn",
          "userDetails": [
            {
              "githubAddress": "eFoCq4Q"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 3248.53,
      "phone": "Q",
      "createTime": 2338,
      "nickName": "PCGC4oIDb",
      "ipv6": "g",
      "telephone": "t1vAejuN",
      "userName": "KhXeTtJs",
      "userDetails": [
        {
          "githubAddress": "cy8"
        }
      ],
      "userAge": 0
    },
    "data1": {
      "userAddress": "cdD",
      "small": 8665.83,
      "userList": [
        {
          "userAddress": "J06K9eWS",
          "small": 4317.29,
          "userList": [],
          "money": 8261.46,
          "phone": "Um6TSqbSM3",
          "createTime": 9234,
          "nickName": "hsnwyncdE",
          "ipv6": "2Cp6LNr",
          "telephone": "etN",
          "userName": "8SzS77BxA",
          "userDetails": [
            {
              "githubAddress": "7eeVn"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 4432.7,
      "phone": "51gN0",
      "createTime": 7085,
      "nickName": "HSrfu6XD",
      "ipv6": "oaIW",
      "telephone": "Qllgm",
      "userName": "Cmapmh0o",
      "userDetails": [
        {
          "githubAddress": "0vtu"
        }
      ],
      "userAge": 0
    },
    "age": 0
  },
  "data2": {
    "data": {
      "userAddress": "svdO11i",
      "small": 8078.89,
      "userList": [
        {
          "userAddress": "DG4h",
          "small": 9352.44,
          "userList": [],
          "money": 8805.16,
          "phone": "Qy0K",
          "createTime": 1140,
          "nickName": "BmxYnF3",
          "ipv6": "zsDLxN",
          "telephone": "YAnge",
          "userName": "xJ29jez",
          "userDetails": [
            {
              "githubAddress": "z"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 5623.33,
      "phone": "StKkamz99",
      "createTime": 5830,
      "nickName": "VM",
      "ipv6": "GUsjjOeN",
      "telephone": "l23rP03",
      "userName": "PSTmrG",
      "userDetails": [
        {
          "githubAddress": "GhORC"
        }
      ],
      "userAge": 0
    },
    "data2": {
      "userAddress": "e2qIii",
      "small": 9207.96,
      "userList": [
        {
          "userAddress": "DkFhd",
          "small": 2615.88,
          "userList": [],
          "money": 4288.56,
          "phone": "880NMAs6",
          "createTime": 2892,
          "nickName": "uhBef9IJpb",
          "ipv6": "kzu",
          "telephone": "bUO1J5lJP",
          "userName": "Uru1L",
          "userDetails": [
            {
              "githubAddress": "gtPb"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 5004.06,
      "phone": "Y1",
      "createTime": 5108,
      "nickName": "eEmZwcZ",
      "ipv6": "RDF8oEN",
      "telephone": "98Nafws",
      "userName": "bjFa8Vr",
      "userDetails": [
        {
          "githubAddress": "peYw0xhQ"
        }
      ],
      "userAge": 0
    },
    "data1": {
      "userAddress": "rJGPHHz",
      "small": 2284.47,
      "userList": [
        {
          "userAddress": "G9K7hpsjb",
          "small": 5398.49,
          "userList": [],
          "money": 495.4,
          "phone": "59ysqTbri",
          "createTime": 8126,
          "nickName": "6viERiX",
          "ipv6": "VuNvDDwa",
          "telephone": "n6KFFzru",
          "userName": "kOzHX",
          "userDetails": [
            {
              "githubAddress": "iTnjJk"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 2120.95,
      "phone": "rTMOqREt",
      "createTime": 7463,
      "nickName": "eZ8tCFaA",
      "ipv6": "A",
      "telephone": "t1A",
      "userName": "LNasy6JyQ",
      "userDetails": [
        {
          "githubAddress": "G0eIeoI"
        }
      ],
      "userAge": 0
    },
    "age": 0
  },
  "data1": {
    "data": {
      "userAddress": "kzXo",
      "small": 4874.85,
      "userList": [
        {
          "userAddress": "LZfcXQqs",
          "small": 2889.43,
          "userList": [],
          "money": 6081.42,
          "phone": "HX",
          "createTime": 8820,
          "nickName": "1TZ",
          "ipv6": "hmt",
          "telephone": "6",
          "userName": "caLMb9",
          "userDetails": [
            {
              "githubAddress": "ju2m"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 2444.84,
      "phone": "zZzrfr",
      "createTime": 9943,
      "nickName": "45xw0",
      "ipv6": "f9a4r0Je",
      "telephone": "hNg",
      "userName": "YsSncrYfr",
      "userDetails": [
        {
          "githubAddress": "7VD"
        }
      ],
      "userAge": 0
    },
    "data2": {
      "userAddress": "93k7GK1uEX",
      "small": 1145.57,
      "userList": [
        {
          "userAddress": "GUXh4Wp",
          "small": 9929.61,
          "userList": [],
          "money": 8965.94,
          "phone": "P3ijF",
          "createTime": 9073,
          "nickName": "EE",
          "ipv6": "4",
          "telephone": "31QejrKo",
          "userName": "4bU5G",
          "userDetails": [
            {
              "githubAddress": "RPDNo"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 7471.02,
      "phone": "O9pTfpEe",
      "createTime": 4227,
      "nickName": "mF",
      "ipv6": "4QQC",
      "telephone": "j5KKPB4Y",
      "userName": "8OYji1VD",
      "userDetails": [
        {
          "githubAddress": "GtK"
        }
      ],
      "userAge": 0
    },
    "data1": {
      "userAddress": "LUCgpFEEG0",
      "small": 1213.43,
      "userList": [
        {
          "userAddress": "tB6O22",
          "small": 9343.49,
          "userList": [],
          "money": 2013.04,
          "phone": "TrR963c",
          "createTime": 8273,
          "nickName": "QUAZ",
          "ipv6": "gSGMuQ8D",
          "telephone": "cZCJNkXZl",
          "userName": "x",
          "userDetails": [
            {
              "githubAddress": "97wSRn"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 3307.54,
      "phone": "ocb",
      "createTime": 9394,
      "nickName": "9ITiDI",
      "ipv6": "hssY",
      "telephone": "DgIu357qB",
      "userName": "TGg7q",
      "userDetails": [
        {
          "githubAddress": "BSqu8tHk"
        }
      ],
      "userAge": 0
    },
    "age": 0
  },
  "age": 0
}
```

## 5.Teacher&lt;List&lt;User&gt;, User, Student&gt;
**URL:** http://localhost/simple/teacher2

**Type:** POST



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/simple/teacher2
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Description:<br/>老师
├── data|array&lt;object&gt;|泛型data
│&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; └── telephone|string|固定电话
├── data1|object|泛型data1
│&nbsp;&nbsp; ├── stuName|string|姓名
│&nbsp;&nbsp; ├── stuAge|boolean|年龄
│&nbsp;&nbsp; ├── stuAddress|string|地址
│&nbsp;&nbsp; ├── user|object|用户对象
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; ├── userMap|map&lt;string, object&gt;|map用户信息
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; ├── userTreeSet|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; └── user1|object|用户对象2
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话
├── data2|object|data2
│&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话
│&nbsp;&nbsp; ├── userName|string|用户名
│&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; ├── userAddress|string|用户地址
│&nbsp;&nbsp; ├── userAge|int32|用户年龄
│&nbsp;&nbsp; ├── phone|string|手机号
│&nbsp;&nbsp; ├── createTime|int64|创建时间
│&nbsp;&nbsp; ├── small|float|钱少
│&nbsp;&nbsp; ├── money|double|钱太多了
│&nbsp;&nbsp; ├── ipv6|string|ipv6
│&nbsp;&nbsp; └── telephone|string|固定电话
└── age|int32|年龄

**Response-example:**
``` json
{
  "data": [
    {
      "userAddress": "4Qakj5E",
      "small": 2576.76,
      "userList": [
        {
          "userAddress": "Vwj",
          "small": 2824.81,
          "userList": [],
          "money": 7334.61,
          "phone": "Bi7JeS",
          "createTime": 2806,
          "nickName": "0qSgpJc0p",
          "ipv6": "oSa",
          "telephone": "NWIvlfA",
          "userName": "A",
          "userDetails": [
            {
              "githubAddress": "AwQCL"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 8736.02,
      "phone": "Zp80",
      "createTime": 6998,
      "nickName": "Ykgh8dr",
      "ipv6": "4w2yQ",
      "telephone": "M",
      "userName": "Ab9",
      "userDetails": [
        {
          "githubAddress": "rrRP87MHz"
        }
      ],
      "userAge": 0
    }
  ],
  "data2": {
    "userAddress": "MJ5B",
    "small": 4152.69,
    "userList": [
      {
        "userAddress": "H1i3",
        "small": 2800.5,
        "userList": [],
        "money": 8948.1,
        "phone": "QI",
        "createTime": 6274,
        "nickName": "puiemVj",
        "ipv6": "J",
        "telephone": "7WCpKhQ",
        "userName": "iGqtcyR",
        "userDetails": [
          {
            "githubAddress": "UhzhbmuQT"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 2866.22,
    "phone": "hNd8Aam8iE",
    "createTime": 1741,
    "nickName": "0TFF6P",
    "ipv6": "WvXNjvOiOv",
    "telephone": "gliSHJvzQ",
    "userName": "v13QDHhlYr",
    "userDetails": [
      {
        "githubAddress": "RV1WGLnYkL"
      }
    ],
    "userAge": 0
  },
  "data1": {
    "user1": {
      "userAddress": "CJejKHfx",
      "small": 5883.01,
      "userList": [],
      "money": 1348.35,
      "phone": "Q3luZR",
      "createTime": 638,
      "nickName": "GZr2",
      "ipv6": "FPyKKS",
      "telephone": "rWDb",
      "userName": "yZCYE",
      "userDetails": [
        {
          "githubAddress": "jmk"
        }
      ],
      "userAge": 0
    },
    "userTreeSet": [
      {
        "userAddress": "FPLC",
        "small": 5893.17,
        "userList": [],
        "money": 5661.76,
        "phone": "lwaHDqY5",
        "createTime": 4000,
        "nickName": "oX1RMfmLN",
        "ipv6": "mNLUYy",
        "telephone": "der0qMHTAl",
        "userName": "xatHIuDaDM",
        "userDetails": [
          {
            "githubAddress": "2HOppg8"
          }
        ],
        "userAge": 0
      }
    ],
    "stuAddress": "M11",
    "stuName": "W5WlBQn",
    "userMap": {
      "null": {
        "userAddress": "cjh6g8",
        "small": 8458.59,
        "userList": [],
        "money": 2994.89,
        "phone": "9g",
        "createTime": 5959,
        "nickName": "6peB22N",
        "ipv6": "Vb3Kt",
        "telephone": "HtQV",
        "userName": "PTkMhNK",
        "userDetails": [
          {
            "githubAddress": "6F9mP"
          }
        ],
        "userAge": 0
      }
    },
    "stuAge": false,
    "user": {
      "userAddress": "HgnuNV",
      "small": 5372.08,
      "userList": [],
      "money": 2862.0,
      "phone": "4MtaH",
      "createTime": 587,
      "nickName": "AOLmdbSX",
      "ipv6": "X0abK",
      "telephone": "i",
      "userName": "AmEr4cGwTO",
      "userDetails": [
        {
          "githubAddress": "p5e65vax9Q"
        }
      ],
      "userAge": 0
    }
  },
  "age": 0
}
```

## 6.测试SubUser
**URL:** http://localhost/simple/subUser

**Type:** POST



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/simple/subUser
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Description:<br/>子用户
├── subUserName|string|用户名称
└── numbers|number|bigInteger

**Response-example:**
``` json
{
  "subUserName": "bobpUUFs",
  "numbers": 8884
}
```

## 7.返回CommonResult&lt;SubUser&gt;
**URL:** http://localhost/simple/subUser/result

**Type:** POST



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/simple/subUser/result
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|Description:<br/>子用户
│&nbsp;&nbsp; ├── subUserName|string|用户名称
│&nbsp;&nbsp; └── numbers|number|bigInteger
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "A",
  "data": {
    "subUserName": "cXJNmbA6L",
    "numbers": 7031
  },
  "success": false,
  "message": "u",
  "timestamp": "l"
}
```

# 简单对象测试2

## 1.CommonResult&lt;String&gt;
**URL:** http://localhost/stringCommonResult

**Type:** POST



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/stringCommonResult
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "mQ",
  "data": "XKo09DyapT",
  "success": false,
  "message": "Tu",
  "timestamp": "z"
}
```

## 2.返回Staff&lt;Staff&lt;Staff&gt;&gt;
**URL:** http://localhost/staff

**Type:** POST



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/staff
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Description:<br/>职工信息
├── name|string|职工名称
├── annyObject|object|任何信息对象
│&nbsp;&nbsp; ├── name|string|职工名称
│&nbsp;&nbsp; ├── annyObject|object|任何信息对象
│&nbsp;&nbsp; └── data|array&lt;object&gt;|泛型数据
└── data|array&lt;object&gt;|泛型数据
&nbsp;&nbsp; ├── name|string|职工名称
&nbsp;&nbsp; ├── annyObject|object|任何信息对象
&nbsp;&nbsp; └── data|array&lt;object&gt;|泛型数据

**Response-example:**
``` json
{
  "annyObject": {
    "data": [],
    "name": "p"
  },
  "data": [
    {
      "data": [],
      "name": "dxlRkLbbz"
    }
  ],
  "name": "I4f2eyh"
}
```

## 3.返回Staff&lt;String&gt;
**URL:** http://localhost/staffStr

**Type:** POST



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/staffStr
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Description:<br/>职工信息
├── name|string|职工名称
├── annyObject|string|任何信息对象
└── data|array&lt;string&gt;|泛型数据

**Response-example:**
``` json
{
  "annyObject": "Bl4",
  "data": [
    "pLGrFFEsIH"
  ],
  "name": "TVWotJNs"
}
```

## 4.JAVA继承测试
**URL:** http://localhost/children

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── children|object|true|&nbsp;|
&nbsp;&nbsp; ├── age|int32|&nbsp;|0|年龄
&nbsp;&nbsp; └── name|string|&nbsp;|&nbsp;|姓名

**Request-example:**
``` json
http://localhost/children
```

**Request-body-example:**
``` json
{
  "name": "ec6fmHPhS",
  "age": 0
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── age|int32|年龄
└── name|string|姓名

**Response-example:**
``` json
{
  "name": "FdTCcd8",
  "age": 0
}
```

# 注释tag用例

## 1.~~测试apiNote tag~~
**URL:** http://localhost/tags/apiNote

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|array&lt;string&gt;|&nbsp;|&nbsp;|&nbsp;

**Request-example:**
``` json
http://localhost/tags/apiNote
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"q3Yy41s4Q"
```

## 2.自定义mock tag获取mock值
**URL:** http://localhost/tags/mock

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|
&nbsp;&nbsp; ├── subUserName|string|true|&nbsp;|用户名称
&nbsp;&nbsp; └── numbers|number|&nbsp;|&nbsp;|bigInteger

**Request-example:**
``` json
http://localhost/tags/mock
```

**Request-body-example:**
``` json
{
  "subUserName": "biusgq",
  "numbers": 35
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
│&nbsp;&nbsp; ├── AGE|int32|&nbsp;
│&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;
│&nbsp;&nbsp; ├── gender|enum|性别<br/>WOMAN(0,"女人")<br/>MAN(2,"男人")
│&nbsp;&nbsp; ├── simpleEnum|enum|简单枚举<br/>RED<br/>BLUE
│&nbsp;&nbsp; ├── username|string|用户名
│&nbsp;&nbsp; ├── password|string|密码
│&nbsp;&nbsp; ├── nickName|string|昵称
│&nbsp;&nbsp; └── mobile|string|电话
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "bVBC7",
  "data": {
    "password": "xdB5t55nwz",
    "gender": "MAN",
    "MAX_SPEED": "120",
    "simpleEnum": "BLUE",
    "nickName": "SET9DKVEYB",
    "mobile": "NdTlAnKWD",
    "AGE": "100",
    "username": "O1Ha"
  },
  "success": false,
  "message": "4Pkii",
  "timestamp": "0RvJHF"
}
```

## 3.测试@ignore tag
**URL:** http://localhost/tags/ignore

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── pager|object|&nbsp;|&nbsp;|
&nbsp;&nbsp; ├── total|int32|&nbsp;|0|记录总数
&nbsp;&nbsp; ├── concurrentPage|int32|&nbsp;|0|当前页
&nbsp;&nbsp; └── pageSize|int32|&nbsp;|0|当前page

**Request-example:**
``` json
http://localhost/tags/ignore
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"jQSOXB6W"
```

# 用户信息操作接口

## 1.添加用户
**URL:** http://localhost/user/add

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|
&nbsp;&nbsp; ├── AGE|int32|&nbsp;|100|&nbsp;
&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;|120|&nbsp;
&nbsp;&nbsp; ├── gender|enum|&nbsp;|&nbsp;|性别<br/>WOMAN(0,"女人")<br/>MAN(2,"男人")
&nbsp;&nbsp; ├── simpleEnum|enum|&nbsp;|&nbsp;|简单枚举<br/>RED<br/>BLUE
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; └── mobile|string|&nbsp;|&nbsp;|电话

**Request-example:**
``` json
http://localhost/user/add
```

**Request-body-example:**
``` json
{
  "password": "x",
  "gender": "MAN",
  "MAX_SPEED": "120",
  "simpleEnum": "BLUE",
  "nickName": "WqQ",
  "mobile": "xTKNKB",
  "AGE": "100",
  "username": "AcQIPN"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── username|string|用户名
├── password|string|密码
├── nickName|string|昵称
├── mobile|string|电话
├── email|string|邮箱
├── address|string|地址
├── sex|int32|性别(男1 女 2)
├── avatar|string|&nbsp;
├── type|int32|类型
├── status|int32|状态
├── description|string|描述
├── roles|array&lt;object&gt;|用户拥有角色
│&nbsp;&nbsp; ├── name|string|角色名 以ROLE_开头
│&nbsp;&nbsp; ├── defaultRole|boolean|是否为注册默认角色
│&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|拥有权限
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
├── permissions|array&lt;object&gt;|用户拥有的权限
│&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
├── id|string|自增编号
├── createBy|string|创建人
├── createTime|string|创建时间
├── updateBy|string|修改人
├── updateTime|string|修改时间
└── delFlag|int32|删除标记[1表示已删除，默认值0]

**Response-example:**
``` json
{
  "address": "lg4qn",
  "nickName": "h",
  "sex": 8415,
  "roles": [
    {
      "createBy": "fC",
      "defaultRole": true,
      "createTime": "Apr 13, 1984, 9:16:27 AM",
      "updateBy": "sqrBc",
      "permissions": [
        {
          "level": 9984,
          "icon": "ro3XiWqi",
          "description": "RCt",
          "updateTime": "May 27, 2051, 5:47:28 AM",
          "type": 8389,
          "title": "UxRs2EZY",
          "delFlag": 8308,
          "parentId": "JMVAJ",
          "permTypes": [
            "wyjespX"
          ],
          "path": "TbNNPrT",
          "component": "AEOAq1Ij",
          "expand": "true",
          "createBy": "Ckqkjqo",
          "buttonType": "No2",
          "children": [
            {
              "level": 3,
              "icon": "yhsjttmLlN",
              "description": "jCBiqH5qv",
              "updateTime": "Aug 8, 2091, 2:17:16 AM",
              "type": 1847,
              "title": "e4KipOmNoD",
              "delFlag": 6341,
              "parentId": "m",
              "permTypes": [
                "NPNJb4GXUj"
              ],
              "path": "plQi6urI3T",
              "component": "MD",
              "expand": "true",
              "createBy": "TH",
              "buttonType": "0OiqQisMA",
              "children": [],
              "createTime": "Nov 8, 2016, 5:45:22 PM",
              "updateBy": "kVlmIRitMl",
              "sortOrder": 9737.73,
              "name": "mwrscb",
              "checked": "false",
              "id": "qcRBt8eIs",
              "selected": "false",
              "status": 7007
            }
          ],
          "createTime": "Aug 23, 2020, 12:34:40 PM",
          "updateBy": "TFE2",
          "sortOrder": 5318.69,
          "name": "CUIy5sY",
          "checked": "false",
          "id": "GuZgi7nyDm",
          "selected": "false",
          "status": 4375
        }
      ],
      "name": "r6lQIIh",
      "updateTime": "Feb 19, 1974, 12:24:40 PM",
      "id": "39tc",
      "delFlag": 6645
    }
  ],
  "mobile": "8PeVD",
  "description": "4",
  "updateTime": "Oct 2, 2051, 7:51:53 AM",
  "avatar": "https://s1.ax1x.com/2018/05/19/CcdVQP.png",
  "type": 23,
  "delFlag": 5522,
  "password": "jFNDukF",
  "createBy": "215umoea",
  "createTime": "Oct 1, 1983, 7:10:08 PM",
  "updateBy": "2vGk0",
  "permissions": [
    {
      "level": 8210,
      "icon": "UetcIBlM28",
      "description": "wRp3RGaZ",
      "updateTime": "Dec 23, 2018, 5:58:00 AM",
      "type": 4359,
      "title": "7jY",
      "delFlag": 928,
      "parentId": "7py9y6auE",
      "permTypes": [
        "o9Z"
      ],
      "path": "KHz8poI",
      "component": "AlCJkEJZs",
      "expand": "true",
      "createBy": "uzUp",
      "buttonType": "67hVIVd",
      "children": [
        {
          "level": 8719,
          "icon": "SYLsjMS",
          "description": "Aw0zQmc",
          "updateTime": "Aug 24, 2098, 1:30:48 AM",
          "type": 8927,
          "title": "svI8rxqCX",
          "delFlag": 5905,
          "parentId": "cOb",
          "permTypes": [
            "iFwh"
          ],
          "path": "gewmF9",
          "component": "lubYAp",
          "expand": "true",
          "createBy": "sVxCKnoYN",
          "buttonType": "ycFZXqz",
          "children": [
            {
              "level": 2349,
              "icon": "o",
              "description": "PzD7",
              "updateTime": "Oct 10, 2023, 6:37:03 PM",
              "type": 349,
              "title": "CQRXF",
              "delFlag": 3823,
              "parentId": "tLIrj",
              "permTypes": [
                "2bEcd"
              ],
              "path": "z7",
              "component": "8uGWHV7Kpj",
              "expand": "true",
              "createBy": "OjyPpP3bsX",
              "buttonType": "oUJepxAcAR",
              "children": [],
              "createTime": "May 20, 2088, 2:58:15 AM",
              "updateBy": "E",
              "sortOrder": 4029.28,
              "name": "4XhVLdembC",
              "checked": "false",
              "id": "K",
              "selected": "false",
              "status": 7384
            }
          ],
          "createTime": "Sep 23, 2012, 3:28:29 PM",
          "updateBy": "ducJ9E",
          "sortOrder": 4205.12,
          "name": "ewEwtFY",
          "checked": "false",
          "id": "Rygu4G",
          "selected": "false",
          "status": 2278
        }
      ],
      "createTime": "Jul 31, 2073, 7:03:08 PM",
      "updateBy": "4reD",
      "sortOrder": 1451.19,
      "name": "XEc9nhkH4",
      "checked": "false",
      "id": "W",
      "selected": "false",
      "status": 505
    }
  ],
  "id": "6uYGYUN",
  "email": "FBSPugR",
  "username": "7dHv",
  "status": 8221
}
```

## 2.更新用户
**URL:** http://localhost/user/update

**Type:** PUT



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|
&nbsp;&nbsp; ├── AGE|int32|&nbsp;|100|&nbsp;
&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;|120|&nbsp;
&nbsp;&nbsp; ├── gender|enum|&nbsp;|&nbsp;|性别<br/>WOMAN(0,"女人")<br/>MAN(2,"男人")
&nbsp;&nbsp; ├── simpleEnum|enum|&nbsp;|&nbsp;|简单枚举<br/>RED<br/>BLUE
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称
&nbsp;&nbsp; └── mobile|string|&nbsp;|&nbsp;|电话

**Request-example:**
``` json
http://localhost/user/update
```

**Request-body-example:**
``` json
{
  "password": "oCYpxE",
  "gender": "MAN",
  "MAX_SPEED": "120",
  "simpleEnum": "BLUE",
  "nickName": "sI",
  "mobile": "AX4W",
  "AGE": "100",
  "username": "N"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── username|string|用户名
├── password|string|密码
├── nickName|string|昵称
├── mobile|string|电话
├── email|string|邮箱
├── address|string|地址
├── sex|int32|性别(男1 女 2)
├── avatar|string|&nbsp;
├── type|int32|类型
├── status|int32|状态
├── description|string|描述
├── roles|array&lt;object&gt;|用户拥有角色
│&nbsp;&nbsp; ├── name|string|角色名 以ROLE_开头
│&nbsp;&nbsp; ├── defaultRole|boolean|是否为注册默认角色
│&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|拥有权限
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
├── permissions|array&lt;object&gt;|用户拥有的权限
│&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; │&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
│&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型
│&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需
│&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需
│&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需
│&nbsp;&nbsp; ├── id|string|自增编号
│&nbsp;&nbsp; ├── createBy|string|创建人
│&nbsp;&nbsp; ├── createTime|string|创建时间
│&nbsp;&nbsp; ├── updateBy|string|修改人
│&nbsp;&nbsp; ├── updateTime|string|修改时间
│&nbsp;&nbsp; └── delFlag|int32|删除标记[1表示已删除，默认值0]
├── id|string|自增编号
├── createBy|string|创建人
├── createTime|string|创建时间
├── updateBy|string|修改人
├── updateTime|string|修改时间
└── delFlag|int32|删除标记[1表示已删除，默认值0]

**Response-example:**
``` json
{
  "address": "gdWjVuuH",
  "nickName": "VmRSkid77",
  "sex": 4476,
  "roles": [
    {
      "createBy": "iyLjXq",
      "defaultRole": false,
      "createTime": "Feb 12, 2083, 11:59:08 AM",
      "updateBy": "N",
      "permissions": [
        {
          "level": 4963,
          "icon": "EvfPZ",
          "description": "2jmcmiH",
          "updateTime": "Feb 2, 2096, 3:08:41 PM",
          "type": 3483,
          "title": "W6IS9eQt",
          "delFlag": 9579,
          "parentId": "fxYTeLYVTN",
          "permTypes": [
            "6vbaBW"
          ],
          "path": "vA6Amf",
          "component": "00Gza5h1Hq",
          "expand": "true",
          "createBy": "7sR1cRMpt",
          "buttonType": "wv",
          "children": [
            {
              "level": 3479,
              "icon": "WgiBh",
              "description": "K5sHd5",
              "updateTime": "Apr 23, 2028, 3:33:36 AM",
              "type": 1177,
              "title": "FsDUdaJFB",
              "delFlag": 2682,
              "parentId": "CiLHu395D",
              "permTypes": [
                "HWIE3nez0"
              ],
              "path": "nSEH7",
              "component": "YuaI4MYQy",
              "expand": "true",
              "createBy": "LV2Jz4tFF",
              "buttonType": "tKLNvjsV",
              "children": [],
              "createTime": "Feb 11, 2069, 2:35:36 PM",
              "updateBy": "FYpqz",
              "sortOrder": 5442.8,
              "name": "sWt2WbU6QN",
              "checked": "false",
              "id": "exzro",
              "selected": "false",
              "status": 611
            }
          ],
          "createTime": "Jan 17, 2055, 9:08:24 AM",
          "updateBy": "zhph",
          "sortOrder": 9111.19,
          "name": "pEE",
          "checked": "false",
          "id": "f7ppY",
          "selected": "false",
          "status": 455
        }
      ],
      "name": "PV6aW",
      "updateTime": "Jan 15, 1978, 7:28:14 AM",
      "id": "3mTg1vsf",
      "delFlag": 771
    }
  ],
  "mobile": "ZiKX",
  "description": "YQqtPE4WAC",
  "updateTime": "Aug 21, 2025, 11:33:54 PM",
  "avatar": "https://s1.ax1x.com/2018/05/19/CcdVQP.png",
  "type": 9622,
  "delFlag": 862,
  "password": "GtV",
  "createBy": "BmlZhB",
  "createTime": "Dec 9, 2032, 12:21:01 PM",
  "updateBy": "Bpy7w33wT2",
  "permissions": [
    {
      "level": 520,
      "icon": "eJ",
      "description": "P10Q",
      "updateTime": "Oct 10, 2068, 12:07:16 PM",
      "type": 5198,
      "title": "Uoogz3y1j",
      "delFlag": 1443,
      "parentId": "NVC",
      "permTypes": [
        "WtoADyu"
      ],
      "path": "2",
      "component": "0kDyvP",
      "expand": "true",
      "createBy": "zM",
      "buttonType": "xMI1R",
      "children": [
        {
          "level": 9803,
          "icon": "4lvAT",
          "description": "JY7eXFsNz",
          "updateTime": "May 11, 2040, 10:14:44 PM",
          "type": 841,
          "title": "o9",
          "delFlag": 2667,
          "parentId": "RGB6vBn0",
          "permTypes": [
            "MvRVeQ"
          ],
          "path": "cxvhC",
          "component": "8lzTEXgOc",
          "expand": "true",
          "createBy": "QXNLOv2",
          "buttonType": "23p",
          "children": [
            {
              "level": 7986,
              "icon": "HN",
              "description": "iGb9nbyTO3",
              "updateTime": "Jan 26, 2099, 9:21:45 PM",
              "type": 1412,
              "title": "y8z",
              "delFlag": 5734,
              "parentId": "8",
              "permTypes": [
                "HKh"
              ],
              "path": "nqQ",
              "component": "3z5m",
              "expand": "true",
              "createBy": "X",
              "buttonType": "z",
              "children": [],
              "createTime": "Mar 16, 1971, 9:28:44 AM",
              "updateBy": "DzZuT2u",
              "sortOrder": 945.3,
              "name": "H",
              "checked": "false",
              "id": "NU6uqdwF62",
              "selected": "false",
              "status": 1239
            }
          ],
          "createTime": "Nov 9, 1976, 9:43:11 PM",
          "updateBy": "C3m",
          "sortOrder": 6656.9,
          "name": "VHcXBOgCzH",
          "checked": "false",
          "id": "06uAzCsiiT",
          "selected": "false",
          "status": 9360
        }
      ],
      "createTime": "May 27, 1987, 8:42:45 PM",
      "updateBy": "7qi",
      "sortOrder": 7957.47,
      "name": "FIw2R",
      "checked": "false",
      "id": "E",
      "selected": "false",
      "status": 4581
    }
  ],
  "id": "p3Pq4dRpu6",
  "email": "GhmcWPpoS",
  "username": "3wtEXwQZ0N",
  "status": 4577
}
```

# JSR303参数验证规范测试

## 1.验证validate
**URL:** http://localhost/validator/test

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── leader|object|true|&nbsp;|
&nbsp;&nbsp; ├── name|string|true|&nbsp;|姓名
&nbsp;&nbsp; ├── birthday|string|true|&nbsp;|生日
&nbsp;&nbsp; ├── age|int32|&nbsp;|&nbsp;|年龄
&nbsp;&nbsp; └── subject|object|true|&nbsp;|科目
&nbsp;&nbsp; &nbsp;&nbsp; ├── subjectName|string|true|&nbsp;|科目名称
&nbsp;&nbsp; &nbsp;&nbsp; └── core|int32|&nbsp;|0|分数

**Request-example:**
``` json
http://localhost/validator/test
```

**Request-body-example:**
``` json
{
  "birthday": "ekYWAAeVWG",
  "subject": {
    "core": 0,
    "subjectName": "DAesGgn3Xk"
  },
  "name": "Pawl",
  "age": 1779
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "NZFwvlmx",
  "success": false,
  "message": "h9Ebth",
  "timestamp": "vyM"
}
```

## 2.验证通用参数
**URL:** http://localhost/validator/valid

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── param|object|true|&nbsp;|
&nbsp;&nbsp; ├── token|string|true|&nbsp;|token
&nbsp;&nbsp; ├── sequenceNo|string|true|&nbsp;|序列号
&nbsp;&nbsp; └── parameter|object|&nbsp;|&nbsp;|Description:<br/>子用户
&nbsp;&nbsp; &nbsp;&nbsp; ├── subUserName|string|true|&nbsp;|用户名称
&nbsp;&nbsp; &nbsp;&nbsp; └── numbers|number|&nbsp;|&nbsp;|bigInteger

**Request-example:**
``` json
http://localhost/validator/valid
```

**Request-body-example:**
``` json
{
  "sequenceNo": "7cbCQ",
  "parameter": {
    "subUserName": "EuQhin",
    "numbers": 2926
  },
  "token": "Fvjy"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "N6gez",
  "success": false,
  "message": "vt",
  "timestamp": "CC2bGXG1"
}
```

## 3.分组验证1
**URL:** http://localhost/validator/save

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── collect|object|true|&nbsp;|
&nbsp;&nbsp; ├── id|int64|true|&nbsp;|主键id
&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|名称
&nbsp;&nbsp; └── mobile|string|true|&nbsp;|电话

**Request-example:**
``` json
http://localhost/validator/save
```

**Request-body-example:**
``` json
{
  "name": "xOvfgnDss",
  "mobile": "KKSyU1uR",
  "id": 6115
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "wL5XGG9F",
  "success": false,
  "message": "opSbc9",
  "timestamp": "bXZe"
}
```

## 4.分组验证2
**URL:** http://localhost/validator/update

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── collect|object|true|&nbsp;|
&nbsp;&nbsp; ├── id|int64|true|&nbsp;|主键id
&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|名称
&nbsp;&nbsp; └── mobile|string|true|&nbsp;|电话

**Request-example:**
``` json
http://localhost/validator/update
```

**Request-body-example:**
``` json
{
  "name": "4N",
  "mobile": "i1tpBNO",
  "id": 2322
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "mkfeU",
  "success": false,
  "message": "6OjEYH",
  "timestamp": "xv8JuLyfl7"
}
```

## 5.分组验证3
**URL:** http://localhost/validator/login

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── collect|object|true|&nbsp;|
&nbsp;&nbsp; ├── id|int64|true|&nbsp;|主键id
&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|名称
&nbsp;&nbsp; └── mobile|string|true|&nbsp;|电话

**Request-example:**
``` json
http://localhost/validator/login
```

**Request-body-example:**
``` json
{
  "name": "Te7Fqh",
  "mobile": "w9xbhtSh",
  "id": 3856
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "G0yF",
  "success": false,
  "message": "Vh",
  "timestamp": "2"
}
```

## 6.分页查询
**URL:** http://localhost/validator/list

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── t|object|true|&nbsp;|&nbsp;

**Request-example:**
``` json
http://localhost/validator/list
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|object|&nbsp;


# xss拦击测试

## 1.xss过滤普通post请求
**URL:** http://localhost/xss/text

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── text|string|&nbsp;|&nbsp;|请求文本<br/>

**Request-example:**
``` json
http://localhost/xss/text
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "D6",
  "data": "rCBRi",
  "success": false,
  "message": "I9uCTa9Lwz",
  "timestamp": "56"
}
```

## 2.xss过滤get请求
**URL:** http://localhost/xss/query

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── query|string|&nbsp;|&nbsp;|请求参数<br/>

**Request-example:**
``` json
http://localhost/xss/query
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "U",
  "data": "WvT",
  "success": false,
  "message": "X",
  "timestamp": "LNrhWA4B"
}
```

## 3.xss过滤json数据
**URL:** http://localhost/xss/json

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── children|object|true|&nbsp;|
&nbsp;&nbsp; ├── age|int32|&nbsp;|0|年龄
&nbsp;&nbsp; └── name|string|&nbsp;|&nbsp;|姓名

**Request-example:**
``` json
http://localhost/xss/json
```

**Request-body-example:**
``` json
{
  "name": "03LJK5",
  "age": 0
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
│&nbsp;&nbsp; ├── age|int32|年龄
│&nbsp;&nbsp; └── name|string|姓名
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "b1wuYVD",
  "data": {
    "name": "Jl4upHHy8",
    "age": 0
  },
  "success": false,
  "message": "79h",
  "timestamp": "4OH9"
}
```

# 异步返回信息测试

## 1.返回Callable&lt;CommonResult&gt;
**URL:** http://localhost/testCallable

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/testCallable
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "Z74",
  "success": false,
  "message": "HzJpxb",
  "timestamp": "djw5Mz852"
}
```

## 2.返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost/async-deferredresult

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/async-deferredresult
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "ll2",
  "data": "dTHqQR",
  "success": false,
  "message": "pWZxX0",
  "timestamp": "f"
}
```

## 3.返回WebAsyncTask&lt;CommonResult&gt;
**URL:** http://localhost/WebAsync/timeout

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/WebAsync/timeout
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "nKTA1qU",
  "success": false,
  "message": "iTUgSgC",
  "timestamp": "DsfJ"
}
```

## 4.返回Future&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost/future

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/future
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "rB",
  "data": "ze57kfDx",
  "success": false,
  "message": "SvDPc",
  "timestamp": "1CuiTiByV"
}
```

## 5.返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;
**URL:** http://localhost/completableFuture

**Type:** GET



**Request-parameters:**

None

**Request-example:**
``` json
http://localhost/completableFuture
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "dM",
  "data": "RqRQWHy9",
  "success": false,
  "message": "eqvUwvE4",
  "timestamp": "C"
}
```

# smart-doc调试入口

## 1.Test Constants
**URL:** http://localhost/testConstants/1.0

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── page|int32|false|0|页码

**Request-example:**
``` json
http://localhost/testConstants/1.0?page=0
```


**Response-fields:**

None


# app端接口测试

## 1.Test Constants
**URL:** http://localhost/app/admin/testConstants/1.0

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── page|int32|false|0|页码

**Request-example:**
``` json
http://localhost/app/admin/testConstants/1.0?page=0
```


**Response-fields:**

None


## 2.分页查询订单信息
**URL:** http://localhost/app/page/{pageIndex}/{pageSize}

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── pageIndex|int32|true|0|当前页码<br/>
└── pageSize|int32|true|0|页面大小<br/>

**Request-example:**
``` json
http://localhost/app/page/0/0
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── count|int64|总数
├── records|array&lt;object&gt;|分页数据
│&nbsp;&nbsp; ├── orderId|int32|订单id
│&nbsp;&nbsp; └── orderType|enum|订单类型<br/>WAIT_PAY("0", "已支付")<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")
├── page|int64|当前页码
└── size|int64|每页显示条数

**Response-example:**
``` json
{
  "size": 0,
  "records": [
    {
      "orderType": "EXPIRED",
      "orderId": 0
    }
  ],
  "count": 0,
  "page": 0
}
```

## 3.app测试
**URL:** http://localhost/app/test

**Type:** POST



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── name|string|&nbsp;|&nbsp;|姓名│zhangsan<br/>
├── beginTime|string|&nbsp;|&nbsp;|开始时间<br/>
└── endTime|string|&nbsp;|&nbsp;|结束时间<br/>

**Request-example:**
``` json
http://localhost/app/test
```


**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
└── timestamp|string|&nbsp;

**Response-example:**
``` json
{
  "code": "6dVqt92UNS",
  "success": false,
  "message": "22",
  "timestamp": "k0Cz7g"
}
```

## 4.app测试2
**URL:** http://localhost/app/test2

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── name|string|&nbsp;|&nbsp;|姓名<br/>
├── beginTime|string|&nbsp;|&nbsp;|开始时间<br/>
└── endTime|string|&nbsp;|&nbsp;|结束时间<br/>

**Request-example:**
``` json
http://localhost/app/test2
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"FtY5d"
```

## 5.app测试3
**URL:** http://localhost/app/test3

**Type:** GET



**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── name|string|&nbsp;|&nbsp;|姓名<br/>
├── beginTime|string|&nbsp;|&nbsp;|开始时间<br/>
└── endTime|string|&nbsp;|&nbsp;|结束时间<br/>

**Request-example:**
``` json
http://localhost/app/test3
```


**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"ofSOTCcmV"
```