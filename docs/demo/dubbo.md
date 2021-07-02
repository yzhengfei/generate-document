**Generated:** [Generate Document plugin for IntelliJ platform IDEs](https://plugins.jetbrains.com/plugin/13086-generate-document)

**Author:** yinzhengfei

**Dependency:**
``` xml
<dependency>
	<groupId>com.power.doc</groupId>
	<artifactId>api-doc-test</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```

# Class Name：com.power.doc.dubbo.DubboInterface

**Class Description:** dubbo接口测试

## 1.测试
**Method Name:** testConstantsRequestParams

**Author:**

**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── orderList|com.power.doc.entity.ResultUtil&lt;com.power.doc.entity.Order&gt;[]|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; └── &nbsp;|com.power.doc.entity.ResultUtil|&nbsp;|&nbsp;|Author: hcy<br/>Version: 1.0.0V<br/>Date:  2019/12/5 10:32<br/>Description: 正常返回工具类
&nbsp;&nbsp; &nbsp;&nbsp; ├── data|com.power.doc.entity.Order|&nbsp;|&nbsp;|返回数据
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── orderId|int|&nbsp;|0|订单id
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── orderType|com.power.doc.enums.OrderEnum|&nbsp;|&nbsp;|订单类型<br/>WAIT_PAY("0", "已支付")<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")
&nbsp;&nbsp; &nbsp;&nbsp; ├── message|java.lang.String|&nbsp;|&nbsp;|ok: 接口业务成功返回<br/>其他返回表示相应的错误提示
&nbsp;&nbsp; &nbsp;&nbsp; └── code|java.lang.String|&nbsp;|&nbsp;|0: 表示业务正常返回<br/>非0: 则表示业务异常, msg会有相应的异常信息

**Request-example:**
``` json
{
  "orderList": [
    {
      "code": "Fn",
      "data": {
        "orderType": "EXPIRED",
        "orderId": 0
      },
      "message": "utu1"
    }
  ]
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |com.power.common.model.CommonResult|&nbsp;
├── success|boolean|&nbsp;
├── message|java.lang.String|&nbsp;
├── data|com.power.doc.entity.Order|&nbsp;
│&nbsp;&nbsp; ├── orderId|int|订单id
│&nbsp;&nbsp; └── orderType|com.power.doc.enums.OrderEnum|订单类型<br/>WAIT_PAY("0", "已支付")<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")
├── code|java.lang.String|&nbsp;
└── timestamp|java.lang.String|&nbsp;

**Response-example:**
``` json
{
  "code": "z6",
  "data": {
    "orderType": "WAIT_PAY",
    "orderId": 0
  },
  "success": false,
  "message": "I",
  "timestamp": "JkfT"
}
```

## 2.测试接口2
**Method Name:** testConstantsRequestParams2

**Author:**

**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── orderList|java.util.List&lt;com.power.doc.entity.Order&gt;|&nbsp;|&nbsp;|
&nbsp;&nbsp; ├── orderId|int|&nbsp;|0|订单id
&nbsp;&nbsp; └── orderType|com.power.doc.enums.OrderEnum|&nbsp;|&nbsp;|订单类型<br/>WAIT_PAY("0", "已支付")<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")

**Request-example:**
``` json
{
  "orderList": [
    {
      "orderType": "EXPIRED",
      "orderId": 0
    }
  ]
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |com.power.common.model.CommonResult|&nbsp;
├── success|boolean|&nbsp;
├── message|java.lang.String|&nbsp;
├── data|java.util.List&lt;com.power.doc.entity.Order&gt;|&nbsp;
│&nbsp;&nbsp; ├── orderId|int|订单id
│&nbsp;&nbsp; └── orderType|com.power.doc.enums.OrderEnum|订单类型<br/>WAIT_PAY("0", "已支付")<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")
├── code|java.lang.String|&nbsp;
└── timestamp|java.lang.String|&nbsp;

**Response-example:**
``` json
{
  "code": "HoiBsr9L",
  "data": [
    {
      "orderType": "PAID",
      "orderId": 0
    }
  ],
  "success": false,
  "message": "7JZB",
  "timestamp": "fcIqV6"
}
```