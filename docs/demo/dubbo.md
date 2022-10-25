**Generated:** [Generate Document plugin for IntelliJ platform IDEs](https://plugins.jetbrains.com/plugin/13086-generate-document)

**Author:** yinzhengfei

**Dependency:**
``` xml
<dependency>
	<groupId>com.power.doc</groupId>
	<artifactId>smart-doc-example-cn</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```

# Class Name：com.power.doc.dubbo.DubboInterface

**Class Description:** dubbo接口测试&nbsp;

## 1.测试&nbsp;
**Method Name:** testConstantsRequestParams

**Author:**

**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── orderList|com.power.doc.entity.ResultUtil&lt;com.power.doc.entity.Order&gt;[]|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; └── &nbsp;|com.power.doc.entity.ResultUtil|&nbsp;|&nbsp;|Author: hcy<br/>Version: 1.0.0V<br/>Date:  2019/12/5 10:32<br/>Description: 正常返回工具类&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── timestamp|java.lang.String|&nbsp;|&nbsp;|时间戳&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── traceId|java.lang.String|&nbsp;|&nbsp;|链路id&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── data|com.power.doc.entity.Order|&nbsp;|&nbsp;|返回数据&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── orderId|int|&nbsp;|0|订单id&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── orderType|com.power.doc.enums.OrderEnum|&nbsp;|&nbsp;|订单类型<br/>WAIT_PAY("0", "等待支付") - 描述1<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── testSee|java.lang.String|&nbsp;|&nbsp;|测试订单类型&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── orderEnums|java.util.List&lt;com.power.doc.enums.OrderEnum&gt;|&nbsp;|&nbsp;|订单类型数组&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── message|java.lang.String|&nbsp;|&nbsp;|ok: 接口业务成功返回<br/>其他返回表示相应的错误提示&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── code|java.lang.String|&nbsp;|&nbsp;|0: 表示业务正常返回<br/>非0: 则表示业务异常, msg会有相应的异常信息&nbsp;

**Request-example:**
``` json
{
  "orderList": [
    {
      "traceId": "NPt2QbkQ",
      "code": "c4eDuGZqq",
      "data": {
        "orderEnums": [
          "EXPIRED"
        ],
        "orderType": "EXPIRED",
        "orderId": 0,
        "testSee": "ycTL"
      },
      "message": "ZmGk",
      "timestamp": "pZGh"
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
│&nbsp;&nbsp; ├── orderId|int|订单id&nbsp;
│&nbsp;&nbsp; ├── orderType|com.power.doc.enums.OrderEnum|订单类型<br/>WAIT_PAY("0", "等待支付") - 描述1<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")&nbsp;
│&nbsp;&nbsp; ├── testSee|java.lang.String|测试订单类型&nbsp;
│&nbsp;&nbsp; └── orderEnums|java.util.List&lt;com.power.doc.enums.OrderEnum&gt;|订单类型数组&nbsp;
├── code|java.lang.String|&nbsp;
├── timestamp|java.lang.String|&nbsp;
└── traceId|java.lang.String|&nbsp;

**Response-example:**
``` json
{
  "traceId": "I",
  "code": "jA7gxC7",
  "data": {
    "orderEnums": [
      "PAID"
    ],
    "orderType": "PAID",
    "orderId": 0,
    "testSee": "92aW"
  },
  "success": false,
  "message": "VH",
  "timestamp": "ZymnFyx"
}
```

## 2.测试接口2&nbsp;
**Method Name:** testConstantsRequestParams2

**Author:**

**Request-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── orderList|java.util.List&lt;com.power.doc.entity.Order&gt;|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── orderId|int|&nbsp;|0|订单id&nbsp;
&nbsp;&nbsp; ├── orderType|com.power.doc.enums.OrderEnum|&nbsp;|&nbsp;|订单类型<br/>WAIT_PAY("0", "等待支付") - 描述1<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")&nbsp;
&nbsp;&nbsp; ├── testSee|java.lang.String|&nbsp;|&nbsp;|测试订单类型&nbsp;
&nbsp;&nbsp; └── orderEnums|java.util.List&lt;com.power.doc.enums.OrderEnum&gt;|&nbsp;|&nbsp;|订单类型数组&nbsp;

**Request-example:**
``` json
{
  "orderList": [
    {
      "orderEnums": [
        "WAIT_PAY"
      ],
      "orderType": "WAIT_PAY",
      "orderId": 0,
      "testSee": "Pz2fBAReH"
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
│&nbsp;&nbsp; ├── orderId|int|订单id&nbsp;
│&nbsp;&nbsp; ├── orderType|com.power.doc.enums.OrderEnum|订单类型<br/>WAIT_PAY("0", "等待支付") - 描述1<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")&nbsp;
│&nbsp;&nbsp; ├── testSee|java.lang.String|测试订单类型&nbsp;
│&nbsp;&nbsp; └── orderEnums|java.util.List&lt;com.power.doc.enums.OrderEnum&gt;|订单类型数组&nbsp;
├── code|java.lang.String|&nbsp;
├── timestamp|java.lang.String|&nbsp;
└── traceId|java.lang.String|&nbsp;

**Response-example:**
``` json
{
  "traceId": "Ww",
  "code": "6u8UqHibT",
  "data": [
    {
      "orderEnums": [
        "PAID"
      ],
      "orderType": "PAID",
      "orderId": 0,
      "testSee": "3kbvDbpI"
    }
  ],
  "success": false,
  "message": "241",
  "timestamp": "YEpX6wUqJs"
}
```