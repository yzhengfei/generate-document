**Generated:** [Generate Document plugin for IntelliJ platform IDEs](https://plugins.jetbrains.com/plugin/13086-generate-document)

**Author:** yinzhengfei

**Version:** 0.0.1-SNAPSHOT

# 注释tag<br/>用例&nbsp;

## 1.~~测试apiNote tag~~&nbsp;

**URL:** http://localhost/tags/apiNote

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|array&lt;string&gt;|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"xR"
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/tags/apiNote --data 'user=S5'
```

## 2.自定义mock tag获取mock值&nbsp;

**URL:** http://localhost/tags/mock

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|
&nbsp;&nbsp; ├── subUserName|string|true|&nbsp;|用户名称<br/>水水水水<br/>ddddd
&nbsp;&nbsp; └── numbers|number|&nbsp;|&nbsp;|bigInteger&nbsp;

**Request-body-example:**
``` json
{
  "subUserName": "AMLy8nopKQ",
  "numbers": 390
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
│&nbsp;&nbsp; ├── gender|enum|性别<br/>WOMAN(0,"女人\nwewew")<br/>MAN(2,"男人")&nbsp;
│&nbsp;&nbsp; ├── simpleEnum|enum|简单枚举<br/>RED<br/>BLUE&nbsp;
│&nbsp;&nbsp; ├── username|string|用户名<br/>测试分隔注释&nbsp;
│&nbsp;&nbsp; ├── password|string|密码&nbsp;
│&nbsp;&nbsp; ├── passwordssss|array|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; ├── mobile|string|电话&nbsp;
│&nbsp;&nbsp; ├── role|object|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; ├── roles|array&lt;object&gt;|用户角色信息&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; ├── extend|map&lt;string, string&gt;|用户扩展项&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; └── listMap|array&lt;map&lt;string, string&gt;&gt;|ListMap效果展示&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; └── &nbsp;|string|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "5Cn2vHo",
  "code": "aZeQOk",
  "data": {
    "passwordssss": [
      "1bCkTRn"
    ],
    "role": {
      "createBy": "Nqh5",
      "createTime": "Dec 7, 2056, 7:55:00 AM",
      "updateBy": "fIVb",
      "roleId": "kjpzg",
      "roleName": "C2mEfIUrLI",
      "updateTime": "2095-03-16 00:28:06",
      "id": "xeNaqPx",
      "delFlag": 222,
      "userId": "CD3"
    },
    "gender": "WOMAN",
    "nickName": "R53Au5HN",
    "listMap": [
      {
        "null": "RiQy"
      }
    ],
    "roles": [
      {
        "createBy": "8wyJ",
        "createTime": "Apr 3, 2077, 1:37:22 PM",
        "updateBy": "lT1Eeon1",
        "roleId": "eb",
        "roleName": "TBCa",
        "updateTime": "2095-05-10 11:37:55",
        "id": "cEaUHzp",
        "delFlag": 4587,
        "userId": "HW"
      }
    ],
    "mobile": "TKd1Vhj",
    "extend": {
      "null": "vaS"
    },
    "password": "50",
    "MAX_SPEED": "120",
    "simpleEnum": "RED",
    "AGE": "100",
    "username": "7Ax9o0q"
  },
  "success": false,
  "message": "fhku",
  "timestamp": "m5s4WIRU"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/tags/mock --data '{
  "subUserName": "AMLy8nopKQ",
  "numbers": 390
}'
```

## 3.测试@ignore tag&nbsp;

**URL:** http://localhost/tags/ignore

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── pager|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── total|int32|&nbsp;|0|记录总数&nbsp;
&nbsp;&nbsp; ├── concurrentPage|int32|&nbsp;|0|当前页&nbsp;
&nbsp;&nbsp; └── pageSize|int32|&nbsp;|0|当前page&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"RiaBdOV"
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/tags/ignore --data 'concurrentPage=0&pageSize=0&total=0'
```

# 用户信息操作接口&nbsp;

## 1.添加用户&nbsp;

**URL:** http://localhost/user/add

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|
&nbsp;&nbsp; ├── AGE|int32|&nbsp;|100|&nbsp;
&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;|120|&nbsp;
&nbsp;&nbsp; ├── gender|enum|&nbsp;|&nbsp;|性别<br/>WOMAN(0,"女人\nwewew")<br/>MAN(2,"男人")&nbsp;
&nbsp;&nbsp; ├── simpleEnum|enum|&nbsp;|&nbsp;|简单枚举<br/>RED<br/>BLUE&nbsp;
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名<br/>测试分隔注释&nbsp;
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码&nbsp;
&nbsp;&nbsp; ├── passwordssss|array|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话&nbsp;
&nbsp;&nbsp; ├── role|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户角色信息&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── extend|map&lt;string, string&gt;|&nbsp;|&nbsp;|用户扩展项&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; └── listMap|array&lt;map&lt;string, string&gt;&gt;|&nbsp;|&nbsp;|ListMap效果展示&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;

**Request-body-example:**
``` json
{
  "passwordssss": [
    "GZ3iz"
  ],
  "role": {
    "createBy": "t5",
    "createTime": "Feb 4, 2094, 6:27:11 AM",
    "updateBy": "20N1y3dAf8",
    "roleId": "wZyhR",
    "roleName": "0mZM6g",
    "updateTime": "2093-06-30 06:30:14",
    "id": "ZqXPTO1",
    "delFlag": 5789,
    "userId": "xW2jnuo"
  },
  "gender": "WOMAN",
  "nickName": "ZFZsr",
  "listMap": [
    {
      "null": "glAtC"
    }
  ],
  "roles": [
    {
      "createBy": "RKfCrw",
      "createTime": "Jul 1, 2042, 2:20:58 AM",
      "updateBy": "v0xhc47kB",
      "roleId": "k3rilQRZ8K",
      "roleName": "kxVEf",
      "updateTime": "2033-10-27 18:33:52",
      "id": "eADAcC",
      "delFlag": 5465,
      "userId": "nWY8"
    }
  ],
  "mobile": "7bw",
  "extend": {
    "null": "5O87mWz"
  },
  "password": "7uk",
  "MAX_SPEED": "120",
  "simpleEnum": "RED",
  "AGE": "100",
  "username": "KtS4Om3"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Author: hcy<br/>Version: 1.0.0V<br/>Date:  2019/12/5 10:32<br/>Description: 正常返回工具类&nbsp;
├── timestamp|string|时间戳&nbsp;
├── traceId|string|链路id&nbsp;
├── data|object|返回数据&nbsp;
│&nbsp;&nbsp; ├── testObject|object|测试object&nbsp;
│&nbsp;&nbsp; ├── username|string|用户名&nbsp;
│&nbsp;&nbsp; ├── password|string|密码&nbsp;
│&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; ├── mobile|string|电话&nbsp;
│&nbsp;&nbsp; ├── email|string|邮箱&nbsp;
│&nbsp;&nbsp; ├── address|string|地址&nbsp;
│&nbsp;&nbsp; ├── sex|int32|性别(男1 女 2)&nbsp;
│&nbsp;&nbsp; ├── avatar|string|&nbsp;
│&nbsp;&nbsp; ├── type|int32|类型&nbsp;
│&nbsp;&nbsp; ├── status|int32|状态&nbsp;
│&nbsp;&nbsp; ├── description|string|描述&nbsp;
│&nbsp;&nbsp; ├── roles|array&lt;object&gt;|用户拥有角色&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|角色名 以ROLE_开头&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── defaultRole|boolean|是否为注册默认角色&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|拥有权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|用户拥有的权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; └── test|object|测试数据&nbsp;
├── message|string|ok: 接口业务成功返回<br/>其他返回表示相应的错误提示&nbsp;
└── code|string|0: 表示业务正常返回<br/>非0: 则表示业务异常, msg会有相应的异常信息&nbsp;

**Response-example:**
``` json
{
  "traceId": "oc",
  "code": "3o",
  "data": {
    "address": "77aiG",
    "nickName": "tldQ",
    "sex": 2468,
    "roles": [
      {
        "createBy": "rOD7ceoE",
        "defaultRole": true,
        "createTime": "Mar 11, 2048, 2:35:43 AM",
        "updateBy": "Soaal",
        "permissions": [
          {
            "level": 90,
            "icon": "MWqC8wzAF",
            "description": "33XXn1",
            "updateTime": "2063-06-22 00:26:08",
            "type": 5994,
            "title": "L3BVZINdD",
            "delFlag": 731,
            "parentId": "WWrz25",
            "permTypes": [
              "B"
            ],
            "path": "5",
            "component": "E5rCh7",
            "expand": "true",
            "createBy": "B9DW",
            "buttonType": "AVt1hmy",
            "children": [
              {
                "level": 1696,
                "icon": "Dcur",
                "description": "oxEsLEKr39",
                "updateTime": "1979-12-07 17:54:21",
                "type": 1524,
                "title": "uO",
                "delFlag": 4068,
                "parentId": "7hZQto",
                "permTypes": [
                  "m8JKk2"
                ],
                "path": "KjC3gkMYQ",
                "component": "s7X",
                "expand": "true",
                "createBy": "W",
                "buttonType": "WMrDSpjgF",
                "children": [],
                "createTime": "Nov 10, 2042, 6:38:28 AM",
                "updateBy": "sTRoin6oHD",
                "sortOrder": 9446.8,
                "name": "o5I",
                "checked": "false",
                "id": "XI4T9",
                "selected": "false",
                "status": 8176
              }
            ],
            "createTime": "Oct 4, 2088, 3:41:16 PM",
            "updateBy": "V7HT8wxUul",
            "sortOrder": 9760.98,
            "name": "KlUpb",
            "checked": "false",
            "id": "n6m",
            "selected": "false",
            "status": 7868
          }
        ],
        "name": "MFRg4na",
        "updateTime": "2081-03-21 17:52:19",
        "id": "tIBFGGC",
        "delFlag": 5723
      }
    ],
    "mobile": "xgIuI",
    "description": "1S",
    "updateTime": "1990-10-17 08:57:14",
    "avatar": "https://s1.ax1x.com/2018/05/19/CcdVQP.png",
    "type": 3550,
    "delFlag": 3110,
    "password": "IBQxWF2O",
    "createBy": "O",
    "createTime": "Feb 4, 2022, 12:06:25 PM",
    "updateBy": "iDhIp38Yv1",
    "permissions": [
      {
        "level": 9862,
        "icon": "h3d7S8ntvB",
        "description": "zBP7U2lZ6I",
        "updateTime": "2086-10-25 06:51:49",
        "type": 988,
        "title": "sXSwwhBT",
        "delFlag": 7331,
        "parentId": "JiaSezdFZ",
        "permTypes": [
          "BLsFejgI"
        ],
        "path": "qYkwW7",
        "component": "y8FfDs",
        "expand": "true",
        "createBy": "XZpigydH",
        "buttonType": "okSHpK",
        "children": [
          {
            "level": 9486,
            "icon": "WbnwlLzc",
            "description": "XJ5sL",
            "updateTime": "2019-02-27 01:54:21",
            "type": 1622,
            "title": "U1kee",
            "delFlag": 6966,
            "parentId": "qZOXp9",
            "permTypes": [
              "DLwNe4"
            ],
            "path": "eSTp",
            "component": "upd",
            "expand": "true",
            "createBy": "ZnIitfX",
            "buttonType": "ZXrrDx",
            "children": [
              {
                "level": 4296,
                "icon": "Fkfz",
                "description": "jLgJpdrVA5",
                "updateTime": "1980-10-20 02:49:40",
                "type": 8819,
                "title": "D",
                "delFlag": 7327,
                "parentId": "qbHna2C",
                "permTypes": [
                  "C"
                ],
                "path": "i",
                "component": "WLLGYzvt",
                "expand": "true",
                "createBy": "ULEo",
                "buttonType": "Ueiyq",
                "children": [],
                "createTime": "Dec 29, 2006, 8:11:04 PM",
                "updateBy": "m",
                "sortOrder": 6232.08,
                "name": "GJGpF9Kn",
                "checked": "false",
                "id": "sT",
                "selected": "false",
                "status": 8835
              }
            ],
            "createTime": "Oct 13, 2016, 12:07:11 PM",
            "updateBy": "67W5",
            "sortOrder": 5224.58,
            "name": "lKN",
            "checked": "false",
            "id": "JBVOimECU",
            "selected": "false",
            "status": 842
          }
        ],
        "createTime": "Nov 12, 2049, 9:47:37 PM",
        "updateBy": "sSJbZ",
        "sortOrder": 4824.29,
        "name": "MOyHNtUEF",
        "checked": "false",
        "id": "RhM6vtmuhG",
        "selected": "false",
        "status": 3395
      }
    ],
    "testObject": {},
    "id": "fqq",
    "email": "nEC5Fr",
    "username": "3IgC",
    "status": 6057
  },
  "message": "0DxtG",
  "timestamp": "mTxNs"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/user/add --data '{
  "passwordssss": [
    "GZ3iz"
  ],
  "role": {
    "createBy": "t5",
    "createTime": "Feb 4, 2094, 6:27:11 AM",
    "updateBy": "20N1y3dAf8",
    "roleId": "wZyhR",
    "roleName": "0mZM6g",
    "updateTime": "2093-06-30 06:30:14",
    "id": "ZqXPTO1",
    "delFlag": 5789,
    "userId": "xW2jnuo"
  },
  "gender": "WOMAN",
  "nickName": "ZFZsr",
  "listMap": [
    {
      "null": "glAtC"
    }
  ],
  "roles": [
    {
      "createBy": "RKfCrw",
      "createTime": "Jul 1, 2042, 2:20:58 AM",
      "updateBy": "v0xhc47kB",
      "roleId": "k3rilQRZ8K",
      "roleName": "kxVEf",
      "updateTime": "2033-10-27 18:33:52",
      "id": "eADAcC",
      "delFlag": 5465,
      "userId": "nWY8"
    }
  ],
  "mobile": "7bw",
  "extend": {
    "null": "5O87mWz"
  },
  "password": "7uk",
  "MAX_SPEED": "120",
  "simpleEnum": "RED",
  "AGE": "100",
  "username": "KtS4Om3"
}'
```

## 2.更新用户&nbsp;

**URL:** http://localhost/user/update

**Type:** PUT

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|@mock<br/>{<br/>"address":"成都市","sex":1,"age":16,"name":"smart-doc","extand""<br/>{<br/>"version":1.0,"versionList":["1.2.0","1.5.6"]<br/>}<br/>}<br/>
&nbsp;&nbsp; ├── AGE|int32|&nbsp;|100|&nbsp;
&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;|120|&nbsp;
&nbsp;&nbsp; ├── gender|enum|&nbsp;|&nbsp;|性别<br/>WOMAN(0,"女人\nwewew")<br/>MAN(2,"男人")&nbsp;
&nbsp;&nbsp; ├── simpleEnum|enum|&nbsp;|&nbsp;|简单枚举<br/>RED<br/>BLUE&nbsp;
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名<br/>测试分隔注释&nbsp;
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码&nbsp;
&nbsp;&nbsp; ├── passwordssss|array|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话&nbsp;
&nbsp;&nbsp; ├── role|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户角色信息&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── extend|map&lt;string, string&gt;|&nbsp;|&nbsp;|用户扩展项&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; └── listMap|array&lt;map&lt;string, string&gt;&gt;|&nbsp;|&nbsp;|ListMap效果展示&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;

**Request-body-example:**
``` json
{
  "passwordssss": [
    "bN"
  ],
  "role": {
    "createBy": "gbpTtY1S4V",
    "createTime": "Oct 21, 1987, 2:30:17 PM",
    "updateBy": "ho",
    "roleId": "r",
    "roleName": "llTTFa",
    "updateTime": "1979-01-24 19:41:57",
    "id": "YxLKUNG7",
    "delFlag": 4880,
    "userId": "cskQN"
  },
  "gender": "WOMAN",
  "nickName": "Pj2",
  "listMap": [
    {
      "null": "kPOENMN"
    }
  ],
  "roles": [
    {
      "createBy": "6MV",
      "createTime": "Jan 20, 1978, 6:13:31 AM",
      "updateBy": "HCM8gEQd5",
      "roleId": "Esz",
      "roleName": "gUjpfSiDV5",
      "updateTime": "2002-10-16 20:46:44",
      "id": "bSoR",
      "delFlag": 3371,
      "userId": "OVPyD"
    }
  ],
  "mobile": "U9IqULsjLE",
  "extend": {
    "null": "N0eTRc"
  },
  "password": "NQJ",
  "MAX_SPEED": "120",
  "simpleEnum": "RED",
  "AGE": "100",
  "username": "yoO8"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── testObject|object|测试object&nbsp;
├── username|string|用户名&nbsp;
├── password|string|密码&nbsp;
├── nickName|string|昵称&nbsp;
├── mobile|string|电话&nbsp;
├── email|string|邮箱&nbsp;
├── address|string|地址&nbsp;
├── sex|int32|性别(男1 女 2)&nbsp;
├── avatar|string|&nbsp;
├── type|int32|类型&nbsp;
├── status|int32|状态&nbsp;
├── description|string|描述&nbsp;
├── roles|array&lt;object&gt;|用户拥有角色&nbsp;
│&nbsp;&nbsp; ├── name|string|角色名 以ROLE_开头&nbsp;
│&nbsp;&nbsp; ├── defaultRole|boolean|是否为注册默认角色&nbsp;
│&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|拥有权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; └── test|object|测试数据&nbsp;
├── permissions|array&lt;object&gt;|用户拥有的权限&nbsp;
│&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; └── test|object|测试数据&nbsp;
├── id|string|自增编号&nbsp;
├── createBy|string|创建人&nbsp;
├── createTime|string|创建时间&nbsp;
├── updateBy|string|修改人&nbsp;
├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
└── test|object|测试数据&nbsp;

**Response-example:**
``` json
{
  "address": "47j",
  "nickName": "ZSmZLCjjN",
  "sex": 3410,
  "roles": [
    {
      "createBy": "K9peBgoWCt",
      "defaultRole": false,
      "createTime": "Feb 8, 2076, 9:40:01 AM",
      "updateBy": "1Y1ZsYQ",
      "permissions": [
        {
          "level": 2274,
          "icon": "cryGpbH6He",
          "description": "7OFd",
          "updateTime": "2088-08-23 00:27:54",
          "type": 6768,
          "title": "gqC7OBGbyI",
          "delFlag": 743,
          "parentId": "w0j",
          "permTypes": [
            "ZIG"
          ],
          "path": "nsauqrmPa",
          "component": "W3XQws",
          "expand": "true",
          "createBy": "spzt6CwtX",
          "buttonType": "75U8Fcjrw",
          "children": [
            {
              "level": 116,
              "icon": "ztbURkRi2",
              "description": "ft",
              "updateTime": "2031-06-21 14:46:41",
              "type": 396,
              "title": "lj",
              "delFlag": 8650,
              "parentId": "XcpUZVk",
              "permTypes": [
                "ss6U"
              ],
              "path": "rP18iJ",
              "component": "YVQg8KL",
              "expand": "true",
              "createBy": "QzbbQKdAvj",
              "buttonType": "Y",
              "children": [],
              "createTime": "Sep 28, 2095, 10:50:36 AM",
              "updateBy": "xjmXGn",
              "sortOrder": 892.15,
              "name": "LG2P8jKKZ",
              "checked": "false",
              "id": "Mg8hfl0Kf",
              "selected": "false",
              "status": 8269
            }
          ],
          "createTime": "Jun 26, 2014, 5:51:19 PM",
          "updateBy": "Y3F9fysHd",
          "sortOrder": 4712.72,
          "name": "5GipLudJbl",
          "checked": "false",
          "id": "8G54vQzq",
          "selected": "false",
          "status": 3496
        }
      ],
      "name": "GtrsroB",
      "updateTime": "2011-03-09 23:15:44",
      "id": "yPOGPKYwI",
      "delFlag": 4
    }
  ],
  "mobile": "Yo",
  "description": "6t",
  "updateTime": "2041-08-12 14:46:11",
  "avatar": "https://s1.ax1x.com/2018/05/19/CcdVQP.png",
  "type": 2154,
  "delFlag": 2589,
  "password": "o8oscw",
  "createBy": "7BNTknYOi",
  "createTime": "Dec 29, 2100, 1:39:11 PM",
  "updateBy": "s",
  "permissions": [
    {
      "level": 3864,
      "icon": "ORp7e6zJZr",
      "description": "Ha0T1QPJ",
      "updateTime": "2080-05-02 20:04:16",
      "type": 4618,
      "title": "8kIAs",
      "delFlag": 9550,
      "parentId": "hcYpGoDpy",
      "permTypes": [
        "CEuVf"
      ],
      "path": "PF4q",
      "component": "LFQZ",
      "expand": "true",
      "createBy": "ZhOix5t7c0",
      "buttonType": "q4QeIX",
      "children": [
        {
          "level": 8712,
          "icon": "c4XvhDQ7",
          "description": "hU",
          "updateTime": "2100-05-18 16:57:21",
          "type": 1579,
          "title": "My3cL",
          "delFlag": 6416,
          "parentId": "XmYZ",
          "permTypes": [
            "v8U"
          ],
          "path": "WUU",
          "component": "Zzt",
          "expand": "true",
          "createBy": "oxT5g4Z3",
          "buttonType": "OMfpZl",
          "children": [
            {
              "level": 3085,
              "icon": "qxYi75k",
              "description": "WjBAa5",
              "updateTime": "2041-05-15 22:12:37",
              "type": 5560,
              "title": "HYbQaU1Lw",
              "delFlag": 443,
              "parentId": "9OJg",
              "permTypes": [
                "6yF5RPJC6N"
              ],
              "path": "vC",
              "component": "l4hrBy8u",
              "expand": "true",
              "createBy": "dcaiInyU",
              "buttonType": "F5",
              "children": [],
              "createTime": "May 17, 2067, 2:40:41 AM",
              "updateBy": "qnrvonj",
              "sortOrder": 6428.92,
              "name": "J",
              "checked": "false",
              "id": "KK9vD",
              "selected": "false",
              "status": 724
            }
          ],
          "createTime": "May 12, 2004, 7:33:45 AM",
          "updateBy": "vsO5Pfr9mn",
          "sortOrder": 392.16,
          "name": "h",
          "checked": "false",
          "id": "W1",
          "selected": "false",
          "status": 548
        }
      ],
      "createTime": "Dec 23, 2054, 1:20:27 AM",
      "updateBy": "PgvQKZfjx",
      "sortOrder": 3300.34,
      "name": "JJ",
      "checked": "false",
      "id": "E",
      "selected": "false",
      "status": 8023
    }
  ],
  "testObject": {},
  "id": "UaAhm",
  "email": "vyzG",
  "username": "Ar",
  "status": 5063
}
```

**Curl-example:**
``` bash
curl -X PUT -H 'Content-Type: application/json' -i http://localhost/user/update --data '{
  "passwordssss": [
    "bN"
  ],
  "role": {
    "createBy": "gbpTtY1S4V",
    "createTime": "Oct 21, 1987, 2:30:17 PM",
    "updateBy": "ho",
    "roleId": "r",
    "roleName": "llTTFa",
    "updateTime": "1979-01-24 19:41:57",
    "id": "YxLKUNG7",
    "delFlag": 4880,
    "userId": "cskQN"
  },
  "gender": "WOMAN",
  "nickName": "Pj2",
  "listMap": [
    {
      "null": "kPOENMN"
    }
  ],
  "roles": [
    {
      "createBy": "6MV",
      "createTime": "Jan 20, 1978, 6:13:31 AM",
      "updateBy": "HCM8gEQd5",
      "roleId": "Esz",
      "roleName": "gUjpfSiDV5",
      "updateTime": "2002-10-16 20:46:44",
      "id": "bSoR",
      "delFlag": 3371,
      "userId": "OVPyD"
    }
  ],
  "mobile": "U9IqULsjLE",
  "extend": {
    "null": "N0eTRc"
  },
  "password": "NQJ",
  "MAX_SPEED": "120",
  "simpleEnum": "RED",
  "AGE": "100",
  "username": "yoO8"
}'
```

# JDK8的时间测试&nbsp;

## 1.LocalDate和LocalDateTime测试&nbsp;

**URL:** http://localhost/dateEntity

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── dateEntity|object|true|&nbsp;|
&nbsp;&nbsp; ├── localDate|string|&nbsp;|&nbsp;|创建日期&nbsp;
&nbsp;&nbsp; ├── localDateTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; ├── localTime|string|&nbsp;|&nbsp;|jdk8 LocalTime&nbsp;
&nbsp;&nbsp; └── createDate|string|&nbsp;|&nbsp;|创建时间&nbsp;

**Request-body-example:**
``` json
{
  "localDateTime": {
    "date": {
      "year": 1996,
      "month": 7,
      "day": 26
    },
    "time": {
      "hour": 12,
      "minute": 47,
      "second": 4,
      "nano": 299000000
    }
  },
  "localTime": {
    "hour": 11,
    "minute": 59,
    "second": 14,
    "nano": 0
  },
  "localDate": {
    "year": 2097,
    "month": 8,
    "day": 15
  },
  "createDate": {
    "date": {
      "year": 2008,
      "month": 2,
      "day": 26
    },
    "time": {
      "hour": 22,
      "minute": 27,
      "second": 44,
      "nano": 446000000
    }
  }
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── localDate|string|创建日期&nbsp;
├── localDateTime|string|创建时间&nbsp;
├── localTime|string|jdk8 LocalTime&nbsp;
└── createDate|string|创建时间&nbsp;

**Response-example:**
``` json
{
  "localDateTime": {
    "date": {
      "year": 1971,
      "month": 2,
      "day": 5
    },
    "time": {
      "hour": 6,
      "minute": 9,
      "second": 48,
      "nano": 875000000
    }
  },
  "localTime": {
    "hour": 9,
    "minute": 49,
    "second": 17,
    "nano": 0
  },
  "localDate": {
    "year": 2036,
    "month": 1,
    "day": 11
  },
  "createDate": {
    "date": {
      "year": 2078,
      "month": 12,
      "day": 17
    },
    "time": {
      "hour": 9,
      "minute": 8,
      "second": 32,
      "nano": 156000000
    }
  }
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/dateEntity --data '{
  "localDateTime": {
    "date": {
      "year": 1996,
      "month": 7,
      "day": 26
    },
    "time": {
      "hour": 12,
      "minute": 47,
      "second": 4,
      "nano": 299000000
    }
  },
  "localTime": {
    "hour": 11,
    "minute": 59,
    "second": 14,
    "nano": 0
  },
  "localDate": {
    "year": 2097,
    "month": 8,
    "day": 15
  },
  "createDate": {
    "date": {
      "year": 2008,
      "month": 2,
      "day": 26
    },
    "time": {
      "hour": 22,
      "minute": 27,
      "second": 44,
      "nano": 446000000
    }
  }
}'
```

# 接收表单参数&nbsp;

## 1.测试formData&nbsp;

**URL:** http://localhost/formData1

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── car|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|车名称&nbsp;
&nbsp;&nbsp; ├── length|double|&nbsp;|&nbsp;|长度&nbsp;
&nbsp;&nbsp; └── pager|object|&nbsp;|&nbsp;|分页&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── total|int32|&nbsp;|0|记录总数&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── concurrentPage|int32|&nbsp;|0|当前页&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── pageSize|int32|&nbsp;|0|当前page&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -i http://localhost/formData1 --data 'pager.pageSize=0&name=X&length=7935.94&pager.concurrentPage=0&pager.total=0'
```

## 2.Post请求发表单文件&nbsp;

**URL:** http://localhost/formData2

**Type:** POST

**Content-Type:** multipart/form-data

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── userId|string|&nbsp;|&nbsp;|&nbsp;
├── userData|string|&nbsp;|&nbsp;|&nbsp;
└── file|file|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

None


## 3.Get请求发表单文件 暂不支持完全解析&nbsp;

**URL:** http://localhost/formData2

**Type:** GET

**Content-Type:** multipart/form-data

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── userId|string|&nbsp;|&nbsp;|&nbsp;
├── userData|string|&nbsp;|&nbsp;|&nbsp;
└── file|file|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

None


## 4.表单 包含复杂对象的Get 暂不支持完全解析&nbsp;

**URL:** http://localhost/formData4

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── userId|string|&nbsp;|&nbsp;|&nbsp;
├── userData|string|&nbsp;|&nbsp;|&nbsp;
└── simpleUser|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── AGE|int32|&nbsp;|100|&nbsp;
&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;|120|&nbsp;
&nbsp;&nbsp; ├── gender|enum|&nbsp;|&nbsp;|性别<br/>WOMAN(0,"女人\nwewew")<br/>MAN(2,"男人")&nbsp;
&nbsp;&nbsp; ├── simpleEnum|enum|&nbsp;|&nbsp;|简单枚举<br/>RED<br/>BLUE&nbsp;
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名<br/>测试分隔注释&nbsp;
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码&nbsp;
&nbsp;&nbsp; ├── passwordssss|array|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话&nbsp;
&nbsp;&nbsp; ├── role|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户角色信息&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── extend|map&lt;string, string&gt;|&nbsp;|&nbsp;|用户扩展项&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; └── listMap|array&lt;map&lt;string, string&gt;&gt;|&nbsp;|&nbsp;|ListMap效果展示&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/formData4 --data 'passwordssss=ZKEtXQ&roles[0].createTime=Sun+Nov+26+23%3A17%3A15+CST+2056&roles[0].createBy=fQ&userData=SEzXBoPLlZ&role.id=yOC&gender=WOMAN&roles[0].updateBy=TH5&role.createBy=EGS9&role.updateBy=G6je53fni&role.delFlag=7935&role.createTime=Tue+May+29+15%3A59%3A33+CST+2035&role.userId=4JGy&password=U&roles[0].updateTime=1990-09-11+11%3A41%3A35&roles[0].id=1yi5jagrg&MAX_SPEED=120&extend[pu9ae8sZNR]=llsVS2IrmW&AGE=100&role.updateTime=2080-07-18+21%3A10%3A42&role.roleName=AZyhU&nickName=a4xMq&mobile=eTd6DMDv&roles[0].userId=WC4&userId=ZAMH60aulG&roles[0].roleName=Lf&role.roleId=tr6S23&roles[0].delFlag=4417&simpleEnum=RED&roles[0].roleId=48&username=GcLV&listMap[0][EK4wd2EZ]=ljDg6U5f'
```

## 5.测试formData带路径参数&nbsp;

**URL:** http://localhost/formData7/{id}

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|string|true|&nbsp;|

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── simpleUser|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── AGE|int32|&nbsp;|100|&nbsp;
&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;|120|&nbsp;
&nbsp;&nbsp; ├── gender|enum|&nbsp;|&nbsp;|性别<br/>WOMAN(0,"女人\nwewew")<br/>MAN(2,"男人")&nbsp;
&nbsp;&nbsp; ├── simpleEnum|enum|&nbsp;|&nbsp;|简单枚举<br/>RED<br/>BLUE&nbsp;
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名<br/>测试分隔注释&nbsp;
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码&nbsp;
&nbsp;&nbsp; ├── passwordssss|array|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话&nbsp;
&nbsp;&nbsp; ├── role|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户角色信息&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── extend|map&lt;string, string&gt;|&nbsp;|&nbsp;|用户扩展项&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; └── listMap|array&lt;map&lt;string, string&gt;&gt;|&nbsp;|&nbsp;|ListMap效果展示&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -i http://localhost/formData7/k --data 'passwordssss=dfuZ5d&roles[0].createTime=Sat+Aug+11+15%3A51%3A35+CST+2096&roles[0].createBy=u&role.id=iHTLgl&gender=WOMAN&roles[0].updateBy=vsVke&role.createBy=edK9zSv&role.updateBy=X&role.delFlag=5073&role.createTime=Tue+Sep+29+11%3A11%3A03+CST+2020&role.userId=aa3JcQM&password=CntAVY&roles[0].updateTime=2036-03-09+11%3A49%3A16&roles[0].id=uc4ScttyW&MAX_SPEED=120&AGE=100&role.updateTime=2033-01-08+20%3A24%3A23&role.roleName=MKT&nickName=6bDmHYVBSI&mobile=rKd5uQlsn&roles[0].userId=NIyP&roles[0].roleName=o&extend[68]=fOCKgN&role.roleId=JjwEJjl&roles[0].delFlag=2715&simpleEnum=RED&listMap[0][lXWu]=LURScs2RjQ&roles[0].roleId=chpVytbG0w&username=fwy9kfOBvn'
```

## 6.&nbsp;

**URL:** http://localhost/formData9/{id}

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|string|true|&nbsp;|

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── strings|array|true|<br/>		<br/>		<br/><br/>				<br/>|
&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -i http://localhost/formData9/Z --data 'strings=Mnp'
```

## 7.&nbsp;

**URL:** http://localhost/formData10/{id}

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|string|true|&nbsp;|

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── map|map&lt;string, int32&gt;|true|<br/>		<br/>		<br/><br/>				<br/>|
&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; └── &nbsp;|int32|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/formData10/5SGrn7BzgT --data 'x=6349'
```

## 8.测试formData带路多个路径参数&nbsp;

**URL:** http://localhost/formData8/{id}/{age}

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── id|string|true|&nbsp;|
└── age|int32|true|&nbsp;|

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── simpleUser|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── AGE|int32|&nbsp;|100|&nbsp;
&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;|120|&nbsp;
&nbsp;&nbsp; ├── gender|enum|&nbsp;|&nbsp;|性别<br/>WOMAN(0,"女人\nwewew")<br/>MAN(2,"男人")&nbsp;
&nbsp;&nbsp; ├── simpleEnum|enum|&nbsp;|&nbsp;|简单枚举<br/>RED<br/>BLUE&nbsp;
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名<br/>测试分隔注释&nbsp;
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码&nbsp;
&nbsp;&nbsp; ├── passwordssss|array|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话&nbsp;
&nbsp;&nbsp; ├── role|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户角色信息&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── extend|map&lt;string, string&gt;|&nbsp;|&nbsp;|用户扩展项&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; └── listMap|array&lt;map&lt;string, string&gt;&gt;|&nbsp;|&nbsp;|ListMap效果展示&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -i http://localhost/formData8/yGOPFzmSHk/8194 --data 'passwordssss=TM3&roles[0].createTime=Thu+Apr+25+13%3A20%3A47+CST+2019&roles[0].createBy=0WNjPD&role.id=Pctesf&gender=WOMAN&roles[0].updateBy=ODJDKzG&listMap[0][nK5DMIUg]=x06ic&role.createBy=j00zqF&role.updateBy=KLir9vX&role.delFlag=3843&role.createTime=Sat+Dec+01+07%3A51%3A45+CST+2074&role.userId=QxHCiN&password=CAKmJ4&roles[0].updateTime=2086-11-04+22%3A58%3A30&roles[0].id=s&MAX_SPEED=120&AGE=100&role.updateTime=2037-02-28+01%3A17%3A56&role.roleName=jT&extend[2CXCgRIWpK]=fa&nickName=ARS8&mobile=JKjVmaRl29&roles[0].userId=FQjNIud&roles[0].roleName=MkTK76&role.roleId=e&roles[0].delFlag=7569&simpleEnum=RED&roles[0].roleId=1Q&username=QfG9feyVJ'
```

# https测试&nbsp;

## 1.测试https&nbsp;

**URL:** http://localhost/testHttps

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "Fza7",
  "code": "xmIESD",
  "data": "Jgq",
  "success": false,
  "message": "zheD69L",
  "timestamp": "UpKwjRPqIy"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/testHttps
```

## 2.测试http&nbsp;

**URL:** http://localhost/testHttp

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "Vj2bCqU",
  "code": "f8p24Tx",
  "data": "vWBd",
  "success": false,
  "message": "cSEZkI3E9u",
  "timestamp": "7VEuvkxJ"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/testHttp
```

# Class Name：com.power.doc.controller.torna.TestTreeTornaController

## 1.test torna tree&nbsp;

**URL:** http://localhost/test1

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── vo|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|the nickname&nbsp;
&nbsp;&nbsp; ├── sex|string|&nbsp;|&nbsp;|sex&nbsp;
&nbsp;&nbsp; └── list|array&lt;object&gt;|&nbsp;|&nbsp;|test two tree vo&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── id|int64|&nbsp;|&nbsp;|主键&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── address|string|&nbsp;|&nbsp;|address&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── threeList|array&lt;object&gt;|&nbsp;|&nbsp;|test three list&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; └── abc|string|&nbsp;|&nbsp;|abc&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "Iv",
  "code": "ON",
  "success": false,
  "message": "KJPufheebT",
  "timestamp": "gkER0fI"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/test1 --data 'list[0].id=4878&name=dEqdxHM&list[0].threeList[0].abc=ImKGTu&list[0].address=9sZl&sex=wda'
```

## 2.test torna tree json&nbsp;

**URL:** http://localhost/test2

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── vo|object|true|&nbsp;|
&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|the nickname&nbsp;
&nbsp;&nbsp; ├── sex|string|&nbsp;|&nbsp;|sex&nbsp;
&nbsp;&nbsp; └── list|array&lt;object&gt;|&nbsp;|&nbsp;|test two tree vo&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── id|int64|&nbsp;|&nbsp;|主键&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── address|string|&nbsp;|&nbsp;|address&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── threeList|array&lt;object&gt;|&nbsp;|&nbsp;|test three list&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; └── abc|string|&nbsp;|&nbsp;|abc&nbsp;

**Request-body-example:**
``` json
{
  "sex": "q7",
  "name": "I",
  "list": [
    {
      "address": "qeImBTCq",
      "threeList": [
        {
          "abc": "f"
        }
      ],
      "id": 9096
    }
  ]
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "jqpgwoLf",
  "code": "I",
  "success": false,
  "message": "fl",
  "timestamp": "avX3W4mAj1"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/test2 --data '{
  "sex": "q7",
  "name": "I",
  "list": [
    {
      "address": "qeImBTCq",
      "threeList": [
        {
          "abc": "f"
        }
      ],
      "id": 9096
    }
  ]
}'
```

# 测试json&nbsp;

## 1.RequestParam+json&nbsp;

**URL:** http://localhost/getUserJson

**Type:** POST

**Content-Type:** application/json

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── name|string|true|<br/>		<br/>		<br/><br/>				<br/>|

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── pramInfo|object|true|&nbsp;|
&nbsp;&nbsp; ├── dataExpressionEnum|enum|&nbsp;|&nbsp;|枚举<br/>SENSIRION("2101", new HashMap&lt;&gt;()) - temperature&nbsp;
&nbsp;&nbsp; ├── menuPermissionCodes|array&lt;enum&gt;|&nbsp;|&nbsp;|菜单/权限编码&nbsp;
&nbsp;&nbsp; ├── date|string|&nbsp;|&nbsp;|学好&nbsp;
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名<br/>Pattern: 
&nbsp;&nbsp; ├── idCard|string|&nbsp;|&nbsp;|身份证号<br/>Pattern: 
&nbsp;&nbsp; ├── age|int32|&nbsp;|0|&nbsp;
&nbsp;&nbsp; └── age2|int32|&nbsp;|&nbsp;|Pattern: 

**Request-body-example:**
``` json
{
  "date": "Jan 16, 1976, 10:26:18 AM",
  "idCard": "uOICwt5Om",
  "menuPermissionCodes": [
    "PAID"
  ],
  "dataExpressionEnum": "SENSIRION",
  "age": 0,
  "age2": 7183,
  "username": "ud"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── dataExpressionEnum|enum|枚举<br/>SENSIRION("2101", new HashMap&lt;&gt;()) - temperature&nbsp;
├── menuPermissionCodes|array&lt;enum&gt;|菜单/权限编码&nbsp;
├── date|string|学好&nbsp;
├── username|string|用户名<br/>Pattern: 
├── idCard|string|身份证号<br/>Pattern: 
├── age|int32|&nbsp;
└── age2|int32|Pattern: 

**Response-example:**
``` json
{
  "date": "Mar 15, 1976, 8:41:07 AM",
  "idCard": "S",
  "menuPermissionCodes": [
    "EXPIRED"
  ],
  "dataExpressionEnum": "SENSIRION",
  "age": 0,
  "age2": 1848,
  "username": "Z3N"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/getUserJson --data '{
  "date": "Jan 16, 1976, 10:26:18 AM",
  "idCard": "uOICwt5Om",
  "menuPermissionCodes": [
    "PAID"
  ],
  "dataExpressionEnum": "SENSIRION",
  "age": 0,
  "age2": 7183,
  "username": "ud"
}'
```

## 2.测试&nbsp;

**URL:** http://localhost/getUserJson1/{id}

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|int32|true|0|编号<br/>

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── name|string|true|<br/>		<br/>		<br/><br/>				<br/>|名称<br/>

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"4d6gc9cuI"
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/getUserJson1/0 --data 'name=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A'
```

## 3.测试2&nbsp;

**URL:** http://localhost/getUserJson1/

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── name|string|&nbsp;|&nbsp;|姓名<br/>&nbsp;
└── age|int32|&nbsp;|0|年龄<br/>&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"fQPPR"
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/getUserJson1/ --data 'name=Jbqbc&age=0'
```

# Class Name：com.power.doc.controller.JsrController

## 1.测试忽略注解效果&nbsp;

**URL:** http://localhost/jsr/ignore

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── fastJson|object|true|&nbsp;|
&nbsp;&nbsp; ├── dataExpressionEnum|enum|&nbsp;|&nbsp;|枚举<br/>SENSIRION("2101", new HashMap&lt;&gt;()) - temperature&nbsp;
&nbsp;&nbsp; ├── menuPermissionCodes|array&lt;enum&gt;|&nbsp;|&nbsp;|菜单/权限编码&nbsp;
&nbsp;&nbsp; ├── date|string|&nbsp;|&nbsp;|学好&nbsp;
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名<br/>Pattern: 
&nbsp;&nbsp; ├── idCard|string|&nbsp;|&nbsp;|身份证号<br/>Pattern: 
&nbsp;&nbsp; ├── age|int32|&nbsp;|0|&nbsp;
&nbsp;&nbsp; └── age2|int32|&nbsp;|&nbsp;|Pattern: 

**Request-body-example:**
``` json
{
  "date": "Nov 17, 1998, 7:50:38 AM",
  "idCard": "WxX6xpcm",
  "menuPermissionCodes": [
    "PAID"
  ],
  "dataExpressionEnum": "SENSIRION",
  "age": 0,
  "age2": 2417,
  "username": "qcrnDh"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
│&nbsp;&nbsp; ├── dataExpressionEnum|enum|枚举<br/>SENSIRION("2101", new HashMap&lt;&gt;()) - temperature&nbsp;
│&nbsp;&nbsp; ├── menuPermissionCodes|array&lt;enum&gt;|菜单/权限编码&nbsp;
│&nbsp;&nbsp; ├── date|string|学好&nbsp;
│&nbsp;&nbsp; ├── username|string|用户名<br/>Pattern: 
│&nbsp;&nbsp; ├── idCard|string|身份证号<br/>Pattern: 
│&nbsp;&nbsp; ├── age|int32|&nbsp;
│&nbsp;&nbsp; └── age2|int32|Pattern: 
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "f",
  "code": "DvRWJe",
  "data": {
    "date": "Sep 10, 1971, 4:52:12 AM",
    "idCard": "rZ0Seh",
    "menuPermissionCodes": [
      "WAIT_PAY"
    ],
    "dataExpressionEnum": "SENSIRION",
    "age": 0,
    "age2": 8422,
    "username": "4UO3k1"
  },
  "success": false,
  "message": "StQtxdvY",
  "timestamp": "sH8j"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/jsr/ignore --data '{
  "date": "Nov 17, 1998, 7:50:38 AM",
  "idCard": "WxX6xpcm",
  "menuPermissionCodes": [
    "PAID"
  ],
  "dataExpressionEnum": "SENSIRION",
  "age": 0,
  "age2": 2417,
  "username": "qcrnDh"
}'
```

# smart-doc调试入口&nbsp;

## 1.Test Constants&nbsp;

**URL:** http://localhost/testConstants/1.0

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── page|int32|false|0|页码

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/testConstants/1.0 --data 'page=0'
```

# 循环引用依赖测试&nbsp;

## 1.循环依赖参数推导&nbsp;

**URL:** http://localhost/circularReference

**Type:** GET

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|
&nbsp;&nbsp; ├── a|string|&nbsp;|&nbsp;|属性a&nbsp;
&nbsp;&nbsp; └── b|object|&nbsp;|&nbsp;|对象b&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── b|string|&nbsp;|&nbsp;|属性b&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── c|object|&nbsp;|&nbsp;|对象c&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── c|string|&nbsp;|&nbsp;|属性c&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; └── a|object|&nbsp;|&nbsp;|对象A&nbsp;

**Request-body-example:**
``` json
{
  "a": "Rj",
  "b": {
    "b": "ynjc",
    "c": {
      "c": "7"
    }
  }
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── a|string|属性a&nbsp;
└── b|object|对象b&nbsp;
&nbsp;&nbsp; ├── b|string|属性b&nbsp;
&nbsp;&nbsp; └── c|object|对象c&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── c|string|属性c&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── a|object|对象A&nbsp;

**Response-example:**
``` json
{
  "a": "5QrZl",
  "b": {
    "b": "CXMi3KaW",
    "c": {
      "c": "LmLEQy"
    }
  }
}
```

**Curl-example:**
``` bash
curl -X GET -H 'Content-Type: application/json' -i http://localhost/circularReference --data '{
  "a": "Rj",
  "b": {
    "b": "ynjc",
    "c": {
      "c": "7"
    }
  }
}'
```

# 文件下载&nbsp;

## 1.下载文件&nbsp;

**URL:** http://localhost/download1/{filename}

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── filename|string|true|&nbsp;|文件名│me<br/>

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|file|&nbsp;


**Curl-example:**
``` bash
curl -X POST -i http://localhost/download1/CerZ4
```

## 2.下载普通文件文件&nbsp;

**URL:** http://localhost/text/

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── response|object|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -i http://localhost/text/
```

## 3.分页查询&nbsp;

**URL:** http://localhost/list

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── t|object|true|&nbsp;|

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|object|&nbsp;


**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/list
```

# 普通java对象api文档测试&nbsp;

## 1.返回普通String测试&nbsp;

**URL:** http://localhost/simple/str

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"Q5eaiviHYo"
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/simple/str
```

## 2.返回普通javabean&nbsp;

**URL:** http://localhost/simple/user

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|
&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|&nbsp;|&nbsp;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|&nbsp;|&nbsp;|测试&nbsp;
&nbsp;&nbsp; ├── userList|array&lt;object&gt;|&nbsp;|&nbsp;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|&nbsp;|&nbsp;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|&nbsp;|&nbsp;|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|&nbsp;|&nbsp;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|&nbsp;|&nbsp;|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|&nbsp;|&nbsp;|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|&nbsp;|0|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|&nbsp;|&nbsp;|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|&nbsp;|&nbsp;|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|&nbsp;|&nbsp;|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|&nbsp;|&nbsp;|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|&nbsp;|&nbsp;|固定电话&nbsp;
&nbsp;&nbsp; ├── userName|string|&nbsp;|&nbsp;|用户名&nbsp;
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; ├── userAddress|string|&nbsp;|&nbsp;|用户地址&nbsp;
&nbsp;&nbsp; ├── userAge|int32|&nbsp;|0|用户年龄&nbsp;
&nbsp;&nbsp; ├── phone|string|&nbsp;|&nbsp;|手机号&nbsp;
&nbsp;&nbsp; ├── createTime|int64|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; ├── small|float|&nbsp;|&nbsp;|钱少&nbsp;
&nbsp;&nbsp; ├── money|double|&nbsp;|&nbsp;|钱太多了&nbsp;
&nbsp;&nbsp; ├── ipv6|string|&nbsp;|&nbsp;|ipv6&nbsp;
&nbsp;&nbsp; └── telephone|string|&nbsp;|&nbsp;|固定电话&nbsp;

**Request-body-example:**
``` json
{
  "userAddress": "OptNbdpXz3",
  "small": 4853.05,
  "userList": [
    {
      "userAddress": "hoF",
      "small": 1227.7,
      "userList": [],
      "money": 5703.44,
      "phone": "E",
      "createTime": 2394,
      "nickName": "AXe2",
      "ipv6": "m7RK8vy1JK",
      "telephone": "oWd9VI8oY",
      "userName": "Pgmw1LMb",
      "userDetails": [
        {
          "githubAddress": "kZ"
        }
      ],
      "userAge": 0
    }
  ],
  "money": 6197.39,
  "phone": "rs5TSR3T",
  "createTime": 7430,
  "nickName": "x",
  "ipv6": "9",
  "telephone": "mEDo",
  "userName": "GxM9QFHbV1",
  "userDetails": [
    {
      "githubAddress": "4hkx"
    }
  ],
  "userAge": 0
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Description:<br/>用户对象&nbsp;
├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
├── userName|string|用户名&nbsp;
├── nickName|string|昵称&nbsp;
├── userAddress|string|用户地址&nbsp;
├── userAge|int32|用户年龄&nbsp;
├── phone|string|手机号&nbsp;
├── createTime|int64|创建时间&nbsp;
├── small|float|钱少&nbsp;
├── money|double|钱太多了&nbsp;
├── ipv6|string|ipv6&nbsp;
└── telephone|string|固定电话&nbsp;

**Response-example:**
``` json
{
  "userAddress": "r",
  "small": 7527.52,
  "userList": [
    {
      "userAddress": "OKB8B9Cl",
      "small": 5536.95,
      "userList": [],
      "money": 1840.03,
      "phone": "eza",
      "createTime": 7940,
      "nickName": "qAvT",
      "ipv6": "gTxvR9",
      "telephone": "S1nkvsTv",
      "userName": "ri7OwB",
      "userDetails": [
        {
          "githubAddress": "nFDOdGlN"
        }
      ],
      "userAge": 0
    }
  ],
  "money": 3179.27,
  "phone": "9",
  "createTime": 5269,
  "nickName": "tsZaRTtiPk",
  "ipv6": "u6XaAsOA",
  "telephone": "JvBaa",
  "userName": "uCTn",
  "userDetails": [
    {
      "githubAddress": "my0"
    }
  ],
  "userAge": 0
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/simple/user --data '{
  "userAddress": "OptNbdpXz3",
  "small": 4853.05,
  "userList": [
    {
      "userAddress": "hoF",
      "small": 1227.7,
      "userList": [],
      "money": 5703.44,
      "phone": "E",
      "createTime": 2394,
      "nickName": "AXe2",
      "ipv6": "m7RK8vy1JK",
      "telephone": "oWd9VI8oY",
      "userName": "Pgmw1LMb",
      "userDetails": [
        {
          "githubAddress": "kZ"
        }
      ],
      "userAge": 0
    }
  ],
  "money": 6197.39,
  "phone": "rs5TSR3T",
  "createTime": 7430,
  "nickName": "x",
  "ipv6": "9",
  "telephone": "mEDo",
  "userName": "GxM9QFHbV1",
  "userDetails": [
    {
      "githubAddress": "4hkx"
    }
  ],
  "userAge": 0
}'
```

## 3.返回复杂实体数据&nbsp;

**URL:** http://localhost/simple/stu

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Description:<br/>学生信息&nbsp;
├── stuName|string|姓名&nbsp;
├── stuAge|boolean|年龄&nbsp;
├── stuAddress|string|地址&nbsp;
├── user|object|用户对象&nbsp;
│&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
├── userMap|map&lt;string, object&gt;|map用户信息&nbsp;
│&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
├── listMap|array&lt;map&lt;string, int32&gt;&gt;|listMap&nbsp;
│&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; └── &nbsp;|int32|&nbsp;
├── userTreeSet|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
└── user1|object|用户对象2&nbsp;
&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;

**Response-example:**
``` json
{
  "user1": {
    "userAddress": "RJ",
    "small": 5795.84,
    "userList": [
      {
        "userAddress": "Ij",
        "small": 2696.09,
        "userList": [],
        "money": 6277.82,
        "phone": "OCozi",
        "createTime": 3549,
        "nickName": "m10ZrPH",
        "ipv6": "Nx",
        "telephone": "mpIeQtkvEU",
        "userName": "AK",
        "userDetails": [
          {
            "githubAddress": "S"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 9805.47,
    "phone": "Hfsz",
    "createTime": 8590,
    "nickName": "L2d",
    "ipv6": "tx5",
    "telephone": "NkyoZOWt",
    "userName": "YSscZc2",
    "userDetails": [
      {
        "githubAddress": "XRkO8DtJBm"
      }
    ],
    "userAge": 0
  },
  "userTreeSet": [
    {
      "userAddress": "C",
      "small": 9701.87,
      "userList": [
        {
          "userAddress": "LRC0ROZ",
          "small": 2399.65,
          "userList": [],
          "money": 1870.29,
          "phone": "ofzz",
          "createTime": 1485,
          "nickName": "9NvFv1",
          "ipv6": "nF",
          "telephone": "H1etpVFk4p",
          "userName": "J5JQrcU",
          "userDetails": [
            {
              "githubAddress": "DrKVcD"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 9558.37,
      "phone": "GNchevsXdq",
      "createTime": 6244,
      "nickName": "16iO7HFd9S",
      "ipv6": "0MDqvoJYnH",
      "telephone": "M",
      "userName": "QVTThvS",
      "userDetails": [
        {
          "githubAddress": "HSVPPD9cEG"
        }
      ],
      "userAge": 0
    }
  ],
  "listMap": [
    {
      "null": 7173
    }
  ],
  "stuAddress": "Hn70m",
  "stuName": "9m3uRvPmR",
  "userMap": {
    "null": {
      "userAddress": "pY2YfSJ",
      "small": 7354.18,
      "userList": [
        {
          "userAddress": "mQiP3soaW",
          "small": 5401.39,
          "userList": [],
          "money": 9861.03,
          "phone": "VlJ2seDuk",
          "createTime": 9997,
          "nickName": "f",
          "ipv6": "0U7wy7YH",
          "telephone": "rI80N",
          "userName": "CM9Ha",
          "userDetails": [
            {
              "githubAddress": "YDypO"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 8119.24,
      "phone": "szksM",
      "createTime": 1688,
      "nickName": "9",
      "ipv6": "nam81jYe8e",
      "telephone": "2rOUliHS1",
      "userName": "Rei0",
      "userDetails": [
        {
          "githubAddress": "gxJKCeUsZ"
        }
      ],
      "userAge": 0
    }
  },
  "stuAge": false,
  "user": {
    "userAddress": "tF3YeC",
    "small": 5987.1,
    "userList": [
      {
        "userAddress": "j",
        "small": 1967.47,
        "userList": [],
        "money": 9254.97,
        "phone": "I2",
        "createTime": 6591,
        "nickName": "xO3xY8",
        "ipv6": "fk",
        "telephone": "lmZS82p",
        "userName": "jX9n",
        "userDetails": [
          {
            "githubAddress": "y"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 1072.11,
    "phone": "Ar5",
    "createTime": 4713,
    "nickName": "PQViVFD1G1",
    "ipv6": "o",
    "telephone": "3bNo",
    "userName": "kLs",
    "userDetails": [
      {
        "githubAddress": "l"
      }
    ],
    "userAge": 0
  }
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/simple/stu
```

## 4.Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构&nbsp;

**URL:** http://localhost/simple/teacher

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Description:<br/>老师&nbsp;
├── data|object|泛型data&nbsp;
│&nbsp;&nbsp; ├── data|object|泛型data&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; ├── data1|object|泛型data1&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; ├── data2|object|data2&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; └── age|int32|年龄&nbsp;
├── data1|object|泛型data1&nbsp;
│&nbsp;&nbsp; ├── data|object|泛型data&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; ├── data1|object|泛型data1&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; ├── data2|object|data2&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; └── age|int32|年龄&nbsp;
├── data2|object|data2&nbsp;
│&nbsp;&nbsp; ├── data|object|泛型data&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; ├── data1|object|泛型data1&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; ├── data2|object|data2&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; └── age|int32|年龄&nbsp;
└── age|int32|年龄&nbsp;

**Response-example:**
``` json
{
  "data": {
    "data": {
      "userAddress": "N8",
      "small": 6367.49,
      "userList": [
        {
          "userAddress": "wUzFkOY",
          "small": 2834.44,
          "userList": [],
          "money": 2245.42,
          "phone": "NgMEJI",
          "createTime": 7020,
          "nickName": "Y8b",
          "ipv6": "g7lwW",
          "telephone": "GCMC",
          "userName": "i",
          "userDetails": [
            {
              "githubAddress": "4c7idaWg"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 9681.44,
      "phone": "sWL7n",
      "createTime": 2079,
      "nickName": "Sk",
      "ipv6": "SMF7",
      "telephone": "lhRkjMGI",
      "userName": "TsZoXC",
      "userDetails": [
        {
          "githubAddress": "NuGnWCWu"
        }
      ],
      "userAge": 0
    },
    "data2": {
      "userAddress": "7QAsd",
      "small": 3221.45,
      "userList": [
        {
          "userAddress": "fnmG7T1wZU",
          "small": 9207.95,
          "userList": [],
          "money": 6091.52,
          "phone": "h7X",
          "createTime": 8649,
          "nickName": "iMkG2BD",
          "ipv6": "VCl7dzuEz",
          "telephone": "IzOEITQdjG",
          "userName": "b",
          "userDetails": [
            {
              "githubAddress": "rrND3gCbT"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 4434.64,
      "phone": "7ZyxK",
      "createTime": 1838,
      "nickName": "ugJapkt",
      "ipv6": "MFsLY2u",
      "telephone": "Rd",
      "userName": "Y1pLrveb7e",
      "userDetails": [
        {
          "githubAddress": "D5"
        }
      ],
      "userAge": 0
    },
    "data1": {
      "userAddress": "M",
      "small": 6701.6,
      "userList": [
        {
          "userAddress": "bG",
          "small": 3978.56,
          "userList": [],
          "money": 7697.76,
          "phone": "iaIZNvHp",
          "createTime": 3284,
          "nickName": "u9PCk",
          "ipv6": "Yc",
          "telephone": "fv4",
          "userName": "3zRksa",
          "userDetails": [
            {
              "githubAddress": "0g93CE6"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 2568.58,
      "phone": "Nz",
      "createTime": 8083,
      "nickName": "DvG696NJ5",
      "ipv6": "kWoFIt9gr",
      "telephone": "X2",
      "userName": "DN",
      "userDetails": [
        {
          "githubAddress": "jncWI4"
        }
      ],
      "userAge": 0
    },
    "age": 0
  },
  "data2": {
    "data": {
      "userAddress": "UVj",
      "small": 4004.71,
      "userList": [
        {
          "userAddress": "mHWzX2",
          "small": 1560.62,
          "userList": [],
          "money": 6953.57,
          "phone": "jfAZ2153",
          "createTime": 794,
          "nickName": "lQfE4NKtJK",
          "ipv6": "QBwQXeaT6E",
          "telephone": "oWpRaP7iE",
          "userName": "lr",
          "userDetails": [
            {
              "githubAddress": "JSgHe2msy4"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 7096.64,
      "phone": "rx9",
      "createTime": 7429,
      "nickName": "i7UQcNsGkx",
      "ipv6": "FBz34qdky",
      "telephone": "2jgMrMw",
      "userName": "z",
      "userDetails": [
        {
          "githubAddress": "5K4J"
        }
      ],
      "userAge": 0
    },
    "data2": {
      "userAddress": "DGMi",
      "small": 7894.04,
      "userList": [
        {
          "userAddress": "mAd",
          "small": 9696.04,
          "userList": [],
          "money": 574.42,
          "phone": "G3eQ6Sg",
          "createTime": 9802,
          "nickName": "OiVVG6tr",
          "ipv6": "1GW9NiF4",
          "telephone": "wJz0",
          "userName": "Y75PP",
          "userDetails": [
            {
              "githubAddress": "kLILz8ZJ3N"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 6014.49,
      "phone": "X276",
      "createTime": 5704,
      "nickName": "14mlm717m0",
      "ipv6": "GS",
      "telephone": "rUOb551he",
      "userName": "O",
      "userDetails": [
        {
          "githubAddress": "OYTyFyJzNc"
        }
      ],
      "userAge": 0
    },
    "data1": {
      "userAddress": "HOu5",
      "small": 3390.92,
      "userList": [
        {
          "userAddress": "kgV",
          "small": 4380.49,
          "userList": [],
          "money": 5474.95,
          "phone": "R7",
          "createTime": 2981,
          "nickName": "UjMdUP",
          "ipv6": "hPu7dm",
          "telephone": "NGdgsBzX",
          "userName": "en0u",
          "userDetails": [
            {
              "githubAddress": "mBXa"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 8901.47,
      "phone": "Qv9hV",
      "createTime": 4542,
      "nickName": "GG6xFz56Db",
      "ipv6": "DlU",
      "telephone": "9KCHH0dA",
      "userName": "Gw7",
      "userDetails": [
        {
          "githubAddress": "I5HrCm"
        }
      ],
      "userAge": 0
    },
    "age": 0
  },
  "data1": {
    "data": {
      "userAddress": "EW",
      "small": 476.16,
      "userList": [
        {
          "userAddress": "8dE",
          "small": 5642.79,
          "userList": [],
          "money": 8699.61,
          "phone": "GxGD0jEI",
          "createTime": 3076,
          "nickName": "5fM",
          "ipv6": "i3xUWBU",
          "telephone": "VEcPVhLyK",
          "userName": "KfwTR203GR",
          "userDetails": [
            {
              "githubAddress": "kszcb"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 375.76,
      "phone": "tu",
      "createTime": 7330,
      "nickName": "4EKEpUQG",
      "ipv6": "gr",
      "telephone": "ovUCFm",
      "userName": "lu8TqN",
      "userDetails": [
        {
          "githubAddress": "nShzF2pj"
        }
      ],
      "userAge": 0
    },
    "data2": {
      "userAddress": "Bpusvgp",
      "small": 8679.78,
      "userList": [
        {
          "userAddress": "XcLi",
          "small": 7864.56,
          "userList": [],
          "money": 8786.45,
          "phone": "sKv",
          "createTime": 923,
          "nickName": "Nw",
          "ipv6": "QumQX7",
          "telephone": "hNRXqks",
          "userName": "3oXH6",
          "userDetails": [
            {
              "githubAddress": "a"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 8155.23,
      "phone": "9h",
      "createTime": 9326,
      "nickName": "pM",
      "ipv6": "UnySJCj",
      "telephone": "rLP",
      "userName": "sHQWtB9f",
      "userDetails": [
        {
          "githubAddress": "K"
        }
      ],
      "userAge": 0
    },
    "data1": {
      "userAddress": "I9",
      "small": 7656.17,
      "userList": [
        {
          "userAddress": "9QjVUykR",
          "small": 5312.53,
          "userList": [],
          "money": 1999.95,
          "phone": "JB",
          "createTime": 8425,
          "nickName": "RlVtM6CxM",
          "ipv6": "55Z",
          "telephone": "sC2PBN52JZ",
          "userName": "u3KspOEpdT",
          "userDetails": [
            {
              "githubAddress": "5cDikbGEfH"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 9355.8,
      "phone": "PdRD",
      "createTime": 6914,
      "nickName": "iepl",
      "ipv6": "fTT",
      "telephone": "JR36uVf",
      "userName": "Haw",
      "userDetails": [
        {
          "githubAddress": "2mnguy8eA"
        }
      ],
      "userAge": 0
    },
    "age": 0
  },
  "age": 0
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/simple/teacher
```

## 5.Teacher&lt;List&lt;User&gt;, User, Student&gt;&nbsp;

**URL:** http://localhost/simple/teacher2

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Description:<br/>老师&nbsp;
├── data|array&lt;object&gt;|泛型data&nbsp;
│&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
├── data1|object|泛型data1&nbsp;
│&nbsp;&nbsp; ├── stuName|string|姓名&nbsp;
│&nbsp;&nbsp; ├── stuAge|boolean|年龄&nbsp;
│&nbsp;&nbsp; ├── stuAddress|string|地址&nbsp;
│&nbsp;&nbsp; ├── user|object|用户对象&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; ├── userMap|map&lt;string, object&gt;|map用户信息&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; ├── listMap|array&lt;map&lt;string, int32&gt;&gt;|listMap&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|int32|&nbsp;
│&nbsp;&nbsp; ├── userTreeSet|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; └── user1|object|用户对象2&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
├── data2|object|data2&nbsp;
│&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
│&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
│&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
│&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
│&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
│&nbsp;&nbsp; ├── small|float|钱少&nbsp;
│&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
│&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
│&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
└── age|int32|年龄&nbsp;

**Response-example:**
``` json
{
  "data": [
    {
      "userAddress": "fbk5qVmWHb",
      "small": 9061.98,
      "userList": [
        {
          "userAddress": "U9MUdYtj8t",
          "small": 4493.61,
          "userList": [],
          "money": 1048.95,
          "phone": "y",
          "createTime": 3617,
          "nickName": "AdfxZ",
          "ipv6": "X",
          "telephone": "4vuG9GoNvl",
          "userName": "nC4GfO",
          "userDetails": [
            {
              "githubAddress": "ouaS8w0"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 7499.03,
      "phone": "ksVorbPw",
      "createTime": 465,
      "nickName": "ZOk",
      "ipv6": "ZcPuvwVN",
      "telephone": "hq3",
      "userName": "J1HogsGsNP",
      "userDetails": [
        {
          "githubAddress": "WGEmvnz"
        }
      ],
      "userAge": 0
    }
  ],
  "data2": {
    "userAddress": "7H4ZqY8p",
    "small": 5033.8,
    "userList": [
      {
        "userAddress": "nCwgD",
        "small": 5026.72,
        "userList": [],
        "money": 583.06,
        "phone": "P8gsLDmFS",
        "createTime": 6860,
        "nickName": "XYGZ",
        "ipv6": "bfcR1W6y",
        "telephone": "i2kQVQuR",
        "userName": "8DTo",
        "userDetails": [
          {
            "githubAddress": "nyHveG"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 2867.59,
    "phone": "rFN7",
    "createTime": 1457,
    "nickName": "9",
    "ipv6": "My",
    "telephone": "sQyJs6tZ",
    "userName": "PLECiyAf",
    "userDetails": [
      {
        "githubAddress": "TkMrai3Ux"
      }
    ],
    "userAge": 0
  },
  "data1": {
    "user1": {
      "userAddress": "7Goje",
      "small": 8144.54,
      "userList": [],
      "money": 2881.42,
      "phone": "qjW9Orp",
      "createTime": 4525,
      "nickName": "4",
      "ipv6": "V3CRu",
      "telephone": "uiN7q",
      "userName": "PxwXuF1",
      "userDetails": [
        {
          "githubAddress": "8oK4"
        }
      ],
      "userAge": 0
    },
    "userTreeSet": [
      {
        "userAddress": "bMegjm7HCh",
        "small": 9549.01,
        "userList": [],
        "money": 5257.68,
        "phone": "GixUOdPOFR",
        "createTime": 5061,
        "nickName": "qI",
        "ipv6": "EUmXEj",
        "telephone": "fxQHqJ4ITa",
        "userName": "yctq2",
        "userDetails": [
          {
            "githubAddress": "8VR8V6O51"
          }
        ],
        "userAge": 0
      }
    ],
    "listMap": [
      {
        "null": 6810
      }
    ],
    "stuAddress": "XTrpHje",
    "stuName": "oHg6UGMde",
    "userMap": {
      "null": {
        "userAddress": "f14FBYOfc",
        "small": 2427.08,
        "userList": [],
        "money": 5545.21,
        "phone": "1Umv",
        "createTime": 1338,
        "nickName": "NzN",
        "ipv6": "uEq20OHO3",
        "telephone": "e5ucxD",
        "userName": "3ZA",
        "userDetails": [
          {
            "githubAddress": "D31GD8naj1"
          }
        ],
        "userAge": 0
      }
    },
    "stuAge": false,
    "user": {
      "userAddress": "K",
      "small": 5571.44,
      "userList": [],
      "money": 5593.01,
      "phone": "W",
      "createTime": 580,
      "nickName": "W63F",
      "ipv6": "tc8la31yc",
      "telephone": "XnDg08HG",
      "userName": "nz",
      "userDetails": [
        {
          "githubAddress": "OzFt4ug"
        }
      ],
      "userAge": 0
    }
  },
  "age": 0
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/simple/teacher2
```

## 6.测试SubUser&nbsp;

**URL:** http://localhost/simple/subUser

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Description:<br/>子用户&nbsp;
├── subUserName|string|用户名称<br/>水水水水<br/>ddddd
└── numbers|number|bigInteger&nbsp;

**Response-example:**
``` json
{
  "subUserName": "YAfB10LN",
  "numbers": 2343
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/simple/subUser
```

## 7.返回CommonResult&lt;SubUser&gt;&nbsp;

**URL:** http://localhost/simple/subUser/result

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|Description:<br/>子用户&nbsp;
│&nbsp;&nbsp; ├── subUserName|string|用户名称<br/>水水水水<br/>ddddd
│&nbsp;&nbsp; └── numbers|number|bigInteger&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "gVqhp6Ef",
  "code": "jxZt5b",
  "data": {
    "subUserName": "gC",
    "numbers": 5680
  },
  "success": false,
  "message": "wFVY1V",
  "timestamp": "Tj22P"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/simple/subUser/result
```

# Jpa代码测试&nbsp;

## 1.~~Jpa Page~~&nbsp;

**URL:** http://localhost/test

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;object&gt;|&nbsp;
└── &nbsp;|object|角色&nbsp;
&nbsp;&nbsp; ├── roleId|int32|角色id&nbsp;
&nbsp;&nbsp; ├── roleName|string|角色名称&nbsp;
&nbsp;&nbsp; └── age|int32|年龄&nbsp;

**Response-example:**
``` json
[
  {
    "roleId": 9009,
    "roleName": "J",
    "age": 339
  }
]
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/test
```

## 2.Jpa Pageable查询参数重渲染&nbsp;

**URL:** http://localhost/pageableParam

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── pageable|object|true|&nbsp;|

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "splks6Gou",
  "code": "Wt",
  "success": false,
  "message": "Ox2s",
  "timestamp": "NkG"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/pageableParam
```

# 文件上传测试&nbsp;

## 1.上传单个文件&nbsp;

**URL:** http://localhost/upload

**Type:** POST

**Content-Type:** multipart/form-data

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── userId|string|&nbsp;|&nbsp;|用户id<br/>&nbsp;
└── file|file|true|<br/>		<br/>		<br/><br/>				<br/>|文件<br/>

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "ZdkZJeP2s",
  "code": "FugkWYTa",
  "success": false,
  "message": "K68jZLm",
  "timestamp": "oJ5CoPa"
}
```

## 2.批量上传文件&nbsp;

**URL:** http://localhost/

**Type:** POST

**Content-Type:** multipart/form-data

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── file|array|&nbsp;|&nbsp;|文件<br/>&nbsp;
&nbsp;&nbsp; └── &nbsp;|file|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "y",
  "code": "VMy8diTZ9B",
  "success": false,
  "message": "DzWDoi5Rm7",
  "timestamp": "l2N"
}
```

## 3.批量上传文件1&nbsp;

**URL:** http://localhost/batchUpload2

**Type:** POST

**Content-Type:** multipart/form-data

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── file|array&lt;file&gt;|&nbsp;|&nbsp;|文件<br/>&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "o8FqqsBS",
  "code": "6654I",
  "success": false,
  "message": "SA1xs",
  "timestamp": "G9WLg5"
}
```

## 4.批量上传文件2&nbsp;

**URL:** http://localhost/batchUpload3

**Type:** POST

**Content-Type:** multipart/form-data

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── files|array|&nbsp;|&nbsp;|批量文件<br/>&nbsp;
&nbsp;&nbsp; └── &nbsp;|file|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "CGFb",
  "code": "hU3HQ",
  "success": false,
  "message": "kZMQVUIUzx",
  "timestamp": "s8KlJgo"
}
```

## 5.批量上传文件3&nbsp;

**URL:** http://localhost/batchUpload4

**Type:** POST

**Content-Type:** multipart/form-data

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── files|array&lt;file&gt;|&nbsp;|&nbsp;|批量文件<br/>&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "b",
  "code": "w2Dvde",
  "success": false,
  "message": "hMIiMrJq",
  "timestamp": "6eGVX44o"
}
```

## 6.批量上传文件5&nbsp;

**URL:** http://localhost/batchUpload5

**Type:** POST

**Content-Type:** multipart/form-data

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── dto|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|名称&nbsp;
&nbsp;&nbsp; ├── sex|string|&nbsp;|&nbsp;|性别&nbsp;
&nbsp;&nbsp; ├── addressList|array&lt;string&gt;|&nbsp;|&nbsp;|地址&nbsp;
&nbsp;&nbsp; ├── multipartFileList|array&lt;file&gt;|&nbsp;|&nbsp;|文件List&nbsp;
&nbsp;&nbsp; ├── multipartFiles|array|&nbsp;|&nbsp;|文件array&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|file|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── commonsMultipartFileList|array&lt;file&gt;|&nbsp;|&nbsp;|文件List&nbsp;
&nbsp;&nbsp; └── commonsMultipartFiles|array|&nbsp;|&nbsp;|文件array&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── &nbsp;|file|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "5VY2q",
  "code": "c",
  "success": false,
  "message": "62Q8wFO",
  "timestamp": "ngNQwiuE"
}
```

# Class Name：com.power.doc.controller.torna.Issue223Controller

## 1.测试list map的value为实体时, map的key的推送效果&nbsp;

**URL:** http://localhost/issue223/test

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|array&lt;map&lt;string, object&gt;&gt;|&nbsp;
│&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; └── &nbsp;|object|阿哲&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── name|string|姓名&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; └── sex|int32|性别&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "HPQ0lo",
  "code": "aue",
  "data": [
    {
      "null": {
        "sex": 4612,
        "name": "Nrv"
      }
    }
  ],
  "success": false,
  "message": "Q2",
  "timestamp": "Q1aTZS"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/issue223/test
```

## 2.test1&nbsp;

**URL:** http://localhost/issue223/test1

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|map&lt;string, int32&gt;|&nbsp;
│&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; └── &nbsp;|int32|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "wnB60H",
  "code": "RCn",
  "data": {
    "null": 2125
  },
  "success": false,
  "message": "3D",
  "timestamp": "k"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/issue223/test1
```

## 3.test2&nbsp;

**URL:** http://localhost/issue223/test2

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|array&lt;map&lt;string, map&gt;&gt;|&nbsp;
│&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; └── &nbsp;|map&lt;string, int32&gt;|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; └── &nbsp;|int32|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "30",
  "code": "f2RU",
  "data": [
    {
      "null": {
        "null": 8381
      }
    }
  ],
  "success": false,
  "message": "1P",
  "timestamp": "TGgcj"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/issue223/test2
```

## 4.test3&nbsp;

**URL:** http://localhost/issue223/test3

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, int32&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|int32|&nbsp;

**Response-example:**
``` json
{
  "null": 7381
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/issue223/test3
```

## 5.test4&nbsp;

**URL:** http://localhost/issue223/test4

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, object&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|object|阿哲&nbsp;
&nbsp;&nbsp; ├── name|string|姓名&nbsp;
&nbsp;&nbsp; └── sex|int32|性别&nbsp;

**Response-example:**
``` json
{
  "null": {
    "sex": 8043,
    "name": "iruSHCZYp"
  }
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/issue223/test4
```

## 6.test5&nbsp;

**URL:** http://localhost/issue223/test5

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

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

**Curl-example:**
``` bash
curl -X POST -i http://localhost/issue223/test5
```

# 多泛型测试&nbsp;

## 1.test mulGeneric&nbsp;

**URL:** http://localhost/mulGenric/test

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|user对象<br/>
&nbsp;&nbsp; ├── header|object|&nbsp;|&nbsp;|通信协议信息&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── protocol|int32|&nbsp;|&nbsp;|协议版本&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── timestamp|string|&nbsp;|&nbsp;|请求时间戳&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── requestId|string|&nbsp;|&nbsp;|请求id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── source|int32|&nbsp;|&nbsp;|来源&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── strategy|int32|&nbsp;|&nbsp;|加密策略&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── statusCode|int32|&nbsp;|&nbsp;|状态码[0:成功 其他:失败]&nbsp;
&nbsp;&nbsp; └── body|object|&nbsp;|&nbsp;|请求体&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── oee|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── head|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── protocol|int32|&nbsp;|&nbsp;|协议版本号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── onlineId|string|&nbsp;|&nbsp;|在线id&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── timestamp|string|&nbsp;|&nbsp;|请求时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── serialNumber|string|&nbsp;|&nbsp;|请求流水号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── operationType|int32|&nbsp;|&nbsp;|操作类型&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── operationCode|int32|&nbsp;|&nbsp;|操作码&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── terminal|string|&nbsp;|&nbsp;|数据&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── data|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── request|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── response|object|&nbsp;|&nbsp;|&nbsp;

**Request-body-example:**
``` json
{
  "header": {
    "protocol": 5190,
    "requestId": "b",
    "source": 5153,
    "strategy": 6124,
    "timestamp": "zzvl",
    "statusCode": 4053
  },
  "body": {
    "oee": {
      "head": {
        "protocol": 2724,
        "serialNumber": "3",
        "operationCode": 6202,
        "onlineId": "5NI",
        "operationType": 2969,
        "terminal": "QLwjhN6",
        "timestamp": "oA9xBqYf"
      }
    }
  }
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── header|object|通信协议信息&nbsp;
│&nbsp;&nbsp; ├── protocol|int32|协议版本&nbsp;
│&nbsp;&nbsp; ├── timestamp|string|请求时间戳&nbsp;
│&nbsp;&nbsp; ├── requestId|string|请求id&nbsp;
│&nbsp;&nbsp; ├── source|int32|来源&nbsp;
│&nbsp;&nbsp; ├── strategy|int32|加密策略&nbsp;
│&nbsp;&nbsp; └── statusCode|int32|状态码[0:成功 其他:失败]&nbsp;
└── body|object|请求体&nbsp;
&nbsp;&nbsp; ├── oee|object|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── head|object|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── protocol|int32|协议版本号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── onlineId|string|在线id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── timestamp|string|请求时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── serialNumber|string|请求流水号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── operationType|int32|操作类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── operationCode|int32|操作码&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── terminal|string|数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── data|object|&nbsp;
&nbsp;&nbsp; ├── request|object|&nbsp;
&nbsp;&nbsp; └── response|object|&nbsp;

**Response-example:**
``` json
{
  "header": {
    "protocol": 2514,
    "requestId": "kVQ",
    "source": 6827,
    "strategy": 4375,
    "timestamp": "e4SV2YgF",
    "statusCode": 1742
  },
  "body": {
    "oee": {
      "head": {
        "protocol": 8365,
        "serialNumber": "h3oLJfZp5Z",
        "operationCode": 5202,
        "onlineId": "1dlQVrEqE",
        "operationType": 1861,
        "terminal": "PTX",
        "timestamp": "sgcYE"
      }
    }
  }
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/mulGenric/test --data '{
  "header": {
    "protocol": 5190,
    "requestId": "b",
    "source": 5153,
    "strategy": 6124,
    "timestamp": "zzvl",
    "statusCode": 4053
  },
  "body": {
    "oee": {
      "head": {
        "protocol": 2724,
        "serialNumber": "3",
        "operationCode": 6202,
        "onlineId": "5NI",
        "operationType": 2969,
        "terminal": "QLwjhN6",
        "timestamp": "oA9xBqYf"
      }
    }
  }
}'
```

## 2.数组&nbsp;

**URL:** http://localhost/mulGenric/test2/

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── data|object|true|&nbsp;|3423<br/>
&nbsp;&nbsp; ├── page|object|&nbsp;|&nbsp;|角色&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|int32|&nbsp;|&nbsp;|角色id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|角色名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── age|int32|&nbsp;|&nbsp;|年龄&nbsp;
&nbsp;&nbsp; └── data1|array&lt;object&gt;|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── total|int32|&nbsp;|0|记录总数&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── concurrentPage|int32|&nbsp;|0|当前页&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── pageSize|int32|&nbsp;|0|当前page&nbsp;

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
    "roleId": 2729,
    "roleName": "bN054",
    "age": 6937
  }
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── page|object|角色&nbsp;
│&nbsp;&nbsp; ├── roleId|int32|角色id&nbsp;
│&nbsp;&nbsp; ├── roleName|string|角色名称&nbsp;
│&nbsp;&nbsp; └── age|int32|年龄&nbsp;
└── data1|array&lt;object&gt;|&nbsp;
&nbsp;&nbsp; ├── total|int32|记录总数&nbsp;
&nbsp;&nbsp; ├── concurrentPage|int32|当前页&nbsp;
&nbsp;&nbsp; └── pageSize|int32|当前page&nbsp;

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
    "roleId": 4843,
    "roleName": "Iev",
    "age": 7604
  }
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/mulGenric/test2/ --data '{
  "data1": [
    {
      "total": 0,
      "concurrentPage": 0,
      "pageSize": 0
    }
  ],
  "page": {
    "roleId": 2729,
    "roleName": "bN054",
    "age": 6937
  }
}'
```

## 3.gitee #I1S8W验证&nbsp;

**URL:** http://localhost/mulGenric/test3

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
│&nbsp;&nbsp; ├── page|object|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── records|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── testObject|object|测试object&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── username|string|用户名&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── password|string|密码&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── mobile|string|电话&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── email|string|邮箱&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── address|string|地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sex|int32|性别(男1 女 2)&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── avatar|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|状态&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|描述&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── roles|array&lt;object&gt;|用户拥有角色&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|角色名 以ROLE_开头&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── defaultRole|boolean|是否为注册默认角色&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|拥有权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|用户拥有的权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── total|int64|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── size|int64|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── current|int64|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── orders|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── column|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── asc|boolean|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── optimizeCountSql|boolean|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── searchCount|boolean|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── optimizeJoinOfCountSql|boolean|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── countId|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── maxLimit|int64|&nbsp;
│&nbsp;&nbsp; └── data1|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── testObject|object|测试object&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── username|string|用户名&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── password|string|密码&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── mobile|string|电话&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── email|string|邮箱&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── address|string|地址&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── sex|int32|性别(男1 女 2)&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── avatar|string|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── type|int32|类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── status|int32|状态&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── description|string|描述&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── roles|array&lt;object&gt;|用户拥有角色&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|角色名 以ROLE_开头&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── defaultRole|boolean|是否为注册默认角色&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|拥有权限&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── permissions|array&lt;object&gt;|用户拥有的权限&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|菜单/权限名称&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|层级&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|类型 0页面 1具体操作&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|菜单标题&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|页面路径/资源链接url&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|前端组件&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|图标&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|按钮权限类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|父id&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|说明备注&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|排序值&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|是否启用 0启用 -1禁用&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|子菜单/权限&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|页面拥有的权限类型&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|节点展开 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|是否勾选 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|是否选中 前端所需&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; &nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; └── test|object|测试数据&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "qKmK9KDj",
  "code": "EVf",
  "data": {
    "data1": [
      {
        "address": "TCySjsA62",
        "nickName": "om",
        "sex": 9237,
        "roles": [
          {
            "createBy": "dZJP",
            "defaultRole": true,
            "createTime": "Jan 4, 2032, 1:36:44 PM",
            "updateBy": "Q",
            "permissions": [
              {
                "level": 6587,
                "icon": "KVwMTrIRMG",
                "description": "U0sh",
                "updateTime": "1991-05-20 23:10:16",
                "type": 8758,
                "title": "fsft",
                "delFlag": 3406,
                "parentId": "Y7ijeTso",
                "permTypes": [
                  "md2oh"
                ],
                "path": "teJq",
                "component": "e3",
                "expand": "true",
                "createBy": "RN5SJ",
                "buttonType": "lD",
                "children": [
                  {
                    "level": 9903,
                    "icon": "f",
                    "description": "iWEsv0kyH",
                    "updateTime": "2028-05-12 23:03:34",
                    "type": 5043,
                    "title": "tQMhKa7hV",
                    "delFlag": 2500,
                    "parentId": "z0Yren1dj",
                    "permTypes": [
                      "WLb4pZRJqU"
                    ],
                    "path": "f82RTahHS",
                    "component": "qfW",
                    "expand": "true",
                    "createBy": "u4a7",
                    "buttonType": "V8byFRtV",
                    "children": [
                      {
                        "level": 8465,
                        "icon": "FzVp3g",
                        "description": "wFjn0q",
                        "updateTime": "1982-06-15 16:29:56",
                        "type": 3133,
                        "title": "xP",
                        "delFlag": 7882,
                        "parentId": "BX4esiLhs",
                        "permTypes": [
                          "XqjbuT5qP"
                        ],
                        "path": "rxd3B3I",
                        "component": "8hBFc7pE",
                        "expand": "true",
                        "createBy": "DtJdgJZqw",
                        "buttonType": "J",
                        "children": [],
                        "createTime": "Mar 18, 1988, 7:07:22 PM",
                        "updateBy": "2E0r13",
                        "sortOrder": 2428.93,
                        "name": "kS",
                        "checked": "false",
                        "id": "uymnl",
                        "selected": "false",
                        "status": 6837
                      }
                    ],
                    "createTime": "Jan 16, 2063, 7:25:24 AM",
                    "updateBy": "N5",
                    "sortOrder": 3434.8,
                    "name": "z1taRUGSDh",
                    "checked": "false",
                    "id": "tTFDyuJ",
                    "selected": "false",
                    "status": 2254
                  }
                ],
                "createTime": "Jul 11, 2076, 10:58:56 PM",
                "updateBy": "D",
                "sortOrder": 7862.04,
                "name": "tWOF6xlaw3",
                "checked": "false",
                "id": "f2NT",
                "selected": "false",
                "status": 5531
              }
            ],
            "name": "kHwQLhE",
            "updateTime": "2088-03-18 05:08:21",
            "id": "g7w",
            "delFlag": 1301
          }
        ],
        "mobile": "y",
        "description": "z2Z7",
        "updateTime": "2067-06-14 14:16:30",
        "avatar": "https://s1.ax1x.com/2018/05/19/CcdVQP.png",
        "type": 2106,
        "delFlag": 9157,
        "password": "SSixrx",
        "createBy": "j7q7Ip5pp",
        "createTime": "Aug 2, 1995, 2:04:13 AM",
        "updateBy": "dkpiSIy4",
        "permissions": [
          {
            "level": 6208,
            "icon": "206V",
            "description": "FvMi",
            "updateTime": "2062-02-16 06:31:45",
            "type": 6616,
            "title": "Szc7C",
            "delFlag": 9153,
            "parentId": "K9teP4qwNI",
            "permTypes": [
              "AViuAcbEN"
            ],
            "path": "4xv",
            "component": "Q",
            "expand": "true",
            "createBy": "BkqU",
            "buttonType": "NoCdeN",
            "children": [
              {
                "level": 6858,
                "icon": "7RSUivF",
                "description": "xD",
                "updateTime": "2070-12-23 10:00:37",
                "type": 4372,
                "title": "pg8k1Lv",
                "delFlag": 8528,
                "parentId": "CR",
                "permTypes": [
                  "Yq"
                ],
                "path": "e1hUuiUZ",
                "component": "2lAP",
                "expand": "true",
                "createBy": "OhIie",
                "buttonType": "lql1jhr5b",
                "children": [
                  {
                    "level": 9379,
                    "icon": "FyxB",
                    "description": "0qoS",
                    "updateTime": "2058-10-09 03:41:52",
                    "type": 1987,
                    "title": "IhO",
                    "delFlag": 3907,
                    "parentId": "KcxFaEb9",
                    "permTypes": [
                      "7wGq4FfFX3"
                    ],
                    "path": "b",
                    "component": "E",
                    "expand": "true",
                    "createBy": "7YjV",
                    "buttonType": "zBh4rtcd",
                    "children": [
                      {
                        "level": 3060,
                        "icon": "JIRlHkL",
                        "description": "y",
                        "updateTime": "1993-03-02 04:13:26",
                        "type": 6593,
                        "title": "c3MBcQ4lr",
                        "delFlag": 9114,
                        "parentId": "mO",
                        "permTypes": [
                          "N8hHSBZH4x"
                        ],
                        "path": "bmqG3",
                        "component": "3M3C",
                        "expand": "true",
                        "createBy": "vR8GwoEWwp",
                        "buttonType": "ZZed3e5",
                        "children": [],
                        "createTime": "Jan 31, 1996, 1:17:43 PM",
                        "updateBy": "aublZU",
                        "sortOrder": 1389.0,
                        "name": "iJChm5L",
                        "checked": "false",
                        "id": "YWviKBryt",
                        "selected": "false",
                        "status": 7306
                      }
                    ],
                    "createTime": "Oct 20, 1977, 3:25:05 AM",
                    "updateBy": "7zwT",
                    "sortOrder": 3323.8,
                    "name": "n09Poef",
                    "checked": "false",
                    "id": "1",
                    "selected": "false",
                    "status": 8975
                  }
                ],
                "createTime": "May 14, 1990, 9:26:38 PM",
                "updateBy": "6f",
                "sortOrder": 4805.61,
                "name": "66KRhiOh",
                "checked": "false",
                "id": "SsHzfT2",
                "selected": "false",
                "status": 1747
              }
            ],
            "createTime": "Feb 15, 2039, 7:06:07 PM",
            "updateBy": "GQf",
            "sortOrder": 340.92,
            "name": "4u3L",
            "checked": "false",
            "id": "jiOi7DJhH1",
            "selected": "false",
            "status": 4983
          }
        ],
        "testObject": {},
        "id": "B59BFPZO",
        "email": "dNgd4FV",
        "username": "vBeDvt",
        "status": 2349
      }
    ],
    "page": {
      "total": 0,
      "current": 0,
      "size": 0,
      "optimizeCountSql": false,
      "records": [
        {
          "address": "H",
          "nickName": "JY0mUNM8",
          "sex": 5941,
          "roles": [
            {
              "createBy": "pkc",
              "defaultRole": false,
              "createTime": "Jan 5, 2082, 2:46:07 AM",
              "updateBy": "Xttgw6Ifb",
              "permissions": [
                {
                  "level": 6416,
                  "icon": "p1",
                  "description": "ozm1k",
                  "updateTime": "2095-09-13 21:28:44",
                  "type": 2153,
                  "title": "Jf3Rm5nLEA",
                  "delFlag": 178,
                  "parentId": "m",
                  "permTypes": [
                    "Vsozl1"
                  ],
                  "path": "PHFbjB4A9J",
                  "component": "pE",
                  "expand": "true",
                  "createBy": "rZLsN",
                  "buttonType": "EwF",
                  "children": [
                    {
                      "level": 858,
                      "icon": "m",
                      "description": "rt",
                      "updateTime": "2060-04-19 14:34:48",
                      "type": 1336,
                      "title": "fzLwW0y6ru",
                      "delFlag": 9085,
                      "parentId": "eYm3V",
                      "permTypes": [
                        "hP49mKGvj"
                      ],
                      "path": "8rcrSZEV",
                      "component": "eLnE8jHWh",
                      "expand": "true",
                      "createBy": "Bww79",
                      "buttonType": "IbJkbzmOIR",
                      "children": [],
                      "createTime": "Feb 19, 2008, 7:10:19 AM",
                      "updateBy": "jm3JwNl6W",
                      "sortOrder": 459.62,
                      "name": "qkPkv2ufQ",
                      "checked": "false",
                      "id": "t9xX",
                      "selected": "false",
                      "status": 5790
                    }
                  ],
                  "createTime": "Aug 2, 2033, 1:58:46 PM",
                  "updateBy": "Os",
                  "sortOrder": 5044.27,
                  "name": "WVOvyy1MSQ",
                  "checked": "false",
                  "id": "a8H",
                  "selected": "false",
                  "status": 479
                }
              ],
              "name": "OMNG53k",
              "updateTime": "2012-07-19 19:10:23",
              "id": "QDDhT2RJ",
              "delFlag": 8167
            }
          ],
          "mobile": "iygb8di",
          "description": "6Kq",
          "updateTime": "2017-07-10 10:51:26",
          "avatar": "https://s1.ax1x.com/2018/05/19/CcdVQP.png",
          "type": 7373,
          "delFlag": 4938,
          "password": "Ea5s6ilRyZ",
          "createBy": "WEvWMlH",
          "createTime": "Aug 26, 2033, 5:37:27 PM",
          "updateBy": "CSuCB9oa3j",
          "permissions": [
            {
              "level": 5373,
              "icon": "0",
              "description": "Ns3bS8sKwg",
              "updateTime": "2005-02-20 06:11:51",
              "type": 8096,
              "title": "mQwTX3qSW",
              "delFlag": 6165,
              "parentId": "seJNmk",
              "permTypes": [
                "YaFad"
              ],
              "path": "wvxkcUh5nu",
              "component": "Jkh2",
              "expand": "true",
              "createBy": "7",
              "buttonType": "vz",
              "children": [
                {
                  "level": 710,
                  "icon": "TFj",
                  "description": "QnodLP",
                  "updateTime": "1979-05-21 13:42:58",
                  "type": 9221,
                  "title": "NUHYx4",
                  "delFlag": 4766,
                  "parentId": "HzYcTqyT0",
                  "permTypes": [
                    "nBB1mPp"
                  ],
                  "path": "912KFPne2",
                  "component": "3C",
                  "expand": "true",
                  "createBy": "uaA",
                  "buttonType": "4CDfK43kP",
                  "children": [
                    {
                      "level": 3069,
                      "icon": "m",
                      "description": "06Otarfl",
                      "updateTime": "2043-09-02 17:12:48",
                      "type": 6670,
                      "title": "MTw",
                      "delFlag": 1182,
                      "parentId": "dpIKledr",
                      "permTypes": [
                        "4SMs8MZ"
                      ],
                      "path": "Ze2",
                      "component": "3nNlCF5v",
                      "expand": "true",
                      "createBy": "TED",
                      "buttonType": "YhsvI",
                      "children": [],
                      "createTime": "Sep 5, 2033, 8:39:30 AM",
                      "updateBy": "rEYgZoj",
                      "sortOrder": 2793.88,
                      "name": "a3W",
                      "checked": "false",
                      "id": "v2CgZUJciy",
                      "selected": "false",
                      "status": 7794
                    }
                  ],
                  "createTime": "Nov 7, 1985, 7:52:48 PM",
                  "updateBy": "Xt",
                  "sortOrder": 2955.78,
                  "name": "b6A3IgEE9",
                  "checked": "false",
                  "id": "MwsPIit9Q",
                  "selected": "false",
                  "status": 8794
                }
              ],
              "createTime": "Jun 16, 1976, 6:20:11 AM",
              "updateBy": "pHbgEL",
              "sortOrder": 198.87,
              "name": "hSJ",
              "checked": "false",
              "id": "lDTRejf",
              "selected": "false",
              "status": 6509
            }
          ],
          "testObject": {},
          "id": "EurwLgF",
          "email": "owzrJM5XGL",
          "username": "r4gLONC",
          "status": 5351
        }
      ],
      "maxLimit": 547,
      "searchCount": false,
      "optimizeJoinOfCountSql": false,
      "orders": [
        {
          "asc": false,
          "column": "v5yt4dsBQ"
        }
      ],
      "countId": "KVcpphCICW"
    }
  },
  "success": false,
  "message": "Z3x",
  "timestamp": "o"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/mulGenric/test3
```

# JSR303参数验证规范测试&nbsp;

## 1.验证validate&nbsp;

**URL:** http://localhost/validator/test

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── leader|object|true|&nbsp;|
&nbsp;&nbsp; ├── birthday|string|true|&nbsp;|生日
&nbsp;&nbsp; ├── name|string|true|&nbsp;|姓名
&nbsp;&nbsp; ├── age|int32|&nbsp;|&nbsp;|年龄&nbsp;
&nbsp;&nbsp; └── subject|object|true|&nbsp;|科目
&nbsp;&nbsp; &nbsp;&nbsp; ├── subjectName|string|true|&nbsp;|科目名称
&nbsp;&nbsp; &nbsp;&nbsp; └── core|int32|&nbsp;|0|分数&nbsp;

**Request-body-example:**
``` json
{
  "birthday": "TGHUFH",
  "subject": {
    "core": 0,
    "subjectName": "R"
  },
  "name": "tMkTH7BO",
  "age": 3162
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
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "g0b",
  "code": "5T3wvQ3",
  "success": false,
  "message": "URK",
  "timestamp": "iCEm7yva"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/validator/test --data '{
  "birthday": "TGHUFH",
  "subject": {
    "core": 0,
    "subjectName": "R"
  },
  "name": "tMkTH7BO",
  "age": 3162
}'
```

## 2.验证通用参数&nbsp;

**URL:** http://localhost/validator/valid

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── param|object|true|&nbsp;|
&nbsp;&nbsp; ├── token|string|true|&nbsp;|token
&nbsp;&nbsp; ├── sequenceNo|string|true|&nbsp;|序列号
&nbsp;&nbsp; └── parameter|object|&nbsp;|&nbsp;|Description:<br/>子用户&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── subUserName|string|true|&nbsp;|用户名称<br/>水水水水<br/>ddddd
&nbsp;&nbsp; &nbsp;&nbsp; └── numbers|number|&nbsp;|&nbsp;|bigInteger&nbsp;

**Request-body-example:**
``` json
{
  "sequenceNo": "a",
  "parameter": {
    "subUserName": "x",
    "numbers": 1705
  },
  "token": "k6zk9"
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
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "rK",
  "code": "xuYZ0Sj",
  "success": false,
  "message": "HKrU",
  "timestamp": "SX"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/validator/valid --data '{
  "sequenceNo": "a",
  "parameter": {
    "subUserName": "x",
    "numbers": 1705
  },
  "token": "k6zk9"
}'
```

## 3.分组验证1&nbsp;

**URL:** http://localhost/validator/save

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── collect|object|true|&nbsp;|
&nbsp;&nbsp; ├── id|int64|true|&nbsp;|主键id
&nbsp;&nbsp; ├── name|string|true|&nbsp;|名称
&nbsp;&nbsp; ├── email|string|true|&nbsp;|邮箱<br/>测试继承默认分组的group
&nbsp;&nbsp; ├── mobile|string|true|&nbsp;|电话
&nbsp;&nbsp; └── address|string|true|&nbsp;|地址

**Request-body-example:**
``` json
{
  "address": "501YL",
  "name": "f",
  "mobile": "7WNZryzOg",
  "id": 985,
  "email": "ibI0"
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
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "4OSkn",
  "code": "gC",
  "success": false,
  "message": "1HgvwlYP",
  "timestamp": "Caiyts"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/validator/save --data '{
  "address": "501YL",
  "name": "f",
  "mobile": "7WNZryzOg",
  "id": 985,
  "email": "ibI0"
}'
```

## 4.分组验证2&nbsp;

**URL:** http://localhost/validator/update

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── collect|object|true|&nbsp;|
&nbsp;&nbsp; ├── id|int64|true|&nbsp;|主键id
&nbsp;&nbsp; ├── name|string|true|&nbsp;|名称
&nbsp;&nbsp; ├── email|string|true|&nbsp;|邮箱<br/>测试继承默认分组的group
&nbsp;&nbsp; ├── mobile|string|true|&nbsp;|电话
&nbsp;&nbsp; └── address|string|true|&nbsp;|地址

**Request-body-example:**
``` json
{
  "address": "NXnU",
  "name": "eUFZxhc",
  "mobile": "ZVaXW",
  "id": 804,
  "email": "PxorQUdm2x"
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
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "GEq1L9",
  "code": "GfGWfCUU",
  "success": false,
  "message": "b0j",
  "timestamp": "u9R2"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/validator/update --data '{
  "address": "NXnU",
  "name": "eUFZxhc",
  "mobile": "ZVaXW",
  "id": 804,
  "email": "PxorQUdm2x"
}'
```

## 5.分组验证3&nbsp;

**URL:** http://localhost/validator/login

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── collect|object|true|&nbsp;|
&nbsp;&nbsp; ├── id|int64|true|&nbsp;|主键id
&nbsp;&nbsp; ├── name|string|true|&nbsp;|名称
&nbsp;&nbsp; ├── email|string|true|&nbsp;|邮箱<br/>测试继承默认分组的group
&nbsp;&nbsp; ├── mobile|string|true|&nbsp;|电话
&nbsp;&nbsp; └── address|string|true|&nbsp;|地址

**Request-body-example:**
``` json
{
  "address": "bSXfG",
  "name": "CASDOGk",
  "mobile": "o",
  "id": 9710,
  "email": "SM9UplHH"
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
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "MK",
  "code": "wA6V",
  "success": false,
  "message": "VwE9l",
  "timestamp": "Dw4JrO1"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/validator/login --data '{
  "address": "bSXfG",
  "name": "CASDOGk",
  "mobile": "o",
  "id": 9710,
  "email": "SM9UplHH"
}'
```

## 6.分组验证4&nbsp;

**URL:** http://localhost/validator/test4

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── collect|object|true|&nbsp;|
&nbsp;&nbsp; ├── id|int64|true|&nbsp;|主键id
&nbsp;&nbsp; ├── name|string|true|&nbsp;|名称
&nbsp;&nbsp; ├── email|string|true|&nbsp;|邮箱<br/>测试继承默认分组的group
&nbsp;&nbsp; ├── mobile|string|true|&nbsp;|电话
&nbsp;&nbsp; └── address|string|true|&nbsp;|地址

**Request-body-example:**
``` json
{
  "address": "6UIF",
  "name": "mj",
  "mobile": "vxNw",
  "id": 3820,
  "email": "F3J"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|object|&nbsp;

**Response-example:**
``` json
{}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/validator/test4 --data '{
  "address": "6UIF",
  "name": "mj",
  "mobile": "vxNw",
  "id": 3820,
  "email": "F3J"
}'
```

## 7.测试父级内部注解分组校验&nbsp;

**URL:** http://localhost/validator/testInnerValid

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── collect|object|true|&nbsp;|
&nbsp;&nbsp; ├── id|int64|true|&nbsp;|主键id
&nbsp;&nbsp; ├── name|string|true|&nbsp;|名称
&nbsp;&nbsp; ├── email|string|true|&nbsp;|邮箱<br/>测试继承默认分组的group
&nbsp;&nbsp; ├── mobile|string|true|&nbsp;|电话
&nbsp;&nbsp; └── address|string|true|&nbsp;|地址

**Request-body-example:**
``` json
{
  "address": "rDD1Sv1xC",
  "name": "JT3",
  "mobile": "1Iw0Wj",
  "id": 9340,
  "email": "GdCb8T1zFA"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "tt",
  "code": "KG",
  "success": false,
  "message": "FUUXr4iYq1",
  "timestamp": "qNOdMuF"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/validator/testInnerValid --data '{
  "address": "rDD1Sv1xC",
  "name": "JT3",
  "mobile": "1Iw0Wj",
  "id": 9340,
  "email": "GdCb8T1zFA"
}'
```

## 8.测试继承默认分组&nbsp;

**URL:** http://localhost/validator/testExtendsDefault

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── collect|object|true|&nbsp;|
&nbsp;&nbsp; ├── id|int64|true|&nbsp;|主键id
&nbsp;&nbsp; ├── name|string|true|&nbsp;|名称
&nbsp;&nbsp; ├── email|string|true|&nbsp;|邮箱<br/>测试继承默认分组的group
&nbsp;&nbsp; ├── mobile|string|true|&nbsp;|电话
&nbsp;&nbsp; └── address|string|true|&nbsp;|地址

**Request-body-example:**
``` json
{
  "address": "Hvw",
  "name": "GiRgMmxKCu",
  "mobile": "y",
  "id": 3491,
  "email": "x0rq5TQ"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "2",
  "code": "7SI0icTW0",
  "success": false,
  "message": "tdkS",
  "timestamp": "X"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/validator/testExtendsDefault --data '{
  "address": "Hvw",
  "name": "GiRgMmxKCu",
  "mobile": "y",
  "id": 3491,
  "email": "x0rq5TQ"
}'
```

## 9.测试内部接口继承默认分组&nbsp;

**URL:** http://localhost/validator/testExtendsDefault2

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── collect|object|true|&nbsp;|
&nbsp;&nbsp; ├── id|int64|true|&nbsp;|主键id
&nbsp;&nbsp; ├── name|string|true|&nbsp;|名称
&nbsp;&nbsp; ├── email|string|true|&nbsp;|邮箱<br/>测试继承默认分组的group
&nbsp;&nbsp; ├── mobile|string|true|&nbsp;|电话
&nbsp;&nbsp; └── address|string|true|&nbsp;|地址

**Request-body-example:**
``` json
{
  "address": "M",
  "name": "lVe",
  "mobile": "o",
  "id": 4607,
  "email": "t"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "AZu",
  "code": "q9gJhyvq",
  "success": false,
  "message": "i",
  "timestamp": "A"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/validator/testExtendsDefault2 --data '{
  "address": "M",
  "name": "lVe",
  "mobile": "o",
  "id": 4607,
  "email": "t"
}'
```

## 10.测试新增&nbsp;

**URL:** http://localhost/validator/testSave

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── collect|object|true|&nbsp;|
&nbsp;&nbsp; ├── id|int64|true|&nbsp;|主键id
&nbsp;&nbsp; ├── name|string|true|&nbsp;|名称
&nbsp;&nbsp; ├── email|string|true|&nbsp;|邮箱<br/>测试继承默认分组的group
&nbsp;&nbsp; ├── mobile|string|true|&nbsp;|电话
&nbsp;&nbsp; └── address|string|true|&nbsp;|地址

**Request-body-example:**
``` json
{
  "address": "OfSvIkyhjP",
  "name": "lrJY4I2fY",
  "mobile": "gTRvZd",
  "id": 6561,
  "email": "a9Rv"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "nuLtq",
  "code": "geUsEA",
  "success": false,
  "message": "IFU63",
  "timestamp": "hK"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/validator/testSave --data '{
  "address": "OfSvIkyhjP",
  "name": "lrJY4I2fY",
  "mobile": "gTRvZd",
  "id": 6561,
  "email": "a9Rv"
}'
```

## 11.测试更新&nbsp;

**URL:** http://localhost/validator/testUpdate

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── collect|object|true|&nbsp;|
&nbsp;&nbsp; ├── id|int64|true|&nbsp;|主键id
&nbsp;&nbsp; ├── name|string|true|&nbsp;|名称
&nbsp;&nbsp; ├── email|string|true|&nbsp;|邮箱<br/>测试继承默认分组的group
&nbsp;&nbsp; ├── mobile|string|true|&nbsp;|电话
&nbsp;&nbsp; └── address|string|true|&nbsp;|地址

**Request-body-example:**
``` json
{
  "address": "i",
  "name": "gYHF",
  "mobile": "Ickzd0hR",
  "id": 9540,
  "email": "2kVQR"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "NzU",
  "code": "QxPJ9",
  "success": false,
  "message": "AKoFdD",
  "timestamp": "YN4IFUSIJl"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/validator/testUpdate --data '{
  "address": "i",
  "name": "gYHF",
  "mobile": "Ickzd0hR",
  "id": 9540,
  "email": "2kVQR"
}'
```

## 12.分页查询&nbsp;

**URL:** http://localhost/validator/list

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── t|object|true|&nbsp;|

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|object|&nbsp;


**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/validator/list
```

# 测试深层级map&nbsp;

## 1.测试&nbsp;

**URL:** http://localhost/nested/test

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
│&nbsp;&nbsp; ├── name|string|名称&nbsp;
│&nbsp;&nbsp; ├── sex|string|性别&nbsp;
│&nbsp;&nbsp; ├── oneVOList|array&lt;object&gt;|第一个嵌套&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── address|string|地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── map|map&lt;string, object&gt;|一个map&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── child|array&lt;object&gt;|第二个嵌套&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── address|string|地址&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── map|map&lt;string, object&gt;|一个map&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── child|array&lt;object&gt;|第二个嵌套&nbsp;
│&nbsp;&nbsp; └── nestedTwoVOList|array&lt;object&gt;|aaa&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── address|string|地址&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── map|map&lt;string, object&gt;|一个map&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; └── child|array&lt;object&gt;|第二个嵌套&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── address|string|地址&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── map|map&lt;string, object&gt;|一个map&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; └── child|array&lt;object&gt;|第二个嵌套&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "lG2WzUaVU",
  "code": "aZp8M8VGN",
  "data": {
    "nestedTwoVOList": [
      {
        "address": "VG7iarIS",
        "map": {
          "null": {}
        },
        "child": [
          {
            "address": "oP",
            "map": {
              "null": {}
            },
            "child": []
          }
        ]
      }
    ],
    "sex": "CCi",
    "name": "p",
    "oneVOList": [
      {
        "address": "a",
        "map": {
          "null": {}
        },
        "child": [
          {
            "address": "As",
            "map": {
              "null": {}
            },
            "child": []
          }
        ]
      }
    ]
  },
  "success": false,
  "message": "Wi9LnodA",
  "timestamp": "iGFJ"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/nested/test
```

# 枚举参数测试&nbsp;

## 1.获取枚举参数1&nbsp;

**URL:** http://localhost/enum/tt

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── simpleEnum|enum|&nbsp;|&nbsp;|RED<br/>BLUE&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"UFm6j"
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/enum/tt --data 'simpleEnum=BLUE'
```

## 2.获取枚举参数2&nbsp;

**URL:** http://localhost/enum0/{orderEnum}

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── orderEnum|enum|true|&nbsp;|WAIT_PAY("0", "等待支付") - 描述1<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"z5SMUmD"
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/enum0/PAID
```

## 3.获取枚举参数3&nbsp;

**URL:** http://localhost/enum/{simpleEnum}

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── simpleEnum|enum|true|&nbsp;|RED<br/>BLUE

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"RgB3Hcx"
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/enum/BLUE
```

## 4.获取枚举参数4(json)&nbsp;

**URL:** http://localhost/enum/test1

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── order|object|true|&nbsp;|简单枚举<br/>
&nbsp;&nbsp; ├── orderId|int32|&nbsp;|0|订单id&nbsp;
&nbsp;&nbsp; ├── orderType|enum|&nbsp;|&nbsp;|订单类型<br/>WAIT_PAY("0", "等待支付") - 描述1<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")&nbsp;
&nbsp;&nbsp; ├── testSee|string|&nbsp;|&nbsp;|测试订单类型&nbsp;
&nbsp;&nbsp; └── orderEnums|array&lt;enum&gt;|&nbsp;|&nbsp;|订单类型数组&nbsp;

**Request-body-example:**
``` json
{
  "orderEnums": [
    "WAIT_PAY"
  ],
  "orderType": "WAIT_PAY",
  "orderId": 0,
  "testSee": "GMNcpHud"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"wazKlxnTy"
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/enum/test1 --data '{
  "orderEnums": [
    "WAIT_PAY"
  ],
  "orderType": "WAIT_PAY",
  "orderId": 0,
  "testSee": "GMNcpHud"
}'
```

## 5.获取枚举参数5&nbsp;

**URL:** http://localhost/enum/test2

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── order|object|&nbsp;|&nbsp;|简单枚举<br/>&nbsp;
&nbsp;&nbsp; ├── orderId|int32|&nbsp;|0|订单id&nbsp;
&nbsp;&nbsp; ├── orderType|enum|&nbsp;|&nbsp;|订单类型<br/>WAIT_PAY("0", "等待支付") - 描述1<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")&nbsp;
&nbsp;&nbsp; ├── testSee|string|&nbsp;|&nbsp;|测试订单类型&nbsp;
&nbsp;&nbsp; └── orderEnums|array&lt;enum&gt;|&nbsp;|&nbsp;|订单类型数组&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── orderId|int32|订单id&nbsp;
├── orderType|enum|订单类型<br/>WAIT_PAY("0", "等待支付") - 描述1<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")&nbsp;
├── testSee|string|测试订单类型&nbsp;
└── orderEnums|array&lt;enum&gt;|订单类型数组&nbsp;

**Response-example:**
``` json
{
  "orderEnums": [
    "WAIT_PAY"
  ],
  "orderType": "WAIT_PAY",
  "orderId": 0,
  "testSee": "qY"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/enum/test2 --data 'orderEnums=WAIT_PAY&orderType=WAIT_PAY&orderId=0&testSee=QX8Ey'
```

## 6.枚举响应&nbsp;

**URL:** http://localhost/enum/resp

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|enum|test<br/>RED<br/>BLUE&nbsp;

**Response-example:**
``` json
"BLUE"
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/enum/resp
```

## 7.测试枚举array<br/>https://github.com/smart-doc-group/smart-doc/issues/254&nbsp;

**URL:** http://localhost/enum/testArray

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── enums|array|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; └── &nbsp;|enum|&nbsp;|&nbsp;|订单状态<br/>WAIT_PAY("0", "等待支付") - 描述1<br/>PAID("1", "已支付")<br/>EXPIRED("2","已经失效")&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"zu6hiyICL"
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/enum/testArray --data 'enums=WAIT_PAY'
```

## 8.测试枚举list&nbsp;

**URL:** http://localhost/enum/testList

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── enums|array&lt;enum&gt;|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"0BBo"
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/enum/testList --data 'enums=WAIT_PAY'
```

## 9.测试@see&nbsp;

**URL:** http://localhost/enum/see

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── enums|string|&nbsp;|&nbsp;|enum<br/>&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"cP6vBhBw"
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/enum/see --data 'enums=Zmm'
```

# 异步返回信息测试&nbsp;

## 1.返回Callable&lt;CommonResult&gt;&nbsp;

**URL:** http://localhost/testCallable

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "zynA8wahZ",
  "code": "B",
  "success": false,
  "message": "k3hH",
  "timestamp": "U"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/testCallable
```

## 2.返回DeferredResult&lt;CommonResult&lt;String&gt;&gt;&nbsp;

**URL:** http://localhost/async-deferredresult

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "h2shrz",
  "code": "w",
  "data": "nqpF",
  "success": false,
  "message": "ik",
  "timestamp": "75ZNTBiF"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/async-deferredresult
```

## 3.返回WebAsyncTask&lt;CommonResult&gt;&nbsp;

**URL:** http://localhost/WebAsync/timeout

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "HNwbs31j3A",
  "code": "LbIkS",
  "success": false,
  "message": "UobgCZ",
  "timestamp": "4"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/WebAsync/timeout
```

## 4.返回Future&lt;CommonResult&lt;String&gt;&gt;&nbsp;

**URL:** http://localhost/future

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "XEJphovb",
  "code": "lbP",
  "data": "HkT",
  "success": false,
  "message": "e8MbCCTZu3",
  "timestamp": "36VM"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/future
```

## 5.返回CompletableFuture&lt;CommonResult&lt;String&gt;&gt;&nbsp;

**URL:** http://localhost/completableFuture

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "Lx3x",
  "code": "xsCBGVmr",
  "data": "X6tKD6WY",
  "success": false,
  "message": "yAu",
  "timestamp": "Gz"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/completableFuture
```

# java泛型解析测试&nbsp;

## 1.测试多泛型1&nbsp;

**URL:** http://localhost/generics/test1

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── test|string|托尔斯泰&nbsp;
├── value|object|value&nbsp;
│&nbsp;&nbsp; ├── AGE|int32|&nbsp;
│&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;
│&nbsp;&nbsp; ├── gender|enum|性别<br/>WOMAN(0,"女人\nwewew")<br/>MAN(2,"男人")&nbsp;
│&nbsp;&nbsp; ├── simpleEnum|enum|简单枚举<br/>RED<br/>BLUE&nbsp;
│&nbsp;&nbsp; ├── username|string|用户名<br/>测试分隔注释&nbsp;
│&nbsp;&nbsp; ├── password|string|密码&nbsp;
│&nbsp;&nbsp; ├── passwordssss|array|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; ├── mobile|string|电话&nbsp;
│&nbsp;&nbsp; ├── role|object|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; ├── roles|array&lt;object&gt;|用户角色信息&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; ├── extend|map&lt;string, string&gt;|用户扩展项&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; └── listMap|array&lt;map&lt;string, string&gt;&gt;|ListMap效果展示&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; └── &nbsp;|string|&nbsp;
└── key|object|key&nbsp;
&nbsp;&nbsp; ├── roleId|int32|角色id&nbsp;
&nbsp;&nbsp; ├── roleName|string|角色名称&nbsp;
&nbsp;&nbsp; └── age|int32|年龄&nbsp;

**Response-example:**
``` json
{
  "test": "yHTF74",
  "value": {
    "passwordssss": [
      "4E"
    ],
    "role": {
      "createBy": "iZlj4Y2cT",
      "createTime": "Apr 28, 2059, 5:18:22 AM",
      "updateBy": "MpCL",
      "roleId": "OW",
      "roleName": "l8cLO6Bl",
      "updateTime": "2021-08-06 04:02:56",
      "id": "KA",
      "delFlag": 5210,
      "userId": "X"
    },
    "gender": "MAN",
    "nickName": "Fsyr",
    "listMap": [
      {
        "null": "BkvxXZyw"
      }
    ],
    "roles": [
      {
        "createBy": "W",
        "createTime": "May 22, 2037, 11:44:29 AM",
        "updateBy": "WLXq",
        "roleId": "LWL6QYh",
        "roleName": "dv",
        "updateTime": "2046-07-29 13:24:21",
        "id": "fRxtuU",
        "delFlag": 1685,
        "userId": "2"
      }
    ],
    "mobile": "qB",
    "extend": {
      "null": "w6"
    },
    "password": "qNo0o",
    "MAX_SPEED": "120",
    "simpleEnum": "BLUE",
    "AGE": "100",
    "username": "k"
  },
  "key": {
    "roleId": 6863,
    "roleName": "P92iHY",
    "age": 1015
  }
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/generics/test1
```

## 2.测试多泛型2&nbsp;

**URL:** http://localhost/generics/test2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|author: hcy<br/>version: 1.0.0V<br/>date:  2019/12/5 14:36<br/>description: 分页返回工具类&nbsp;
├── total|int32|总条数&nbsp;
├── other|object|其他信息&nbsp;
│&nbsp;&nbsp; ├── AGE|int32|&nbsp;
│&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;
│&nbsp;&nbsp; ├── gender|enum|性别<br/>WOMAN(0,"女人\nwewew")<br/>MAN(2,"男人")&nbsp;
│&nbsp;&nbsp; ├── simpleEnum|enum|简单枚举<br/>RED<br/>BLUE&nbsp;
│&nbsp;&nbsp; ├── username|string|用户名<br/>测试分隔注释&nbsp;
│&nbsp;&nbsp; ├── password|string|密码&nbsp;
│&nbsp;&nbsp; ├── passwordssss|array|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
│&nbsp;&nbsp; ├── mobile|string|电话&nbsp;
│&nbsp;&nbsp; ├── role|object|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; ├── roles|array&lt;object&gt;|用户角色信息&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|自增编号&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|创建人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|创建时间&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|修改人&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|删除标记[1表示已删除，默认值0]&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|测试数据&nbsp;
│&nbsp;&nbsp; ├── extend|map&lt;string, string&gt;|用户扩展项&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; └── listMap|array&lt;map&lt;string, string&gt;&gt;|ListMap效果展示&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; └── &nbsp;|string|&nbsp;
└── rows|array&lt;object&gt;|数据列表&nbsp;
&nbsp;&nbsp; ├── roleId|int32|角色id&nbsp;
&nbsp;&nbsp; ├── roleName|string|角色名称&nbsp;
&nbsp;&nbsp; └── age|int32|年龄&nbsp;

**Response-example:**
``` json
{
  "total": 0,
  "other": {
    "passwordssss": [
      "A6q"
    ],
    "role": {
      "createBy": "8nFY5hL",
      "createTime": "Oct 15, 2095, 12:14:07 AM",
      "updateBy": "2dvsxIf",
      "roleId": "633cw",
      "roleName": "1KR7kIwa95",
      "updateTime": "1998-07-20 09:49:05",
      "id": "IPd",
      "delFlag": 6830,
      "userId": "7wuxYBVlGD"
    },
    "gender": "MAN",
    "nickName": "14d",
    "listMap": [
      {
        "null": "EUt7uMoEq"
      }
    ],
    "roles": [
      {
        "createBy": "GC4bGG",
        "createTime": "Aug 14, 1989, 1:35:53 PM",
        "updateBy": "UNr",
        "roleId": "pYTO5",
        "roleName": "O0",
        "updateTime": "2094-02-06 22:23:35",
        "id": "V",
        "delFlag": 9179,
        "userId": "phZ"
      }
    ],
    "mobile": "2m",
    "extend": {
      "null": "htV1iD"
    },
    "password": "noJQDp",
    "MAX_SPEED": "120",
    "simpleEnum": "BLUE",
    "AGE": "100",
    "username": "9Yfk"
  },
  "rows": [
    {
      "roleId": 2608,
      "roleName": "rjyJbT",
      "age": 8731
    }
  ]
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/generics/test2
```

## 3.测试单泛型嵌套&nbsp;

**URL:** http://localhost/generics/test3

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|角色&nbsp;
│&nbsp;&nbsp; ├── roleId|int32|角色id&nbsp;
│&nbsp;&nbsp; ├── roleName|string|角色名称&nbsp;
│&nbsp;&nbsp; └── age|int32|年龄&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "Ffr7k9JWt",
  "code": "yxvTRg",
  "data": {
    "roleId": 3681,
    "roleName": "PIE",
    "age": 5606
  },
  "success": false,
  "message": "H4brcd",
  "timestamp": "8Yb8W5ccZ3"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/generics/test3
```

# json文件配置全局参数测试&nbsp;

## 1.get请求测试query参数&nbsp;

**URL:** http://localhost/configQueryParamGet

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── configQueryParam|string|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/configQueryParamGet --data 'configQueryParam=1c9'
```

## 2.post请求测试query参数&nbsp;

**URL:** http://localhost/configQueryParamPost

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── configQueryParam|string|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -i http://localhost/configQueryParamPost --data 'configQueryParam=ctp'
```

## 3.get请求测试query参数和path参数&nbsp;

**URL:** http://localhost/configParamGet/{configPathParam}

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── configPathParam|string|true|&nbsp;|

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── configQueryParam|string|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/configParamGet/NWaxfgkCS5 --data 'configQueryParam=gbXQIld'
```

## 4.post请求测试query参数和path参数&nbsp;

**URL:** http://localhost/configParamPost/{configPathParam}

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── configPathParam|string|true|&nbsp;|

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── configQueryParam|string|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -i http://localhost/configParamPost/V --data 'configQueryParam=gK'
```

# 请求类型测试&nbsp;

## 1.测试GetMapping 无参数&nbsp;

**URL:** http://localhost/getMapping1

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/getMapping1
```

## 2.测试PostMapping 无参数&nbsp;

**URL:** http://localhost/PostMapping1

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -i http://localhost/PostMapping1
```

## 3.测试PutMapping 无参数&nbsp;

**URL:** http://localhost/PutMapping1

**Type:** PUT

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X PUT -i http://localhost/PutMapping1
```

## 4.DeleteMapping 无参数&nbsp;

**URL:** http://localhost/DeleteMapping1

**Type:** DELETE

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X DELETE -i http://localhost/DeleteMapping1
```

## 5.测试GetMapping&nbsp;

**URL:** http://localhost/getMapping

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── userId|int64|true|<br/>		<br/>		<br/><br/>				<br/>|userId

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/getMapping --data 'userId=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A'
```

## 6.测试PostMapping json&nbsp;

**URL:** http://localhost/postMapping

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|user│com.power.doc.entity.UserTest
&nbsp;&nbsp; ├── testObject|object|&nbsp;|&nbsp;|测试object&nbsp;
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名&nbsp;
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码&nbsp;
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话&nbsp;
&nbsp;&nbsp; ├── email|string|&nbsp;|&nbsp;|邮箱&nbsp;
&nbsp;&nbsp; ├── address|string|&nbsp;|&nbsp;|地址&nbsp;
&nbsp;&nbsp; ├── sex|int32|&nbsp;|&nbsp;|性别(男1 女 2)&nbsp;
&nbsp;&nbsp; ├── avatar|string|&nbsp;|https://s1.ax1x.com/2018/05/19/CcdVQP.png|&nbsp;
&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型&nbsp;
&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|状态&nbsp;
&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|描述&nbsp;
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有角色&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|角色名 以ROLE_开头&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── defaultRole|boolean|&nbsp;|&nbsp;|是否为注册默认角色&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|拥有权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有的权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;

**Request-body-example:**
``` json
{
  "address": "cpWj1Nimg6",
  "nickName": "xPqqn",
  "sex": 6803,
  "roles": [
    {
      "createBy": "bszEYJz",
      "defaultRole": false,
      "createTime": "Nov 19, 1998, 9:28:22 AM",
      "updateBy": "GMuN9",
      "permissions": [
        {
          "level": 1500,
          "icon": "Ny",
          "description": "FeDMI0",
          "updateTime": "2056-10-30 17:41:30",
          "type": 2832,
          "title": "aS",
          "delFlag": 40,
          "parentId": "T0n",
          "permTypes": [
            "y"
          ],
          "path": "HUqVmB57vk",
          "component": "Qmfcofwhx",
          "expand": "true",
          "createBy": "Bg",
          "buttonType": "c",
          "children": [
            {
              "level": 9672,
              "icon": "rgm",
              "description": "Foxr",
              "updateTime": "2067-11-24 08:22:30",
              "type": 2779,
              "title": "pp",
              "delFlag": 3034,
              "parentId": "BM4DXSc",
              "permTypes": [
                "uZsyoD"
              ],
              "path": "57V",
              "component": "Yl6db",
              "expand": "true",
              "createBy": "kp4h",
              "buttonType": "pvrmxTu",
              "children": [],
              "createTime": "May 5, 1974, 11:23:31 PM",
              "updateBy": "hRoXi",
              "sortOrder": 9892.47,
              "name": "U9zJ3R",
              "checked": "false",
              "id": "lS2BY",
              "selected": "false",
              "status": 4116
            }
          ],
          "createTime": "May 14, 2074, 12:31:18 AM",
          "updateBy": "vxLf2xNeiw",
          "sortOrder": 3336.6,
          "name": "2ai9xomjny",
          "checked": "false",
          "id": "8FlYOKW",
          "selected": "false",
          "status": 9233
        }
      ],
      "name": "f",
      "updateTime": "1993-05-12 04:10:59",
      "id": "n85Xo4",
      "delFlag": 9212
    }
  ],
  "mobile": "Lp1hlpjGdy",
  "description": "Un4q",
  "updateTime": "1970-11-15 09:22:57",
  "avatar": "https://s1.ax1x.com/2018/05/19/CcdVQP.png",
  "type": 6953,
  "delFlag": 8065,
  "password": "tWIt",
  "createBy": "r",
  "createTime": "Dec 31, 2055, 9:31:32 AM",
  "updateBy": "o0UW",
  "permissions": [
    {
      "level": 504,
      "icon": "nKspxtb",
      "description": "ZhYzZ",
      "updateTime": "2043-02-27 12:58:37",
      "type": 2285,
      "title": "aqlJt2w",
      "delFlag": 4634,
      "parentId": "jh37kWzCZV",
      "permTypes": [
        "UWk4"
      ],
      "path": "0WV",
      "component": "BP",
      "expand": "true",
      "createBy": "r",
      "buttonType": "ueU",
      "children": [
        {
          "level": 8151,
          "icon": "Bv7Z8z",
          "description": "2BGPHC",
          "updateTime": "2064-08-22 15:49:40",
          "type": 3910,
          "title": "TE9cv",
          "delFlag": 2029,
          "parentId": "0YXD9vQo",
          "permTypes": [
            "DbDXwZWT"
          ],
          "path": "h4h6",
          "component": "UCt0iOg2Wx",
          "expand": "true",
          "createBy": "9gSl1fV",
          "buttonType": "PPEdA",
          "children": [
            {
              "level": 1167,
              "icon": "bES",
              "description": "m3gmQBeKy",
              "updateTime": "2052-03-22 20:35:58",
              "type": 4906,
              "title": "ijCDvgj5Ew",
              "delFlag": 4588,
              "parentId": "MWtpZdP",
              "permTypes": [
                "S4osJ2T9B"
              ],
              "path": "vMgSs",
              "component": "nhIyxINA",
              "expand": "true",
              "createBy": "TMEpWNQLIH",
              "buttonType": "E",
              "children": [],
              "createTime": "Sep 27, 2073, 9:31:13 PM",
              "updateBy": "0tI",
              "sortOrder": 8839.76,
              "name": "aRkiGQC8E",
              "checked": "false",
              "id": "1",
              "selected": "false",
              "status": 3612
            }
          ],
          "createTime": "Jun 13, 2088, 7:48:53 PM",
          "updateBy": "EufKlhw",
          "sortOrder": 2431.62,
          "name": "pYxeFb",
          "checked": "false",
          "id": "YTjuULem",
          "selected": "false",
          "status": 3409
        }
      ],
      "createTime": "Feb 26, 2036, 3:06:55 AM",
      "updateBy": "lgjxsXn",
      "sortOrder": 2264.03,
      "name": "c6OO",
      "checked": "false",
      "id": "3rYfURF2",
      "selected": "false",
      "status": 1749
    }
  ],
  "testObject": {},
  "id": "8",
  "email": "7t7e2V",
  "username": "YV",
  "status": 3945
}
```

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/postMapping --data '{
  "address": "cpWj1Nimg6",
  "nickName": "xPqqn",
  "sex": 6803,
  "roles": [
    {
      "createBy": "bszEYJz",
      "defaultRole": false,
      "createTime": "Nov 19, 1998, 9:28:22 AM",
      "updateBy": "GMuN9",
      "permissions": [
        {
          "level": 1500,
          "icon": "Ny",
          "description": "FeDMI0",
          "updateTime": "2056-10-30 17:41:30",
          "type": 2832,
          "title": "aS",
          "delFlag": 40,
          "parentId": "T0n",
          "permTypes": [
            "y"
          ],
          "path": "HUqVmB57vk",
          "component": "Qmfcofwhx",
          "expand": "true",
          "createBy": "Bg",
          "buttonType": "c",
          "children": [
            {
              "level": 9672,
              "icon": "rgm",
              "description": "Foxr",
              "updateTime": "2067-11-24 08:22:30",
              "type": 2779,
              "title": "pp",
              "delFlag": 3034,
              "parentId": "BM4DXSc",
              "permTypes": [
                "uZsyoD"
              ],
              "path": "57V",
              "component": "Yl6db",
              "expand": "true",
              "createBy": "kp4h",
              "buttonType": "pvrmxTu",
              "children": [],
              "createTime": "May 5, 1974, 11:23:31 PM",
              "updateBy": "hRoXi",
              "sortOrder": 9892.47,
              "name": "U9zJ3R",
              "checked": "false",
              "id": "lS2BY",
              "selected": "false",
              "status": 4116
            }
          ],
          "createTime": "May 14, 2074, 12:31:18 AM",
          "updateBy": "vxLf2xNeiw",
          "sortOrder": 3336.6,
          "name": "2ai9xomjny",
          "checked": "false",
          "id": "8FlYOKW",
          "selected": "false",
          "status": 9233
        }
      ],
      "name": "f",
      "updateTime": "1993-05-12 04:10:59",
      "id": "n85Xo4",
      "delFlag": 9212
    }
  ],
  "mobile": "Lp1hlpjGdy",
  "description": "Un4q",
  "updateTime": "1970-11-15 09:22:57",
  "avatar": "https://s1.ax1x.com/2018/05/19/CcdVQP.png",
  "type": 6953,
  "delFlag": 8065,
  "password": "tWIt",
  "createBy": "r",
  "createTime": "Dec 31, 2055, 9:31:32 AM",
  "updateBy": "o0UW",
  "permissions": [
    {
      "level": 504,
      "icon": "nKspxtb",
      "description": "ZhYzZ",
      "updateTime": "2043-02-27 12:58:37",
      "type": 2285,
      "title": "aqlJt2w",
      "delFlag": 4634,
      "parentId": "jh37kWzCZV",
      "permTypes": [
        "UWk4"
      ],
      "path": "0WV",
      "component": "BP",
      "expand": "true",
      "createBy": "r",
      "buttonType": "ueU",
      "children": [
        {
          "level": 8151,
          "icon": "Bv7Z8z",
          "description": "2BGPHC",
          "updateTime": "2064-08-22 15:49:40",
          "type": 3910,
          "title": "TE9cv",
          "delFlag": 2029,
          "parentId": "0YXD9vQo",
          "permTypes": [
            "DbDXwZWT"
          ],
          "path": "h4h6",
          "component": "UCt0iOg2Wx",
          "expand": "true",
          "createBy": "9gSl1fV",
          "buttonType": "PPEdA",
          "children": [
            {
              "level": 1167,
              "icon": "bES",
              "description": "m3gmQBeKy",
              "updateTime": "2052-03-22 20:35:58",
              "type": 4906,
              "title": "ijCDvgj5Ew",
              "delFlag": 4588,
              "parentId": "MWtpZdP",
              "permTypes": [
                "S4osJ2T9B"
              ],
              "path": "vMgSs",
              "component": "nhIyxINA",
              "expand": "true",
              "createBy": "TMEpWNQLIH",
              "buttonType": "E",
              "children": [],
              "createTime": "Sep 27, 2073, 9:31:13 PM",
              "updateBy": "0tI",
              "sortOrder": 8839.76,
              "name": "aRkiGQC8E",
              "checked": "false",
              "id": "1",
              "selected": "false",
              "status": 3612
            }
          ],
          "createTime": "Jun 13, 2088, 7:48:53 PM",
          "updateBy": "EufKlhw",
          "sortOrder": 2431.62,
          "name": "pYxeFb",
          "checked": "false",
          "id": "YTjuULem",
          "selected": "false",
          "status": 3409
        }
      ],
      "createTime": "Feb 26, 2036, 3:06:55 AM",
      "updateBy": "lgjxsXn",
      "sortOrder": 2264.03,
      "name": "c6OO",
      "checked": "false",
      "id": "3rYfURF2",
      "selected": "false",
      "status": 1749
    }
  ],
  "testObject": {},
  "id": "8",
  "email": "7t7e2V",
  "username": "YV",
  "status": 3945
}'
```

## 7.测试PostMapping表单&nbsp;

**URL:** http://localhost/postMapping2

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|&nbsp;|&nbsp;|user&nbsp;
&nbsp;&nbsp; ├── testObject|object|&nbsp;|&nbsp;|测试object&nbsp;
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名&nbsp;
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码&nbsp;
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话&nbsp;
&nbsp;&nbsp; ├── email|string|&nbsp;|&nbsp;|邮箱&nbsp;
&nbsp;&nbsp; ├── address|string|&nbsp;|&nbsp;|地址&nbsp;
&nbsp;&nbsp; ├── sex|int32|&nbsp;|&nbsp;|性别(男1 女 2)&nbsp;
&nbsp;&nbsp; ├── avatar|string|&nbsp;|https://s1.ax1x.com/2018/05/19/CcdVQP.png|&nbsp;
&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型&nbsp;
&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|状态&nbsp;
&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|描述&nbsp;
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有角色&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|角色名 以ROLE_开头&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── defaultRole|boolean|&nbsp;|&nbsp;|是否为注册默认角色&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|拥有权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有的权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -i http://localhost/postMapping2 --data 'permissions[0].children[0].buttonType=wO06KYhL&roles[0].permissions[0].children[0].description=QeUBy&roles[0].updateBy=pT84&permissions[0].children[0].children[0].component=7h1Li&permissions[0].children[0].children[0].type=5582&type=6914&permissions[0].title=fgHzWcDlc&roles[0].permissions[0].level=7299&roles[0].permissions[0].checked=false&permissions[0].children[0].path=jF&password=6&roles[0].id=l2wY9k&permissions[0].buttonType=FgToeg8J&permissions[0].children[0].children[0].selected=false&permissions[0].status=9910&id=vfI1SR&permissions[0].children[0].createTime=Wed+Apr+17+09%3A43%3A09+CST+2058&permissions[0].children[0].children[0].createTime=Thu+Dec+21+04%3A03%3A33+CST+2045&roles[0].permissions[0].children[0].selected=false&permissions[0].icon=ApJRU3&permissions[0].parentId=TGn65TQ&permissions[0].children[0].children[0].level=1578&permissions[0].children[0].permTypes=XlKS&roles[0].permissions[0].updateTime=1990-04-26+01%3A09%3A50&roles[0].permissions[0].parentId=9s7&roles[0].permissions[0].expand=true&permissions[0].name=0z&permissions[0].permTypes=0mkJ&permissions[0].children[0].children[0].path=682vd&roles[0].permissions[0].children[0].status=1167&permissions[0].children[0].children[0].buttonType=pPoHyiCNzq&status=1511&permissions[0].updateTime=2020-05-13+07%3A14%3A12&roles[0].createTime=Fri+Jun+15+18%3A14%3A10+CST+2085&roles[0].createBy=FZruD5&permissions[0].path=fEi9wgd4uj&permissions[0].children[0].children[0].checked=false&roles[0].permissions[0].children[0].permTypes=R&roles[0].permissions[0].children[0].type=4296&permissions[0].children[0].children[0].parentId=kBz7aP4Q&roles[0].permissions[0].description=5&roles[0].permissions[0].children[0].checked=false&delFlag=3818&roles[0].permissions[0].sortOrder=1860.93&roles[0].updateTime=2008-07-10+04%3A49%3A33&permissions[0].children[0].createBy=ZC&roles[0].permissions[0].delFlag=1859&email=KRxK&roles[0].permissions[0].children[0].level=8437&permissions[0].sortOrder=8649.22&address=P&sex=621&roles[0].permissions[0].children[0].name=lrsHN&updateTime=2015-03-21+14%3A15%3A41&avatar=https%3A%2F%2Fs1.ax1x.com%2F2018%2F05%2F19%2FCcdVQP.png&permissions[0].type=8771&permissions[0].children[0].children[0].permTypes=Co&roles[0].permissions[0].id=MILNvUI&permissions[0].createTime=Wed+Mar+25+01%3A47%3A52+CST+2099&roles[0].permissions[0].children[0].component=zSnUA8esp&createTime=Fri+Jan+17+23%3A22%3A59+CST+2042&roles[0].permissions[0].children[0].parentId=cOmFhxR&permissions[0].children[0].delFlag=7871&permissions[0].checked=false&roles[0].permissions[0].children[0].icon=QXld&roles[0].permissions[0].children[0].createBy=Z&roles[0].permissions[0].status=4344&permissions[0].children[0].children[0].sortOrder=6802.19&permissions[0].createBy=hR9K7Ka9&roles[0].permissions[0].children[0].id=dRT7fx&permissions[0].children[0].children[0].updateTime=2096-07-01+12%3A20%3A27&permissions[0].children[0].parentId=noQ7dS4&roles[0].permissions[0].children[0].buttonType=f&roles[0].name=Xp&roles[0].permissions[0].children[0].sortOrder=6853.08&permissions[0].children[0].children[0].updateBy=FfkVUX&roles[0].permissions[0].name=f5nNBM&permissions[0].children[0].name=f9s&permissions[0].children[0].updateBy=K&nickName=Jq6cj&permissions[0].expand=true&permissions[0].children[0].description=aTDpOkkMv&permissions[0].children[0].children[0].delFlag=4896&permissions[0].children[0].level=4949&roles[0].permissions[0].createBy=2Ory&roles[0].permissions[0].icon=Ma&permissions[0].children[0].icon=m5vGzOm6e&roles[0].permissions[0].component=L8UoxQN&roles[0].permissions[0].title=e&roles[0].permissions[0].createTime=Fri+Nov+14+15%3A29%3A10+CST+2098&permissions[0].children[0].children[0].id=E2SJ&roles[0].permissions[0].children[0].expand=true&permissions[0].children[0].component=QgHKGZ&permissions[0].children[0].id=o8ug40z&permissions[0].component=ST&roles[0].permissions[0].children[0].createTime=Tue+Aug+21+08%3A58%3A52+CST+2040&roles[0].permissions[0].permTypes=zk&permissions[0].updateBy=NmO&roles[0].defaultRole=false&permissions[0].children[0].children[0].status=5716&permissions[0].children[0].title=8&roles[0].permissions[0].children[0].title=Djhv4WMY&description=Urir4fYN&roles[0].permissions[0].children[0].updateTime=1974-04-27+07%3A13%3A51&permissions[0].delFlag=8293&permissions[0].children[0].children[0].icon=BcKxowRt&permissions[0].children[0].children[0].description=GQe&roles[0].permissions[0].children[0].path=7EYKtNXe&updateBy=PS3&roles[0].permissions[0].updateBy=FhGwYll0zP&roles[0].permissions[0].children[0].updateBy=05vbPu&permissions[0].children[0].updateTime=2091-08-23+00%3A37%3A10&permissions[0].children[0].children[0].name=oi9&roles[0].permissions[0].buttonType=oiY&permissions[0].selected=false&roles[0].permissions[0].path=4OZOq7mqEo&permissions[0].id=EZYmL&mobile=SLabwdO&permissions[0].children[0].status=148&permissions[0].children[0].expand=true&permissions[0].children[0].sortOrder=8171.5&roles[0].permissions[0].selected=false&permissions[0].children[0].selected=false&roles[0].delFlag=4301&permissions[0].children[0].children[0].createBy=QWoIr6NdT&createBy=MkmPHN&permissions[0].children[0].children[0].expand=true&permissions[0].children[0].type=7842&permissions[0].children[0].children[0].title=GY9Ch8Nwp&roles[0].permissions[0].type=4144&permissions[0].level=9775&permissions[0].children[0].checked=false&permissions[0].description=ve7LoHlW&username=756w&roles[0].permissions[0].children[0].delFlag=9624'
```

## 8.测试PutMapping json&nbsp;

**URL:** http://localhost/putMapping

**Type:** PUT

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|user
&nbsp;&nbsp; ├── testObject|object|&nbsp;|&nbsp;|测试object&nbsp;
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名&nbsp;
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码&nbsp;
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话&nbsp;
&nbsp;&nbsp; ├── email|string|&nbsp;|&nbsp;|邮箱&nbsp;
&nbsp;&nbsp; ├── address|string|&nbsp;|&nbsp;|地址&nbsp;
&nbsp;&nbsp; ├── sex|int32|&nbsp;|&nbsp;|性别(男1 女 2)&nbsp;
&nbsp;&nbsp; ├── avatar|string|&nbsp;|https://s1.ax1x.com/2018/05/19/CcdVQP.png|&nbsp;
&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型&nbsp;
&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|状态&nbsp;
&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|描述&nbsp;
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有角色&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|角色名 以ROLE_开头&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── defaultRole|boolean|&nbsp;|&nbsp;|是否为注册默认角色&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|拥有权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有的权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;

**Request-body-example:**
``` json
{
  "address": "Aptli0",
  "nickName": "j3CPd",
  "sex": 2931,
  "roles": [
    {
      "createBy": "xrQYhjX",
      "defaultRole": true,
      "createTime": "Feb 19, 2025, 11:25:38 AM",
      "updateBy": "eN0",
      "permissions": [
        {
          "level": 7402,
          "icon": "MF8Gk6",
          "description": "Ja4fTcR9Vi",
          "updateTime": "1985-10-14 18:27:59",
          "type": 6167,
          "title": "R0gPUlf7",
          "delFlag": 1711,
          "parentId": "TNc47D4",
          "permTypes": [
            "pjIur"
          ],
          "path": "QLKnb8ia",
          "component": "gqtw4r",
          "expand": "true",
          "createBy": "s",
          "buttonType": "LexzZyYvS",
          "children": [
            {
              "level": 1534,
              "icon": "Y",
              "description": "FSc",
              "updateTime": "2000-07-25 10:31:06",
              "type": 15,
              "title": "yKNn",
              "delFlag": 13,
              "parentId": "MSls",
              "permTypes": [
                "0sa5P"
              ],
              "path": "7AdFXUzgve",
              "component": "PS1sIUlD",
              "expand": "true",
              "createBy": "Ty8FYs6R",
              "buttonType": "jKW",
              "children": [],
              "createTime": "May 11, 2060, 1:04:08 PM",
              "updateBy": "CF21rek3L",
              "sortOrder": 7029.9,
              "name": "LsRcIoelE",
              "checked": "false",
              "id": "9kG5HbdDrI",
              "selected": "false",
              "status": 7406
            }
          ],
          "createTime": "Feb 9, 2098, 8:38:21 AM",
          "updateBy": "0E",
          "sortOrder": 1014.1,
          "name": "wZdM1dqi4",
          "checked": "false",
          "id": "IoeToLN",
          "selected": "false",
          "status": 3713
        }
      ],
      "name": "3xksE",
      "updateTime": "2011-02-04 12:00:32",
      "id": "z1kdkkIYp",
      "delFlag": 2108
    }
  ],
  "mobile": "MAv",
  "description": "FQ",
  "updateTime": "2057-12-08 02:52:51",
  "avatar": "https://s1.ax1x.com/2018/05/19/CcdVQP.png",
  "type": 5417,
  "delFlag": 9306,
  "password": "5c0b7Ut8PU",
  "createBy": "A",
  "createTime": "Aug 13, 2029, 1:33:13 AM",
  "updateBy": "v54",
  "permissions": [
    {
      "level": 6196,
      "icon": "7Qi",
      "description": "SfWF4agqF",
      "updateTime": "2094-10-26 06:15:10",
      "type": 800,
      "title": "hOZXtu3V",
      "delFlag": 5053,
      "parentId": "Tqe",
      "permTypes": [
        "gXIdrybWI1"
      ],
      "path": "roqJ0",
      "component": "TWAJIi",
      "expand": "true",
      "createBy": "siq2teIF",
      "buttonType": "LZvE8Qr",
      "children": [
        {
          "level": 9242,
          "icon": "2VBMuXIV",
          "description": "E1l7nYlQ5w",
          "updateTime": "1999-08-30 13:42:21",
          "type": 3016,
          "title": "lwQE4",
          "delFlag": 3702,
          "parentId": "dMd",
          "permTypes": [
            "VemEfz"
          ],
          "path": "agnZ",
          "component": "VU",
          "expand": "true",
          "createBy": "xqHgJIpyg",
          "buttonType": "cBPZeBjuj",
          "children": [
            {
              "level": 5395,
              "icon": "Xy7y",
              "description": "ozuExmud",
              "updateTime": "1978-07-24 04:44:26",
              "type": 1331,
              "title": "P",
              "delFlag": 7277,
              "parentId": "NndC0xxmtj",
              "permTypes": [
                "TgBZhyXA0M"
              ],
              "path": "8THTL909",
              "component": "ZX",
              "expand": "true",
              "createBy": "pzr",
              "buttonType": "ro",
              "children": [],
              "createTime": "Apr 8, 1980, 1:39:52 PM",
              "updateBy": "Hvdy",
              "sortOrder": 3862.89,
              "name": "1w6nwUBZ",
              "checked": "false",
              "id": "ji61AXKfDM",
              "selected": "false",
              "status": 9237
            }
          ],
          "createTime": "Aug 24, 2033, 1:05:40 AM",
          "updateBy": "HP3",
          "sortOrder": 6321.21,
          "name": "HdKChb",
          "checked": "false",
          "id": "vWWErep",
          "selected": "false",
          "status": 3358
        }
      ],
      "createTime": "Jul 3, 2061, 3:05:54 AM",
      "updateBy": "PU3Bo",
      "sortOrder": 1714.0,
      "name": "VdvZ",
      "checked": "false",
      "id": "kh",
      "selected": "false",
      "status": 1958
    }
  ],
  "testObject": {},
  "id": "SD2QJHME8",
  "email": "6hk0Pk",
  "username": "Bg8i",
  "status": 3052
}
```

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X PUT -H 'Content-Type: application/json' -i http://localhost/putMapping --data '{
  "address": "Aptli0",
  "nickName": "j3CPd",
  "sex": 2931,
  "roles": [
    {
      "createBy": "xrQYhjX",
      "defaultRole": true,
      "createTime": "Feb 19, 2025, 11:25:38 AM",
      "updateBy": "eN0",
      "permissions": [
        {
          "level": 7402,
          "icon": "MF8Gk6",
          "description": "Ja4fTcR9Vi",
          "updateTime": "1985-10-14 18:27:59",
          "type": 6167,
          "title": "R0gPUlf7",
          "delFlag": 1711,
          "parentId": "TNc47D4",
          "permTypes": [
            "pjIur"
          ],
          "path": "QLKnb8ia",
          "component": "gqtw4r",
          "expand": "true",
          "createBy": "s",
          "buttonType": "LexzZyYvS",
          "children": [
            {
              "level": 1534,
              "icon": "Y",
              "description": "FSc",
              "updateTime": "2000-07-25 10:31:06",
              "type": 15,
              "title": "yKNn",
              "delFlag": 13,
              "parentId": "MSls",
              "permTypes": [
                "0sa5P"
              ],
              "path": "7AdFXUzgve",
              "component": "PS1sIUlD",
              "expand": "true",
              "createBy": "Ty8FYs6R",
              "buttonType": "jKW",
              "children": [],
              "createTime": "May 11, 2060, 1:04:08 PM",
              "updateBy": "CF21rek3L",
              "sortOrder": 7029.9,
              "name": "LsRcIoelE",
              "checked": "false",
              "id": "9kG5HbdDrI",
              "selected": "false",
              "status": 7406
            }
          ],
          "createTime": "Feb 9, 2098, 8:38:21 AM",
          "updateBy": "0E",
          "sortOrder": 1014.1,
          "name": "wZdM1dqi4",
          "checked": "false",
          "id": "IoeToLN",
          "selected": "false",
          "status": 3713
        }
      ],
      "name": "3xksE",
      "updateTime": "2011-02-04 12:00:32",
      "id": "z1kdkkIYp",
      "delFlag": 2108
    }
  ],
  "mobile": "MAv",
  "description": "FQ",
  "updateTime": "2057-12-08 02:52:51",
  "avatar": "https://s1.ax1x.com/2018/05/19/CcdVQP.png",
  "type": 5417,
  "delFlag": 9306,
  "password": "5c0b7Ut8PU",
  "createBy": "A",
  "createTime": "Aug 13, 2029, 1:33:13 AM",
  "updateBy": "v54",
  "permissions": [
    {
      "level": 6196,
      "icon": "7Qi",
      "description": "SfWF4agqF",
      "updateTime": "2094-10-26 06:15:10",
      "type": 800,
      "title": "hOZXtu3V",
      "delFlag": 5053,
      "parentId": "Tqe",
      "permTypes": [
        "gXIdrybWI1"
      ],
      "path": "roqJ0",
      "component": "TWAJIi",
      "expand": "true",
      "createBy": "siq2teIF",
      "buttonType": "LZvE8Qr",
      "children": [
        {
          "level": 9242,
          "icon": "2VBMuXIV",
          "description": "E1l7nYlQ5w",
          "updateTime": "1999-08-30 13:42:21",
          "type": 3016,
          "title": "lwQE4",
          "delFlag": 3702,
          "parentId": "dMd",
          "permTypes": [
            "VemEfz"
          ],
          "path": "agnZ",
          "component": "VU",
          "expand": "true",
          "createBy": "xqHgJIpyg",
          "buttonType": "cBPZeBjuj",
          "children": [
            {
              "level": 5395,
              "icon": "Xy7y",
              "description": "ozuExmud",
              "updateTime": "1978-07-24 04:44:26",
              "type": 1331,
              "title": "P",
              "delFlag": 7277,
              "parentId": "NndC0xxmtj",
              "permTypes": [
                "TgBZhyXA0M"
              ],
              "path": "8THTL909",
              "component": "ZX",
              "expand": "true",
              "createBy": "pzr",
              "buttonType": "ro",
              "children": [],
              "createTime": "Apr 8, 1980, 1:39:52 PM",
              "updateBy": "Hvdy",
              "sortOrder": 3862.89,
              "name": "1w6nwUBZ",
              "checked": "false",
              "id": "ji61AXKfDM",
              "selected": "false",
              "status": 9237
            }
          ],
          "createTime": "Aug 24, 2033, 1:05:40 AM",
          "updateBy": "HP3",
          "sortOrder": 6321.21,
          "name": "HdKChb",
          "checked": "false",
          "id": "vWWErep",
          "selected": "false",
          "status": 3358
        }
      ],
      "createTime": "Jul 3, 2061, 3:05:54 AM",
      "updateBy": "PU3Bo",
      "sortOrder": 1714.0,
      "name": "VdvZ",
      "checked": "false",
      "id": "kh",
      "selected": "false",
      "status": 1958
    }
  ],
  "testObject": {},
  "id": "SD2QJHME8",
  "email": "6hk0Pk",
  "username": "Bg8i",
  "status": 3052
}'
```

## 9.测试PutMapping表单&nbsp;

**URL:** http://localhost/putMapping2

**Type:** PUT

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|&nbsp;|&nbsp;|user&nbsp;
&nbsp;&nbsp; ├── testObject|object|&nbsp;|&nbsp;|测试object&nbsp;
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名&nbsp;
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码&nbsp;
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话&nbsp;
&nbsp;&nbsp; ├── email|string|&nbsp;|&nbsp;|邮箱&nbsp;
&nbsp;&nbsp; ├── address|string|&nbsp;|&nbsp;|地址&nbsp;
&nbsp;&nbsp; ├── sex|int32|&nbsp;|&nbsp;|性别(男1 女 2)&nbsp;
&nbsp;&nbsp; ├── avatar|string|&nbsp;|https://s1.ax1x.com/2018/05/19/CcdVQP.png|&nbsp;
&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型&nbsp;
&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|状态&nbsp;
&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|描述&nbsp;
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有角色&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|角色名 以ROLE_开头&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── defaultRole|boolean|&nbsp;|&nbsp;|是否为注册默认角色&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|拥有权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── permissions|array&lt;object&gt;|&nbsp;|&nbsp;|用户拥有的权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|&nbsp;|&nbsp;|菜单/权限名称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── level|int32|&nbsp;|&nbsp;|层级&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── type|int32|&nbsp;|&nbsp;|类型 0页面 1具体操作&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── title|string|&nbsp;|&nbsp;|菜单标题&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── path|string|&nbsp;|&nbsp;|页面路径/资源链接url&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── component|string|&nbsp;|&nbsp;|前端组件&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── icon|string|&nbsp;|&nbsp;|图标&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── buttonType|string|&nbsp;|&nbsp;|按钮权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── parentId|string|&nbsp;|&nbsp;|父id&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── description|string|&nbsp;|&nbsp;|说明备注&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── sortOrder|number|&nbsp;|&nbsp;|排序值&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── status|int32|&nbsp;|&nbsp;|是否启用 0启用 -1禁用&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── children|array&lt;object&gt;|&nbsp;|&nbsp;|子菜单/权限&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── permTypes|array&lt;string&gt;|&nbsp;|&nbsp;|页面拥有的权限类型&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── expand|boolean|&nbsp;|true|节点展开 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── checked|boolean|&nbsp;|false|是否勾选 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── selected|boolean|&nbsp;|false|是否选中 前端所需&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X PUT -i http://localhost/putMapping2 --data 'permissions[0].children[0].buttonType=hQaxjPH&roles[0].permissions[0].children[0].description=kZDzlC&roles[0].updateBy=RfolSUm&permissions[0].children[0].children[0].component=ISuSN2k&permissions[0].children[0].children[0].type=4939&type=4383&permissions[0].title=pg4r4&roles[0].permissions[0].level=3902&roles[0].permissions[0].checked=false&permissions[0].children[0].path=bULR&password=YVDYdNVnd&roles[0].id=8z4h5lfX&permissions[0].buttonType=TlQ3&permissions[0].children[0].children[0].selected=false&permissions[0].status=9214&id=DkVqB1&permissions[0].children[0].createTime=Sat+Feb+13+04%3A51%3A44+CST+2100&permissions[0].children[0].children[0].createTime=Thu+Nov+26+17%3A42%3A49+CST+2026&roles[0].permissions[0].children[0].selected=false&permissions[0].icon=iyvRXA&permissions[0].parentId=0w&permissions[0].children[0].children[0].level=5939&permissions[0].children[0].permTypes=AMAT2j6&roles[0].permissions[0].updateTime=2010-01-26+21%3A27%3A33&roles[0].permissions[0].parentId=IbZjVwJYjx&roles[0].permissions[0].expand=true&permissions[0].name=UrBiOvS0&permissions[0].permTypes=CUp&permissions[0].children[0].children[0].path=RSRdUzTZYm&roles[0].permissions[0].children[0].status=410&permissions[0].children[0].children[0].buttonType=MmxQDxJGH&status=933&permissions[0].updateTime=1974-11-17+18%3A46%3A06&roles[0].createTime=Mon+Feb+21+09%3A47%3A44+CST+2005&roles[0].createBy=Wgr2TIpvN0&permissions[0].path=zK&permissions[0].children[0].children[0].checked=false&roles[0].permissions[0].children[0].permTypes=elDwDn6nuu&roles[0].permissions[0].children[0].type=8934&permissions[0].children[0].children[0].parentId=6Gdez&roles[0].permissions[0].description=e&roles[0].permissions[0].children[0].checked=false&delFlag=2831&roles[0].permissions[0].sortOrder=7104.84&roles[0].updateTime=1980-10-28+06%3A51%3A21&permissions[0].children[0].createBy=O0kNqlstu&roles[0].permissions[0].delFlag=4015&email=RBr6AF&roles[0].permissions[0].children[0].level=926&permissions[0].sortOrder=4266.7&address=iNl&sex=3775&roles[0].permissions[0].children[0].name=PJDQDrGx&updateTime=2052-05-14+03%3A39%3A16&avatar=https%3A%2F%2Fs1.ax1x.com%2F2018%2F05%2F19%2FCcdVQP.png&permissions[0].type=872&permissions[0].children[0].children[0].permTypes=RkGAuus&roles[0].permissions[0].id=fVkfiwJCdO&permissions[0].createTime=Tue+Mar+03+07%3A05%3A00+CST+2071&roles[0].permissions[0].children[0].component=fi75DTYi8&createTime=Fri+Jun+15+18%3A42%3A48+CST+2046&roles[0].permissions[0].children[0].parentId=fa&permissions[0].children[0].delFlag=5491&permissions[0].checked=false&roles[0].permissions[0].children[0].icon=aM0&roles[0].permissions[0].children[0].createBy=VO&roles[0].permissions[0].status=2723&permissions[0].children[0].children[0].sortOrder=3929.05&permissions[0].createBy=I8ckS&roles[0].permissions[0].children[0].id=hMwVX1P&permissions[0].children[0].children[0].updateTime=2066-01-10+17%3A01%3A24&permissions[0].children[0].parentId=Y3Yb&roles[0].permissions[0].children[0].buttonType=lRy6q&roles[0].name=S&roles[0].permissions[0].children[0].sortOrder=3822.38&permissions[0].children[0].children[0].updateBy=pvBiyJiw&roles[0].permissions[0].name=GDMKsW&permissions[0].children[0].name=yr9l&permissions[0].children[0].updateBy=6h3&nickName=7xigI&permissions[0].expand=true&permissions[0].children[0].description=1&permissions[0].children[0].children[0].delFlag=384&permissions[0].children[0].level=7811&roles[0].permissions[0].createBy=iRYut&roles[0].permissions[0].icon=oT9E&permissions[0].children[0].icon=9yTCZ6Vy&roles[0].permissions[0].component=gMruwvs1aB&roles[0].permissions[0].title=Ercnn2NbOW&roles[0].permissions[0].createTime=Wed+Jan+12+19%3A35%3A20+CST+2022&permissions[0].children[0].children[0].id=O1ajAa4A4n&roles[0].permissions[0].children[0].expand=true&permissions[0].children[0].component=azTbom&permissions[0].children[0].id=mCMdk6Xl&permissions[0].component=V0S3GKW7&roles[0].permissions[0].children[0].createTime=Sun+Mar+14+06%3A43%3A33+CST+2094&roles[0].permissions[0].permTypes=bF2B&permissions[0].updateBy=XLtTKGdD&roles[0].defaultRole=false&permissions[0].children[0].children[0].status=5355&permissions[0].children[0].title=T1sDSKS&roles[0].permissions[0].children[0].title=iK3ye4&description=hH6a&roles[0].permissions[0].children[0].updateTime=2082-05-09+13%3A37%3A35&permissions[0].delFlag=6195&permissions[0].children[0].children[0].icon=zD9rfVN&permissions[0].children[0].children[0].description=LbP&roles[0].permissions[0].children[0].path=q8&updateBy=q45j4V&roles[0].permissions[0].updateBy=XvWckaPR&roles[0].permissions[0].children[0].updateBy=5kLz2&permissions[0].children[0].updateTime=2063-09-23+09%3A55%3A22&permissions[0].children[0].children[0].name=BXH2PtiApQ&roles[0].permissions[0].buttonType=yvMxVu4NxL&permissions[0].selected=false&roles[0].permissions[0].path=UcaMiz&permissions[0].id=z&mobile=5z&permissions[0].children[0].status=9950&permissions[0].children[0].expand=true&permissions[0].children[0].sortOrder=8829.38&roles[0].permissions[0].selected=false&permissions[0].children[0].selected=false&roles[0].delFlag=9700&permissions[0].children[0].children[0].createBy=JrhD4XBjU&createBy=lQyr0p4r&permissions[0].children[0].children[0].expand=true&permissions[0].children[0].type=2874&permissions[0].children[0].children[0].title=33V5aoGGRi&roles[0].permissions[0].type=1863&permissions[0].level=1832&permissions[0].children[0].checked=false&permissions[0].description=99JP7&username=CZJDPYua&roles[0].permissions[0].children[0].delFlag=6080'
```

## 10.测试DeleteMapping&nbsp;

**URL:** http://localhost/deleteMapping

**Type:** DELETE

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── userId|int64|true|<br/>		<br/>		<br/><br/>				<br/>|userId

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X DELETE -i http://localhost/deleteMapping --data 'userId=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A'
```

# 实现controller接口&nbsp;

## 1.新增一个对象&nbsp;

**URL:** http://localhost/testImpl/

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── request|object|true|&nbsp;|

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/testImpl/
```

## 2.更新一个对象&nbsp;

**URL:** http://localhost/testImpl/{id}

**Type:** PUT

**Content-Type:** application/json

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|int64|true|&nbsp;|编号

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── request|object|true|&nbsp;|

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X PUT -H 'Content-Type: application/json' -i http://localhost/testImpl/9760
```

# Class Name：com.power.doc.controller.PageController

## 1.分页查询用户列表&nbsp;

**URL:** http://localhost/page/page

**Type:** GET

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|
&nbsp;&nbsp; ├── AGE|int32|&nbsp;|100|&nbsp;
&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;|120|&nbsp;
&nbsp;&nbsp; ├── gender|enum|&nbsp;|&nbsp;|性别<br/>WOMAN(0,"女人\nwewew")<br/>MAN(2,"男人")&nbsp;
&nbsp;&nbsp; ├── simpleEnum|enum|&nbsp;|&nbsp;|简单枚举<br/>RED<br/>BLUE&nbsp;
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名<br/>测试分隔注释&nbsp;
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码&nbsp;
&nbsp;&nbsp; ├── passwordssss|array|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话&nbsp;
&nbsp;&nbsp; ├── role|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户角色信息&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── extend|map&lt;string, string&gt;|&nbsp;|&nbsp;|用户扩展项&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; └── listMap|array&lt;map&lt;string, string&gt;&gt;|&nbsp;|&nbsp;|ListMap效果展示&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;

**Request-body-example:**
``` json
{
  "passwordssss": [
    "y4qUGnw"
  ],
  "role": {
    "createBy": "MfldGp",
    "createTime": "Aug 29, 2067, 2:54:46 AM",
    "updateBy": "FcTBCWEBzk",
    "roleId": "Fm1iY0",
    "roleName": "uDOzVV",
    "updateTime": "2069-04-12 16:40:03",
    "id": "EnksjhNj",
    "delFlag": 5545,
    "userId": "FoT"
  },
  "gender": "MAN",
  "nickName": "w",
  "listMap": [
    {
      "null": "c"
    }
  ],
  "roles": [
    {
      "createBy": "0uLq",
      "createTime": "Apr 7, 2100, 8:05:31 PM",
      "updateBy": "3",
      "roleId": "HR",
      "roleName": "5tkTPd",
      "updateTime": "1998-10-27 16:51:17",
      "id": "M",
      "delFlag": 8920,
      "userId": "B25QII3ZW"
    }
  ],
  "mobile": "BdL",
  "extend": {
    "null": "7"
  },
  "password": "WYFsY",
  "MAX_SPEED": "120",
  "simpleEnum": "BLUE",
  "AGE": "100",
  "username": "Sob"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Author: hcy<br/>Version: 1.0.0V<br/>Date:  2019/12/5 10:32<br/>Description: 正常返回工具类&nbsp;
├── timestamp|string|时间戳&nbsp;
├── traceId|string|链路id&nbsp;
├── data|object|返回数据&nbsp;
│&nbsp;&nbsp; ├── records|array&lt;object&gt;|记录数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|车名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── length|double|长度&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── pager|object|分页&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── total|int32|记录总数&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── concurrentPage|int32|当前页&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── pageSize|int32|当前page&nbsp;
│&nbsp;&nbsp; ├── test|array&lt;object&gt;|测试&nbsp;
│&nbsp;&nbsp; ├── orders|array&lt;object&gt;|排序字段&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── column|string|排序字段&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── asc|boolean|是否正序&nbsp;
│&nbsp;&nbsp; ├── total|int64|总数&nbsp;
│&nbsp;&nbsp; └── size|int64|&nbsp;
├── message|string|ok: 接口业务成功返回<br/>其他返回表示相应的错误提示&nbsp;
└── code|string|0: 表示业务正常返回<br/>非0: 则表示业务异常, msg会有相应的异常信息&nbsp;

**Response-example:**
``` json
{
  "traceId": "G4urS",
  "code": "UUyux",
  "data": {
    "total": "0",
    "test": [
      {}
    ],
    "size": "10",
    "records": [
      {
        "pager": {
          "total": 0,
          "concurrentPage": 0,
          "pageSize": 0
        },
        "name": "Un",
        "length": 4559.67
      }
    ],
    "orders": [
      {
        "asc": "true",
        "column": "TpzD"
      }
    ]
  },
  "message": "Emima",
  "timestamp": "XccUJtf8Qs"
}
```

**Curl-example:**
``` bash
curl -X GET -H 'Content-Type: application/json' -i http://localhost/page/page --data '{
  "passwordssss": [
    "y4qUGnw"
  ],
  "role": {
    "createBy": "MfldGp",
    "createTime": "Aug 29, 2067, 2:54:46 AM",
    "updateBy": "FcTBCWEBzk",
    "roleId": "Fm1iY0",
    "roleName": "uDOzVV",
    "updateTime": "2069-04-12 16:40:03",
    "id": "EnksjhNj",
    "delFlag": 5545,
    "userId": "FoT"
  },
  "gender": "MAN",
  "nickName": "w",
  "listMap": [
    {
      "null": "c"
    }
  ],
  "roles": [
    {
      "createBy": "0uLq",
      "createTime": "Apr 7, 2100, 8:05:31 PM",
      "updateBy": "3",
      "roleId": "HR",
      "roleName": "5tkTPd",
      "updateTime": "1998-10-27 16:51:17",
      "id": "M",
      "delFlag": 8920,
      "userId": "B25QII3ZW"
    }
  ],
  "mobile": "BdL",
  "extend": {
    "null": "7"
  },
  "password": "WYFsY",
  "MAX_SPEED": "120",
  "simpleEnum": "BLUE",
  "AGE": "100",
  "username": "Sob"
}'
```

## 2.mybatisPage分页查询用户列表&nbsp;

**URL:** http://localhost/page/mybatisPage

**Type:** GET

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|
&nbsp;&nbsp; ├── AGE|int32|&nbsp;|100|&nbsp;
&nbsp;&nbsp; ├── MAX_SPEED|int32|&nbsp;|120|&nbsp;
&nbsp;&nbsp; ├── gender|enum|&nbsp;|&nbsp;|性别<br/>WOMAN(0,"女人\nwewew")<br/>MAN(2,"男人")&nbsp;
&nbsp;&nbsp; ├── simpleEnum|enum|&nbsp;|&nbsp;|简单枚举<br/>RED<br/>BLUE&nbsp;
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名<br/>测试分隔注释&nbsp;
&nbsp;&nbsp; ├── password|string|&nbsp;|&nbsp;|密码&nbsp;
&nbsp;&nbsp; ├── passwordssss|array|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; ├── mobile|string|&nbsp;|&nbsp;|电话&nbsp;
&nbsp;&nbsp; ├── role|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── roles|array&lt;object&gt;|&nbsp;|&nbsp;|用户角色信息&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── id|string|&nbsp;|&nbsp;|自增编号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createBy|string|&nbsp;|&nbsp;|创建人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|string|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── updateBy|string|&nbsp;|&nbsp;|修改人&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ~~updateTime~~|~~string~~|&nbsp;|&nbsp;|~~修改时间~~<br/>~~Pattern: yyyy-MM-dd HH:mm:ss~~
&nbsp;&nbsp; │&nbsp;&nbsp; ├── delFlag|int32|&nbsp;|&nbsp;|删除标记[1表示已删除，默认值0]&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── test|object|&nbsp;|&nbsp;|测试数据&nbsp;
&nbsp;&nbsp; ├── extend|map&lt;string, string&gt;|&nbsp;|&nbsp;|用户扩展项&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; └── listMap|array&lt;map&lt;string, string&gt;&gt;|&nbsp;|&nbsp;|ListMap效果展示&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;

**Request-body-example:**
``` json
{
  "passwordssss": [
    "gmjNr1Oap0"
  ],
  "role": {
    "createBy": "I4sHUVWFa",
    "createTime": "Jan 8, 2068, 8:40:37 AM",
    "updateBy": "kti",
    "roleId": "S",
    "roleName": "2oE",
    "updateTime": "1981-03-29 20:37:24",
    "id": "Kipd",
    "delFlag": 4397,
    "userId": "fCpDoG"
  },
  "gender": "WOMAN",
  "nickName": "fuM",
  "listMap": [
    {
      "null": "y2lFL"
    }
  ],
  "roles": [
    {
      "createBy": "jNbjg",
      "createTime": "Oct 30, 2002, 4:30:53 AM",
      "updateBy": "i9BJlK5Y",
      "roleId": "El0XHSN4p",
      "roleName": "dbLbxo1t",
      "updateTime": "2045-01-21 21:02:00",
      "id": "Uo",
      "delFlag": 7352,
      "userId": "7YgWiMKlaz"
    }
  ],
  "mobile": "5Q2oA",
  "extend": {
    "null": "Mow4iN4o"
  },
  "password": "NjREtO",
  "MAX_SPEED": "120",
  "simpleEnum": "RED",
  "AGE": "100",
  "username": "arJ"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Author: hcy<br/>Version: 1.0.0V<br/>Date:  2019/12/5 10:32<br/>Description: 正常返回工具类&nbsp;
├── timestamp|string|时间戳&nbsp;
├── traceId|string|链路id&nbsp;
├── data|object|返回数据&nbsp;
│&nbsp;&nbsp; ├── records|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|车名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── length|double|长度&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── pager|object|分页&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── total|int32|记录总数&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── concurrentPage|int32|当前页&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── pageSize|int32|当前page&nbsp;
│&nbsp;&nbsp; ├── total|int64|&nbsp;
│&nbsp;&nbsp; ├── size|int64|&nbsp;
│&nbsp;&nbsp; ├── current|int64|&nbsp;
│&nbsp;&nbsp; ├── orders|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── column|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── asc|boolean|&nbsp;
│&nbsp;&nbsp; ├── optimizeCountSql|boolean|&nbsp;
│&nbsp;&nbsp; ├── searchCount|boolean|&nbsp;
│&nbsp;&nbsp; ├── optimizeJoinOfCountSql|boolean|&nbsp;
│&nbsp;&nbsp; ├── countId|string|&nbsp;
│&nbsp;&nbsp; └── maxLimit|int64|&nbsp;
├── message|string|ok: 接口业务成功返回<br/>其他返回表示相应的错误提示&nbsp;
└── code|string|0: 表示业务正常返回<br/>非0: 则表示业务异常, msg会有相应的异常信息&nbsp;

**Response-example:**
``` json
{
  "traceId": "06H",
  "code": "iu",
  "data": {
    "total": 0,
    "current": 0,
    "size": 0,
    "optimizeCountSql": false,
    "records": [
      {
        "pager": {
          "total": 0,
          "concurrentPage": 0,
          "pageSize": 0
        },
        "name": "EzT9uRcYj",
        "length": 2764.12
      }
    ],
    "maxLimit": 9190,
    "searchCount": false,
    "optimizeJoinOfCountSql": false,
    "orders": [
      {
        "asc": false,
        "column": "G"
      }
    ],
    "countId": "w01GiKcQ"
  },
  "message": "gL9yaq67q",
  "timestamp": "WPm3XP7DW"
}
```

**Curl-example:**
``` bash
curl -X GET -H 'Content-Type: application/json' -i http://localhost/page/mybatisPage --data '{
  "passwordssss": [
    "gmjNr1Oap0"
  ],
  "role": {
    "createBy": "I4sHUVWFa",
    "createTime": "Jan 8, 2068, 8:40:37 AM",
    "updateBy": "kti",
    "roleId": "S",
    "roleName": "2oE",
    "updateTime": "1981-03-29 20:37:24",
    "id": "Kipd",
    "delFlag": 4397,
    "userId": "fCpDoG"
  },
  "gender": "WOMAN",
  "nickName": "fuM",
  "listMap": [
    {
      "null": "y2lFL"
    }
  ],
  "roles": [
    {
      "createBy": "jNbjg",
      "createTime": "Oct 30, 2002, 4:30:53 AM",
      "updateBy": "i9BJlK5Y",
      "roleId": "El0XHSN4p",
      "roleName": "dbLbxo1t",
      "updateTime": "2045-01-21 21:02:00",
      "id": "Uo",
      "delFlag": 7352,
      "userId": "7YgWiMKlaz"
    }
  ],
  "mobile": "5Q2oA",
  "extend": {
    "null": "Mow4iN4o"
  },
  "password": "NjREtO",
  "MAX_SPEED": "120",
  "simpleEnum": "RED",
  "AGE": "100",
  "username": "arJ"
}'
```

# Test ResponseEntity&nbsp;

## 1.ResponseEntity return List&nbsp;

**URL:** http://localhost/responseEntity/list

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;object&gt;|&nbsp;
└── &nbsp;|object|Description:<br/>用户对象&nbsp;
&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;

**Response-example:**
``` json
[
  {
    "userAddress": "2QNfEbRPA",
    "small": 9551.81,
    "userList": [
      {
        "userAddress": "h8bwWwX",
        "small": 950.98,
        "userList": [],
        "money": 8229.63,
        "phone": "GaA",
        "createTime": 6945,
        "nickName": "jVZsi9",
        "ipv6": "W37w8OOnU",
        "telephone": "DKqmgn2Nj",
        "userName": "b9HUr",
        "userDetails": [
          {
            "githubAddress": "0"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 4188.17,
    "phone": "KayU1",
    "createTime": 2137,
    "nickName": "kXW7",
    "ipv6": "WhP0hAk",
    "telephone": "QPkfV2jb",
    "userName": "1IXaKm17",
    "userDetails": [
      {
        "githubAddress": "HsnksjQN"
      }
    ],
    "userAge": 0
  }
]
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/responseEntity/list
```

# fastmybatis&nbsp;

## 1.fastmybatis测试&nbsp;

**URL:** http://localhost/fastmybatis

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── param|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; ├── code|int32|&nbsp;|0|错误码&nbsp;
&nbsp;&nbsp; ├── pageIndex|int32|&nbsp;|0|&nbsp;
&nbsp;&nbsp; └── pageSize|int32|&nbsp;|0|&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -i http://localhost/fastmybatis --data 'pageSize=0&code=0&pageIndex=0'
```

# FastJson和Jackson注解支持测试&nbsp;

## 1.Jackson注解支持测试&nbsp;

**URL:** http://localhost/json/jacksonTest

**Type:** ALL

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── annotation|object|true|&nbsp;|
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名&nbsp;
&nbsp;&nbsp; └── idCard|string|&nbsp;|&nbsp;|身份证号&nbsp;

**Request-body-example:**
``` json
{
  "idCard": "1fru4g7mA1",
  "username": "AY9X"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── username|string|用户名&nbsp;
└── idCard|string|身份证号&nbsp;

**Response-example:**
``` json
{
  "idCard": "K3IY1E5ORs",
  "username": "mTg"
}
```

**Curl-example:**
``` bash
curl -X GET -H 'Content-Type: application/json' -i http://localhost/json/jacksonTest --data '{
  "idCard": "1fru4g7mA1",
  "username": "AY9X"
}'
```

## 2.FastJson注解支持测试&nbsp;

**URL:** http://localhost/json/fastJsonTest

**Type:** ALL

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── fastJson|object|true|&nbsp;|
&nbsp;&nbsp; ├── dataExpressionEnum|enum|&nbsp;|&nbsp;|枚举<br/>SENSIRION("2101", new HashMap&lt;&gt;()) - temperature&nbsp;
&nbsp;&nbsp; ├── menuPermissionCodes|array&lt;enum&gt;|&nbsp;|&nbsp;|菜单/权限编码&nbsp;
&nbsp;&nbsp; ├── date|string|&nbsp;|&nbsp;|学好&nbsp;
&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名<br/>Pattern: 
&nbsp;&nbsp; ├── idCard|string|&nbsp;|&nbsp;|身份证号<br/>Pattern: 
&nbsp;&nbsp; ├── age|int32|&nbsp;|0|&nbsp;
&nbsp;&nbsp; └── age2|int32|&nbsp;|&nbsp;|Pattern: 

**Request-body-example:**
``` json
{
  "date": "May 22, 2055, 1:41:51 AM",
  "idCard": "OPplxk2Z",
  "menuPermissionCodes": [
    "WAIT_PAY"
  ],
  "dataExpressionEnum": "SENSIRION",
  "age": 0,
  "age2": 1356,
  "username": "G3asfyT"
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── dataExpressionEnum|enum|枚举<br/>SENSIRION("2101", new HashMap&lt;&gt;()) - temperature&nbsp;
├── menuPermissionCodes|array&lt;enum&gt;|菜单/权限编码&nbsp;
├── date|string|学好&nbsp;
├── username|string|用户名<br/>Pattern: 
├── idCard|string|身份证号<br/>Pattern: 
├── age|int32|&nbsp;
└── age2|int32|Pattern: 

**Response-example:**
``` json
{
  "date": "Dec 28, 1970, 12:27:54 AM",
  "idCard": "7J",
  "menuPermissionCodes": [
    "EXPIRED"
  ],
  "dataExpressionEnum": "SENSIRION",
  "age": 0,
  "age2": 9629,
  "username": "Iau0U"
}
```

**Curl-example:**
``` bash
curl -X GET -H 'Content-Type: application/json' -i http://localhost/json/fastJsonTest --data '{
  "date": "May 22, 2055, 1:41:51 AM",
  "idCard": "OPplxk2Z",
  "menuPermissionCodes": [
    "WAIT_PAY"
  ],
  "dataExpressionEnum": "SENSIRION",
  "age": 0,
  "age2": 1356,
  "username": "G3asfyT"
}'
```

# 测试类多路径&nbsp;

## 1.测试1&nbsp;

**URL:** http://localhost/testMultiPathOne/{path}/test/abc

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── path|string|true|&nbsp;|

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── name|string|&nbsp;|&nbsp;|名称<br/>&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "BnRIdj",
  "code": "m2n",
  "success": false,
  "message": "ETpA",
  "timestamp": "69Bb3Yj9"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/testMultiPathOne/LaoF/test/abc --data 'name=BhyaeTzDm'
```

## 2.测试2&nbsp;

**URL:** http://localhost/testMultiPathOne/{path}/test/{path2}/abc2

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── path|string|true|&nbsp;|路径1<br/>
└── path2|string|true|&nbsp;|路径2<br/>

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "3xOBN",
  "code": "X",
  "success": false,
  "message": "Amf",
  "timestamp": "p3oK6cVXs"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/testMultiPathOne/y7B/test/6v1Hin/abc2
```

# InnovateFruitController&nbsp;

## 1.列表&nbsp;

**URL:** http://localhost/InnovateFruit/list

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|公共列表出参&nbsp;
│&nbsp;&nbsp; ├── result|array&lt;object&gt;|结果集&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── name|string|车名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── length|double|长度&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── pager|object|分页&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── total|int32|记录总数&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── concurrentPage|int32|当前页&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── pageSize|int32|当前page&nbsp;
│&nbsp;&nbsp; ├── pageSize|int32|分页 每页条数
│&nbsp;&nbsp; ├── pageNum|int32|分页 页数
│&nbsp;&nbsp; └── Total|int64|分页 总条数
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "p",
  "code": "AzNvKwtN9",
  "data": {
    "result": [
      {
        "pager": {
          "total": 0,
          "concurrentPage": 0,
          "pageSize": 0
        },
        "name": "m9",
        "length": 3133.37
      }
    ],
    "Total": 0,
    "pageSize": 0,
    "pageNum": 0
  },
  "success": false,
  "message": "NcFj8rrBQy",
  "timestamp": "Fu"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/InnovateFruit/list
```

# Test inner class&nbsp;

## 1.Return A object contains Inner class&nbsp;

**URL:** http://localhost/inner/class

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|用于测试内部类解析&nbsp;
├── name|string|姓名&nbsp;
└── innerClass|object|内部类&nbsp;
&nbsp;&nbsp; └── phone|string|电话&nbsp;

**Response-example:**
``` json
{
  "name": "rfJSy",
  "innerClass": {
    "phone": "IPv"
  }
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/inner/class
```

# List返回接口Api文档测试&nbsp;

## 1.List&lt;String&gt;结构&nbsp;

**URL:** http://localhost/list/listString

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;string&gt;|&nbsp;
└── &nbsp;|string|&nbsp;

**Response-example:**
``` json
[
  "xT"
]
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/list/listString
```

## 2.List&lt;Map&lt;String,String&gt;&gt;结构&nbsp;

**URL:** http://localhost/list/listMap

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

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
    "null": "6"
  }
]
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/list/listMap
```

## 3.List&lt;自动义对象&gt;&nbsp;

**URL:** http://localhost/list/listObject

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;object&gt;|&nbsp;
└── &nbsp;|object|Description:<br/>用户对象&nbsp;
&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;

**Response-example:**
``` json
[
  {
    "userAddress": "qcge9m58sw",
    "small": 678.0,
    "userList": [
      {
        "userAddress": "mwd8jK",
        "small": 4882.4,
        "userList": [],
        "money": 9514.71,
        "phone": "LY",
        "createTime": 2320,
        "nickName": "1Vi1OZ8VUb",
        "ipv6": "8OtC",
        "telephone": "7VfLnOEcQY",
        "userName": "9TJ0",
        "userDetails": [
          {
            "githubAddress": "UUNDFzT"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 3117.37,
    "phone": "HDJ9UHi",
    "createTime": 7097,
    "nickName": "h9",
    "ipv6": "dDar",
    "telephone": "iIwczv",
    "userName": "R47dIO40",
    "userDetails": [
      {
        "githubAddress": "kYYt"
      }
    ],
    "userAge": 0
  }
]
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/list/listObject
```

## 4.List&lt;Map&lt;String,T&gt;&gt;结构&nbsp;

**URL:** http://localhost/list/listMap2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;map&gt;|&nbsp;
└── &nbsp;|map&lt;string, object&gt;|&nbsp;
&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>学生信息&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── stuName|string|姓名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── stuAge|boolean|年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── stuAddress|string|地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── user|object|用户对象&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── userMap|map&lt;string, object&gt;|map用户信息&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── listMap|array&lt;map&lt;string, int32&gt;&gt;|listMap&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|int32|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── userTreeSet|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── user1|object|用户对象2&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话&nbsp;

**Response-example:**
``` json
[
  {
    "null": {
      "user1": {
        "userAddress": "IZx3",
        "small": 3020.92,
        "userList": [
          {
            "userAddress": "bLUIF8tZ",
            "small": 8261.27,
            "userList": [],
            "money": 6729.33,
            "phone": "FtGI18p6",
            "createTime": 8427,
            "nickName": "boQApsvRV",
            "ipv6": "0ZRsJ9XBk",
            "telephone": "dCimIgrzP",
            "userName": "BX",
            "userDetails": [
              {
                "githubAddress": "BipsInbz"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 3043.64,
        "phone": "Hr9cI9",
        "createTime": 4613,
        "nickName": "k",
        "ipv6": "S6Bie",
        "telephone": "tvtgc",
        "userName": "zH520",
        "userDetails": [
          {
            "githubAddress": "tz8AHVAg"
          }
        ],
        "userAge": 0
      },
      "userTreeSet": [
        {
          "userAddress": "KBJUys6",
          "small": 7680.58,
          "userList": [
            {
              "userAddress": "2K6q9bV5",
              "small": 5873.94,
              "userList": [],
              "money": 9257.35,
              "phone": "RxTbfNV4",
              "createTime": 5361,
              "nickName": "jTZ3ep95G",
              "ipv6": "c",
              "telephone": "NBIJehT",
              "userName": "R5G0",
              "userDetails": [
                {
                  "githubAddress": "6Os"
                }
              ],
              "userAge": 0
            }
          ],
          "money": 2986.77,
          "phone": "F7yiRtDJYV",
          "createTime": 1496,
          "nickName": "xT3",
          "ipv6": "mbOrXhqt9",
          "telephone": "AnJGM",
          "userName": "BFwiL",
          "userDetails": [
            {
              "githubAddress": "BgK"
            }
          ],
          "userAge": 0
        }
      ],
      "listMap": [
        {
          "null": 7135
        }
      ],
      "stuAddress": "wMGlUoMbf",
      "stuName": "wHXQVXaYt",
      "userMap": {
        "null": {
          "userAddress": "0nL5Na7X0",
          "small": 8820.9,
          "userList": [
            {
              "userAddress": "a4CsxY",
              "small": 6707.7,
              "userList": [],
              "money": 4165.99,
              "phone": "EeZj3HT4",
              "createTime": 3341,
              "nickName": "4",
              "ipv6": "SrCwwS9",
              "telephone": "sIHagno",
              "userName": "T",
              "userDetails": [
                {
                  "githubAddress": "9"
                }
              ],
              "userAge": 0
            }
          ],
          "money": 900.01,
          "phone": "keRWbQw",
          "createTime": 3575,
          "nickName": "y9",
          "ipv6": "s4a",
          "telephone": "wQkXdE0m6",
          "userName": "o",
          "userDetails": [
            {
              "githubAddress": "fpNmYjy"
            }
          ],
          "userAge": 0
        }
      },
      "stuAge": true,
      "user": {
        "userAddress": "ETvCNHJbJ6",
        "small": 3658.93,
        "userList": [
          {
            "userAddress": "b7f",
            "small": 2136.74,
            "userList": [],
            "money": 8524.79,
            "phone": "w5O1",
            "createTime": 1962,
            "nickName": "2YkPRXSq6D",
            "ipv6": "eanrFeTFRW",
            "telephone": "6",
            "userName": "ei3W",
            "userDetails": [
              {
                "githubAddress": "QBBPL1krD"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 5761.93,
        "phone": "2r",
        "createTime": 6691,
        "nickName": "YNVZqO",
        "ipv6": "RtntX",
        "telephone": "y",
        "userName": "i7RCY",
        "userDetails": [
          {
            "githubAddress": "qzkT"
          }
        ],
        "userAge": 0
      }
    }
  }
]
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/list/listMap2
```

## 5.List&lt;Map&lt;M,N&lt;P,K,Y&gt;&gt;&gt;超复杂结构&nbsp;

**URL:** http://localhost/list/listMap3

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;map&gt;|&nbsp;
└── &nbsp;|map&lt;string, object&gt;|&nbsp;
&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>老师&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── data|object|泛型data&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── data1|object|泛型data1&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── data2|object|data2&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── age|int32|年龄&nbsp;

**Response-example:**
``` json
[
  {
    "null": {
      "data": {
        "userAddress": "HGWsear9BW",
        "small": 7585.76,
        "userList": [
          {
            "userAddress": "7FQ",
            "small": 5698.31,
            "userList": [],
            "money": 2175.56,
            "phone": "3k9fk4a",
            "createTime": 9745,
            "nickName": "HQ8V3s29r",
            "ipv6": "j6VVB9b",
            "telephone": "GQNEoKTTH0",
            "userName": "QMnTEa30",
            "userDetails": [
              {
                "githubAddress": "W"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 993.52,
        "phone": "HNeMf",
        "createTime": 2310,
        "nickName": "PsUvPTELs",
        "ipv6": "9mzj",
        "telephone": "V",
        "userName": "Lx",
        "userDetails": [
          {
            "githubAddress": "i2h0vBdo"
          }
        ],
        "userAge": 0
      },
      "data2": {
        "userAddress": "6k9j",
        "small": 2026.06,
        "userList": [
          {
            "userAddress": "9U",
            "small": 738.88,
            "userList": [],
            "money": 59.76,
            "phone": "DJ8GEuyoto",
            "createTime": 97,
            "nickName": "z",
            "ipv6": "7FVY",
            "telephone": "ZUg48TCZ",
            "userName": "NO",
            "userDetails": [
              {
                "githubAddress": "ZQGKxQj"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 6258.37,
        "phone": "pBq4",
        "createTime": 3483,
        "nickName": "asmXlmhc",
        "ipv6": "uzPJE947",
        "telephone": "w",
        "userName": "wbjZh",
        "userDetails": [
          {
            "githubAddress": "18m"
          }
        ],
        "userAge": 0
      },
      "data1": {
        "userAddress": "JR",
        "small": 5937.28,
        "userList": [
          {
            "userAddress": "nF5i",
            "small": 5930.41,
            "userList": [],
            "money": 5455.16,
            "phone": "ZmGemL09",
            "createTime": 6502,
            "nickName": "bibp5cI",
            "ipv6": "kQYN2GMZil",
            "telephone": "BBNtl5",
            "userName": "nyXpPd2",
            "userDetails": [
              {
                "githubAddress": "hX"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 5995.47,
        "phone": "LV2XyhJi",
        "createTime": 7079,
        "nickName": "gdT2SvgIh9",
        "ipv6": "B1ybKGP2",
        "telephone": "B",
        "userName": "4",
        "userDetails": [
          {
            "githubAddress": "lRU4KHl"
          }
        ],
        "userAge": 0
      },
      "age": 0
    }
  }
]
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/list/listMap3
```

## 6.List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构&nbsp;

**URL:** http://localhost/list/listTeacher

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;object&gt;|&nbsp;
└── &nbsp;|object|Description:<br/>老师&nbsp;
&nbsp;&nbsp; ├── data|array&lt;object&gt;|泛型data&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── data1|array&lt;object&gt;|泛型data1&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── data2|array&lt;object&gt;|data2&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; └── age|int32|年龄&nbsp;

**Response-example:**
``` json
[
  {
    "data": [
      {
        "userAddress": "2",
        "small": 4088.73,
        "userList": [
          {
            "userAddress": "p5FmiyHuo",
            "small": 4474.69,
            "userList": [],
            "money": 1071.84,
            "phone": "WeGP",
            "createTime": 2359,
            "nickName": "HIEgpDiOG",
            "ipv6": "r",
            "telephone": "lX",
            "userName": "5kyC",
            "userDetails": [
              {
                "githubAddress": "vzTgwWL"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 5851.22,
        "phone": "fqmGun6TnC",
        "createTime": 7686,
        "nickName": "bm2duZ7",
        "ipv6": "QljivpV",
        "telephone": "B8a",
        "userName": "5IbuoZ5a",
        "userDetails": [
          {
            "githubAddress": "rt9Jacp"
          }
        ],
        "userAge": 0
      }
    ],
    "data2": [
      {
        "userAddress": "e9",
        "small": 3701.71,
        "userList": [
          {
            "userAddress": "E",
            "small": 2121.51,
            "userList": [],
            "money": 9224.79,
            "phone": "QNB",
            "createTime": 5777,
            "nickName": "iUJ6AhL",
            "ipv6": "Z1gbiE9VB",
            "telephone": "09PZ",
            "userName": "vxBqlv8BB8",
            "userDetails": [
              {
                "githubAddress": "lDv"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 3270.98,
        "phone": "2kJextz8",
        "createTime": 7889,
        "nickName": "Lc0VN0",
        "ipv6": "ysEbiY",
        "telephone": "XRw8C9s",
        "userName": "o",
        "userDetails": [
          {
            "githubAddress": "t3m"
          }
        ],
        "userAge": 0
      }
    ],
    "data1": [
      {
        "userAddress": "catfb",
        "small": 2818.99,
        "userList": [
          {
            "userAddress": "y70Ulb",
            "small": 4067.7,
            "userList": [],
            "money": 1696.84,
            "phone": "xByhYq",
            "createTime": 2596,
            "nickName": "pBTfBK",
            "ipv6": "HVW",
            "telephone": "WeKuE",
            "userName": "C",
            "userDetails": [
              {
                "githubAddress": "IucHh5bT"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 5796.91,
        "phone": "Q",
        "createTime": 120,
        "nickName": "CWCkNe",
        "ipv6": "f0mmqWJ0",
        "telephone": "64QbuQDZ7",
        "userName": "RO1J",
        "userDetails": [
          {
            "githubAddress": "LohbYjRfg"
          }
        ],
        "userAge": 0
      }
    ],
    "age": 0
  }
]
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/list/listTeacher
```

## 7.List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构&nbsp;

**URL:** http://localhost/list/listString1

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;object&gt;|&nbsp;
└── &nbsp;|object|Description:<br/>老师&nbsp;
&nbsp;&nbsp; ├── data|object|泛型data&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data|object|泛型data&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data1|object|泛型data1&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data2|object|data2&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── age|int32|年龄&nbsp;
&nbsp;&nbsp; ├── data1|object|泛型data1&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── data2|object|data2&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; └── age|int32|年龄&nbsp;

**Response-example:**
``` json
[
  {
    "data": {
      "data": {
        "userAddress": "tjTah9uLE5",
        "small": 1194.84,
        "userList": [
          {
            "userAddress": "tI1TlR",
            "small": 8318.49,
            "userList": [],
            "money": 8358.96,
            "phone": "V7",
            "createTime": 1265,
            "nickName": "zcAm",
            "ipv6": "FAD",
            "telephone": "5nf",
            "userName": "E2VD",
            "userDetails": [
              {
                "githubAddress": "LzlztLQLq"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 1971.28,
        "phone": "ZbAKxtuNQv",
        "createTime": 4097,
        "nickName": "7bXezSkft",
        "ipv6": "mIMjOGkjjc",
        "telephone": "Az",
        "userName": "kM6Jc81QL",
        "userDetails": [
          {
            "githubAddress": "zp"
          }
        ],
        "userAge": 0
      },
      "data2": {
        "userAddress": "B",
        "small": 9675.5,
        "userList": [
          {
            "userAddress": "T8Q7fdSgUl",
            "small": 7292.74,
            "userList": [],
            "money": 1918.39,
            "phone": "NEW4t",
            "createTime": 713,
            "nickName": "YHOJXkQBe",
            "ipv6": "GKXhuFciXn",
            "telephone": "zTpqaxasR",
            "userName": "069vC",
            "userDetails": [
              {
                "githubAddress": "1pWyKuIMZ"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 1738.72,
        "phone": "r7qGwAVME",
        "createTime": 8158,
        "nickName": "h",
        "ipv6": "YX",
        "telephone": "3",
        "userName": "J0Hjy4fnLU",
        "userDetails": [
          {
            "githubAddress": "b"
          }
        ],
        "userAge": 0
      },
      "data1": {
        "userAddress": "PLkchbu8AB",
        "small": 3291.5,
        "userList": [
          {
            "userAddress": "U8",
            "small": 4025.04,
            "userList": [],
            "money": 6886.71,
            "phone": "XNJ6OABM",
            "createTime": 2770,
            "nickName": "ov5Mpn7t6",
            "ipv6": "4BoVPxBRDf",
            "telephone": "apzdNtyI4D",
            "userName": "3ux2OR9KSa",
            "userDetails": [
              {
                "githubAddress": "ZERk"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 6697.26,
        "phone": "0",
        "createTime": 4754,
        "nickName": "QObZ",
        "ipv6": "A2t7Ua2oe",
        "telephone": "bJFjLl",
        "userName": "h02kGTSB",
        "userDetails": [
          {
            "githubAddress": "vTFYR"
          }
        ],
        "userAge": 0
      },
      "age": 0
    },
    "data2": {
      "userAddress": "WP",
      "small": 1073.19,
      "userList": [
        {
          "userAddress": "jz",
          "small": 6165.67,
          "userList": [
            {
              "userAddress": "1ol",
              "small": 4637.37,
              "userList": [],
              "money": 5585.37,
              "phone": "ChxLqsbW",
              "createTime": 6523,
              "nickName": "atp",
              "ipv6": "E",
              "telephone": "b4PPj0XSr",
              "userName": "PriI1LXfQ",
              "userDetails": [
                {
                  "githubAddress": "0L8GqKRF"
                }
              ],
              "userAge": 0
            }
          ],
          "money": 1685.64,
          "phone": "fTXt",
          "createTime": 5017,
          "nickName": "cSkc",
          "ipv6": "76UQlJDJ",
          "telephone": "7iRIk",
          "userName": "x2opzBai",
          "userDetails": [
            {
              "githubAddress": "f"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 2893.75,
      "phone": "jfCwxERR",
      "createTime": 3030,
      "nickName": "aRnhNC",
      "ipv6": "elFm6w",
      "telephone": "cz",
      "userName": "EoW",
      "userDetails": [
        {
          "githubAddress": "itA"
        }
      ],
      "userAge": 0
    },
    "data1": {
      "userAddress": "U9PZO6D",
      "small": 3976.45,
      "userList": [
        {
          "userAddress": "RUJZ",
          "small": 428.06,
          "userList": [
            {
              "userAddress": "y2GRFEuAGt",
              "small": 5773.91,
              "userList": [],
              "money": 2411.48,
              "phone": "2",
              "createTime": 5065,
              "nickName": "Qsi",
              "ipv6": "nG71RvGfj0",
              "telephone": "cdIT3f",
              "userName": "120uA",
              "userDetails": [
                {
                  "githubAddress": "xhSUK4qH"
                }
              ],
              "userAge": 0
            }
          ],
          "money": 3882.61,
          "phone": "906uA6A",
          "createTime": 3613,
          "nickName": "g",
          "ipv6": "8xrY3F3",
          "telephone": "uvqxHaUab",
          "userName": "r94a71",
          "userDetails": [
            {
              "githubAddress": "NNJaMn6i8"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 302.83,
      "phone": "qKfoRTKK",
      "createTime": 7427,
      "nickName": "etFi25",
      "ipv6": "i7KL",
      "telephone": "kAbN",
      "userName": "1s6A",
      "userDetails": [
        {
          "githubAddress": "LsihraSN"
        }
      ],
      "userAge": 0
    },
    "age": 0
  }
]
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/list/listString1
```

## 8.List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;&nbsp;

**URL:** http://localhost/list/listString2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |array&lt;object&gt;|&nbsp;
└── &nbsp;|object|Description:<br/>老师&nbsp;
&nbsp;&nbsp; ├── data|object|泛型data&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data|object|泛型data&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data1|object|泛型data1&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data2|object|data2&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── age|int32|年龄&nbsp;
&nbsp;&nbsp; ├── data1|object|泛型data1&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data|object|泛型data&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data1|object|泛型data1&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data2|object|data2&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── age|int32|年龄&nbsp;
&nbsp;&nbsp; ├── data2|object|data2&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data|object|泛型data&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data1|object|泛型data1&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── data2|object|data2&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── age|int32|年龄&nbsp;
&nbsp;&nbsp; └── age|int32|年龄&nbsp;

**Response-example:**
``` json
[
  {
    "data": {
      "data": {
        "userAddress": "brjYW",
        "small": 5815.51,
        "userList": [
          {
            "userAddress": "xntzmDWTq",
            "small": 1007.55,
            "userList": [],
            "money": 1578.77,
            "phone": "hIMYpfp2",
            "createTime": 3386,
            "nickName": "bj",
            "ipv6": "kbl11Q",
            "telephone": "i",
            "userName": "sxYNLIo",
            "userDetails": [
              {
                "githubAddress": "aMY"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 8305.08,
        "phone": "ODn6PcUn4X",
        "createTime": 9955,
        "nickName": "L8xUe9I",
        "ipv6": "YWuH",
        "telephone": "Oy76E",
        "userName": "v3TgJVzb",
        "userDetails": [
          {
            "githubAddress": "nm4xFyyP"
          }
        ],
        "userAge": 0
      },
      "data2": {
        "userAddress": "9X4C6G6",
        "small": 9955.08,
        "userList": [
          {
            "userAddress": "n0gQbRy",
            "small": 4361.67,
            "userList": [],
            "money": 1167.51,
            "phone": "WWsEGnj",
            "createTime": 3278,
            "nickName": "tE",
            "ipv6": "4J",
            "telephone": "uwcCZp8",
            "userName": "Vsla",
            "userDetails": [
              {
                "githubAddress": "yzb"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 428.71,
        "phone": "X37KUNqt0",
        "createTime": 5222,
        "nickName": "MUHjV1gGJa",
        "ipv6": "8vGzE",
        "telephone": "j6byyCPUSX",
        "userName": "Cc5thqKfS",
        "userDetails": [
          {
            "githubAddress": "VSD9Cd"
          }
        ],
        "userAge": 0
      },
      "data1": {
        "userAddress": "yl",
        "small": 339.65,
        "userList": [
          {
            "userAddress": "zEYzh",
            "small": 3174.2,
            "userList": [],
            "money": 9704.53,
            "phone": "r",
            "createTime": 5443,
            "nickName": "6CakQd",
            "ipv6": "tPlCcf",
            "telephone": "mgMiFP",
            "userName": "hiEK",
            "userDetails": [
              {
                "githubAddress": "C1A0k2"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 5751.38,
        "phone": "ek",
        "createTime": 996,
        "nickName": "Idr7gni",
        "ipv6": "fjaH3B",
        "telephone": "wsVyvg6DVp",
        "userName": "Bzc",
        "userDetails": [
          {
            "githubAddress": "vWXs"
          }
        ],
        "userAge": 0
      },
      "age": 0
    },
    "data2": {
      "data": {
        "userAddress": "C1Hq",
        "small": 7817.24,
        "userList": [
          {
            "userAddress": "AU",
            "small": 8796.89,
            "userList": [],
            "money": 5496.82,
            "phone": "6sF2fiaDl",
            "createTime": 9094,
            "nickName": "K",
            "ipv6": "9Guo",
            "telephone": "7c40KEtGKx",
            "userName": "LpYb",
            "userDetails": [
              {
                "githubAddress": "WvUi"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 3696.71,
        "phone": "t7Z1un",
        "createTime": 7438,
        "nickName": "bvQmRm",
        "ipv6": "eEzo",
        "telephone": "Ih2vFTBw",
        "userName": "X7",
        "userDetails": [
          {
            "githubAddress": "2l"
          }
        ],
        "userAge": 0
      },
      "data2": {
        "userAddress": "zOtDZxJ",
        "small": 7660.05,
        "userList": [
          {
            "userAddress": "G5HSB3",
            "small": 8220.53,
            "userList": [],
            "money": 3935.78,
            "phone": "2bpsPApp8D",
            "createTime": 9085,
            "nickName": "PPxr5",
            "ipv6": "pXN1L",
            "telephone": "7ZMI0het",
            "userName": "RE0CgoaR7",
            "userDetails": [
              {
                "githubAddress": "DK98Y"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 5735.34,
        "phone": "3bw8Hlm",
        "createTime": 2450,
        "nickName": "MOIF",
        "ipv6": "u",
        "telephone": "7eFeBiBC",
        "userName": "uPvbnW",
        "userDetails": [
          {
            "githubAddress": "T6ds"
          }
        ],
        "userAge": 0
      },
      "data1": {
        "userAddress": "ivt4AjHT",
        "small": 4053.0,
        "userList": [
          {
            "userAddress": "C6PG7coWQY",
            "small": 6274.03,
            "userList": [],
            "money": 7379.03,
            "phone": "up0Ka",
            "createTime": 8517,
            "nickName": "D",
            "ipv6": "ZyCh",
            "telephone": "G50lTm39",
            "userName": "wqspy",
            "userDetails": [
              {
                "githubAddress": "Nk7UWygKY"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 3308.95,
        "phone": "SnAGOAOEG",
        "createTime": 7435,
        "nickName": "f1rU4pT",
        "ipv6": "e1q4",
        "telephone": "9C50hlx4c",
        "userName": "wmF",
        "userDetails": [
          {
            "githubAddress": "LyGF8lduK"
          }
        ],
        "userAge": 0
      },
      "age": 0
    },
    "data1": {
      "data": {
        "userAddress": "W",
        "small": 6149.7,
        "userList": [
          {
            "userAddress": "Oxti",
            "small": 8761.76,
            "userList": [],
            "money": 2861.33,
            "phone": "7skU4RBEZ",
            "createTime": 2014,
            "nickName": "rEiwe",
            "ipv6": "BlA",
            "telephone": "QuRekEbDo",
            "userName": "ogz",
            "userDetails": [
              {
                "githubAddress": "mZiYLOb"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 3690.99,
        "phone": "BzJWST3S",
        "createTime": 4367,
        "nickName": "eY9S0Y",
        "ipv6": "enh",
        "telephone": "5MBkv",
        "userName": "WTRqms",
        "userDetails": [
          {
            "githubAddress": "C"
          }
        ],
        "userAge": 0
      },
      "data2": {
        "userAddress": "F4gQj",
        "small": 5775.01,
        "userList": [
          {
            "userAddress": "BQjUtgg7Xj",
            "small": 5773.68,
            "userList": [],
            "money": 857.2,
            "phone": "5",
            "createTime": 1932,
            "nickName": "Kvom17Y",
            "ipv6": "yCTfT",
            "telephone": "EvV",
            "userName": "7R",
            "userDetails": [
              {
                "githubAddress": "52IQW"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 3559.03,
        "phone": "YhRvmD9O",
        "createTime": 8833,
        "nickName": "Y4jLmg6r0",
        "ipv6": "znqHBoX",
        "telephone": "O9rXjOh",
        "userName": "OV2Xsf5",
        "userDetails": [
          {
            "githubAddress": "ckoFa"
          }
        ],
        "userAge": 0
      },
      "data1": {
        "userAddress": "enYXj",
        "small": 6879.44,
        "userList": [
          {
            "userAddress": "xkCdLap",
            "small": 5879.81,
            "userList": [],
            "money": 1262.82,
            "phone": "CZIrEPj",
            "createTime": 9187,
            "nickName": "c0v",
            "ipv6": "sfr9LEW",
            "telephone": "adbf",
            "userName": "T",
            "userDetails": [
              {
                "githubAddress": "fXfwzD"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 5605.86,
        "phone": "iv",
        "createTime": 8354,
        "nickName": "NxY",
        "ipv6": "2B",
        "telephone": "KI",
        "userName": "U",
        "userDetails": [
          {
            "githubAddress": "N5"
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

**Curl-example:**
``` bash
curl -X GET -i http://localhost/list/listString2
```

## 9.CommonResult&lt;List&lt;UserDto&gt;&gt;&nbsp;

**URL:** http://localhost/list/listUserDto

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; ├── token|string|token&nbsp;
│&nbsp;&nbsp; └── LoginList|array&lt;object&gt;|UserDto 用户信息列表&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; └── password|string|密码&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "uEt",
  "code": "KZ",
  "data": [
    {
      "LoginList": [
        {
          "password": "ZHWUkqa",
          "userName": "QCyjc7tlT"
        }
      ],
      "token": "Bo8coG9bct"
    }
  ],
  "success": false,
  "message": "JL4Q",
  "timestamp": "aXYoXEWg8V"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/list/listUserDto
```

# RequestHeader注解测试&nbsp;

## 1.header常量测试&nbsp;

**URL:** http://localhost/userInfo

**Type:** PUT

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-headers:**

Header | Type|Required|DefaultValue|Description
---|---|---|---|----
Authorization|string|true|<br/>		<br/>		<br/><br/>				<br/>|&nbsp;

**Request-parameters:**

None

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X PUT -H 'Authorization:
		
		

				
' -i http://localhost/userInfo
```

## 2.测试常量请求头4&nbsp;

**URL:** http://localhost/testRequestHeader/constant4

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-headers:**

Header | Type|Required|DefaultValue|Description
---|---|---|---|----
Authorization|string|true|<br/>		<br/>		<br/><br/>				<br/>|请求头<br/>&nbsp;

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"5Rr"
```

**Curl-example:**
``` bash
curl -X GET -H 'Authorization:
		
		

				
' -i http://localhost/testRequestHeader/constant4
```

## 3.测试RequestHeader常规使用&nbsp;

**URL:** http://localhost/testRequestHeader

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-headers:**

Header | Type|Required|DefaultValue|Description
---|---|---|---|----
name|string|true|<br/>		<br/>		<br/><br/>				<br/>|请求头(name)<br/>&nbsp;

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── age|int32|&nbsp;|&nbsp;|年龄&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -H 'name:
		
		

				
' -i http://localhost/testRequestHeader --data 'age=9812'
```

## 4.测试RequestHeader绑定参数名&nbsp;

**URL:** http://localhost/testRequestHeader/value

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-headers:**

Header | Type|Required|DefaultValue|Description
---|---|---|---|----
token|string|false|<br/>		<br/>		<br/><br/>				<br/>|请求头(name)<br/>&nbsp;
age|int32|true|<br/>		<br/>		<br/><br/>				<br/>|年龄&nbsp;

**Request-parameters:**

None

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -H 'token:
		
		

				
' -H 'age:
		
		

				
' -i http://localhost/testRequestHeader/value
```

## 5.测试RequestHeader绑定默认值&nbsp;

**URL:** http://localhost/testRequestHeader/DefaultVal

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-headers:**

Header | Type|Required|DefaultValue|Description
---|---|---|---|----
token|string|false|da|请求头(name)<br/>&nbsp;

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── age|int32|&nbsp;|&nbsp;|年龄&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -H 'token:da' -i http://localhost/testRequestHeader/DefaultVal --data 'age=5809'
```

## 6.测试Mapping中的headers属性&nbsp;

**URL:** http://localhost/testRequestHeader/foos

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"zLO5Vwpc7T"
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/testRequestHeader/foos
```

## 7.测试Mapping header属性&nbsp;

**URL:** http://localhost/ex/foos

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"wKDkU"
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/ex/foos
```

## 8.测试常量请求头1&nbsp;

**URL:** http://localhost/testRequestHeader/constants1

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-headers:**

Header | Type|Required|DefaultValue|Description
---|---|---|---|----
token|string|true|<br/>		<br/>		<br/><br/>				<br/>|请求头<br/>&nbsp;

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"M93"
```

**Curl-example:**
``` bash
curl -X GET -H 'token:
		
		

				
' -i http://localhost/testRequestHeader/constants1
```

## 9.测试常量请求头2&nbsp;

**URL:** http://localhost/testRequestHeader/constant2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-headers:**

Header | Type|Required|DefaultValue|Description
---|---|---|---|----
token|string|true|<br/>		<br/>		<br/><br/>				<br/>|请求头<br/>&nbsp;

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"NA0NQvLe"
```

**Curl-example:**
``` bash
curl -X GET -H 'token:
		
		

				
' -i http://localhost/testRequestHeader/constant2
```

## 10.测试常量请求头3&nbsp;

**URL:** http://localhost/testRequestHeader/constant3

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-headers:**

Header | Type|Required|DefaultValue|Description
---|---|---|---|----
token|string|true|<br/>		<br/>		<br/><br/>				<br/>|请求头<br/>&nbsp;

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"eBplluYqK"
```

**Curl-example:**
``` bash
curl -X GET -H 'token:
		
		

				
' -i http://localhost/testRequestHeader/constant3
```

## 11.测试RequestHeader注解 'value' 属性为常量 绑定参数名&nbsp;

**URL:** http://localhost/testRequestHeader/constValue

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-headers:**

Header | Type|Required|DefaultValue|Description
---|---|---|---|----
MAJOR|string|false|<br/>		<br/>		<br/><br/>				<br/>|请求头(name)<br/>&nbsp;
age|int32|true|<br/>		<br/>		<br/><br/>				<br/>|年龄&nbsp;

**Request-parameters:**

None

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -H 'MAJOR:
		
		

				
' -H 'age:
		
		

				
' -i http://localhost/testRequestHeader/constValue
```

# mybatis-plus分页测试&nbsp;

## 1.mybatis-plus原始分页类测试&nbsp;

**URL:** http://localhost/mybatis/plus/page

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
│&nbsp;&nbsp; ├── records|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|int32|角色id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|角色名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── age|int32|年龄&nbsp;
│&nbsp;&nbsp; ├── total|int64|&nbsp;
│&nbsp;&nbsp; ├── size|int64|&nbsp;
│&nbsp;&nbsp; ├── current|int64|&nbsp;
│&nbsp;&nbsp; ├── orders|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── column|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── asc|boolean|&nbsp;
│&nbsp;&nbsp; ├── optimizeCountSql|boolean|&nbsp;
│&nbsp;&nbsp; ├── searchCount|boolean|&nbsp;
│&nbsp;&nbsp; ├── optimizeJoinOfCountSql|boolean|&nbsp;
│&nbsp;&nbsp; ├── countId|string|&nbsp;
│&nbsp;&nbsp; └── maxLimit|int64|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "LJNtoAHd2j",
  "code": "TZXSk",
  "data": {
    "total": 0,
    "current": 0,
    "size": 0,
    "optimizeCountSql": false,
    "records": [
      {
        "roleId": 2417,
        "roleName": "AW0B7cx",
        "age": 1385
      }
    ],
    "maxLimit": 2790,
    "searchCount": false,
    "optimizeJoinOfCountSql": false,
    "orders": [
      {
        "asc": false,
        "column": "mb4"
      }
    ],
    "countId": "KXb"
  },
  "success": false,
  "message": "RY",
  "timestamp": "5"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/mybatis/plus/page
```

## 2.mybatis-plus分页自定义处理测试&nbsp;

**URL:** http://localhost/mybatis/plus/page2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
│&nbsp;&nbsp; ├── count|int64|总数&nbsp;
│&nbsp;&nbsp; ├── records|array&lt;object&gt;|分页数据&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|int32|角色id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|角色名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── age|int32|年龄&nbsp;
│&nbsp;&nbsp; ├── page|int64|当前页码&nbsp;
│&nbsp;&nbsp; └── size|int64|每页显示条数&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "2ebGKNMemx",
  "code": "PPOZB9",
  "data": {
    "size": 0,
    "records": [
      {
        "roleId": 730,
        "roleName": "j",
        "age": 4410
      }
    ],
    "count": 0,
    "page": 0
  },
  "success": false,
  "message": "1",
  "timestamp": "bXVQEik66"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/mybatis/plus/page2
```

## 3.mybatis-plus分页自定义处理测试2&nbsp;

**URL:** http://localhost/mybatis/plus/page3

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|测试mybatis-plugs page字段忽略&nbsp;
│&nbsp;&nbsp; ├── records|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleId|int32|角色id&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── roleName|string|角色名称&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── age|int32|年龄&nbsp;
│&nbsp;&nbsp; ├── total|int64|&nbsp;
│&nbsp;&nbsp; ├── size|int64|&nbsp;
│&nbsp;&nbsp; ├── current|int64|&nbsp;
│&nbsp;&nbsp; ├── orders|array&lt;object&gt;|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; ├── column|string|&nbsp;
│&nbsp;&nbsp; │&nbsp;&nbsp; └── asc|boolean|&nbsp;
│&nbsp;&nbsp; ├── optimizeCountSql|boolean|&nbsp;
│&nbsp;&nbsp; ├── searchCount|boolean|&nbsp;
│&nbsp;&nbsp; ├── optimizeJoinOfCountSql|boolean|&nbsp;
│&nbsp;&nbsp; ├── countId|string|&nbsp;
│&nbsp;&nbsp; └── maxLimit|int64|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "ZxGolH3Y4",
  "code": "Ljzd1IbX",
  "data": {
    "total": 0,
    "current": 0,
    "size": 0,
    "optimizeCountSql": false,
    "records": [
      {
        "roleId": 5709,
        "roleName": "Q79VbAWd8B",
        "age": 6882
      }
    ],
    "maxLimit": 4464,
    "searchCount": false,
    "optimizeJoinOfCountSql": false,
    "orders": [
      {
        "asc": false,
        "column": "VzyS"
      }
    ],
    "countId": "n2oCQHtxi"
  },
  "success": false,
  "message": "kpAdzRH",
  "timestamp": "MF"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/mybatis/plus/page3
```

# 简单对象测试2&nbsp;

## 1.CommonResult&lt;String&gt;&nbsp;

**URL:** http://localhost/stringCommonResult

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "BP",
  "code": "u4ns4bURjm",
  "data": "p",
  "success": false,
  "message": "5ARYd8Sb2",
  "timestamp": "8Ev"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/stringCommonResult
```

## 2.返回Staff&lt;Staff&lt;Staff&gt;&gt;&nbsp;

**URL:** http://localhost/staff

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Description:<br/>职工信息&nbsp;
├── name|string|职工名称&nbsp;
├── annyObject|object|任何信息对象&nbsp;
│&nbsp;&nbsp; ├── name|string|职工名称&nbsp;
│&nbsp;&nbsp; ├── annyObject|object|任何信息对象&nbsp;
│&nbsp;&nbsp; └── data|array&lt;object&gt;|泛型数据&nbsp;
└── data|array&lt;object&gt;|泛型数据&nbsp;
&nbsp;&nbsp; ├── name|string|职工名称&nbsp;
&nbsp;&nbsp; ├── annyObject|object|任何信息对象&nbsp;
&nbsp;&nbsp; └── data|array&lt;object&gt;|泛型数据&nbsp;

**Response-example:**
``` json
{
  "annyObject": {
    "data": [],
    "name": "XbivgXev"
  },
  "data": [
    {
      "data": [],
      "name": "vr8"
    }
  ],
  "name": "YGaRpE"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/staff
```

## 3.返回Staff&lt;String&gt;&nbsp;

**URL:** http://localhost/staffStr

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|Description:<br/>职工信息&nbsp;
├── name|string|职工名称&nbsp;
├── annyObject|string|任何信息对象&nbsp;
└── data|array&lt;string&gt;|泛型数据&nbsp;

**Response-example:**
``` json
{
  "annyObject": "Yuw",
  "data": [
    "Mf79WAJFm"
  ],
  "name": "zeGBs"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/staffStr
```

## 4.JAVA继承测试&nbsp;

**URL:** http://localhost/children

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── children|object|true|&nbsp;|
&nbsp;&nbsp; ├── age|int32|&nbsp;|0|年龄&nbsp;
&nbsp;&nbsp; └── name|string|&nbsp;|&nbsp;|姓名&nbsp;

**Request-body-example:**
``` json
{
  "name": "j79R",
  "age": 0
}
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── age|int32|年龄&nbsp;
└── name|string|姓名&nbsp;

**Response-example:**
``` json
{
  "name": "fkKmc",
  "age": 0
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/children --data '{
  "name": "j79R",
  "age": 0
}'
```

# Mock Test&nbsp;

## 1.测试基本类型数组&nbsp;

**URL:** http://localhost/testMockPrimaryArray

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── ids|array|true|<br/>		<br/>		<br/><br/>				<br/>|id数组│1,2,3<br/>
&nbsp;&nbsp; └── &nbsp;|int64|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "VTmRc",
  "code": "Frmf6Xs5n",
  "success": false,
  "message": "02",
  "timestamp": "1lbxLn"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/testMockPrimaryArray --data 'ids=4636'
```

## 2.测试包装类型数组&nbsp;

**URL:** http://localhost/testMockPackageArray

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── ids|array|true|<br/>		<br/>		<br/><br/>				<br/>|id包装数组<br/>
&nbsp;&nbsp; └── &nbsp;|int64|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "cwk",
  "code": "A",
  "success": false,
  "message": "S",
  "timestamp": "ZYetjqo02h"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/testMockPackageArray --data 'ids=3714'
```

## 3.测试包装类型List&nbsp;

**URL:** http://localhost/testMockPackageList

**Type:** POST

**Content-Type:** multipart/form-data

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── ids|array&lt;int64&gt;|true|<br/>		<br/>		<br/><br/>				<br/>|idList<br/>
├── configQueryParam|string|&nbsp;|&nbsp;|&nbsp;
└── file|file|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "2FlLWaz",
  "code": "Cb5DlGXNNq",
  "success": false,
  "message": "GQMJ",
  "timestamp": "VDFuUlnCEz"
}
```

## 4.测试基本类型数组(JSON)&nbsp;

**URL:** http://localhost/testMockPrimaryArrayJson

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── ids|array|true|&nbsp;|id包装数组│1,2,3<br/>
&nbsp;&nbsp; └── &nbsp;|int64|&nbsp;|&nbsp;|&nbsp;

**Request-body-example:**
``` json
[
  6866
]
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "rsCsYt",
  "code": "OsYQNSzRF",
  "success": false,
  "message": "C4BfUDPpC",
  "timestamp": "MW1qbLz1a"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/testMockPrimaryArrayJson --data '[
  6866
]'
```

## 5.测试包装类型数组(JSON)&nbsp;

**URL:** http://localhost/testMockPackageArrayJson

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── ids|array|true|&nbsp;|id包装数组│1,2,3<br/>
&nbsp;&nbsp; └── &nbsp;|int64|&nbsp;|&nbsp;|&nbsp;

**Request-body-example:**
``` json
[
  8505
]
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "d",
  "code": "K",
  "success": false,
  "message": "mNqqm3rH",
  "timestamp": "4si6"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/testMockPackageArrayJson --data '[
  8505
]'
```

## 6.测试包装类型List(JSON)&nbsp;

**URL:** http://localhost/testMockPackageListJson

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── ids|array&lt;int64&gt;|true|&nbsp;|idList<br/>

**Request-body-example:**
``` json
[
  4212
]
```

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|none|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "q58cNCbjWV",
  "code": "7FHHoD",
  "success": false,
  "message": "Gqs",
  "timestamp": "o6aqK1"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/testMockPackageListJson --data '[
  4212
]'
```

# xss拦击测试&nbsp;

## 1.xss过滤普通post请求&nbsp;

**URL:** http://localhost/xss/text

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── text|string|&nbsp;|&nbsp;|请求文本<br/>&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "h",
  "code": "iMmYQb",
  "data": "pB0x85YBa",
  "success": false,
  "message": "riOKt2fT",
  "timestamp": "Ff"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/xss/text --data 'text=rzcjLZc'
```

## 2.xss过滤get请求&nbsp;

**URL:** http://localhost/xss/query

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── query|string|&nbsp;|&nbsp;|请求参数<br/>&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|string|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "fU3DWzXB",
  "code": "RzF7Kc",
  "data": "bc",
  "success": false,
  "message": "JfmeMDL",
  "timestamp": "I"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/xss/query --data 'query=ZOoh8Kfm'
```

## 3.xss过滤json数据&nbsp;

**URL:** http://localhost/xss/json

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── children|object|true|&nbsp;|
&nbsp;&nbsp; ├── age|int32|&nbsp;|0|年龄&nbsp;
&nbsp;&nbsp; └── name|string|&nbsp;|&nbsp;|姓名&nbsp;

**Request-body-example:**
``` json
{
  "name": "nl",
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
│&nbsp;&nbsp; ├── age|int32|年龄&nbsp;
│&nbsp;&nbsp; └── name|string|姓名&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "x9F8EP",
  "code": "lH70",
  "data": {
    "name": "TklFtn9j",
    "age": 0
  },
  "success": false,
  "message": "gtTtL",
  "timestamp": "h"
}
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/xss/json --data '{
  "name": "nl",
  "age": 0
}'
```

# Spring boot params test&nbsp;

## 1.Test Normal param binding&nbsp;

**URL:** http://localhost/testNormalParams/binding

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── name|string|true|&nbsp;|name<br/>
└── age|int32|&nbsp;|&nbsp;|age&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/testNormalParams/binding --data 'name=qJchgJU&age=604'
```

## 2.Test Normal param binding&nbsp;

**URL:** http://localhost/testNormalParams/m

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── name|string|&nbsp;|&nbsp;|name<br/>&nbsp;
└── age|int32|&nbsp;|&nbsp;|age&nbsp;

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/testNormalParams/m --data 'name=u&age=5734'
```

## 3.Test @RequestBody User&nbsp;

**URL:** http://localhost/testRequestBody

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|object|true|&nbsp;|
&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|&nbsp;|&nbsp;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|&nbsp;|&nbsp;|测试&nbsp;
&nbsp;&nbsp; ├── userList|array&lt;object&gt;|&nbsp;|&nbsp;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|&nbsp;|&nbsp;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|&nbsp;|&nbsp;|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|&nbsp;|&nbsp;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|&nbsp;|&nbsp;|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|&nbsp;|&nbsp;|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|&nbsp;|0|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|&nbsp;|&nbsp;|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|&nbsp;|&nbsp;|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|&nbsp;|&nbsp;|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|&nbsp;|&nbsp;|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|&nbsp;|&nbsp;|固定电话&nbsp;
&nbsp;&nbsp; ├── userName|string|&nbsp;|&nbsp;|用户名&nbsp;
&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; ├── userAddress|string|&nbsp;|&nbsp;|用户地址&nbsp;
&nbsp;&nbsp; ├── userAge|int32|&nbsp;|0|用户年龄&nbsp;
&nbsp;&nbsp; ├── phone|string|&nbsp;|&nbsp;|手机号&nbsp;
&nbsp;&nbsp; ├── createTime|int64|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; ├── small|float|&nbsp;|&nbsp;|钱少&nbsp;
&nbsp;&nbsp; ├── money|double|&nbsp;|&nbsp;|钱太多了&nbsp;
&nbsp;&nbsp; ├── ipv6|string|&nbsp;|&nbsp;|ipv6&nbsp;
&nbsp;&nbsp; └── telephone|string|&nbsp;|&nbsp;|固定电话&nbsp;

**Request-body-example:**
``` json
{
  "userAddress": "eUUph5H7V",
  "small": 674.61,
  "userList": [
    {
      "userAddress": "JHI",
      "small": 1068.84,
      "userList": [],
      "money": 9625.83,
      "phone": "l",
      "createTime": 6788,
      "nickName": "m7UQdv",
      "ipv6": "vQBXqjSyUr",
      "telephone": "BLngQqp",
      "userName": "EYwtuHJzG",
      "userDetails": [
        {
          "githubAddress": "0zdy"
        }
      ],
      "userAge": 0
    }
  ],
  "money": 1084.2,
  "phone": "vwMGNbKMS",
  "createTime": 6928,
  "nickName": "xUiyT",
  "ipv6": "l",
  "telephone": "Bj6v9",
  "userName": "5M6A",
  "userDetails": [
    {
      "githubAddress": "B098GQ"
    }
  ],
  "userAge": 0
}
```

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/testRequestBody --data '{
  "userAddress": "eUUph5H7V",
  "small": 674.61,
  "userList": [
    {
      "userAddress": "JHI",
      "small": 1068.84,
      "userList": [],
      "money": 9625.83,
      "phone": "l",
      "createTime": 6788,
      "nickName": "m7UQdv",
      "ipv6": "vQBXqjSyUr",
      "telephone": "BLngQqp",
      "userName": "EYwtuHJzG",
      "userDetails": [
        {
          "githubAddress": "0zdy"
        }
      ],
      "userAge": 0
    }
  ],
  "money": 1084.2,
  "phone": "vwMGNbKMS",
  "createTime": 6928,
  "nickName": "xUiyT",
  "ipv6": "l",
  "telephone": "Bj6v9",
  "userName": "5M6A",
  "userDetails": [
    {
      "githubAddress": "B098GQ"
    }
  ],
  "userAge": 0
}'
```

## 4.Test @RequestBody Map&nbsp;

**URL:** http://localhost/testRequestBodyMap

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── user|map&lt;string, object&gt;|true|&nbsp;|
&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; └── &nbsp;|object|&nbsp;|&nbsp;|Description:<br/>用户对象&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|&nbsp;|&nbsp;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|&nbsp;|&nbsp;|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|&nbsp;|&nbsp;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|&nbsp;|&nbsp;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|&nbsp;|&nbsp;|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|&nbsp;|&nbsp;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|&nbsp;|&nbsp;|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|&nbsp;|&nbsp;|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|&nbsp;|0|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|&nbsp;|&nbsp;|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|&nbsp;|&nbsp;|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|&nbsp;|&nbsp;|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|&nbsp;|&nbsp;|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|&nbsp;|&nbsp;|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|&nbsp;|&nbsp;|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|&nbsp;|&nbsp;|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|&nbsp;|&nbsp;|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|&nbsp;|0|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|&nbsp;|&nbsp;|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|&nbsp;|&nbsp;|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|&nbsp;|&nbsp;|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|&nbsp;|&nbsp;|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|&nbsp;|&nbsp;|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|&nbsp;|&nbsp;|固定电话&nbsp;

**Request-body-example:**
``` json
{
  "null": {
    "userAddress": "CLUov",
    "small": 9596.14,
    "userList": [
      {
        "userAddress": "ZLaw7",
        "small": 966.7,
        "userList": [],
        "money": 784.32,
        "phone": "ydr",
        "createTime": 7472,
        "nickName": "i3MTbTS",
        "ipv6": "1sle1E",
        "telephone": "FWj",
        "userName": "WCszx",
        "userDetails": [
          {
            "githubAddress": "R"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 7814.14,
    "phone": "rKiIt8",
    "createTime": 4392,
    "nickName": "jGzOrn",
    "ipv6": "u",
    "telephone": "5a6hQ",
    "userName": "mfZ",
    "userDetails": [
      {
        "githubAddress": "zy3"
      }
    ],
    "userAge": 0
  }
}
```

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/testRequestBodyMap --data '{
  "null": {
    "userAddress": "CLUov",
    "small": 9596.14,
    "userList": [
      {
        "userAddress": "ZLaw7",
        "small": 966.7,
        "userList": [],
        "money": 784.32,
        "phone": "ydr",
        "createTime": 7472,
        "nickName": "i3MTbTS",
        "ipv6": "1sle1E",
        "telephone": "FWj",
        "userName": "WCszx",
        "userDetails": [
          {
            "githubAddress": "R"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 7814.14,
    "phone": "rKiIt8",
    "createTime": 4392,
    "nickName": "jGzOrn",
    "ipv6": "u",
    "telephone": "5a6hQ",
    "userName": "mfZ",
    "userDetails": [
      {
        "githubAddress": "zy3"
      }
    ],
    "userAge": 0
  }
}'
```

## 5.Test @RequestBody List&nbsp;

**URL:** http://localhost/testRequestBodyList

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── ids|array&lt;string&gt;|true|&nbsp;|array of user id

**Request-body-example:**
``` json
[
  "e75SaVTyTz"
]
```

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/testRequestBodyList --data '[
  "e75SaVTyTz"
]'
```

## 6.Test Array Params&nbsp;

**URL:** http://localhost/testArray

**Type:** POST

**Content-Type:** application/json

**Body-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── fastJsons|array|true|&nbsp;|
&nbsp;&nbsp; └── &nbsp;|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── success|boolean|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── message|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── data|object|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── dataExpressionEnum|enum|&nbsp;|&nbsp;|枚举<br/>SENSIRION("2101", new HashMap&lt;&gt;()) - temperature&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── menuPermissionCodes|array&lt;enum&gt;|&nbsp;|&nbsp;|菜单/权限编码&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── date|string|&nbsp;|&nbsp;|学好&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── username|string|&nbsp;|&nbsp;|用户名<br/>Pattern: 
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── idCard|string|&nbsp;|&nbsp;|身份证号<br/>Pattern: 
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── age|int32|&nbsp;|0|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── age2|int32|&nbsp;|&nbsp;|Pattern: 
&nbsp;&nbsp; &nbsp;&nbsp; ├── code|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── timestamp|string|&nbsp;|&nbsp;|&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── traceId|string|&nbsp;|&nbsp;|&nbsp;

**Request-body-example:**
``` json
[
  {
    "traceId": "FZKbb9Fg1e",
    "code": "D",
    "data": {
      "date": "Sep 11, 2050, 6:23:44 AM",
      "idCard": "had",
      "menuPermissionCodes": [
        "WAIT_PAY"
      ],
      "dataExpressionEnum": "SENSIRION",
      "age": 0,
      "age2": 2016,
      "username": "lTAT"
    },
    "success": false,
    "message": "Tf7n2",
    "timestamp": "eF4tWzm"
  }
]
```

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"ABQ"
```

**Curl-example:**
``` bash
curl -X POST -H 'Content-Type: application/json' -i http://localhost/testArray --data '[
  {
    "traceId": "FZKbb9Fg1e",
    "code": "D",
    "data": {
      "date": "Sep 11, 2050, 6:23:44 AM",
      "idCard": "had",
      "menuPermissionCodes": [
        "WAIT_PAY"
      ],
      "dataExpressionEnum": "SENSIRION",
      "age": 0,
      "age2": 2016,
      "username": "lTAT"
    },
    "success": false,
    "message": "Tf7n2",
    "timestamp": "eF4tWzm"
  }
]'
```

## 7.Test @PathVariable&nbsp;

**URL:** http://localhost/test/{name}/{no}/info

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── name|string|true|&nbsp;|name<br/>
└── no|string|true|&nbsp;|no

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/test/nHl/f8yey6t/info
```

## 8.Test @RequestParam&nbsp;

**URL:** http://localhost/testRequestParam

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── author|string|true|<br/>		<br/>		<br/><br/>				<br/>|author│詹姆斯<br/>
└── type|string|true|<br/>		<br/>		<br/><br/>				<br/>|type

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/testRequestParam --data 'author=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A&type=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A'
```

## 9.Test @RequestParam with value&nbsp;

**URL:** http://localhost/testRequestParamWithValue

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── name|string|true|<br/>		<br/>		<br/><br/>				<br/>|user name<br/>

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/testRequestParamWithValue --data 'name=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A'
```

## 10.Test @RequestParam with default value&nbsp;

**URL:** http://localhost/testRequestParamWithDefaultVal

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── userName|string|true|Jordan|user name<br/>

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/testRequestParamWithDefaultVal --data 'userName=Jordan'
```

## 11.Test much path&nbsp;

**URL:** http://localhost/testMuchPath/get/{userId}

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── userId|int64|true|&nbsp;|userId<br/>

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/testMuchPath/get/5104
```

## 12.Test much path much parameter&nbsp;

**URL:** http://localhost/get/{deptId}/{userId}

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── userId|int64|true|&nbsp;|userId<br/>
└── deptId|int64|true|&nbsp;|deptId

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X POST -i http://localhost/get/1060/2605
```

## 13.Test Constants&nbsp;

**URL:** http://localhost/testConstants

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── page|int32|false|0|页码

**Response-fields:**

None


**Curl-example:**
``` bash
curl -X GET -i http://localhost/testConstants --data 'page=0'
```

## 14.测试mapping中的&nbsp;

**URL:** http://localhost/ex/bars

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|int64|true|<br/>		<br/>		<br/><br/>				<br/>|

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"0rVIn"
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/ex/bars --data 'id=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A'
```

## 15.测试mapping中的2&nbsp;

**URL:** http://localhost/ex/bars

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|int64|true|<br/>		<br/>		<br/><br/>				<br/>|

**Response-fields:**

Field|Type|Description
---|---|---
&nbsp;|string|&nbsp;

**Response-example:**
``` json
"KV9I98DT8"
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/ex/bars --data 'id=%0A%09%09%0A%09%09%0A%EE%80%80%EE%80%81%EE%80%82%0A%09%09%09%09%0A'
```

# Map返回型接口api文档测试&nbsp;

## 1.测试map解析&nbsp;

**URL:** http://localhost/map/test5

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|map&lt;string, map&gt;|&nbsp;
│&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; └── &nbsp;|map&lt;string, object&gt;|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; └── &nbsp;|object|&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; ├── age|int32|年龄&nbsp;
│&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; └── name|string|姓名&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "Jmw8mx",
  "code": "oK49tnGh2s",
  "data": {
    "null": {
      "null": {
        "name": "jR",
        "age": 0
      }
    }
  },
  "success": false,
  "message": "XvnhUl",
  "timestamp": "et"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/map/test5
```

## 2.Map&lt;String,Integer&gt;结构&nbsp;

**URL:** http://localhost/map/primitive

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, int32&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|int32|&nbsp;

**Response-example:**
``` json
{
  "null": 1602
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/map/primitive
```

## 3.Map&lt;String,Object&gt;结构&nbsp;

**URL:** http://localhost/map/objectValue

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

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

**Curl-example:**
``` bash
curl -X GET -i http://localhost/map/objectValue
```

## 4.Map&lt;String,User&gt;结构&nbsp;

**URL:** http://localhost/map/object

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, object&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|object|Description:<br/>用户对象&nbsp;
&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;

**Response-example:**
``` json
{
  "null": {
    "userAddress": "Nah75H",
    "small": 4913.87,
    "userList": [
      {
        "userAddress": "iVV",
        "small": 7688.94,
        "userList": [],
        "money": 3933.49,
        "phone": "v",
        "createTime": 7010,
        "nickName": "WvGrkH3kHZ",
        "ipv6": "y1u2Y5m",
        "telephone": "eFG3uWb0Y",
        "userName": "S",
        "userDetails": [
          {
            "githubAddress": "J7"
          }
        ],
        "userAge": 0
      }
    ],
    "money": 163.68,
    "phone": "RzjiMJ6",
    "createTime": 1884,
    "nickName": "bJV",
    "ipv6": "4p5swyqT",
    "telephone": "Vk",
    "userName": "vNCXvb",
    "userDetails": [
      {
        "githubAddress": "J"
      }
    ],
    "userAge": 0
  }
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/map/object
```

## 5.Map&lt;String,Student&gt;结构&nbsp;

**URL:** http://localhost/map/test1

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, object&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|object|Description:<br/>学生信息&nbsp;
&nbsp;&nbsp; ├── stuName|string|姓名&nbsp;
&nbsp;&nbsp; ├── stuAge|boolean|年龄&nbsp;
&nbsp;&nbsp; ├── stuAddress|string|地址&nbsp;
&nbsp;&nbsp; ├── user|object|用户对象&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── userMap|map&lt;string, object&gt;|map用户信息&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── listMap|array&lt;map&lt;string, int32&gt;&gt;|listMap&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|int32|&nbsp;
&nbsp;&nbsp; ├── userTreeSet|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; └── user1|object|用户对象2&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话&nbsp;

**Response-example:**
``` json
{
  "null": {
    "user1": {
      "userAddress": "2qDJVn8d",
      "small": 5802.92,
      "userList": [
        {
          "userAddress": "xKJ",
          "small": 8205.22,
          "userList": [],
          "money": 7007.09,
          "phone": "v55Qi81Iv",
          "createTime": 7270,
          "nickName": "iLWZ5VfK",
          "ipv6": "0vasq",
          "telephone": "e6",
          "userName": "wzQHZSwwDr",
          "userDetails": [
            {
              "githubAddress": "6A"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 7609.85,
      "phone": "GZamX",
      "createTime": 2780,
      "nickName": "2n4I5A",
      "ipv6": "st0rkwHW3",
      "telephone": "F",
      "userName": "jj5dh",
      "userDetails": [
        {
          "githubAddress": "NLW0hoF7dB"
        }
      ],
      "userAge": 0
    },
    "userTreeSet": [
      {
        "userAddress": "vT",
        "small": 1713.15,
        "userList": [
          {
            "userAddress": "U",
            "small": 6800.36,
            "userList": [],
            "money": 7190.81,
            "phone": "8dZ",
            "createTime": 8149,
            "nickName": "Y",
            "ipv6": "ndh",
            "telephone": "nHo",
            "userName": "SrNGBThNW",
            "userDetails": [
              {
                "githubAddress": "TzR"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 2349.35,
        "phone": "OfBszK7xi4",
        "createTime": 9715,
        "nickName": "T6Tck5PW",
        "ipv6": "cPK2fbvmZ",
        "telephone": "u",
        "userName": "qXl",
        "userDetails": [
          {
            "githubAddress": "hv9lJE0"
          }
        ],
        "userAge": 0
      }
    ],
    "listMap": [
      {
        "null": 2838
      }
    ],
    "stuAddress": "gY0Z3Nb",
    "stuName": "3bX8nINh",
    "userMap": {
      "null": {
        "userAddress": "rX1TyCE",
        "small": 4539.8,
        "userList": [
          {
            "userAddress": "tUfjv",
            "small": 3917.81,
            "userList": [],
            "money": 7620.42,
            "phone": "2czTZmJsO",
            "createTime": 9344,
            "nickName": "4v",
            "ipv6": "EkLbqCmv",
            "telephone": "S207BrgyJ",
            "userName": "dVBU2vzCN",
            "userDetails": [
              {
                "githubAddress": "c"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 8700.64,
        "phone": "KZwZz9K",
        "createTime": 7000,
        "nickName": "kO",
        "ipv6": "JX9ay2O6X8",
        "telephone": "HA9BNmz8w",
        "userName": "JYWgzQ",
        "userDetails": [
          {
            "githubAddress": "wq"
          }
        ],
        "userAge": 0
      }
    },
    "stuAge": true,
    "user": {
      "userAddress": "jUYz941ZEp",
      "small": 1226.69,
      "userList": [
        {
          "userAddress": "NtqJ6PGX",
          "small": 2638.46,
          "userList": [],
          "money": 5617.01,
          "phone": "pihfDRc",
          "createTime": 2035,
          "nickName": "7KR6",
          "ipv6": "znCuB",
          "telephone": "ZwAYOSx4LT",
          "userName": "GQxag",
          "userDetails": [
            {
              "githubAddress": "ziQ"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 5956.51,
      "phone": "QjrJISQFO",
      "createTime": 7130,
      "nickName": "I5dsr",
      "ipv6": "Uo",
      "telephone": "MSs44xO",
      "userName": "eg7",
      "userDetails": [
        {
          "githubAddress": "SI"
        }
      ],
      "userAge": 0
    }
  }
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/map/test1
```

## 6.Map&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构&nbsp;

**URL:** http://localhost/map/test2

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, object&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|object|Description:<br/>老师&nbsp;
&nbsp;&nbsp; ├── data|array&lt;object&gt;|泛型data&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── data1|object|泛型data1&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── stuName|string|姓名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── stuAge|boolean|年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── stuAddress|string|地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── user|object|用户对象&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userMap|map&lt;string, object&gt;|map用户信息&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── listMap|array&lt;map&lt;string, int32&gt;&gt;|listMap&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|int32|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userTreeSet|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── user1|object|用户对象2&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── data2|object|data2&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; └── age|int32|年龄&nbsp;

**Response-example:**
``` json
{
  "null": {
    "data": [
      {
        "userAddress": "U",
        "small": 3054.35,
        "userList": [
          {
            "userAddress": "3n",
            "small": 8527.24,
            "userList": [],
            "money": 4661.7,
            "phone": "7lp",
            "createTime": 8400,
            "nickName": "W7KBd",
            "ipv6": "OEse2tLms",
            "telephone": "b",
            "userName": "3HDqET0jfY",
            "userDetails": [
              {
                "githubAddress": "SZWlp7HY"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 2134.64,
        "phone": "Be8pXCNH",
        "createTime": 1879,
        "nickName": "gSyclpsCf",
        "ipv6": "Zp9QFivjh",
        "telephone": "f",
        "userName": "Z",
        "userDetails": [
          {
            "githubAddress": "0reX0t416"
          }
        ],
        "userAge": 0
      }
    ],
    "data2": {
      "userAddress": "Cel",
      "small": 3803.53,
      "userList": [
        {
          "userAddress": "93",
          "small": 7288.27,
          "userList": [],
          "money": 33.27,
          "phone": "fQz",
          "createTime": 9928,
          "nickName": "uV4QjRPzYP",
          "ipv6": "rdjngyQ",
          "telephone": "gP3MZEhnfk",
          "userName": "vouabH9",
          "userDetails": [
            {
              "githubAddress": "ETD8ZsKIOa"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 4600.65,
      "phone": "9qVHmFfJrb",
      "createTime": 516,
      "nickName": "khqhH",
      "ipv6": "ohF",
      "telephone": "Z",
      "userName": "1",
      "userDetails": [
        {
          "githubAddress": "VWlN4cBSUW"
        }
      ],
      "userAge": 0
    },
    "data1": {
      "user1": {
        "userAddress": "EqfvI",
        "small": 3323.35,
        "userList": [],
        "money": 8380.26,
        "phone": "I7pD4aREw",
        "createTime": 6227,
        "nickName": "iFcWqi07PN",
        "ipv6": "7iyUj1V",
        "telephone": "D3AL03f7",
        "userName": "lsJTNTSNL",
        "userDetails": [
          {
            "githubAddress": "yMdgdPe"
          }
        ],
        "userAge": 0
      },
      "userTreeSet": [
        {
          "userAddress": "BGTxActLZD",
          "small": 8492.92,
          "userList": [],
          "money": 9011.41,
          "phone": "JcPps",
          "createTime": 3554,
          "nickName": "kZ7Us",
          "ipv6": "gqCFgO",
          "telephone": "HxvZfK3QR",
          "userName": "GW8Uit",
          "userDetails": [
            {
              "githubAddress": "Rw"
            }
          ],
          "userAge": 0
        }
      ],
      "listMap": [
        {
          "null": 6415
        }
      ],
      "stuAddress": "ViShf",
      "stuName": "yu3XC5",
      "userMap": {
        "null": {
          "userAddress": "WGywLC",
          "small": 9235.73,
          "userList": [],
          "money": 7387.67,
          "phone": "jxfV0Havz",
          "createTime": 3989,
          "nickName": "fbcFI",
          "ipv6": "pB9",
          "telephone": "0pPv0",
          "userName": "C8O",
          "userDetails": [
            {
              "githubAddress": "ogUZL0Bsc1"
            }
          ],
          "userAge": 0
        }
      },
      "stuAge": false,
      "user": {
        "userAddress": "EUWHqa",
        "small": 9235.06,
        "userList": [],
        "money": 6868.96,
        "phone": "f",
        "createTime": 6451,
        "nickName": "fkO6Kf0",
        "ipv6": "gSO",
        "telephone": "wYtE11ep3",
        "userName": "CObXNI5o",
        "userDetails": [
          {
            "githubAddress": "gMo3"
          }
        ],
        "userAge": 0
      }
    },
    "age": 0
  }
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/map/test2
```

## 7.TreeMap&lt;String,Teacher&lt;List&lt;User&gt;,User,Student&gt;&gt;超复杂结构&nbsp;

**URL:** http://localhost/map/test3

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, object&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|object|Description:<br/>老师&nbsp;
&nbsp;&nbsp; ├── data|array&lt;object&gt;|泛型data&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── data1|object|泛型data1&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── stuName|string|姓名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── stuAge|boolean|年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── stuAddress|string|地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── user|object|用户对象&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userMap|map&lt;string, object&gt;|map用户信息&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── listMap|array&lt;map&lt;string, int32&gt;&gt;|listMap&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|int32|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userTreeSet|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── user1|object|用户对象2&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── data2|object|data2&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; └── age|int32|年龄&nbsp;

**Response-example:**
``` json
{
  "null": {
    "data": [
      {
        "userAddress": "wTNNPZ",
        "small": 1947.49,
        "userList": [
          {
            "userAddress": "r0fM9f",
            "small": 9622.63,
            "userList": [],
            "money": 4738.4,
            "phone": "uumd0TLCqV",
            "createTime": 8448,
            "nickName": "raWz6ev",
            "ipv6": "Ip3",
            "telephone": "Vka",
            "userName": "Eip",
            "userDetails": [
              {
                "githubAddress": "bDDqjugKk"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 5958.7,
        "phone": "3493Sv6BU",
        "createTime": 6181,
        "nickName": "B",
        "ipv6": "rG9nBK",
        "telephone": "o3vNTz0",
        "userName": "A9",
        "userDetails": [
          {
            "githubAddress": "BnAxF"
          }
        ],
        "userAge": 0
      }
    ],
    "data2": {
      "userAddress": "xKGB",
      "small": 8331.33,
      "userList": [
        {
          "userAddress": "x6plesQT",
          "small": 1399.64,
          "userList": [],
          "money": 7171.52,
          "phone": "5aNOceO",
          "createTime": 8841,
          "nickName": "OpTTn5sF",
          "ipv6": "KpcGDjaSt",
          "telephone": "tm4v2",
          "userName": "erzk",
          "userDetails": [
            {
              "githubAddress": "7"
            }
          ],
          "userAge": 0
        }
      ],
      "money": 6978.73,
      "phone": "XTHuNb",
      "createTime": 6949,
      "nickName": "I2jXBa",
      "ipv6": "m65",
      "telephone": "eiweVItaBB",
      "userName": "ZdUiO827",
      "userDetails": [
        {
          "githubAddress": "A9YBCTgXrz"
        }
      ],
      "userAge": 0
    },
    "data1": {
      "user1": {
        "userAddress": "XUacLvLr",
        "small": 6876.19,
        "userList": [],
        "money": 4662.7,
        "phone": "SAKrsPq5",
        "createTime": 8803,
        "nickName": "s",
        "ipv6": "xn7B",
        "telephone": "SuZY08d9fA",
        "userName": "a4ABQP",
        "userDetails": [
          {
            "githubAddress": "o"
          }
        ],
        "userAge": 0
      },
      "userTreeSet": [
        {
          "userAddress": "5mAi",
          "small": 3252.74,
          "userList": [],
          "money": 6983.51,
          "phone": "c5Qu",
          "createTime": 7539,
          "nickName": "lI3PW9Z",
          "ipv6": "6VMGGbqyAA",
          "telephone": "adg7P",
          "userName": "tS",
          "userDetails": [
            {
              "githubAddress": "Ou"
            }
          ],
          "userAge": 0
        }
      ],
      "listMap": [
        {
          "null": 9469
        }
      ],
      "stuAddress": "mHQk",
      "stuName": "v",
      "userMap": {
        "null": {
          "userAddress": "o",
          "small": 8466.85,
          "userList": [],
          "money": 3261.71,
          "phone": "uxQa3hoz",
          "createTime": 2792,
          "nickName": "gsfSx",
          "ipv6": "u31",
          "telephone": "y6EiAMIoH",
          "userName": "LureGm0qt0",
          "userDetails": [
            {
              "githubAddress": "kMkmIRw0a"
            }
          ],
          "userAge": 0
        }
      },
      "stuAge": false,
      "user": {
        "userAddress": "WM51T",
        "small": 3471.57,
        "userList": [],
        "money": 4530.28,
        "phone": "9U3",
        "createTime": 105,
        "nickName": "URi84bYkn0",
        "ipv6": "H46QBZ",
        "telephone": "JEve",
        "userName": "ADwO1YpX",
        "userDetails": [
          {
            "githubAddress": "u7PKPZ1"
          }
        ],
        "userAge": 0
      }
    },
    "age": 0
  }
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/map/test3
```

## 8.Map&lt;String,Teacher&lt;Map&lt;String,User&gt;,Map&lt;String,User&gt;,Map&lt;String,User&gt;&gt;&gt;超复杂结构&nbsp;

**URL:** http://localhost/map/test4

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |map&lt;string, object&gt;|&nbsp;
├── &nbsp;|string|&nbsp;
└── &nbsp;|object|Description:<br/>老师&nbsp;
&nbsp;&nbsp; ├── data|map&lt;string, object&gt;|泛型data&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── data1|map&lt;string, object&gt;|泛型data1&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; ├── data2|map&lt;string, object&gt;|data2&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; ├── &nbsp;|string|&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; └── &nbsp;|object|Description:<br/>用户对象&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userDetails|array&lt;object&gt;|用户详情&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; │&nbsp;&nbsp; └── githubAddress|string|测试&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userList|array&lt;object&gt;|用户列表&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; │&nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userName|string|用户名&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── nickName|string|昵称&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAddress|string|用户地址&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── userAge|int32|用户年龄&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── phone|string|手机号&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── createTime|int64|创建时间&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── small|float|钱少&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── money|double|钱太多了&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; ├── ipv6|string|ipv6&nbsp;
&nbsp;&nbsp; │&nbsp;&nbsp; &nbsp;&nbsp; └── telephone|string|固定电话&nbsp;
&nbsp;&nbsp; └── age|int32|年龄&nbsp;

**Response-example:**
``` json
{
  "null": {
    "data": {
      "null": {
        "userAddress": "SDn6sHp",
        "small": 4576.95,
        "userList": [
          {
            "userAddress": "J",
            "small": 2133.63,
            "userList": [],
            "money": 5845.03,
            "phone": "xtfG",
            "createTime": 8445,
            "nickName": "r3vr",
            "ipv6": "PYYu",
            "telephone": "Db2",
            "userName": "PAwC7B",
            "userDetails": [
              {
                "githubAddress": "e7xAK1VE"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 9798.2,
        "phone": "Rk",
        "createTime": 2779,
        "nickName": "PhUkh",
        "ipv6": "0",
        "telephone": "eUNO7bKgM",
        "userName": "ZO1tfbFMo",
        "userDetails": [
          {
            "githubAddress": "ZQTbgob"
          }
        ],
        "userAge": 0
      }
    },
    "data2": {
      "null": {
        "userAddress": "2oVHIGIDD",
        "small": 8027.08,
        "userList": [
          {
            "userAddress": "xZK",
            "small": 5236.72,
            "userList": [],
            "money": 7001.8,
            "phone": "vHNY",
            "createTime": 1271,
            "nickName": "9Na8",
            "ipv6": "d3sspKMEGo",
            "telephone": "Nnr3j6",
            "userName": "GYv2VhiA",
            "userDetails": [
              {
                "githubAddress": "Jveiv"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 670.31,
        "phone": "XPGWIqu",
        "createTime": 6714,
        "nickName": "jsC2B3fZ",
        "ipv6": "QSij",
        "telephone": "rd4F",
        "userName": "Rt",
        "userDetails": [
          {
            "githubAddress": "xgih"
          }
        ],
        "userAge": 0
      }
    },
    "data1": {
      "null": {
        "userAddress": "y9A",
        "small": 7584.03,
        "userList": [
          {
            "userAddress": "86TqQilbpe",
            "small": 4664.77,
            "userList": [],
            "money": 3103.07,
            "phone": "v3Xv",
            "createTime": 9837,
            "nickName": "12",
            "ipv6": "p78gt83OLI",
            "telephone": "5C7HaI1",
            "userName": "xsS",
            "userDetails": [
              {
                "githubAddress": "C"
              }
            ],
            "userAge": 0
          }
        ],
        "money": 9610.22,
        "phone": "6cT0gQA",
        "createTime": 6436,
        "nickName": "fl94AGhj",
        "ipv6": "Btn8",
        "telephone": "QhR2e",
        "userName": "fJ8m7aCys",
        "userDetails": [
          {
            "githubAddress": "ZHscpIie"
          }
        ],
        "userAge": 0
      }
    },
    "age": 0
  }
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/map/test4
```

# Path参数测试&nbsp;

## 1.接收数组类型pathVariable&nbsp;

**URL:** http://localhost/pathVariable/test/{id}

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── id|array|true|&nbsp;|
&nbsp;&nbsp; └── &nbsp;|string|&nbsp;|&nbsp;|&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "xVpvD",
  "code": "bmY",
  "success": false,
  "message": "Ssv5w",
  "timestamp": "pofQ"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/pathVariable/test/[3Zz3L]
```

## 2.Path正则测试1&nbsp;

**URL:** http://localhost/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── fileId|string|true|&nbsp;|文件id<br/>

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "QuMy",
  "code": "tw",
  "success": false,
  "message": "MkDgKoXt",
  "timestamp": "dClQZEf"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}
```

## 3.Path正则测试2&nbsp;

**URL:** http://localhost/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}/file

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── fileId|string|true|&nbsp;|文件id<br/>

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "oUFwi",
  "code": "p5ITco8",
  "success": false,
  "message": "MfHmV",
  "timestamp": "sUmO"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}/file
```

## 4.Path正则测试3&nbsp;

**URL:** http://localhost/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}/file

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Path-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
└── fileId|string|true|&nbsp;|文件id<br/>

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "6z",
  "code": "Sd9JNh",
  "success": false,
  "message": "Q23fUj9CLW",
  "timestamp": "LhwwxY"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/pathVariable/download/{fileId:^[A-Za-z0-9_-]{10,50}$}/file
```

# 测试session参数忽略&nbsp;

## 1.session忽略&nbsp;

**URL:** http://localhost/session/attribute

**Type:** GET

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Query-parameters:**

Parameter|Type|Required|DefaultValue|Description
---|---|---|---|---
├── userName|string|&nbsp;|&nbsp;|忽略用户名<br/>&nbsp;
└── appName|string|&nbsp;|&nbsp;|应用名称&nbsp;

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "liSw0zTc",
  "code": "oaAFevCr",
  "success": false,
  "message": "Iog",
  "timestamp": "Z5"
}
```

**Curl-example:**
``` bash
curl -X GET -i http://localhost/session/attribute --data 'appName=F2zWoxRNV&userName=BIT'
```

# 多method测试&nbsp;

## 1.多method&nbsp;

**URL:** http://localhost/multi/mapping/methods/startJob

**Type:** POST

**Content-Type:** application/x-www-form-urlencoded;charset=UTF-8

**Request-parameters:**

None

**Response-fields:**

Field|Type|Description
---|---|---
┌─&nbsp; |object|&nbsp;
├── success|boolean|&nbsp;
├── message|string|&nbsp;
├── data|object|&nbsp;
├── code|string|&nbsp;
├── timestamp|string|&nbsp;
└── traceId|string|&nbsp;

**Response-example:**
``` json
{
  "traceId": "8OrXr",
  "code": "YzSMslt7n",
  "success": false,
  "message": "X83hHux",
  "timestamp": "J"
}
```

**Curl-example:**
``` bash
curl -X POST -i http://localhost/multi/mapping/methods/startJob
```