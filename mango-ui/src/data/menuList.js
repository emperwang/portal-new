const menuList = [{
    "id": 1,
    "menuText": "系统管理",
    "menuUrl": "sys",
    "menuIcon": "el-icon-s-tools",
    "orderNum": 0,
    "menuDisable": false,
    "children": [{
        "id": 4,
        "menuText": "用户管理",
        "menuUrl": "user",
        "menuIcon": "el-icon-user-solid",
        "orderNum": 1,
        "menuDisable": false,
        "pid": 1
    }, {
        "id": 5,
        "menuText": "角色管理",
        "menuUrl": "role",
        "menuIcon": "el-icon-s-custom",
        "orderNum": 2,
        "menuDisable": false,
        "pid": 1
    }, {
        "id": 6,
        "menuText": "权限管理",
        "menuUrl": "auth",
        "menuIcon": "el-icon-s-ticket",
        "orderNum": 3,
        "menuDisable": false,
        "pid": 1
    }, {
        "id": 7,
        "menuText": "菜单管理",
        "menuUrl": "menu",
        "menuIcon": "el-icon-menu",
        "orderNum": 4,
        "menuDisable": false,
        "pid": 1
    }],
    "pid": 0
}, {
    "id": 2,
    "menuText": "文章管理",
    "menuUrl": "artical",
    "menuIcon": "el-icon-reading",
    "orderNum": 1,
    "menuDisable": false,
    "children": [{
        "id": 8,
        "menuText": "文章列表",
        "menuUrl": "list",
        "menuIcon": "el-icon-document",
        "orderNum": 2,
        "menuDisable": false,
        "pid": 2
    }],
    "pid": 0
}, {
    "id": 3,
    "menuText": "监控中心",
    "menuUrl": "monitor",
    "menuIcon": "el-icon-camera",
    "orderNum": 3,
    "menuDisable": false,
    "children": [],
    "pid": 0
}]

export default menuList;